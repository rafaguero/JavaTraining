package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

class Golfer {
    private String first;
    private String last;
    private int score;

    @Override
    public String toString() {
        return "Golfer{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", score=" + score +
                '}';
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

    public Golfer(String first, String last, int score){
        this.first = first;
        this.last = last;
        this.score = score;

    }
}
class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
}
public class StreamExercises {
    public List<Golfer> golfers = Arrays.asList(
            new Golfer("Jack", "Nicklaus", 68),
            new Golfer("Tiger", "Woods", 70),
            new Golfer("Tom", "Watson", 70),
            new Golfer("Ty", "Webb", 68),
            new Golfer("Bubba", "Watson", 70)
    );

    public List<Golfer> sortByScoreThenLastThenFirst() {
        return golfers.stream()
                .sorted(comparingInt(Golfer::getScore)
                        .thenComparing(Golfer::getLast)
                        .thenComparing(Golfer::getFirst))
                .collect(toList());
    }
    public static void main(String[] args) {

        StreamExercises test = new StreamExercises();
        List<Golfer>sortedGolfers = test.sortByScoreThenLastThenFirst();
        sortedGolfers.forEach(System.out::println);

        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(x -> System.out.println(x));

        System.out.println("this is the second exercise");
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(System.out::println);

        Consumer<Integer> printer = System.out::println;
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(printer);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        List<String> strings =
                Arrays.asList("this", "is", "a", "list", "of", "strings");
//        List<String> sorted = strings.stream()
//                .sorted((s1, s2) -> s1.compareTo(s2))
//                .collect(Collectors.toList());

        List<String> sorted = strings.stream()
                .sorted(String::compareTo)
                .collect(toList());
        sorted.forEach(System.out::println);

        Stream.of("this", "is", "a", "stream", "of", "strings")
                .map(String::length)
                .forEach(System.out::println);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Juan"));
        people.add(new Person("Rafael"));

        List<String> names = people.stream()
                .map(person -> person.getName())
                .collect(toList());

// or, alternatively,

        List<String> names1 = people.stream()
                .map(Person::getName)
                .collect(toList());
    }
    List<String> strings = Stream.of("this", "is", "a", "list", "of", "strings")
            .collect(toList());
    String s = Stream.of("this", "is", "a", "list")
            .collect(Collectors.joining());
}
