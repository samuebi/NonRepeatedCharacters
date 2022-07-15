package com.bsamuel.exercises.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacters {

    public static void main(String[] args) {

        FirstNonRepeatedCharacters fNRC = new FirstNonRepeatedCharacters();
        Character ch = fNRC.firstNonRepeatedCharacter("hello world");
        System.out.println(ch);
    }

    public char firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for(char ch: str.toCharArray()) {

            chars.compute(ch, (k, v) -> ( v == null) ? 1: ++v);

        }

        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

}
