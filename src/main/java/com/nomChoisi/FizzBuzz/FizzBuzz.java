package com.nomChoisi.FizzBuzz;

public class FizzBuzz {
    public static String FizzBuzznb(int n) {
        if(n%3==0 && n%5==0){
            return "FIZZBUZZ";
        }else if(n%3==0 ){
            return "FIZZ";
        }else if(n%5==0){
            return "BUZZ";
        }else
        return String.valueOf(n);

}}
