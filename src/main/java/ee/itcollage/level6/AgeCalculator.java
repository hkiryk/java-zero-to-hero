package ee.itcollage.level6;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        int year= 0;
        System.out.println("How old are you?");
        Scanner sc = new Scanner(System.in);
        int insertedInt = sc.nextInt();

        System.out.println("Insert the number of your birth month ");
        Scanner sc1 = new Scanner(System.in);
        int birthInt = sc.nextInt();
        if (birthInt >= 3 ){
            year= 2018 -insertedInt;
        } else{
            year = 2019 - insertedInt;
        }

        //or sc.nextLine() for String
        System.out.println("You are: " + insertedInt + " years old " + " you were born in " + year);
        if (insertedInt >= 18){
            System.out.println("Have you coded java? ");
            Scanner sc2 = new Scanner(System.in);
            String response = sc2.nextLine();
            if (response.equals("yes") ){ System.out.println("Good for you");}
            else System.out.println("You should try");
        }

        // todo calculate and print which year person was born in
        // todo if person is 18+ ask them whether they have coded java
        // todo if yes, do sth, if no, do sth else
    }
}
