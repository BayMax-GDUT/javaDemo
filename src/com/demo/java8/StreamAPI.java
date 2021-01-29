package com.demo.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        /* forEach */
        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);

        /* map */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            List<Integer> resultList = numbers.stream().map(i -> i * i).collect(Collectors.toList());
//            System.out.println(resultList);
        }

        /* filter */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            List<Integer> resultList = numbers.stream().filter(i -> i >= 5).collect(Collectors.toList());
//            System.out.println(resultList);
        }

        /* limit */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            List<Integer> resultList = numbers.stream().limit(5).collect(Collectors.toList());
//            System.out.println(resultList);
        }

        /* sorted */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 10; i > 0; i--) {
                numbers.add(i);
            }
            List<Integer> resultList = numbers.stream().sorted((a, b) -> a - b).collect(Collectors.toList());
//            System.out.println(resultList);
        }

        /* parallel */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
//           numbers.parallelStream().forEach(System.out::println);
        }

        /* distinct */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
//            System.out.println("before distinct: " + numbers);
//            System.out.println("after distinct: " + numbers.stream().distinct().collect(Collectors.toList()));
        }

        /* match */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
//            System.out.println(numbers.stream().allMatch(s -> s >= 5));
//            System.out.println(numbers.stream().anyMatch(s ->  s == 9));
//            System.out.println(numbers.stream().noneMatch(s -> s > 10));
        }

        /* count */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
//            System.out.println(numbers.stream().limit(5).count());
        }

        /* reduce */
        {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            Optional<Integer> reduce = numbers.stream().reduce(Integer::max);
            reduce.ifPresent(System.out::println);
        }

        /* collectors */
        {
            List<String> numbers = new ArrayList<>();
            for (Integer i = 0; i < 10; i++) {
                numbers.add(i.toString());
            }
            for (Integer i = 0; i < 10; i++) {
                numbers.add(i.toString());
            }
//            System.out.println("toList: " + numbers.stream().collect(Collectors.toList()));
//            System.out.println("toSet: " + numbers.stream().collect(Collectors.toSet()));
//            numbers = new ArrayList<>(new HashSet<>(numbers));
//            System.out.println("toMap: " + numbers.stream().collect(Collectors.toMap((i -> i), (i -> Integer.parseInt(i) * Integer.parseInt(i)))));
//            System.out.println("joining: " + numbers.stream().collect(Collectors.joining(",")));
        }

    }
}



















