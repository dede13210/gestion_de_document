public class Image extends  Documents{
    private int[] pixel;

    public Image(String nom, float size, String auteur, int[] pixel) {
        super(nom, size, auteur);
        this.pixel = pixel;
    }

    public int[] getPixel() {
        return pixel;
    }
}
