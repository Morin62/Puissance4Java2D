package puissance4java2d;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 * Coeur du jeu, boucle de calcul et d'affichage
 * @author Jerome
 * @version 1.0, le 30/04/2014
 */

public class Game implements Constantes {
       
    private final Grille grille;
    private Pion p;

    public Game() {

        this.grille = new Grille();
        this.p = new Pion(2, 2);
    }

    public void calcul() {
        
       jouerPion();

    }

    public void affichage(Graphics g) {
        
        if(GRIILE_ON)
            this.grille.Affichage(g);
        
        this.p.Afficher(g);
       
    }
    
    public void jouerPion() {
        
    }
    
    public void gestionDuClavier(KeyEvent ke) {
        
//        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
//            this.serpent.setNouvelleDirection(Serpent.Direction.VERS_LA_DROITE);
//        else if(ke.getKeyCode() == KeyEvent.VK_LEFT)
//            this.serpent.setNouvelleDirection(Serpent.Direction.VERS_LA_GAUCHE);

//        else if (ke.getKeyCode() == KeyEvent.VK_DOWN)
//            this.serpent.setNouvelleDirection(Serpent.Direction.VERS_LE_BAS);
  
    }
  
}