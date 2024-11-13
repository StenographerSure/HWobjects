public class Main {
    public static void main(String[] args) {

        Author author_1 = new Author("Терри", "Пратчетт");
        Author author_2 = new Author("Джон", "Стейнбек");
        Book book_1 = new Book("Мор, ученик смерти", author_1, 1995);
        Book book_2 = new Book("Гроздья Гнева", author_2, 1939);


        book_1.printBook();
        book_2.printBook();
        book_1.setYear(1987);
        book_1.printBook();

    }
}
