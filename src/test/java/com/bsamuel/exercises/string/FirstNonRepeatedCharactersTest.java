package com.bsamuel.exercises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatedCharactersTest {


    @Test
    void testFirstNonRepeatedCharacter() {
        FirstNonRepeatedCharacters fNRC = new FirstNonRepeatedCharacters();

        Character ch = fNRC.firstNonRepeatedCharacter("hello_world");

        assertEquals('h', ch);

    }
}