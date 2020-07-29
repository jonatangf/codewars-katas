package com.jgarfer.katas.sevenkyu.highandlow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowestCalculator {

    public static String calculate(String numbers) {
        List<Integer> convertedNumbers = Arrays
                .stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Integer lowestNumber = convertedNumbers.stream().min(Integer::compareTo).orElse(0);
        Integer highestNumber = convertedNumbers.stream().max(Integer::compareTo).orElse(0);
        return highestNumber + " " + lowestNumber;
    }
}
