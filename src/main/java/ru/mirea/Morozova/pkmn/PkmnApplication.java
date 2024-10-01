package ru.mirea.Morozova.pkmn;

import java.io.IOException;

public class PkmnApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CardImport cardImport= new CardImport("src/main/resoures/my_card.txt");
        Card my_card = cardImport.getCard();

        System.out.println(my_card);

        CardExport cardExport = new CardExport(my_card);
        Card import_some_card = cardImport.exportFromCrd("src/main/resoures/Sigilyph.crd");
        System.out.println(import_some_card);
    }
}
