package puissance4java2d;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Coeur du jeu, boucle de calcul et d'affichage
 * @author Jerome
 * @version 1.0, le 30/04/2014
 */

public class Game implements Constantes {
       
    private final Grille grille;
    private Curseur curseur;
    private ArrayList<Pion> listePions;
    
    private Color couleurPionBleu;
    private Color couleurPionRouge;

    public Game() {
        
        this.couleurPionBleu = Color.blue;
        this.couleurPionRouge = Color.RED;
        this.grille = new Grille();
        this.curseur = new Curseur(4);
        this.listePions = new ArrayList<Pion>();

    }

    public void calcul() {
        
        this.curseur.calcul();
    }

    public void affichage(Graphics g) {
        
        this.curseur.affichage(g);
        
        if(GRIILE_ON)
            this.grille.Affichage(g);
        
        // Dessin des pions
        for (Pion p : this.listePions) {
            
            p.Afficher(g);
        }
       
    }
    
    public void ajouterPion(int poX, int posY, Color couleur) {
        
        this.listePions.add(new Pion(posY, posY, couleur));
    }
    
    public void gestionDuClavier(KeyEvent ke) {
        
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
            this.curseur.deplacerCurseur(Curseur.Direction.VERS_LA_DROITE);
        else if(ke.getKeyCode() == KeyEvent.VK_LEFT)
            this.curseur.deplacerCurseur(Curseur.Direction.VERS_LA_GAUCHE);
  
    }
  
}