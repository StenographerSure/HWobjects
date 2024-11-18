import java.util.Objects;

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

    @Override
    public String toString(){
        return title + "; " + author.toString() + "; " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}
