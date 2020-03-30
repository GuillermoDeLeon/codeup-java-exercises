package movies;

public class Movie {

    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}