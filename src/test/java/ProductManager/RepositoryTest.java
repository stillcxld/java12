package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenIdExisted() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
}