package nyc.c4q.lighterletter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Access Code 2.1
 *
 * Author  <YOUR NAME>
 * Date    March 2015
 *
 * This class asks the user which car they have and prints its price.
 */

public class BlueBook {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 1. Create a Scanner for user input.

        ArrayList<Car> cars = new ArrayList(); // 2. Create an ArrayList that holds type Car.

        // 3. Create a few new Car objects and add them to the ArrayList.

        Car camaro1989 = new Car("Chevrolet", "Camaro", 1989, 1000000.00);
        cars.add(camaro1989);
        Car bmw2014 = new Car("BMW", "M4", 2014, 65000.00);
        cars.add(bmw2014);


        System.out.println("Type in the car's make: ");
        String make = input.nextLine();
        System.out.println("Type in the cars model:");
        String model = input.nextLine();
        System.out.println("Type in the model year: ");
        int year = input.nextInt();

        for (int i=0; i < cars.size(); i++){
            Car newCar = cars.get(i);

            if (newCar.getMake().equals(make)
                    && newCar.getModel().equals(model)
                    && newCar.getYear()== year){
                System.out.println("Your " + year + " " + make + " " + model + " Is worth: " + cars.get(i).getPrice());
                break;

            } else {
                System.out.println("Not in our database");

            }
        }




// 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.


        // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
        //    ...make
        //    ...model
        //    ...year
       /* while (true) {
            String carsObject = input.nextLine();
            // 3. Create a few new Car objects and add them to the ArrayList.
            if (input.equals("")){
                break;
            }
            //cars.add(carsObject);
        }
        // 6. Print the price of that car.
    }*/
    }

}

