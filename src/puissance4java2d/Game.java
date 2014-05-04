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
    
    private int compteurCouleur;
    
    public Game() {
        
        this.couleurPionBleu = Color.blue;
        this.couleurPionRouge = Color.red;
        this.grille = new Grille();
        this.curseur = new Curseur(4);
        this.listePions = new ArrayList<Pion>();
        this.compteurCouleur = 0;

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
            
            p.afficher(g);
            System.out.println("size"+this.listePions.size());
        }
    }
    
    public void ajouterPion() {
        
        int y =  NB_CASE_Y-1;
        
        Pion pion = new Pion(this.curseur.getPosX(), y, this.couleurPionBleu);
        
        for (Pion p : this.listePions) {
            
            if(pion.equals(p))
                pion.setPosY(y--);
        } 
        
        if(this.compteurCouleur % 2 == 0)
            pion.setColor(couleurPionBleu);
        else if(this.compteurCouleur % 2 != 0)
            pion.setColor(couleurPionRouge);

        this.listePions.add(pion);
        this.compteurCouleur++;
    }
    
    public void gestionDuClavier(KeyEvent ke) {
        
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
            this.curseur.deplacerCurseur(Curseur.Direction.VERS_LA_DROITE);
        else if(ke.getKeyCode() == KeyEvent.VK_LEFT)
            this.curseur.deplacerCurseur(Curseur.Direction.VERS_LA_GAUCHE);
        else if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
            this.ajouterPion();
        }
  
    }
  
}