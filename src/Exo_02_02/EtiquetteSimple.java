package Exo_02_02;

import Exo_02_01.FenetreSimple;

import javax.swing.*;
import java.awt.Window;

/**
 * Created by c14012299 on 29/04/16.
 */
public class EtiquetteSimple extends JLabel {

    public EtiquetteSimple(String text, ImageIcon icon){
        super(text , icon , CENTER);
        setIconTextGap(20);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


    }


    public static void main(String[] args) {

        FenetreSimple cadre = new FenetreSimple("Une fenêtre avec une chien");
        ImageIcon chien = new ImageIcon("RESGRAF/Chien.gif");
        EtiquetteSimple etiquette = new EtiquetteSimple("un chien",chien);
        etiquette.setHorizontalTextPosition(LEFT);
        etiquette.setVerticalTextPosition(CENTER);
        cadre.getContentPane().add(etiquette);
        cadre.pack();
        cadre.setVisible(true);
        cadre.setLocationRelativeTo(null);


    }
}
