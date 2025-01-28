package org.example.entity;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<Integer, String> map = new HashMap<>();

    public void getMenu()
    {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public String getValueFromKey(int key)
    {
        return map.getOrDefault(key, "");
    }

    public int getKeyNumber()
    {
        System.out.println("Map icerisindeki deger sayisi: " + map.size());
        return map.size();
    }

    public void setMenuOption(int optionNumber, String optionDescription) {
        map.put(optionNumber, optionDescription);
    }



}
