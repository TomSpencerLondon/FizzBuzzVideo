package com.codurance;

public class FizzBuzz {

  public String convert(int input) {
    StringBuilder result = new StringBuilder();

    if (input < 1){
      return "0";
    }



    if (input % 3 == 0){
      result.append("Fizz");
    }else if (input % 5 == 0) {
      result.append("Buzz");
    }

    if (result.length() == 0){
      result.append(input);
    }

    return result.toString();
  }
}
