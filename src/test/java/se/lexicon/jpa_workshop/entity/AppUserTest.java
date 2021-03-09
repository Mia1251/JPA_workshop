package se.lexicon.jpa_workshop.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppUserTest {

    AppUser testObject;

    @BeforeEach
    public void setup() {
        testObject = new AppUser(1, "Andreas", "Svensson", "andreas.svensson@gmail.com");
    }

    @Test
    @DisplayName("Test1 create new object")
    public void test_create() {
        Assertions.assertEquals(1,testObject.getId());
        Assertions.assertEquals("Andreas",testObject.getFirstName());
        Assertions.assertEquals("Svensson",testObject.getLastName());
        Assertions.assertEquals("andreas.svensson@gmail.com",testObject.getEmail());
    }

    @Test
    @DisplayName("Test2 Egual")
    public void test_equal() {
        AppUser expected = new AppUser(1, "Andreas", "Svensson", "andreas.svensson@gmail.com");
        Assertions.assertTrue(testObject.equals(expected));
    }

    @Test
    @DisplayName("Test3 HashCode")
    public void test_hashCode() {
        AppUser expected = new AppUser(1, "Andreas", "Svensson", "andreas.svensson@gmail.com");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }

}
