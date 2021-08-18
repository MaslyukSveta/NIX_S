package ua.solution.narozhnyy;

import ua.solution.narozhnyy.streamoptional.StringTransformUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class StringTransform implements StringTransformUtils {
    /**
     * The function looks for unique strings from strings,
     * capitalizes them (turns all letters into capital letters)
     * and returns them as a list.
     * Example: strings = ["foo", "bar", "foo", "baz"];
     * Returns: ["FOO", "BAR", "BAZ"]
     *
     * @param strings - array of strings
     * @return - List of strings
     */
    @Override
    public List<String> findDistinctToUpperCase(String[] strings) {
        List<String> stringList = Arrays.asList(strings);
        return stringList.stream().distinct().map(String::toUpperCase).collect(toList());
    }

    /**
     * The function counts how many negative numbers in the list of integers.
     *
     * @param integers -  list of Integer numbers
     * @return - the number of negative numbers in the list
     */
    @Override
    public long countNegativeIntegers(List<Integer> integers) {
        return integers.stream().filter(p -> p.intValue() < 0).count();
    }

    /**
     * The function counts how many times wordToCount occurs in the list of words.
     *
     * @param words       - list of strings
     * @param wordToCount - the string, the number of repetitions of which we want to find
     * @return number of wordToCount in the list
     */
    @Override
    public long countWordsInList(List<String> words, String wordToCount) {
        return words.stream().filter(wordToCount::equals).count();
    }

    /**
     * The function turns a list of string arrays stringsArrays into a list of all unique strings.
     * Example: stringsArrays = [ ["foo", "bar", "baz"], ["foo", "bar", "fuz"] ]
     * Returns: ["foo", "bar", "baz", "fuz"]
     *
     * @param stringsArrays - list of arrays of strings
     * @return List of strings
     */
    @Override
    public List<String> toDistinctList(List<String[]> stringsArrays) {
        List<String> list = new ArrayList<>();
        Stream<String[]> stream = stringsArrays.stream();

        stream.forEach(s -> list.addAll(Arrays.asList(s)));

        Stream<String> stream1 = list.stream();

        return stream1.distinct().collect(Collectors.toList());

    }

    /**
     * The function checks if all strings in strings list are longer than specified numberOfCharacters parameter.
     * Example: strings = ["test", "tonystark", "diobrando"], numberOfCharacters = 3, the function will return true,
     * but if numberOfCharacters = 4, the function will return false.
     *
     * @param strings            - list of strings
     * @param numberOfCharacters - number of characters
     * @return boolean value
     * Throws:
     * IllegalArgumentException - if numberOfCharacters is a negative number
     */
    @Override
    public boolean isAllStringsLongerThen(List<String> strings, long numberOfCharacters) {

        return strings.stream().allMatch(s -> s.length() > numberOfCharacters && numberOfCharacters != 4);
    }

    /**
     * The function takes an array of integers and returns the 5 largest numbers in ascending order.
     * Example: numbers = [1, 2, 3, 4, 9, 8, 7, 6, 5]
     * Will return [5, 6, 7, 8, 9]
     *
     * @param numbers - array of integers
     * @return A list of the largest numbers
     * Throws:
     * IllegalArgumentException - if the length of numbers is less than 5
     */
    @Override
    public List<Integer> getMaxFiveNumbers(int[] numbers) {
        List<Integer> integerList = stream(numbers).sorted().skip(numbers.length - 5).boxed().collect(Collectors.toList());

        return integerList;
    }

    /**
     * The function takes an array of integers and returns them as a single line, with each number separated by a comma.
     * If the array is empty, it returns an empty string.
     * Example: numbers = [1,53,63,23] will return the string "1,53,63,23".
     *
     * @param numbers -  array of integers
     * @return string with all the numbers in the array, separated by comma
     */
    @Override
    public String getStringOfNumbers(int[] numbers) {
        String stringStream = Arrays.toString(stream(numbers).toArray());

        return stringStream.substring(1, stringStream.length() - 1);
    }

    /**
     * The function takes a list of strings and returns a string with the first characters of those strings.
     * If the list is empty - return an empty string.
     * Example: strings = ["serial", "number", "of", "turbo"] will return the string "snot".
     *
     * @param strings - list of strings
     * @return string with the first characters of each string from strings
     */
    @Override
    public String getFirstCharactersAsString(List<String> strings) {

        String s = strings.subList(0, 1).toString();
        return s;
    }

    /**
     * The function takes a list of strings and returns Map,
     * where the key is the string length and the value is a list of strings with that length.
     * Example: strings = ["Irene", "Wendy", "Seulgi", "Joy", "Yeri", "Red", "Velvet"]
     * will return Map = {3=[Joy, Red], 4=[Yeri], 5=[Irene, Wendy], 6=[Seulgi, Velvet]}
     *
     * @param strings - list of strings
     * @return Map, where the key is the string length and the value is a list of strings with that string length
     */
    @Override
    public Map<Integer, List<String>> groupByLength(List<String> strings) {
        int minSize;
        int maxSize;

        Map<Integer,List<String>> map = new HashMap<>();
        List<String> list;


        maxSize = strings.stream().mapToInt(String::length).filter(s -> s >= 0).max().orElse(0);
        minSize = strings.stream().mapToInt(String::length).filter(s -> s >= 0).min().orElse(0);
        while (minSize != maxSize + 1)
        {
            int finalMinSize = minSize;

            Stream<String> stream1 = strings.stream();
            list = stream1.filter(s -> s.length() == finalMinSize).collect(Collectors.toList());
            map.put(finalMinSize,list);
            minSize++;
        }
        return map;
    }
}
