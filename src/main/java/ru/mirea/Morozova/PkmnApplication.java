package ru.mirea.Morozova;

import ru.mirea.pkmn.Card;

import java.io.IOException;

public class PkmnApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CardImport cardImport= new CardImport("src/main/resoures/my_card.txt");
        Card my_card = cardImport.getCard();

        System.out.println(my_card);

        CardExport cardExport = new CardExport(my_card);
        Card import_some_card = cardExport.deserialize("src/main/resoures/Pyroar.crd");
        System.out.println(import_some_card);
    }
}
