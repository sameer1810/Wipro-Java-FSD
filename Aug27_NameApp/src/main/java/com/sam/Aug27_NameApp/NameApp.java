package com.sam.Aug27_NameApp;

import java.util.Scanner;

public class NameApp {

    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static void main(String[] args) {
        NameApp app = new NameApp();
        String name = app.enterName();
        System.out.println("Hello, " + name + "!");
    }
}
