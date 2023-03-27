public class Texte extends Documents{
    private int nbrLigne;

    public Texte(String nom, float size, String auteur , int nbrLigne) {
        super(nom, size, auteur);
        this.nbrLigne = nbrLigne;
    }

    public int getNbrLigne() {
        return nbrLigne;
    }
}
