public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Терри", "Пратчетт");
        Author author2 = new Author("Джон", "Стейнбек");
        Book book1 = new Book("Мор, ученик смерти", author1, 1995);
        Book book2 = new Book("Гроздья Гнева", author2, 1939);


        book1.printBook();
        book2.printBook();
        book1.setYear(1987);
        book1.printBook();
        System.out.println(new Book("Новый мир", author1, 2005));
        System.out.println(author1.equals(new Author("Терри", "Пратчетт")));
        System.out.println(book1.equals(new Book("Мор, ученик смерти", author1, 1987)));

    }
}
