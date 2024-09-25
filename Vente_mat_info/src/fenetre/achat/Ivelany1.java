package fenetre.achat;

import java.text.*;
import javax.swing.*;

public class Ivelany1 {

    public static void imprimerjtable(JTable jt, String titre) {
        MessageFormat entete = new MessageFormat(titre);

        MessageFormat pied = new MessageFormat("Chiffre d'Affaire par client ");

        try {
            jt.print(JTable.PrintMode.FIT_WIDTH, entete, pied);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur :\n" + e, "Impression", JOptionPane.ERROR_MESSAGE);
        }
    }
}
