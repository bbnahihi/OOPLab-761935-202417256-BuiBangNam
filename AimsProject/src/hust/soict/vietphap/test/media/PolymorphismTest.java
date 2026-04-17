package hust.soict.vietphap.test.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.vietphap.aims.media.*;

public class PolymorphismTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        CompactDisc cd = new CompactDisc();
        cd.setTitle("Greatest Hits");
        cd.setCategory("Music");
        cd.setCost(15.5f);
        
        DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setCategory("Fantasy");
        book.setCost(20.0f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}