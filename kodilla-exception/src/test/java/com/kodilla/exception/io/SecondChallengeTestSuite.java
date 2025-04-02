package com.kodilla.exception.io;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SecondChallengeTestSuite {
    @Test
    void testprobablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when and then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0,2.5));
        assertAll(
                () -> assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1.0,1.5)),
                () -> assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2.0,1.0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0,1.0))
        );
    }
}
