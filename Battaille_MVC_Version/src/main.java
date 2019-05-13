import Controler.JeuMainControl;
import Model.JeuModel;

public class main {
    public static void main(String[] args) {
        JeuModel jeu = new JeuModel();
        JeuMainControl game = new JeuMainControl(jeu);
    }
}
