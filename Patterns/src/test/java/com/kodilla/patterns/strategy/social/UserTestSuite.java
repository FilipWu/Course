package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenPosts = steven.sharePost();
        System.out.println("Steven is " + stevenPosts);
        String johnPosts = john.sharePost();
        System.out.println("John is " + johnPosts);
        String kodillaPosts = kodilla.sharePost();
        System.out.println("Kodilla is " + kodillaPosts);

        //Then
        assertEquals("Sharing via Facebook", stevenPosts);
        assertEquals("Sharing via Twitter", johnPosts);
        assertEquals("Sharing via Snapchat", kodillaPosts);

    }

    @Test
    void testIndividualSharingStrategy() {
        User steven = new Millenials("Steven Links");

        String stevenPost = steven.sharePost();
        System.out.println("Steven is " + stevenPost);
        steven.setSocialPublisher(new SnapchatPublisher());
        String stevenPostNew = steven.sharePost();
        System.out.println("Steven is now using " + stevenPostNew);

        assertEquals("Sharing via Snapchat", stevenPostNew);
    }

}
