package hust.soict.vietphap.test.cart;

import hust.soict.vietphap.aims.cart.Cart;
import hust.soict.vietphap.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        System.out.println("\n--- Search by ID 1 ---");
        cart.searchById(1); 
        
        System.out.println("\n--- Search by ID 5 ---");
        cart.searchById(5); 
        
        System.out.println("\n--- Search by Title 'Star' ---");
        cart.searchByTitle("Star"); 
        
        System.out.println("\n--- Search by Title 'Nemo' ---");
        cart.searchByTitle("Nemo"); 
    }
}