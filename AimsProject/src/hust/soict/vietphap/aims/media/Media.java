package hust.soict.vietphap.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        if (this.title != null && media.getTitle() != null) {
            return this.title.equals(media.getTitle());
        }
        return false;
    }
}