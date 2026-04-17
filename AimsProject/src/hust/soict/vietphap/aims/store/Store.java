package hust.soict.vietphap.aims.store;

import hust.soict.vietphap.aims.media.DigitalVideoDisc;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore >= MAX_ITEMS_IN_STORE) {
            System.out.println("The store is full. Cannot add more DVDs.");
            return;
        }
        itemsInStore[qtyInStore] = dvd;
        qtyInStore++;
        System.out.println("The DVD '" + dvd.getTitle() + "' has been added to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                found = true;
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The DVD '" + dvd.getTitle() + "' has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD is not in the store.");
        }
    }
}