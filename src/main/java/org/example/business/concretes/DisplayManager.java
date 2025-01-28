package org.example.business.concretes;

import org.example.business.abstracts.DisplayService;
import org.example.entity.Menu;
import org.example.entity.Range;

public class DisplayManager implements DisplayService {

    @Override
    public void displayWelcomeMessage(String gameName, int chance, Range range) {
        String message = "Welcome to the " + gameName + "\n" +
                "I'm thinking of a number between " + range.getFirstNumber() +
                " and " + range.getSecondNumber() + ". " + "\n" +
                "You have " + chance + " chances to guess the correct number. \n";

        System.out.println(message);
    }

    @Override
    public void displayLevelMenu(Menu menu) {
        menu.getMenu();
    }
}
