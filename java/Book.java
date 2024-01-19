public class Book extends Publication {

    private Integer releaseDate;

    public Book(String title, String author, Integer releaseDate) {
        super(title, author);
        this.releaseDate = releaseDate;
    }

    @Override
    public void info() {
        System.out.println("Book: " + getTitle() + " - " + getAuthor() + " (" + getReleaseDate() + ")");
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }
}
