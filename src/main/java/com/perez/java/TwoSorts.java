package com.perez.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Golfer {
    private String first;
    private String last;
    private int score;

    public Golfer(String first, String last, int score) {
        this.first = first;
        this.last = last;
        this.score = score;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Golfer{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", score=" + score +
                '}';
    }
}

public class TwoSorts {
    List<Golfer> golfers = Arrays.asList(new Golfer("jack","Nicklaus",68),new Golfer("Tiger","Woods",70),new Golfer("Tom","Watson",70),
            new Golfer("Ty","Web",68),new Golfer("Bubba","Watson",75));

    public List<Golfer> sortByScoreThenLastThenFirst(){
        return golfers.stream().sorted(Comparator.comparingInt(Golfer::getScore)
                .thenComparing(Golfer::getLast)
                .thenComparing(Golfer::getFirst)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        TwoSorts testSort = new TwoSorts();
        List<Golfer>sortedGolfers = testSort.sortByScoreThenLastThenFirst();
        sortedGolfers.forEach(System.out::println);
    }
}
