package Other;

import java.awt.image.BufferedImage;

public class Carte {

    private static BufferedImage[] imageIndex;
    public static BufferedImage[] dosCarte;

    private Couleur m_couleurCarte;
    private Valeur m_valeurCarte;
    private int m_imageId;

    public Carte(Couleur couleurCarte, Valeur valeurCarte, int imageId) {
        this.m_couleurCarte = couleurCarte;
        this.m_valeurCarte = valeurCarte;
        this.m_imageId = imageId;
    }

    public Couleur getCouleurCarte() {
        return m_couleurCarte;
    }

    public Valeur getValeurCarte() {
        return m_valeurCarte;
    }

    public int getImageId() {
        return m_imageId;
    }
}
