package te.app.evidence.pages.home.models;

public class HomeMainObject {
    private String text;
    private String body;
    private int icon;
    private String fragment;

    public HomeMainObject(String text, String body, int icon, String fragment) {
        this.text = text;
        this.body = body;
        this.icon = icon;
        this.fragment = fragment;
    }

    public String getText() {
        return text;
    }

    public String getBody() {
        return body;
    }

    public int getIcon() {
        return icon;
    }

    public String getFragment() {
        return fragment;
    }
}
