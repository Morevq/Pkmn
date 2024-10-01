package ru.mirea.Morozova.pkmn;

import java.io.*;

public class CardExport {
    public CardExport(Card card) throws IOException {
        File myFile = new File(card.getName() + ".crd");
        FileOutputStream fileOutputStream = new FileOutputStream(myFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(card);
    }
}
