public class Music extends  Documents{
    private float duree;

    public Music(String nom, float size, String auteur, float duree) {
        super(nom, size, auteur);
        this.duree = duree;
    }

    public float getDuree() {
        return duree;
    }
}
