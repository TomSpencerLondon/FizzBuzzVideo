package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzShould {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @ParameterizedTest
  @CsvSource({
      "0, 0",
      "1, 1",
      "2, 2",
      "3, Fizz",
      "4, 4",
      "5, Buzz",
      "6, Fizz",
      "7, 7",
      "8, 8",
      "9, Fizz",
      "10, Buzz",
      "15, FizzBuzz"
  })
  void return_correct_output_for_input(int input, String output) {
    assertEquals(output, fizzBuzz.convert(input));
  }
}
