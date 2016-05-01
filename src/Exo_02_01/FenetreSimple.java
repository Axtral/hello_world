package Exo_02_01;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Window;
import java.lang.String;

/**
 * Created by c14012299 on 29/04/16.
 */
public class FenetreSimple extends JFrame {

    public FenetreSimple(String title) {

        super(title);
        pack();
        setSize(300, 100);

        class MonWindowAdapeter extends WindowAdapter{
            public void windowClosing(WindowEvent e){
                JOptionPane.showConfirmDialog(FenetreSimple.this, "Es-tu sur de vouloir fermer cette fenetre");
                System.exit(0);
            }
        }

        addWindowListener(new MonWindowAdapeter());


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FenetreSimple ("Une fenêtre simple");


    }
}
