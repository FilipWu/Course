package com.kodilla.testing.forum.tdd;


import com.kodilla.testing.forumm.ForumComment;
import com.kodilla.testing.forumm.ForumPost;
import com.kodilla.testing.forumm.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("This is the test " + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts {


    @Test
    void testAddPost() {
        //given
        ForumUser forumUser = new ForumUser("mrW", "Filip Waroch");
        //when
        forumUser.addPost("MrW", "Hello everybody");
        //then
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    void testGetPosts() {
        //given
        ForumUser forumUser = new ForumUser("mrW", "Filip Waroch");
        ForumPost thePost = new ForumPost("Hello everybody", "mrW");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //when
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);
        //then
        Assertions.assertEquals(thePost, retrivedPost);
    }

    @Test
    void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }
}

@Nested
@DisplayName("Tests for comments")
class TestComments {
    @Test
    void testAddComment() {
        //given
        ForumUser forumUser = new ForumUser("mrW", "Filip Waroch");
        ForumPost thePost = new ForumPost("Hello everybody", "mrW");
        //when
        forumUser.addComment(thePost, "mrW", "Thank you for help");
        //then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    void testGetComments() {
        //given
        ForumUser forumUser = new ForumUser("mrW", "Filip Waroch");
        ForumPost thePost = new ForumPost("Hello everybody", "mrW");
        ForumComment theComment = new ForumComment(thePost, "Thank you for help", "mrW");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //when
        ForumComment retrievedComment = forumUser.getComment(0);
        //then
        Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test
    void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("Mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
}
