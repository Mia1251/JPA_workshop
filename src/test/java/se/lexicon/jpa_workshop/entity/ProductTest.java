package se.lexicon.jpa_workshop.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product testObject;

    @BeforeEach
    public void setup() {
        testObject = new Product(1, "Nailpolish", 45);
    }

    @Test
    @DisplayName("Test1 create new product")
    public void test_create() {
        Assertions.assertEquals(1,testObject.getId());
        Assertions.assertEquals("Nailpolish", testObject.getName());
        Assertions.assertEquals(45, testObject.getPrice());
    }

    @Test
    @DisplayName("Test2 find by price")
    public void test_findByPrice() {
        Assertions.assertEquals(45,testObject.getPrice());
    }

    @Test
    @DisplayName("Test3 find by productname")
    public void test_findByProductName() {
        Assertions.assertEquals("Nailpolish", testObject.getName());
    }
}
