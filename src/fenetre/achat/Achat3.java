
package fenetre.achat;
import fenetre.cli.*;
import fenetre.mat.*;

import java.util.Date;  // resaka date 
import java.text.SimpleDateFormat;

import java.sql.*; // sql rehetra
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; // ito indray @ Affichage @ le tableau vo miasa 
import connection.DatabaseConnection;
import javax.swing.table.TableRowSorter;   // ito le @le cherche anaty  Table
// --------------------- * --------------------- debut de code

public class Achat3 extends javax.swing.JFrame {
          private Connection con;
          private int numMat1;
          private int numC;
          private int numClient; // Déclaration de la variable membre
          private static int olona;
          //private static int numCli;
          //private int num_Cli;
 //------------------------------------------------------------- Principal          
    public Achat3() {
        initComponents();
        initComponents();
        initComponents();
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();  // miantso le fonctoin connecter @le base de donnee 
        con = dbc.getConnection();   //dbc.getConnection();
        settableClientData();
        settableMaterielData();
        settableCData();
        aler();
        retrieveNumClient(); // Appel de la méthode pour récupérer le numéro du client
        nbr(con);
        //System.out.println(olona);
        getCurrentDate(); // resaka date 
    }
     //--------------------------------------------------------------------------------------------------- 
    private void retrieveNumClient() {
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT numCli FROM client WHERE nomCli = 'John Doe'");
            
            if (rs.next()) {
                numClient = rs.getInt("numCli"); // Stockage de la valeur dans la variable numClient
                System.out.println("Le numéro du client est : " + numClient);
            }
            
            rs.close();
            smt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
 //------------------------------------------------------ variable numCli
   private void num() throws SQLException{
               Statement smt = con.createStatement();
              ResultSet rs = smt.executeQuery("SELECT numCli FROM Client");
             int snrs = 0; // Déclarer une variable pour stocker le numCli
                if (rs.next()) {
                   snrs = rs.getInt("snrs"); // Récupérer la valeur du numCli du premier enregistrement
                            }
                        rs.close();
                        smt.close();
   }
 //-----------------------------------------------------------------------
   private void aler(){
       System.out.println(numClient);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMateriel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCherche = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtDesigne = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAjouterMat = new javax.swing.JButton();
        btnSupprimerC = new javax.swing.JButton();
        btnAjoutfinal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNbr = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPu = new javax.swing.JTextField();
        txta1 = new javax.swing.JTextField();
        txta2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnVente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCli = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        tableMateriel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMateriel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMaterielMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMateriel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        tableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableC);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Chercher");

        txtCherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChercheKeyReleased(evt);
            }
        });

        txtDesigne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesigneActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Num");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Designation");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Prix");

        btnAjouterMat.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnAjouterMat.setForeground(new java.awt.Color(51, 255, 51));
        btnAjouterMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/[034561].png"))); // NOI18N
        btnAjouterMat.setText("Accepter");
        btnAjouterMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterMatActionPerformed(evt);
            }
        });

        btnSupprimerC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSupprimerC.setForeground(new java.awt.Color(255, 153, 153));
        btnSupprimerC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-supprimer.png"))); // NOI18N
        btnSupprimerC.setText("Supprimer");

        btnAjoutfinal.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnAjoutfinal.setForeground(new java.awt.Color(0, 204, 204));
        btnAjoutfinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-approbation-94.png"))); // NOI18N
        btnAjoutfinal.setText("Validé");
        btnAjoutfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutfinalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Table Materiel ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nombre");

        txtNbr.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(75, 75, 75)
                .addComponent(txtNbr, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNbr, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Stock");

        txtPu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuActionPerformed(evt);
            }
        });

        txta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txta1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fenetre/achat/imprimante (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Table de commande de Personne");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel12.setText("Total");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel13.setText("Ar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtDesigne, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStock)))
                            .addComponent(btnAjouterMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(82, 82, 82))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txta1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txta2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSupprimerC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnAjoutfinal))))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1)
                                        .addGap(5, 5, 5)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDesigne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txta2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txta1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSupprimerC, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(btnAjoutfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAjouterMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        btnVente.setBackground(new java.awt.Color(204, 204, 255));
        btnVente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/annuler.png"))); // NOI18N
        btnVente.setText("Annuler");
        btnVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        jLabel9.setText("Validation de Commande ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("#Projet 12 L3 IG Vente de Materiel Informatique ENI Fianrantsoa 2023");

        jLabel8.setFont(new java.awt.Font("MV Boli", 2, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/client.png"))); // NOI18N

        tableCli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tableCli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(313, 313, 313)
                .addComponent(btnVente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(882, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1294, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//===================================================================================================== 
    private void txtDesigneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesigneActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_txtDesigneActionPerformed
//------------------------------------------------------------------------------------------------------ Go vente
    private void btnVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenteActionPerformed
                      new Achat().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
    }//GEN-LAST:event_btnVenteActionPerformed

//--------------------------------------------------------------------------------------------------------rehefa ckiquena
    private void tableMaterielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMaterielMouseClicked
        // TODO add your handling code here:
                         try {
             numMat1 = Integer.parseInt(tableMateriel.getValueAt(tableMateriel.getSelectedRow(), 0).toString());
            //personTable.getValueAt(personTable.getSelectedRow(),toString();
            // System.out.println(personId);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from materiel where numMat=" + numMat1);
            if (rs.next()) {
                txtNum.setText(rs.getString(1));
                txtDesigne.setText(rs.getString(2));
                txtPu.setText(rs.getInt(3) + "");
                txtStock.setText(rs.getString(4));
            }
            rs.close();
            smt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tableMaterielMouseClicked

    private void txtPuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuActionPerformed
//-----------------------------------------------------------------------------------------------  Rechereche
    private void txtChercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChercheKeyReleased
        // TODO add your handling code here:
        String chercherString = txtCherche.getText();
        chercher(chercherString);
    }//GEN-LAST:event_txtChercheKeyReleased
//------------------------------------------------------------------------------------------------ ajout Client Materiel 
    private void btnAjouterMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterMatActionPerformed
        // TODO add your handling code here:
                String designation = txtDesigne.getText();               // System.out.println(name);
                String pu = txtPu.getText();                            // System.out.println(age);
                String stock = txtStock.getText();                      //System.out.println(contact);
                String num = txtNum.getText();
                String nbr1 = txtNbr.getText();
                       // ---------8--------------
                String num1 = num ;
                String designation1 = designation;
                String pu1 = pu;
                String stock1 = stock;
         int stock11 = Integer.parseInt(stock1);
         int nbr11 = Integer.parseInt(nbr1); 
         int num11 = Integer.parseInt(num1); 
         int rest = (stock11 - nbr11);
            int pu11 = Integer.parseInt(pu); 
            
        String date = getCurrentDate();
        System.out.println("Date d'aujourd'hui : " + date);    
        // System.out.println(olona);

         
      if (stock11>=nbr11){ // 
                  try {
            Statement smt = con.createStatement();
               
                    
            smt.execute("INSERT INTO `materielv`( `numMatx`, `nbrMatx`, `nomMatx`, `PuMatx` ,`numCli`, `daty`) VALUE  ('" + nbr11 + "','" + pu11 + "','" + designation1 + "','" + num11 + "' ,'"+olona+"','"+ date +"') ");
            JOptionPane.showMessageDialog(this, "Ajout avec succes");
           smt.execute("UPDATE materiel set stock ='" +rest+ "' Where numMat='" +num11+ "' " ); // manao - ny ao @table Materiel
            
            settableMaterielData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b                      
            smt.close();
            settableCData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erreur d'ajout");
                        //resetData();  // novana ho methode ary ambany ny end ny teto b  
        }
      }
      else if (stock11 == 0){
          JOptionPane.showMessageDialog(this, "Materiel Indisponible");
                      resetData();  // novana ho methode ary ambany ny end ny teto b  
          return;
      }
      else{
          JOptionPane.showMessageDialog(this, "Nombre de dommande Superieur aux Stock");
            resetData();  // novana ho methode ary ambany ny end ny teto b  
          return;
    }
    }//GEN-LAST:event_btnAjouterMatActionPerformed

    private void txta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txta1ActionPerformed
//=========================================================================================== rehefa cliquena ny tableau Commande
    private void tableCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCMouseClicked
        // TODO add your handling code here:

                 try {
             numC = Integer.parseInt(tableC.getValueAt(tableC.getSelectedRow(), 0).toString());
            //personTable.getValueAt(personTable.getSelectedRow(),toString();
            // System.out.println(personId);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from materielv where numMatx=" + numC);
            
            if (rs.next()) {
                txtNum.setText(rs.getString(1));
                txtDesigne.setText(rs.getString(2));

            }
            rs.close();
            smt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tableCMouseClicked
//============================================================================================ Ajout d'Achat
    private void btnAjoutfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutfinalActionPerformed
  try {
            Statement smt = con.createStatement();
            smt.execute(" INSERT INTO `achat` (`idMat`, `qte`, `idCli`, `dateAchat`) SELECT  PuMatx, numMatx, numCli,daty FROM `materielv`;");
         
            JOptionPane.showMessageDialog(this, "Ajout avec succes");
                 new Achat().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
           // settableClientData(); // Mise a jour du table
            //resetData();  // novana ho methode ary ambany ny end ny teto b                      
            smt.close();
            

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur d'ajout");
        }        
    }//GEN-LAST:event_btnAjoutfinalActionPerformed
//---------------------------------------------------------------------------------------------------------iniciation
  public void resetData(){
    txtDesigne.setText("");
    txtPu.setText("");
    txtStock.setText("");
    txtNbr.setText("");
    txtNum.setText("");
}    

//---------------------------------------------------------------------------------------------- suit ny recherche ito le appelena ao amianazy in y  
    public void chercher(String str){
            DefaultTableModel model = (DefaultTableModel)tableMateriel.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableMateriel.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }
//---------------------------------------------------------------------------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Achat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Achat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Achat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Achat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Achat3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterMat;
    private javax.swing.JButton btnAjoutfinal;
    private javax.swing.JButton btnSupprimerC;
    private javax.swing.JButton btnVente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableC;
    private javax.swing.JTable tableCli;
    private javax.swing.JTable tableMateriel;
    private javax.swing.JTextField txtCherche;
    private javax.swing.JTextField txtDesigne;
    private javax.swing.JTextField txtNbr;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPu;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txta1;
    private javax.swing.JTextField txta2;
    // End of variables declaration//GEN-END:variables

    //=============================================================== ######### Affichage de donne sur le tabeau 
     
    private void settableClientData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select numCLi1 , nomCli1 from client1 ");

            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][4];
            while (rs.next()) {
                data[rowIndex][0] =  rs.getInt(1) + ""; 
                data[rowIndex][1] = rs.getString(2);
                rowIndex++;
            }
            String[] cols = {"numCli", "Nom"};
            DefaultTableModel model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableCli.setModel(model);

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(this, "can not Retrive DATA ");
        }
    }

    //=============================================================== 
    // Affichage de donne sur le tabeau materiel
    private void settableMaterielData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from materiel WHERE stock > 0 order by numMat desc; ");

            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][4];
            while (rs.next()) {
                data[rowIndex][0] =  rs.getInt(1) + "";
                data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getInt(3) + "";
                data[rowIndex][3] = rs.getString(4);
                rowIndex++;
            }
            String[] cols = {"numMat", "Designation", "Prix Unitaire", "Stock"};
            DefaultTableModel model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableMateriel.setModel(model);

        String date = getCurrentDate();
        System.out.println("Date d'aujourd'hui : " + date);
        
            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }
    }

    //=============================================================== 
    // Affichage de donne sur le tabeau materiel
    private void settableCData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(" SELECT nomMatx ,nbrMatx, numMatx FROM `materielv` ");

            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][4];
            while (rs.next()) {
                data[rowIndex][0] =  rs.getString(1) + "";
                data[rowIndex][1] = rs.getInt(2)+"";
                data[rowIndex][2] = rs.getInt(3) + "";
                //data[rowIndex][3] = rs.getString(4);
                rowIndex++;
            }
            String[] cols = {  "Nom Materiel","Prix Unitaire","Nombre"};
            DefaultTableModel model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableC.setModel(model);

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }
    }

    //=============================================================== recuperation de numCli dans la page 
    
       private static void nbr(Connection con) {
        String query = "SELECT numcli1 FROM client1";
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            if (result.next()) {
                olona = result.getInt("numcli1");
            }
            stmt.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  //================================================== recuperation de la date
         public static String getCurrentDate() {
        // Crée une instance de l'objet Date
        Date today = new Date();

        // Formate la date en utilisant un format spécifique
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(today);

        // Retourne la date formatée
        return currentDate;
    }
}