package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("picture", "word", "act", "hit", "bag", "CAT", "word", "cat", "we", "act", "WELL", "switch", "eye");
        List<String> wordCount = words.stream()
                .filter(w->w.length() > 3)
                .map(String::toUpperCase)
                .distinct()
                .collect(toList());

        System.out.println(wordCount);
        boolean hasValue10 = IntStream.range(1, 10).anyMatch(x -> x == 10);
        System.out.println(hasValue10);

        // the collection of java books
        final List<Book> javaBooks = Stream.of(
                new Book("Java EE 7 Essentials", 2013, Arrays.asList("Arun Gupta")),
                new Book("Algorithms", 2011, Arrays.asList("Robert Sedgewick", "Kevin Wayne")),
                new Book("Clean code", 2014, Arrays.asList("Robert Martin"))
        ).collect(Collectors.toList());

// list of authors
        final List<String> authors = javaBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("The authors are " + authors);

        //list of numbers
        List<Integer>numbers = Arrays.asList(2,4,6,8,12,11,32,43);
        int sum = numbers.stream().reduce(0, (acc, elem) -> acc + elem);
        System.out.println(sum);

        //account
        List<Account>accountList = Arrays.asList(new Account("72300001",888877555,false),new Account("2222201",232324443,false),new Account("55555555",111111344,false));
        accountList.stream()
                .filter(a -> a.getSum() > 10_000_000)
                .forEach(a -> a.setLocked(true));
        System.out.println(accountList.toString());

        List<String> numberList = accountList.stream()
                .map(Account::getNumber)
                .collect(Collectors.toList());
        System.out.println(numberList.toString());
        Map<String, Long> numberToBalanceMap = accountList.stream()
                .collect(Collectors.toMap(Account::getNumber, Account::getBalance));
        numberToBalanceMap.keySet().stream().forEach(System.out::println);
    }
}
