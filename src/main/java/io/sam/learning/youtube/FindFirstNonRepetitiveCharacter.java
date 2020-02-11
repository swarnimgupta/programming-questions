package io.sam.learning.youtube;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepetitiveCharacter {

    @SneakyThrows
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System.in))) {
            String s = bufferedReader.readLine ( );
            Map<Character, Integer> map = new LinkedHashMap<> ( );
            for (int i = 0; i < s.length ( ); i++) {
                if (map.containsKey (s.charAt (i))) {
                    map.put (s.charAt (i), map.get (s.charAt (i)) + 1);
                } else {
                    map.put (s.charAt (i), 1);
                }
            }
            for (Character character : map.keySet ( )) {
                if (map.get (character) == 1) {
                    System.out.println (character);
                    break;
                }
            }
        }
    }

}
