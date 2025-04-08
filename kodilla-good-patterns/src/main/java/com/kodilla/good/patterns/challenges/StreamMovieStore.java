package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMovieStore {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.getMovies());

        String joinTitles = movieStore.getMovies().values().stream()
                .flatMap(List -> List.stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(joinTitles);
    }
}