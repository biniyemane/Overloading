package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class OverloadingMain {
    public static void main(String[] args) {
        // Create Animal objects using different constructors
        Animal animal1 = new Animal("Max", true);
        Animal animal2 = new Animal("Charlie");
        Animal animal3 = new Animal();

        // Print Animal objects
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        // Create TvShow objects using different constructors
        TvShow tvShow1 = new TvShow("Breaking Bad", 62, "Drama");
        TvShow tvShow2 = new TvShow("Game of Thrones");
        TvShow tvShow3 = new TvShow();

        // Print TvShow objects
        System.out.println(tvShow1);
        System.out.println(tvShow2);
        System.out.println(tvShow3);

        // Create Book objects using different constructors
        Book book1 = new Book("To Kill a Mockingbird", 281, 1960);
        Book book2 = new Book("A Brief History of Time");
        Book book3 = new Book();

        // Print Book objects
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
