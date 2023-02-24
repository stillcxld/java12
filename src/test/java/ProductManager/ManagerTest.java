package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
     @Test
     public void testAdd() {
         Repository repo = new Repository();
         Manager manager = new Manager(repo);
         Book book1 = new Book(1, "Junkie", 400, "Burroughs");
         Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
         Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

         manager.add(book1);
         manager.add(book2);
         manager.add(book3);

         Product[] actual = manager.searchBy("Ham");
         Product[] expected = {book3};

         Assertions.assertArrayEquals(expected, actual);
     }
    @Test
    public void testAddAll() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearhWhenSomeProductsFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearhByString() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Harry");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetPriceProduct() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        int expected = 300;
        int actual = book2.getPrice();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSearhByString2() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Junkie", 400, "Burroughs");
        Book book2 = new Book(2, "Harry Potter", 300, "Rowling");
        Book book3 = new Book(3, "Ham on rye", 500, "Bukowski");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Ham");
        Product[] expected = {book3};

        Assertions.assertArrayEquals(expected, actual);
    }
}