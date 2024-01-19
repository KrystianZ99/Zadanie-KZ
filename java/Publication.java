public abstract class Publication {
    private String title;
    private String author;

    public Publication(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public abstract void info();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
