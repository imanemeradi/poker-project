import Deck;
import Card;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Scanner;


public class Joueur {

    Card[] main = new Card[5];
    String nom;

    public Joueur (String name){
        nom=name;
    }

    //convert la main en chaine de caractere
    private String getHandString(String[] hand){
        return java.util.Arrays.toString(main);
    }

    public void getCardsToDiscard(){
        Scanner scanner = new Scanner(System.in);
        ArrayList listeMain = (ArrayList) Arrays.asList(main);
        for (int i=0; i<5; i++){
            System.out.println("Voulez vous supprimer la carte " + main[i] + "? Tapez 1 si Oui ou Tapez 0 si non");  
            int answer = scanner.nextInt();
            if (answer==1){
                listeMain.remove(i);
            }

                }
    }

    //faire de la main une méthode pour être appeler dans le main
    public void setHand(Card[] cartes) { 
        for (int i = 0; i < 5; i++) {
            
                main[i] = new Card(cartes[i].v,cartes[i].c);
            
        }

    }

// ajoute les cartes si il en manque à une position donnée
    public void addCard(Card[] cartes) { 
        for (int i = 0; i < 5; i++) {
            if (main[i]==null){  
                main[i] = new Card(cartes[i].v,cartes[i].c);
            }
        }
    }


    public static int poker(Card[] main){
    int countMax = 1; 
        for(int i = 0;i<main.length;i++){ 
            int count = 1;
        	for(int j = i+1;j<main.length;j++){ 
        		if(main[i].equals(main[j])){ 
        			count++; 
        		} 
        	} 
            if (count>countMax){
                countMax=count;
            }
        }
        if(countMax == 4) { 
            return 4;
            //break; 
        }
        if (countMax == 2) { 
            return 2;
            //break;  
        } 
        
        if (countMax == 3) { 
            return 3;
            //break;  
        } 

        else {
            return 1;
        }
    }

    public Boolean beats(Joueur j){
        if (Joueur.poker(main)>Joueur.poker(j.main)){
            System.out.println("Bravo, Vous avez gagner");
            return true;
        }
        else{
            System.out.println("Vous avez perdu");
            return false;
        }
    }


    
}
