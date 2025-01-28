package org.example.business.abstracts;

import org.example.entity.Menu;
import org.example.entity.Range;

public interface DisplayService {

    void displayWelcomeMessage(String gameName, int chance, Range range);
    void displayLevelMenu(Menu menu);

}
