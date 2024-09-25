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
import java.text.DecimalFormat;
import javax.swing.table.TableRowSorter;   // ito le @le cherche anaty  Table
// --------------------- * --------------------- debut de code

public class Achat3 extends javax.swing.JFrame {

    private Connection con;
    private int numMat1;
    private int numC;
    private int numClient; // Déclaration de la variable membre
    private static int olona;
    private static int total;
    //private int num_Cli; numCli1 
    private int numCli1;
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
        txtNum.setEditable(false);
        txtDesigne.setEditable(false);
        txtPu.setEditable(false);
        txtStock.setEditable(false);
        txt1Designation.setEditable(false);
        txt2Qte.setEditable(false);
        txt3Num.setEditable(false);
        Total1.setEditable(false);
        btnSupprimerC.setEnabled(false); 
        txtChiffre.setEditable(false);
        txtClii.setEditable(false);
        Total1.setHorizontalAlignment(SwingConstants.CENTER);
        txtChiffre.setHorizontalAlignment(SwingConstants.CENTER);
        essai1();
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

    private void num() throws SQLException {
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

    private void aler() {
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
        txt1Designation = new javax.swing.JTextField();
        btnImprimer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Total1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt3Num = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtChiffre = new javax.swing.JTextField();
        txt2Qte = new javax.swing.JTextField();
        txtClii = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnVente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
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
        tableC.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableCAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        btnSupprimerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerCActionPerformed(evt);
            }
        });

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

        txt1Designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1DesignationActionPerformed(evt);
            }
        });

        btnImprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fenetre/achat/imprimante (1).png"))); // NOI18N
        btnImprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Table de commande de Personne");

        Total1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Total1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel12.setText("Total");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Design");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Ar");

        txt3Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3NumActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("Num");

        txtChiffre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txt2Qte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2QteActionPerformed(evt);
            }
        });

        txtClii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliiActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("Qte");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("NumCli");

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
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtChiffre, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Total1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(126, 126, 126))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSupprimerC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAjoutfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt3Num, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt1Designation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClii, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2Qte, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Total1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(4, 4, 4)
                        .addComponent(txtChiffre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt1Designation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txt3Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt2Qte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClii, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)))
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
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSupprimerC, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(btnImprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAjouterMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(btnAjoutfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
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

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 744, Short.MAX_VALUE)
                        .addComponent(btnVente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(166, 166, 166))
        );

        setSize(new java.awt.Dimension(1282, 594));
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

        total();
        String designation = txtDesigne.getText();               // System.out.println(name);
        String pu = txtPu.getText();                            // System.out.println(age);
        String stock = txtStock.getText();                      //System.out.println(contact);
        String num = txtNum.getText();
        String nbr1 = txtNbr.getText();
        // ---------8--------------
        String num1 = num;
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

        if (stock11 >= nbr11) { // 
            if (nbr11 == 0) {
                JOptionPane.showMessageDialog(this, "Impossible car la qantiter est vide");
                resetData();  // novana ho methode ary ambany ny end ny teto b            
            } else if (nbr11 < 0) {
                JOptionPane.showMessageDialog(this, "Ipossible pour le valeur negatif");
                resetData();  // novana ho methode ary ambany ny end ny teto b            
            } else {

                try {
                    Statement smt = con.createStatement();

                    smt.execute("INSERT INTO `materielv`( `numMatx`, `nbrMatx`, `nomMatx`, `PuMatx` ,`numCli`, `daty`) VALUE  ('" + nbr11 + "','" + pu11 + "','" + designation1 + "','" + num11 + "' ,'" + olona + "','" + date + "') ");
                    JOptionPane.showMessageDialog(this, "Ajout avec succes");
                    smt.execute("UPDATE materiel set stock ='" + rest + "' Where numMat='" + num11 + "' "); // manao - ny ao @table Materiel

                    settableMaterielData(); // Mise a jour du table
                    resetData();  // novana ho methode ary ambany ny end ny teto b                      
                    smt.close();
                    settableCData();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erreur d'ajout");
                    //resetData();  // novana ho methode ary ambany ny end ny teto b  
                }
            }
        } else if (stock11 == 0) {
            JOptionPane.showMessageDialog(this, "Materiel Indisponible");
            resetData();  // novana ho methode ary ambany ny end ny teto b  
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Nombre de dommande Superieur aux Stock");
            resetData();  // novana ho methode ary ambany ny end ny teto b  
            return;
        }
        essai1(); //----------------------------------------------------------------- total
    }//GEN-LAST:event_btnAjouterMatActionPerformed

    private void txt1DesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1DesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1DesignationActionPerformed
//=========================================================================================== rehefa cliquena ny tableau Commande
    private void tableCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCMouseClicked
        try {

            numCli1 = Integer.parseInt(tableC.getValueAt(tableC.getSelectedRow(), 0).toString());
            //personTable.getValueAt(personTable.getSelectedRow(),toString();
            // System.out.println(personId);
            Statement smt = con.createStatement();
            // SELECT nomMatx ,nbrMatx, numMatx ,(nbrMatx*numMatx)As montant  FROM `materielv`
            // SELECT IdMatx , nomMatx , (nbrMatx*numMatx)As montant from materielv where idMatx = "+numCli
            ResultSet rs = smt.executeQuery("SELECT IdMatx , nomMatx ,PuMatx,numMatx from materielv where IdMatx =" + numCli1);
            //ResultSet rs = smt.executeQuery("SELECT IdMatx , nomMatx , (nbrMatx*numMatx)As montant from materielv where IdMatx = +numCli1 ");
            if (rs.next()) {
                txt3Num.setText(rs.getInt(1) + "");
                txt1Designation.setText(rs.getString(2) + "");
                txtClii.setText(rs.getInt(3) + "");
                txt2Qte.setText(rs.getInt(4) + " ");
                btnSupprimerC.setEnabled(true); 

            }
            rs.close();
            smt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_tableCMouseClicked
//============================================================================================ Ajout d'Achat
    private void btnAjoutfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutfinalActionPerformed
        try {
            int confirmation = JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de vouloir effectuer la modification ?", "Confirmation de modification", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                Statement smt = con.createStatement();
                smt.execute(" INSERT INTO `achat` (`idMat`, `qte`, `idCli`, `dateAchat`) SELECT  PuMatx, numMatx, numCli,daty FROM `materielv`;");
                 smt.execute("DELETE FROM materielv");
                //  JOptionPane.showMessageDialog(this, "Ajout avec succes");
                new Achat().setVisible(true); // Ouvre la deuxième page
                dispose(); // Ferme la première page
                // settableClientData(); // Mise a jour du table
                //resetData();  // novana ho methode ary ambany ny end ny teto b                      
                smt.close();
            } else {
                // JOptionPane.showMessageDialog(this, "Validation Annulé");
                //settableMaterielData();
                //resetData();
                // btnAjouter.setEnabled(true); // Active le bouton btnAjouter
            }

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur d'ajout");
        }
    }//GEN-LAST:event_btnAjoutfinalActionPerformed
//-------------------------------------------------------------------------------------------------------Imprimer
    private void btnImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimerActionPerformed
        // TODO add your handling code here:
        String date = getCurrentDate();
        System.out.println("Date d'aujourd'hui : " + date);

        //String titre = ("Facture N:  \n Numero Client: "+olona+"  Annee ="+date+ "Nom:");
        //String titre = "Facture N:\nNumero Client: " + olona + "\nAnnee = " + date + "\nNom:";
        // String titre = "<html>Facture N:<br>Numero Client: " + olona + "<br>Annee = " + date + "<br>Nom:</html>";
        System.out.println("Date d'aujourd'hui : " + date);

        //String olona = "John Doe"; // Remplacez par votre valeur réelle
        StringBuilder titreBuilder = new StringBuilder();
        titreBuilder.append("Facture N:\n");
        titreBuilder.append("Numero Client: ").append(olona).append("\n");
        titreBuilder.append("Annee = ").append(date).append("\n");
        titreBuilder.append("Nom:");

        String titre = titreBuilder.toString();

        Ivelany.imprimerjtable(tableC, titre);

    }//GEN-LAST:event_btnImprimerActionPerformed
//-------------------------------------------------------------------------------------------------btn Supprimer
    private void btnSupprimerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerCActionPerformed

        String qte = txt2Qte.getText().trim();
        String cli = txtClii.getText().trim();
        String num = txt3Num.getText().trim();
       
        if (qte.isEmpty() || cli.isEmpty() || num.isEmpty()) {
            // Au moins l'une des variables est vide, afficher un message d'erreur ou effectuer un traitement approprié
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs");
            return;
        }

        try {
            UIManager.put("OptionPane.yesButtonText", "Oui");
            UIManager.put("OptionPane.noButtonText", "Non");
            int confirmation = JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de vouloir effectuer la suppretion ?", "Confirmation de suppretion", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                int qtee = Integer.parseInt(qte);
                int clii = Integer.parseInt(cli);
                int numm = Integer.parseInt(num);

                Statement smt = con.createStatement();
               // smt.execute("");
                smt.execute("update materiel join materielv on materielv.PuMatx = materiel.numMat set materiel.stock = materiel.stock + materielv.numMatx  where idMatx=" + numm);
                smt.execute("delete from Materielv where idMatx=" + numm);
                settableCData();
                resetData();
                settableMaterielData();
                essai1(); //-------------------------------------- ito le miabel anile Total
                btnSupprimerC.setEnabled(false); 
            } else {
                //JOptionPane.showMessageDialog(this, "Modification annulée");
                settableCData();
                resetData();
                essai1(); //-------------------------------------- ito le miabel anile Total
                btnSupprimerC.setEnabled(false); 
            }

        } catch (NumberFormatException ex) {
            // La conversion en entier a échoué, afficher un message d'erreur ou effectuer un traitement approprié
            JOptionPane.showMessageDialog(this, "Veuillez entrer des valeurs numériques valides");
        } catch (SQLException ex) {
            Logger.getLogger(Achat3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupprimerCActionPerformed
//------------------------------------------------------------------------------------------------ fin Supprimer
    private void Total1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total1ActionPerformed

    private void txt3NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3NumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3NumActionPerformed

    private void tableCAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableCAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCAncestorAdded

    private void txt2QteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2QteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2QteActionPerformed

    private void txtCliiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliiActionPerformed
//---------------------------------------------------------------------------------------------------------iniciation

    public void resetData() {
        txtDesigne.setText("");
        txtPu.setText("");
        txtStock.setText("");
        txtNbr.setText("");
        txtNum.setText("");
        txtCherche.setText("");
        txt3Num.setText("");
        txt1Designation.setText("");
        txtClii.setText("");
        txt2Qte.setText("");
        // settableMaterielData(); // Mise a jour du table
    }

    public void essai1() {

        try {
            //con.createStatement();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT SUM(numMatx * nbrMatx) AS essai FROM materielv");
            int essai1 = 0;
            if (rs.next()) {
                essai1 = rs.getInt("essai");
            }

            //System.out.println("La valeur d'essai est : " + essai1);
            String essaiText1 = Integer.toString(essai1); // Conversion en texte
            System.out.print(essaiText1);
            Total1.setText(essaiText1);

            //double nombre = essail;
            String enLettres = convertirEnLettres(essai1);
            System.out.println(enLettres);
            txtChiffre.setText(enLettres);

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "non non ");
            JOptionPane.showMessageDialog(this, ex);
            System.out.println(ex);

        }

    }

//---------------------------------------------------------------------------------------------- suit ny recherche ito le appelena ao amianazy in y  
    public void chercher(String str) {
        DefaultTableModel model = (DefaultTableModel) tableMateriel.getModel();
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
    private javax.swing.JTextField Total1;
    private javax.swing.JButton btnAjouterMat;
    private javax.swing.JButton btnAjoutfinal;
    private javax.swing.JButton btnImprimer;
    private javax.swing.JButton btnSupprimerC;
    private javax.swing.JButton btnVente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tableC;
    private javax.swing.JTable tableCli;
    private javax.swing.JTable tableMateriel;
    private javax.swing.JTextField txt1Designation;
    private javax.swing.JTextField txt2Qte;
    private javax.swing.JTextField txt3Num;
    private javax.swing.JTextField txtCherche;
    private javax.swing.JTextField txtChiffre;
    private javax.swing.JTextField txtClii;
    private javax.swing.JTextField txtDesigne;
    private javax.swing.JTextField txtNbr;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPu;
    private javax.swing.JTextField txtStock;
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
                data[rowIndex][0] = rs.getInt(1) + "";
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

    //===============================================================   // Affichage de donne sur le tabeau materiel
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
                data[rowIndex][0] = rs.getInt(1) + "";
                data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getInt(3) + "";
                data[rowIndex][3] = rs.getString(4);
                rowIndex++;
            }
            String[] cols = {"numMat", "Designation", "Prix Unitaire", "Stock"};
            DefaultTableModel model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableMateriel.setModel(model);

            //String date = getCurrentDate();
            //System.out.println("Date d'aujourd'hui : " + date);
            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }
    }

    //===============================================================   // Affichage de donne sur le tabeau materiel
    private void settableCData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(" SELECT idMatx , nomMatx,nbrMatx, numMatx ,(nbrMatx*numMatx)As montant  FROM `materielv` ");

            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][5];
            while (rs.next()) {

                data[rowIndex][0] = rs.getInt(1) + "";
                data[rowIndex][1] = rs.getString(2) + "";
                data[rowIndex][2] = rs.getInt(3) + "";
                data[rowIndex][3] = rs.getInt(4) + "";
                data[rowIndex][4] = rs.getString(5) + " ";
                rowIndex++;
            }
            String[] cols = {"num", "Nom Materiel", "Prix Unitaire", "Quantier", "Montant"};
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

    //--------------------------------------------------------------- recuperation de total tootal d'une client
    private static void total(Connection con) {
        String query = ("SELECT SUM(achat.qte * materiel.PU) "
                + "AS essai FROM achat join materiel ON "
                + "achat.idMat = materiel.numMat");
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            if (result.next()) {
                total = result.getInt("total");

            }
            stmt.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void total() {
        // String snrs = +total+" Ar";
//txtTotal.setText(String.valueOf(snrs));
//txtTotal.setText("" + total);
        System.out.println(total);
    }
    //--------------------------------------------------------------- recuperation de total tootal d'une client

    public void essai() {

        try {
            //con.createStatement();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT SUM(nbrMatx*numMatx)As montant  FROM materielv ");
            int essai = 0;
            if (rs.next()) {
                essai = rs.getInt("essai");
            }

            System.out.println("La valeur d'essai est : " + essai);
            String essaiText = Integer.toString(essai); // Conversion en texte
            Total1.setText(essaiText);

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(this, "non non ");
            // JOptionPane.showMessageDialog(this, ex);
            System.out.println(ex);

        }

    }
    //------------------------------------------------------------------------------------------    Chiffre en lettre
    private static final String[] units = {
        "", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"
    };

    private static final String[] tens = {
        "", "", "vingt", "trente", "quarante", "cinquante", "soixante", "soixante", "quatre-vingt", "quatre-vingt"
    };

    private static final String[] groups = {
        "", "mille", "million", "milliard", "billion", "billiard", "trillion", "trilliard", "quadrillion", "quadrilliard"
    };

    public static String convertirEnLettres(double nombre) {
        DecimalFormat df = new DecimalFormat("#");
        String nombreString = df.format(nombre);
        String[] parts = nombreString.split("\\.");

        int partieEntiere = Integer.parseInt(parts[0]);

        StringBuilder resultat = new StringBuilder();

        if (partieEntiere == 0) {
            resultat.append("zéro");
        } else {
            resultat.append(convertirPartieEntiereEnLettres(partieEntiere));
        }

        if (parts.length > 1) {
            int partieDecimale = Integer.parseInt(parts[1]);
            resultat.append(" virgule ").append(convertirPartieEntiereEnLettres(partieDecimale));
        }

        return resultat.toString();
    }

    private static String convertirPartieEntiereEnLettres(int nombre) {
        if (nombre < 20) {
            return units[nombre];
        }
        if (nombre < 100) {
            int unite = nombre % 10;
            int dizaine = nombre / 10;
            if (unite == 0) {
                return tens[dizaine];
            } else if (dizaine == 7 || dizaine == 9) {
                return tens[dizaine] + "-" + units[unite + 10];
            } else {
                return tens[dizaine] + "-" + units[unite];
            }
        }
        if (nombre < 1000) {
            int centaine = nombre / 100;
            int reste = nombre % 100;
            if (reste == 0) {
                return units[centaine] + " cents";
            } else {
                return units[centaine] + " cent " + convertirPartieEntiereEnLettres(reste);
            }
        }

        int groupe = 0;
        String resultat = "";
        while (nombre > 0) {
            int partie = nombre % 1000;
            if (partie != 0) {
                String prefixe = convertirPartieEntiereEnLettres(partie);
                resultat = prefixe + " " + groups[groupe] + " " + resultat;
            }
            nombre /= 1000;
            groupe++;
        }
        return resultat.trim();
    }

}
