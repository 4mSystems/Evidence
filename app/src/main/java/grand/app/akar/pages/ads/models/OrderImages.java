package grand.app.akar.pages.ads.models;

public class OrderImages {
    private String path;
    private boolean selected;
    private int id;
    private int deletedId;

    public OrderImages(String path, boolean selected, int id) {
        this.path = path;
        this.selected = selected;
        this.id = id;
    }

    public OrderImages() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeletedId() {
        return deletedId;
    }

    public void setDeletedId(int deletedId) {
        this.deletedId = deletedId;
    }

    public OrderImages(boolean selected) {
        this.selected = selected;
    }

    public OrderImages(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
