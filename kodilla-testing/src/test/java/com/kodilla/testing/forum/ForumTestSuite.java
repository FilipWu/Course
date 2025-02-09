package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name")
    @Test
     void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("John", "Doe");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals("John", result);
    }
    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name")
    @Test
    void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("John", "Doe");
        String expectedResult = "Doe";
        String result = simpleUser.getRealName();
        Assertions.assertEquals(expectedResult, result);

    }
}
