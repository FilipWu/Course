package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.ForumStatistics;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @InjectMocks
    private ForumStatistics forumStatisticsMock;

    @Test
    public void testPostNumberIsZero() {
        List<String> users = List.of("user1", "user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(0,forumStatisticsMock.getNumberOfPosts());
        assertEquals(0.0,forumStatisticsMock.getAvgPostsPerUser());
        assertEquals(5.0,forumStatisticsMock.getAvgCommentsPerUser());
        assertEquals(0.0,forumStatisticsMock.getAvgCommentsPerPost());
    }

    @Test
    public void testPostNumberIsOneThousand() {
        List<String> users = List.of("user1", "user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(1000,forumStatisticsMock.getNumberOfPosts());
        assertEquals(500,forumStatisticsMock.getAvgPostsPerUser());
        assertEquals(250,forumStatisticsMock.getAvgCommentsPerUser());
        assertEquals(0.5,forumStatisticsMock.getAvgCommentsPerPost());
    }

    @Test
    public void testCommentsNumberIsOneZero() {
        List<String> users = List.of("user1");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(110);
        when(statisticsMock.commentsCount()).thenReturn(0);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(110,forumStatisticsMock.getNumberOfPosts());
        assertEquals(110,forumStatisticsMock.getAvgPostsPerUser());
        assertEquals(0,forumStatisticsMock.getAvgCommentsPerUser());
        assertEquals(0.0,forumStatisticsMock.getAvgCommentsPerPost());
    }

    @Test
    public void testNumberOfPostsIsGreaterThanNumberOfComments() {
        List<String> users = List.of("user1", "user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(0.1, forumStatisticsMock.getAvgCommentsPerPost());
    }

    @Test
    public void testNumberOfPostsIsLessThanNumberOfComments() {
        List<String> users = List.of("user1", "user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(10.0, forumStatisticsMock.getAvgCommentsPerPost());
    }

    @Test
    public void testNumberOfUsersisZero() {
        List<String> users = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(0,forumStatisticsMock.getNumberOfUsers());
        assertEquals(0.0,forumStatisticsMock.getAvgPostsPerUser());
        assertEquals(0.0,forumStatisticsMock.getAvgCommentsPerUser());
    }

    @Test
    public void testNumberOfUserisOneThousand() {
        List<String> users = new ArrayList<>();

        for(int i =0; i<1000; i++) {
            users.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        forumStatisticsMock.calculateAdvStatistics(statisticsMock);

        assertEquals(1000,forumStatisticsMock.getNumberOfUsers());
        assertEquals(1,forumStatisticsMock.getAvgPostsPerUser());
        assertEquals(2,forumStatisticsMock.getAvgCommentsPerUser());
    }
}
