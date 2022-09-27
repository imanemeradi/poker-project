import Joueur;
import Card;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Deck {
    
    enum Deck{
        AsdePique,
        AsdeCoeur,
        AsdeTrefle,
        AsdeCarreau,
        Roidecoeur,
        Roidetrèfle,
        Roidecarreau,
        Roidepiques,
        Reinedecoeur,
        Reinedepiques,
        Reinedecarreau,
        ReinedeTrèfle,
        Valetdepiques,
        Valet de coeur,
        Valet de trefles,
        Valet de carreau,
        Dix de piques,
        Dix de coeur,
        Dix de trefles,
        Dix de carreau,
        Neuf de piques,
        Neuf de coeur,
        Neuf de trefles,
        Neuf de carreau,
        Huit de piques,
        Huit de coeur,
        Huit de trefles,
        Huit de carreau,
        Sept de piques,
        Sept de coeur,
        Sept de trefles,
        Sept de carreau;

        public void getRandomCards(int n){
            for (int i; i<n; i++){
                carte[i]=Deck.drawRandom().name();
            }
        }
        
        private static Random rand = new Random();
        
        public static Deck drawRandom(){
            
             return (Deck) (Deck.class.getEnumConstants()[rand.nextInt(Deck.class.getEnumConstants().length)]);
        }

        String[] cartes=new String[5];

        public static String[] newRandomHand(){
            //String[] cartes=new String[5];
            cartes[0]=Deck.drawRandom().name();
            cartes[1]=Deck.drawRandom().name();
            cartes[2]=Deck.drawRandom().name();
            cartes[3]=Deck.drawRandom().name();
            cartes[4]=Deck.drawRandom().name();
            return cartes;
        }
        
    }
    
    private static void showHand(String[] hand){
        System.out.println(Arrays.stream(hand).collect(Collectors.joining(" ")));
    }

}