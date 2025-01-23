package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    WorkintechList workintechList = new WorkintechList();
    workintechList.add("emre");
    workintechList.add(1,"beyza");
    workintechList.get(1);
        System.out.println(workintechList);
        System.out.println( workintechList.get(1));

         System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
         System.out.println(convertDecimalToBinary(13));
    }



//Was it a car or a cat I saw ?

    public static boolean checkForPalindrome(String input) {

        String[] clearedInput = input.toLowerCase(Locale.ENGLISH).replaceAll("[.,!?\"\\s'+]", "").split("");

        List<String> reverseInput = new ArrayList<>();

        for (int i = clearedInput.length - 1; i >= 0; i--) {
            reverseInput.add(clearedInput[i]);
        }
        for (int i = 0; i < clearedInput.length; i++) {
            if (!clearedInput[i].equals(reverseInput.get(i))) {
                return false;
            }
        }
        return true;
    }


    public static String convertDecimalToBinary(int number){

        StringBuilder binary = new StringBuilder();

        //List<String> binary = new ArrayList<>(); List yapınca ekleyemedim
        while(number > 0){
            binary.insert(0,number%2);
            number /= 2 ;
        }
        return binary.toString();
    }
}