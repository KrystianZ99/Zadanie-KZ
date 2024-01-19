public class Magazine extends Publication {

    private Long number;

    public Magazine(String title, String author, Long number) {
        super(title, author);
        this.number = number;
    }

    @Override
    public void info() {
        System.out.println("Magazine: " + getTitle() + " - " + getAuthor() + " (Number: " + getNumber() + ")");
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
