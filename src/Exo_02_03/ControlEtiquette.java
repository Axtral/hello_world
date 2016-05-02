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
    private final String nomsIcones[] = {"bhgauche", "bhcentre", "bhdroite",
                                         "bvhaut", "bvcentre", "bvbas"};

    private final int changeGroupeIcones = 6;


    private  void chargerIcones(){
        for(int i = 0 ; i < changeGroupeIcones; ++i){
            iconesBoutons[i] = new ImageIcon("RESGRAF/" + nomsIcones[i]+".gif");
            System.out.println("RESGRAF/" + nomsIcones[i]+".gif");
            iconesBoutons[i + changeGroupeIcones] = new ImageIcon("RESGRAF/" + nomsIcones[i]
                            + "R.gif");
            iconesBoutons[i + changeGroupeIcones * 2] = new ImageIcon("RESGRAF/" + nomsIcones[i]
                            +"B.gif");
        }
    }

    private  void creerBoutons(){

        ButtonGroup troisPremierObject = new ButtonGroup();
        ButtonGroup troisDernierObject = new ButtonGroup();

        for(int i = 0; i < changeGroupeIcones ; ++i){
            boutons[i] = new JRadioButton(iconesBoutons[i]);
            if( i < 3) {
                troisPremierObject.add(boutons[i]);
            }
            else {
                troisDernierObject.add(boutons[i]);
            }
        }
    }

    public ControlEtiquette (){
        super();
        this.chargerIcones();
        this.creerBoutons();
        for (int i = 0; i<boutons.length; ++i)
        {
            this.add(boutons[i]);
        }
    }


    public static void main (String[] args){
        ControlEtiquette control = new ControlEtiquette();
        FenetreSimple cadre = new FenetreSimple("Exo 2.4.5 barre a outil");
        cadre.add(control);
        cadre.pack();
        cadre.setVisible(true);
        cadre.setLocationRelativeTo(null);
    }
}
