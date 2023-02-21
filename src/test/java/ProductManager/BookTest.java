package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void testGetAuthorBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        String expected = "Bukowski";
        String actual = book3.getAuthor();
        Assertions.assertEquals(expected, actual);
    }
}