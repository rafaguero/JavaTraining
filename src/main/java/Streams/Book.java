package Streams;

import java.util.Arrays;
import java.util.List;

public class Book {
    /*
    Each book has a title, a year of publishing and a list of authors (only names)
     */
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title,int year, List<String>names){
        this.title = title;
        this.year = year;
        authors = names;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
