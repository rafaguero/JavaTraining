package Streams;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Person {
    public static enum Gender {
        MALE,FEMALE
    }
    private long id;
    private String name;
    private Gender gender;
    private LocalDate dob;
    private double income;
    public Person(long id,String name,Gender gender,LocalDate dob,double income){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.income = income;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    public static List<Person> persons(){
        Person ken = new Person(1, "Ken", Gender.MALE,LocalDate.of(1970, Month.MAY, 4), 6000.0);
        Person jeff = new Person(2, "Jeff", Gender.MALE,LocalDate.of(1970, Month.JULY, 15), 7100.0);
        Person donna = new Person(3, "Donna", Gender.FEMALE,LocalDate.of(1962, Month.JULY, 29), 8700.0);
        Person chris = new Person(4, "Chris", Gender.MALE,LocalDate.of(1993, Month.DECEMBER, 16), 1800.0);
        Person laynie = new Person(5, "Laynie", Gender.FEMALE,LocalDate.of(2012, Month.DECEMBER, 13), 0.0);
        Person lee = new Person(6, "Li", Gender.MALE,LocalDate.of(2001, Month.MAY, 9), 2400.0);
        List<Person> persons = Arrays.asList(ken,jeff,donna,chris,laynie,lee);
        return persons;
    }
    public static boolean isFemale(Person p){
        return p.getGender() == Gender.FEMALE;
    }
    public static boolean isMale(Person p){
        return p.getGender() == Gender.MALE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", income=" + income +
                '}';
    }
    public static void main(String[] args){
        Person.persons()
                .stream()
                .filter(Person::isFemale)
                .forEach(System.out::println);

        Person.persons()
                .stream()
                .filter(Person::isFemale)
                .map(Person::getName)
                .forEach(System.out::println);
        Person.persons()
                .stream()
                .filter(Person::isMale)
                .filter(p -> p.getIncome() > 5000.0)
                .map(Person::getName)
                .forEach(System.out::println);
        double sum = Person.persons()
                .stream()
                .reduce(0.0, (partialSum, person) -> partialSum + person.getIncome(),
                        (a, b) -> {
                            System.out.println("Combiner called: a = " + a + "b = " + b );
                            return a + b;
                        });
        System.out.println(sum);
        long personCount = Person.persons()
                .stream()
                .count();
        System.out.println("Person count: " + personCount);

        List<String> names2 = Person.persons()
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names2);

        Set<String> uniqueNames = Person.persons()
                .stream()
                .map(Person::getName)
                .collect(Collectors.toSet());
        System.out.println(uniqueNames);
        List<String> sortedName = Person.persons()
                .stream()
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedName);
        Map<Long,String> idToNameMap = Person.persons()
                .stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println(idToNameMap);
        Map<Boolean, List<Person>> partionedByMaleGender =
                Person.persons()
                        .stream()
                        .collect(Collectors.partitioningBy(Person::isMale));
        System.out.println(partionedByMaleGender);


    }
}
