package org.safaricommoringa;

//import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);

        do {
            System.out.println("Select the Process: (e-encode/d-decode:");
            String process = userInputObject.nextLine();

            System.out.println("Enter Your Message:for Encoding; THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\n" +
                    "Decoding; QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
            String msg = userInputObject.nextLine();

            System.out.println("Enter Any key: From 0 - 25; 23 for encoding and 3 for decoding");
            int key = userInputObject.nextInt();

            System.out.println("Your Program is Processing...");
            System.out.println(process);
            if (process.startsWith("e")){
                String output = Encoding.encode(msg, key);
                System.out.println(output);
            } else if (process.startsWith("d")) {
                String output = Decoding.decode(msg, key);
                System.out.println(output);
            } else {
                System.out.println("Your process is Invalid");
                continue;
            }
            System.out.println("Do you want to quit or continue the program");
            String nextStep = userInputObject.nextLine();
            if (nextStep.startsWith("q")){
                break;
            }
        } while(true);


    }
}
