package org.example;

import org.example.business.concretes.DisplayManager;
import org.example.business.concretes.GameManager;
import org.example.entity.Menu;
import org.example.entity.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        DisplayManager displayManager = new DisplayManager();

        Range range = new Range(1,100);

        Menu menu = new Menu();
        menu.setMenuOption(1,"Easy (10 chances)");
        menu.setMenuOption(2,"Medium (5 chances)");
        menu.setMenuOption(3,"Hard (3 chances)");

        displayManager.displayWelcomeMessage("Number Guessing Game", 5, range);
        displayManager.displayLevelMenu(menu);

        System.out.println("Enter your choice: ");
        int choice = new Scanner(System.in).nextInt();

        gameManager.GameStart(choice, range, menu);
    }
}