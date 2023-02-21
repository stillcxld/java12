package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    public void testSmartphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(5, "Iphone", 40000, "Apple");

        manager.add(smartphone1);

        String expected = "Apple";
        String actual = smartphone1.getVendor();
        Assertions.assertEquals(expected, actual);
    }
}