package com.jgarfer.katas.sixkyu.findtheoddint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddIntFinder {

    public static int findIt(int[] numbers) {
        Map<Integer, Integer> counts = new HashMap<>();

        Arrays.stream(numbers)
                .forEach(n -> {
                    counts.putIfAbsent(n, 0);
                    counts.put(n, counts.get(n) + 1);
                });

        NumberCount numberCount = new ArrayList<>(counts.keySet())
                .stream()
                .map(n -> new NumberCount(n, counts.get(n)))
                .filter(nc -> nc.count % 2 != 0).max(NumberCount::compareTo).orElse(null);

        return numberCount == null ? 0 : numberCount.number;
    }

    public static class NumberCount implements Comparable<NumberCount> {
        private final Integer number;
        private final Integer count;

        public NumberCount(Integer number, Integer count) {
            this.number = number;
            this.count = count;
        }

        @Override
        public int compareTo(NumberCount o) {
            return count.compareTo(o.count);
        }
    }
}
