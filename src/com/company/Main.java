package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String zodis = "";

        while (!zodis.equals("pabaiga")) {
            zodis = sc.nextLine();
            System.out.println(zodis);
        }
    }
}
