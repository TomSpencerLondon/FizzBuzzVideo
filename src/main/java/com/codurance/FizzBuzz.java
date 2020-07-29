package com.codurance;

public class FizzBuzz {

  public String convert(int input) {
    if (input < 1){
      return "0";
    }

    if (input % 3 == 0){
      return "Fizz";
    }else if (input % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(input);
  }
}
