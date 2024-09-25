
package fenetre.cli;

import java.text.*;
import javax.swing.*;



public class Divers {
    public static void imprimerjtable(JTable jt,String titre){
          MessageFormat entete = new MessageFormat(titre);
           MessageFormat pied = new MessageFormat("Page(0,number,integer)");
           
           try{
               jt.print(JTable.PrintMode.FIT_WIDTH , entete ,pied );
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null,"Erreur :\n"+e,"Impression",JOptionPane.ERROR_MESSAGE);
           }
    }
     
}
