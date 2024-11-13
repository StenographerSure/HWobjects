public class Book{

    private final String title;
    private final Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printBook(){
        System.out.printf("%10s; %10s; %d\n", this.getTitle(), this.getAuthor().getFirstName() + " " + this.getAuthor().getLastName(), this.getYear());
    }
}
