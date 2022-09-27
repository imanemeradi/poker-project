import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Card {


    public static String[] valeur={"sept", "huit", "neuf", "dix", "valet", "dame", "roi", "as"};
    public static String[] couleur={"carreau", "trefles", "coeur", "piques"};

    ArrayList cartes = new ArrayList();

    

    for (int i; i<valeur.length();i++){
        for (int j; j<couleur.length();i++){

            cartes.add(valeur[i] + "de" + couleur[j]); //creation des cartes valeurs et couleurs

        }
    }

}
