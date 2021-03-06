package Exo_02_03;

import Exo_02_01.FenetreSimple;
import Exo_02_02.EtiquetteSimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by c14012299 on 29/04/16.
 */
public class ControlEtiquette extends JToolBar {


    private ImageIcon[] iconesBoutons = new ImageIcon[18];
    private JRadioButton[] boutons = new JRadioButton[6];
    private final String nomsIcones[] = {"bhgauche", "bhcentre", "bhdroite",
                                         "bvhaut", "bvcentre", "bvbas"};

    private final int changeGroupeIcones = 6;

    private final int positions[] = { JLabel.LEFT, JLabel.CENTER, JLabel.RIGHT, //horizontal
                                     JLabel.TOP, JLabel.CENTER, JLabel.BOTTOM}; //vertical

    private EtiquetteSimple etiquette;


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
            boutons[i].setRolloverIcon(new ImageIcon("RESGRAF/" + nomsIcones[i]
                    +"B.gif"));
            boutons[i].setSelectedIcon(new ImageIcon("RESGRAF/" + nomsIcones[i]+ "R.gif"));
            if( i < 3) {
                troisPremierObject.add(boutons[i]);
                boutons[i].addActionListener( new EcouteurVercal(i));
            }
            else {
                troisDernierObject.add(boutons[i]);
                boutons[i].addActionListener(new EcouteurHorizonral(i));
            }
        }
    }


    class EcouteurHorizonral implements ActionListener   {
        private  int position;

        EcouteurHorizonral(int position){
            this.position = position;
        }

        public void actionPerformed(ActionEvent evt){

        }
    }

    class EcouteurVercal implements ActionListener {
        private int position;

        EcouteurVercal(int position){
            this.position = position;
        }

        public void actionPerformed(ActionEvent evt){

        }
    }

    private void creeEcouteur(){

    }


    public ControlEtiquette (EtiquetteSimple etiquette) {
        super();
        this.chargerIcones();
        this.creerBoutons();
        for (int i = 0; i < boutons.length; ++i) {
            this.add(boutons[i]);
        }
    }

    public static void main (String[] args){
        ControlEtiquette control = new ControlEtiquette();
        FenetreSimple cadre = new FenetreSimple("Une fenetre complexe");
        ImageIcon chien = new ImageIcon("RESGRAF/Chien.gif");
        EtiquetteSimple etiquette = new EtiquetteSimple("un chien",chien);
        etiquette.setHorizontalTextPosition(LEFT);
        etiquette.setVerticalTextPosition(CENTER);
        cadre.getContentPane().add(etiquette);
        cadre.add(control);
        cadre.add(control , BorderLayout.NORTH);
        cadre.add(etiquette , BorderLayout.CENTER);
        cadre.pack();
        cadre.setVisible(true);
        cadre.setLocationRelativeTo(null);
    }
}
