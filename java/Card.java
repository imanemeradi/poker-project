
public class Card {


    public static final String[] valeur={"sept", "huit", "neuf", "dix", "valet", "dame", "roi", "as"};
    public static final String[] couleur={"carreau", "trefles", "coeur", "piques"};
    public  String v;
    public  String c;

    //creation du constructeur qui permet d'initialiser les attributs pour chaque creations de cartes
    public Card(String v, String c){ 
        this.c=c;
        this.v=v;
    }

    private String getCouleur(){
        return c;
    }

    private String getValeur(){
        return v;
    }

    public void afficherCartes(){
        System.out.println(v+ " de "+c);
    }


   
}
