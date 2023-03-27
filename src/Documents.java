public abstract class Documents {
    protected String nom;
    protected float size;
    protected String auteur;

    public Documents(String nom, float size, String auteur) {
        this.nom = nom;
        this.size = size;
        this.auteur = auteur;
    }

    public String getNom() {
        return nom;
    }

    public float getSize() {
        return size;
    }

    public String getAuteur() {
        return auteur;
    }
}
