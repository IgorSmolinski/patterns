package com.patterns.kodillapatterns2.adapter.bookclasifier;

import com.patterns.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class MedianaAdapterTestSuite {
    @Test
    public void publicationYearMedianaTest() {
        //Given
        MedianAdapter bookAdapter = new MedianAdapter();
        Set<Book> booksFromLibraryA = new HashSet<>();
        Book book1 = new Book("Stephen King", "Lśnienie", 2011, "Fantasy1");
        Book book2 = new Book("Philip K. Dick", "Człowiek z wysokiego zamku", 2012, "Fantasy2");
        Book book3 = new Book("Jaś Fasola", "Fsaolowe Lata", 2000, "Fantasy3");
        Book book4 = new Book("Dean R. Koontz", "Opiekunowie", 1983, "Fiction1");

        booksFromLibraryA.add(book1);
        booksFromLibraryA.add(book2);
        booksFromLibraryA.add(book3);
        booksFromLibraryA.add(book4);

        //Log
        booksFromLibraryA.forEach(System.out::println);
        System.out.println(booksFromLibraryA.size());
        //When
        int yearMedian = bookAdapter.publicationYearMedian(booksFromLibraryA);

        //Then
        assertThat(yearMedian).isEqualTo(2010);
    }
}
