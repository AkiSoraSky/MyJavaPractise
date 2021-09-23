package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    private static void hashset1() {
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");

        System.out.println("set1: " + set1);

        Book book1 = new Book("Walden", "Henry Thoreau", 1854);
        Book book2 = new Book("Walden", "Henry Thoreau", 1854);
        Set<Book> set2 = new HashSet<>();
        set2.add(book1);
        set2.add(book2);
        System.out.println("set2: " + set2);
    }

    public static void main(String[] args) {
        hashset1();
    }
}

class Book {
    private String title;
    private String author;
    private int year;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year;
        return result;
    }

    /*
    public int hashCode() {
		return title.hashCode();
	}
	public boolean equals(Object o) {
		return (year == (((Book)o).getYear())) && (author.equals((((Book)o).getAuthor())));
	}*/

}

