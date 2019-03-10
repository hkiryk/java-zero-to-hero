package ee.itcollage.level12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarPicker {

    public static void main(String[] args) {
        //todo 3 simulate picking a car

        List<Car> garage = Arrays.asList(
                buildCar("Lamborgini Avendator", 2000000, false, 10.0),
                buildCar("Tesla Roadster", 100000, true, 9.0),
                buildCar("Toyota Prius", 20000, false, 5.0),
                buildCar("Lada", 5000, false, 2.0),
                buildCar("Bicycle", 100, false, 0.5)
        );
        System.out.println("Garage contains: \n");
        for (Car car : garage) {
            System.out.println(car.getModel());
        }


        //todo 3.1 what does garage print? Can you make it print something prettier?

        //todo 3.2 Ask user how much money do they have and pick them a car or cars based on cars you have in garage
        // uncomment following lines for reading input example
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        Integer input = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Minimal user rating(0-10)?");
        Double input1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Do you want electric car?");
        String input2 = scanner2.nextLine();

        boolean elc;
        if (input2.equals("yes")) elc = true;
        else elc = false;
       // System.out.println(elc);

        List <Car> recommendation = new ArrayList<>();
        for (Car car : garage) {
            if (car.getCost()<= input && car.getUserRating()>=input1 && elc == car.isElectric()){
                recommendation.add(car);
            }
        }

        if (recommendation.isEmpty()) System.out.println("Shop can not recommend you anything");
        else {
            System.out.println("\n");
            System.out.println("Shop recommends you: ");
            for (Car car : recommendation) {
                System.out.println(car.getModel());
            }
        }
        //todo ADVANCED
        // ask user 2nd question (+rating)

        //todo ADVANCED
        // ask user 3rd question (+electric)
    }

    private static Car buildCar(String name, int cost, boolean electric, double userRating) {
        Car car = new Car();
        car.setModel(name);
        car.setCost(cost);
        car.setElectric(electric);
        car.setUserRating(userRating);
        return car;
    }
}