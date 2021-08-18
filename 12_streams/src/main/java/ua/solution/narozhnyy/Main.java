package ua.solution.narozhnyy;

import java.util.ArrayList;
import java.util.List;

class Main {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {


        StringTransform stringTransform = new StringTransform();

        String[] strings = {"sklnf", "jfnkew", "rkfn", "rkfn"};
        LOGGER.info(String.valueOf(stringTransform.findDistinctToUpperCase(strings)));


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(-1);
        integerList.add(-31);
        integerList.add(19);
        integerList.add(16);
        integerList.add(71);
        integerList.add(-451);
        integerList.add(31);
        integerList.add(61);
        integerList.add(17);
        integerList.add(12);
        integerList.add(15);
        integerList.add(451);
        integerList.add(164);
        integerList.add(231);
        LOGGER.info(String.valueOf(stringTransform.countNegativeIntegers(integerList)));


        int[] myArray = {34, 45, 56, 67, 78, 78, 89, 90, 1, 9, 8, 7, 3, 54, 82, 100};
        LOGGER.info(stringTransform.getStringOfNumbers(myArray));


        List<String> stringList = new ArrayList<>();
        stringList.add("dlkf");
        stringList.add("skdnf");
        stringList.add("skdfn");
        stringList.add("skdfn");

        String wordToCount = "skdfn";
        LOGGER.info(String.valueOf(stringTransform.countWordsInList(stringList, wordToCount)));


        List<String[]> stringList1 = new ArrayList<>();
        String[] strings1 = {"sklnf", "jfnkew", "rkfn", "rkfn", "jfnkew", "rkfn", "rkfn"};
        stringList1.add(strings);
        stringList1.add(strings1);

        LOGGER.info(String.valueOf(stringTransform.toDistinctList(stringList1)));
        long numberOfCharacters = 4;
        LOGGER.info(String.valueOf(stringTransform.isAllStringsLongerThen(stringList, numberOfCharacters)));

        LOGGER.info(String.valueOf(stringTransform.getMaxFiveNumbers(myArray)));


    }


}