public class Video extends Documents{
    private float duree;

    public Video(String nom, float size, String auteur, float duree) {
        super(nom, size, auteur);
        this.duree = duree;
    }

    public float getDuree() {
        return duree;
    }
}
