import Card;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Deck {

    public static final String[] valeur={"sept", "huit", "neuf", "dix", "valet", "dame", "roi", "as"};
    public static final String[] couleur={"carreau", "trefles", "coeur", "piques"};

        
        
    Card[] cartes=new Card[5];

       
    
    
    public Card getRandom(){

    for (int i = 0; i < cartesList.size(); i++) 
        {
           
            int index = (int)(Math.random() * cartesList.size());
            return (Card) cartesList.get(index);
            

        }
       
    
    }

    public  Card[] newRandomHand(){
            
        cartes[0]=getRandom();
        cartes[1]=getRandom();
        cartes[2]=getRandom();
        cartes[3]=getRandom();
        cartes[4]=getRandom();
        return cartes;
    }
    


public void getRandomCards(int n){
    for (int i=0; i<n; i++){
        cartes[i]=getRandom();
    }
}



    
    


ArrayList cartesList = new ArrayList();

    public void Deck(){  //constructeur qui initialise l'attribut cartesList avec toutes les cartes

    for (int i=0; i<valeur.length;i++){
        
        for (int j=0; j<couleur.length;j++){

            Card c= new Card(valeur[i],couleur[j]);

            cartesList.add(c); //creation des cartes valeurs et couleurs

        }

        }
    } }


