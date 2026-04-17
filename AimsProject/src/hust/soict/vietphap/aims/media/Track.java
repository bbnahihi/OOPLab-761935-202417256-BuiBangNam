package hust.soict.vietphap.aims.media;

public class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        if (this.title != null && track.getTitle() != null) {
            return this.title.equals(track.getTitle()) && this.length == track.getLength();
        }
        return false;
    }
}