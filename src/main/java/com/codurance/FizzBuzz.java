package com.codurance;

import java.util.Arrays;
import java.util.function.Predicate;

public class FizzBuzz {

  public String convert(int input) {
    StringBuilder result = new StringBuilder();

    if (input < 1){
      return "0";
    }


    appendIf(p -> isDivisibleBy(input, p), result);

    if (result.length() == 0){
      result.append(input);
    }

    return result.toString();
  }

  private void appendIf(Predicate<? super Value> predicate, StringBuilder builder){
    Arrays.stream(Value.values())
        .filter(predicate)
        .forEach(p -> builder.append(p.response));
  }

  private boolean isDivisibleBy(int input, Value value) {
    return input % value.number == 0;
  }

  private enum Value {
    THREE(3, "Fizz"),
    FIVE(5, "Buzz");

    public int number;
    public String response;

    Value(int number, String response) {
      this.number = number;
      this.response = response;
    }
  }
}
