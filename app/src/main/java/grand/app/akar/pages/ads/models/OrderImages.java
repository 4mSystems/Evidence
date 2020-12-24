package grand.app.akar.pages.ads.models;

public class OrderImages {
    private String path;
    private boolean selected;

    public OrderImages() {
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
