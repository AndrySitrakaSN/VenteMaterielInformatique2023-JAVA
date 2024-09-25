/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fenetre.achat;

import connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.*;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ASUS
 */
public class Camembert {
 private  Connection con;
 
    public Camembert(){
  
          DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();  // miantso le fonctoin connecter @le base de donnee 
           con = dbc.getConnection();  
            createPieChart();
}
    
   
    public void createPieChart()  {
        
          Statement smt;
           ResultSet rs;
     try {
         smt = con.createStatement();
          rs = smt.executeQuery("SELECT client.numCli, client.nomCli, (materiel.pu * SUM(achat.qte)) AS montant " +
                "FROM achat JOIN materiel ON materiel.numMat = achat.idMat " +
                "JOIN client ON client.numCli = achat.idCli " +
                "GROUP BY client.numCli");
                 DefaultPieDataset dataset = new DefaultPieDataset();
                 
            while (rs.next()) {
              int numCli = rs.getInt("numCli");
    String nomCli = rs.getString("nomCli");
    double montant = rs.getDouble("montant");
    
    dataset.setValue(nomCli, montant);
    
                   }
            
              JFreeChart chart = ChartFactory.createPieChart("Chiffre d'affaires par client", dataset, true, true, false);

              // Obtenir le plot du graphique camembert
PiePlot plot = (PiePlot) chart.getPlot();

StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0}: {1} ariary ({2})", new java.text.DecimalFormat("0.00"), new java.text.DecimalFormat("0.00%"));
plot.setLabelGenerator(labelGenerator);

// Définir le générateur de tooltips pour afficher la part de chaque portion
StandardPieToolTipGenerator tooltipGenerator = new StandardPieToolTipGenerator("{0}: {2}");
plot.setToolTipGenerator(tooltipGenerator);
              
              
            // Affichage du diagramme camembert dans une fenêtre
            ChartFrame frame = new ChartFrame("Diagramme camembert", chart);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            
     } catch (SQLException ex) {
         Logger.getLogger(Camembert.class.getName()).log(Level.SEVERE, null, ex);
     }
              
            
             /*   if (rs != null) rs.close();
                if (smt != null) smt.close();
                if (con != null) con.close();*/
           
        }  
   

     
}

    
