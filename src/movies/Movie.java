package movies;

public class Movie {

    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    // Command+N will allow you to create the getters and setter below

    public String getTitle() {
        return title;
    }

//    public String getCategory() {
//        return category;
//    }

    public void setTitle(String title) {
        this.title = title;
    }
}
