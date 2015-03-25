package nyc.c4q.lighterletter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList();

        System.out.println("Type in a list of names");


        while (true){
            String inputName = input.nextLine();


            if (inputName.equals("")){
                break;
            }
           names.add(inputName);
       }

        System.out.println("Your names have been saved!\n" +
                "Your names are:");

        for (int i = names.size()-1; i > -1; i--){
            System.out.println(names.get(i));
        }

        System.out.println("Search for a name: ");
        String searchName =input.next();


        if (names.contains(searchName)) {

            System.out.println("I found it. :)");
        }
        else {

            System.out.println("Sorry, I could not find anything. :(");
        }


    }
}
