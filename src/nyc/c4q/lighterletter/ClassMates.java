package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/24/15.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ClassMates {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Call the needed constructor.
            ArrayList<ClassMates> classmates = new ArrayList<ClassMates>();

            classmates.add("Joseph");
            classmates.add("Nathan");

            // How would you ask the program if classmates included your name?

            System.out.println(classmates.size());
            System.out.println("Search for a name: ");
            String searchName =input.next();


            if (classmates.contains(searchName)) {

                System.out.println("I found it. :)");
            }
            else {

                System.out.println("Sorry, I could not find anything. :(");
            }

        }
    }

