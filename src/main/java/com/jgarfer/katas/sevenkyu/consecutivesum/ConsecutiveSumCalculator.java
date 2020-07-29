package com.jgarfer.katas.sevenkyu.consecutivesum;

public class ConsecutiveSumCalculator {

    public static int consecutiveSum(int num) {
        /*
        int n = 1 + (num > 1 ? num % 2 : 0);
        for (int currentLength = 3; currentLength <= num / 2 + 1; currentLength++) {
            int width = Math.max(currentLength - 2, 0);
            int init = Math.max(num / currentLength - width, 1);
            int sum = 0;
            for (int i = init; i < init + currentLength; i++) {
                sum += i;
            }

            if (sum == num) n += 1;
        }
        return n;
        */

        int n = 1 + (num > 1 ? num % 2 : 0);
        int aux = num;

        while (aux > 10 && aux % 10 == 0) {
            aux /= 10;
            n += 1;
        }

        for (int currentLength = 3; currentLength < aux / 2 + 1; currentLength += 2) {
            if (aux % currentLength == 0) {
                System.out.println(String
                        .format("Numero inical: %s, numero reducido: %s, longitud: %s", num, aux, currentLength));
                n += 1;
            }
        }
        return n;

    }
}
