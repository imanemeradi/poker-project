import Deck;
import Card;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;




public class Joueur {

    String nom;

    public Joueur (String name){
        nom=name;
    }

    private static void getHandString(String[] hand){
        System.out.println(Arrays.stream(hand).collect(Collectors.joining(" ")));
    }

    public void getCardsToDiscard(){
        ArrayList liste = Arrays.asList(cartes);
        for (int i; i<5; i++){
            System.out.println("Voulez vous supprimer la carte " + cartes[i] + "? Tapez 1 si Oui ou Tapez 0 si non");  
            int answer = sc.nextInt();
            if (answer==1){
                cartes.remove(i);
            }

                }
    }

    
}
