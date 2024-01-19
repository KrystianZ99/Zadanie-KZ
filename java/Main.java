public class Main {
    public static void main(String[] args) {
        Publication book = new Book("Sample Book", "author1", 2001);
        Publication magazine = new Magazine("Sample Magazine", "autho2", 122023L);

        book.info();
        magazine.info();
    }
}
