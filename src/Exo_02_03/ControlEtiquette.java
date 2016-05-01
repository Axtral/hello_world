package Exo_02_03;

import Exo_02_01.FenetreSimple;
import Exo_02_02.EtiquetteSimple;

import javax.swing.*;

/**
 * Created by c14012299 on 29/04/16.
 */
public class ControlEtiquette extends JToolBar {


    private ImageIcon[] iconesBoutons = new ImageIcon[18];
    private JRadioButton[] boutons = new JRadioButton[6];
    private final String nomsIcones[] = {"bhgauche", "bhdroite",
                                         "bvhaut", "bvcnedre", "bvbas"};

    private final int changeGroupeIcones = 6;


    private  void chargerIcones(){
        for(int i = 0 ; i < changeGroupeIcones; ++i){
            iconesBoutons[i] = new ImageIcon("RESGRAF/" + nomsIcones[i]+"gif");
            iconesBoutons[i + changeGroupeIcones] = new ImageIcon("RESGRAF" + nomsIcones[i]
                            + "R.gif");
            iconesBoutons[i + changeGroupeIcones * 2] = new ImageIcon("RESGRAF" + nomsIcones[i]
                            +"B.gif");
        }
    }

    private  void creerBoutons(){
        for(int i = 0; i < changeGroupeIcones ; ++i){
            boutons[i] = new JRadioButton(iconesBoutons[i]);
        }
    }

    public ControlEtiquette (){
        super();
        this.chargerIcones();
        this.creerBoutons();
    }

    public static void main (String[] args){
        new ControlEtiquette();
        FenetreSimple cadre = new FenetreSimple("Exo 2.4.5 barre a outil");
        cadre.pack();
        cadre.setVisible(true);
        cadre.setLocationRelativeTo(null);
    }
}
