package com.spring.util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lombok.Data;

@Data
class Movie {
    static enum Genre {DRAMA, THRILLER, HORROR, ACTION}

    ;
    private Genre genre;
    private String name;

    Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }
    //accessors not shown
}

public class FilteringStuff {

    static Thread laurel, hardy;

    public static void main(String[] args) {

        laurel = new Thread() {
            @Override
            public void run() {
                System.out.println("A");
                try {
                    hardy.sleep(1000);
                } catch (Exception e) {
                    System.out.println("B");
                }
                System.out.println("C");
            }
        };

        hardy =new Thread() {
            @Override
            public void run() {
                System.out.println("D");
                try {
                    laurel.wait();
                } catch (Exception e) {
                    System.out.println("E");
                }
                System.out.println("F");

            }
        };

        laurel.start();
        hardy.start();


        List<Movie> movies = Arrays.asList(
                new Movie("On the Waterfront", Movie.Genre.DRAMA),
                new Movie("Psycho", Movie.Genre.THRILLER),
                new Movie("Oldboy", Movie.Genre.THRILLER),
                new Movie("Shining", Movie.Genre.HORROR)
        );
        Predicate<Movie> horror = mov -> mov.getGenre() == Movie.Genre.THRILLER;
        Predicate<Movie> name = mov -> mov.getName().startsWith("O");
        movies.stream()
              .filter(horror)
              .filter(name)
              .forEach(mov -> System.out.println(mov.getName()));
    }

}

