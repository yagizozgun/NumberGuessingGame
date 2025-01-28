package org.example.business.concretes;

import org.example.business.abstracts.GameService;
import org.example.entity.Menu;
import org.example.entity.Range;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameManager implements GameService {

    private final Scanner s = new Scanner(System.in);

    @Override
    public void GameStart(int choice, Range range, Menu menu) {

        final int randomInt = (int) (Math.random() * (range.getSecondNumber() - range.getFirstNumber() + 1)) + range.getFirstNumber();

        if (choice > menu.getKeyNumber())
        {
            System.out.println("Gecersiz secenek.");
        }
        else
        {
            String message = "Great! You have selected the " + menu.getValueFromKey(choice) +
                    " difficulty level." + "\n" + "Let's start the game!";
            int attempt = 1;
            String value = menu.getValueFromKey(choice);
            int limitAttempt = extractNumberFromValue(value);
            // for test
            System.out.println(message);

            while(true)
            {
                if (attempt <= limitAttempt)
                {
                    System.out.print("Enter your guess: ");
                    int guess = s.nextInt();
                    if (guess > randomInt)
                    {
                        System.out.println("Incorrect! The number is less than " + guess);
                    }
                    else if (guess < randomInt)
                    {
                        System.out.println("Incorrect! The number is greater than " + guess);
                    }
                    else
                    {
                        System.out.println("Congratulations! You guessed the correct number in " + attempt + " attempts.");
                        break;
                    }
                }
                else
                {
                    break;
                }

                attempt++;
            }
        }
    }

    public static int extractNumberFromValue(String value) {
        Pattern pattern = Pattern.compile("\\((\\d+)"); // Parantez içindeki sayıyı yakalamak için regex
        Matcher matcher = pattern.matcher(value);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1)); // İlk yakalanan grubu döndür
        }

        throw new IllegalArgumentException("Parantez içinde sayı bulunamadı.");
    }
}
