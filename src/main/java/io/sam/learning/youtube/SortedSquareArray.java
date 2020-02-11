package io.sam.learning.youtube;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortedSquareArray {

    public static void main(String[] args) {
        int[] array = new int[]{-7, -3, -1, 4, 8, 12};
        Arrays.toString (Arrays.stream (array).map (i -> (int) Math.pow (i, 2)).sorted ( ).toArray ( ));
        Set<Integer> sortedArray = Arrays.stream (array).mapToObj (value -> (int) Math.pow (value, 2)).collect (Collectors.toCollection (TreeSet::new));
        System.out.println (sortedArray);
        return;
    }

}
