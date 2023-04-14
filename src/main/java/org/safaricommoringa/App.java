package org.safaricommoringa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner userInputObject = new Scanner(System.in);
        System.out.println("Select process (e-encode/d-decode");
        String process = userInputObject.next();
        System.out.println(process);

    }
}
