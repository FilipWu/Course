package com.kodilla.patterns.strategy.social;

import java.util.concurrent.Flow;

public non-sealed class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sharing via Twitter";
    }
}
