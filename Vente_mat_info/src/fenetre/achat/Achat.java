package fenetre.achat;

import connection.DatabaseConnection;
import fenetre.mat.*;
import fenetre.cli.*;

import javax.swing.JFrame;
import javax.swing.ImageIcon;  // ito ndray raha te apiritra aimage na Icon
import javax.swing.JOptionPane;  // ito le boite de dialogue 

import java.sql.*; // sql rehetra
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; // ito indray @ Affichage @ le tableau vo miasa 
import javax.swing.table.TableRowSorter;

public class Achat extends javax.swing.JFrame {

    private JFrame frame;
    private Connection con;
    public DefaultTableModel model;

    public Achat() {
        initComponents();
        frame = new JFrame();
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();  // miantso le fonctoin connecter @le base de donnee 
        con = dbc.getConnection();   //dbc.getConnection();
        settableAchatData(); // Mise a jour du table
        settableMatData();
        essai();
        total.setEditable(false);
        total.setHorizontalAlignment(SwingConstants.CENTER);

        txtChiffre.setEditable(false);
        txtChiffre.setHorizontalAlignment(SwingConstants.CENTER);
        recuperedonnee();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAchat = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtChiffre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        recherche = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAchat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMat = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnDate = new javax.swing.JButton();
        btnChiffre = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMateriel = new javax.swing.JButton();
        bntClient = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        label6 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Achat de Materiel Informatique");
        setBackground(new java.awt.Color(204, 204, 204));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMaximumSize(null);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tableAchat.setBackground(new java.awt.Color(204, 204, 255));
        tableAchat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableAchat.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAchat.setMinimumSize(new java.awt.Dimension(20, 40));
        jScrollPane1.setViewportView(tableAchat);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("Total ");

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Ar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtChiffre, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChiffre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Achat de Materiel");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Marchadise Vendu");

        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });
        recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Chercher");

        btnAchat.setBackground(new java.awt.Color(255, 255, 204));
        btnAchat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAchat.setForeground(new java.awt.Color(153, 153, 153));
        btnAchat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-ajouter (1).png"))); // NOI18N
        btnAchat.setText(" Achat");
        btnAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAchatActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        tableMat.setBackground(new java.awt.Color(204, 204, 255));
        tableMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableMat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableMat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        btnDate.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnDate.setText("Entre desux Date");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });

        btnChiffre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnChiffre.setText("Chiffre d'affaire");
        btnChiffre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiffreActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7909057.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChiffre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChiffre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(recherche))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAchat)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("VENTE DE MATERIEL INFORMATIQUE");

        btnMateriel.setBackground(new java.awt.Color(204, 204, 255));
        btnMateriel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMateriel.setForeground(new java.awt.Color(153, 153, 153));
        btnMateriel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clavier.png"))); // NOI18N
        btnMateriel.setText("Materiel");
        btnMateriel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterielActionPerformed(evt);
            }
        });

        bntClient.setBackground(new java.awt.Color(204, 204, 255));
        bntClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntClient.setForeground(new java.awt.Color(153, 153, 153));
        bntClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/client.png"))); // NOI18N
        bntClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClientActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cashier_icon-icons.com_53629.png"))); // NOI18N
        jButton5.setText("Vente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntClient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMateriel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMateriel)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        label6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("#Projet 12 L3 IG Vente de Materiel Informatique ENI Fianrantsoa 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        setSize(new java.awt.Dimension(1314, 934));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//##############################################################################################
    // Boutton mandeha @ Materiel ito
    private void btnMaterielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterielActionPerformed

        new Materiel().setVisible(true); // Ouvre la deuxième page
        dispose(); // Ferme la première page

    }//GEN-LAST:event_btnMaterielActionPerformed

//##############################################################################################
    // Bouttom mandeha @ Client
    private void bntClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClientActionPerformed

        new Client().setVisible(true); // Ouvre la deuxième page
        dispose(); // Ferme la première page
    }//GEN-LAST:event_bntClientActionPerformed
//============================================================================================  Go Achat
    private void btnAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchatActionPerformed

        new Achat2().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAchatActionPerformed
//------------------------------------------------------------------------------------- go Chiffre d'affaire
    private void btnChiffreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiffreActionPerformed
        // TODO add your handling code here:
        new Achat4().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChiffreActionPerformed

    private void rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheKeyReleased
        String searchString = recherche.getText();
        search(searchString);
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheKeyReleased

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheActionPerformed
//--------------------------------------------------------------------------------------------    go date
    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        // TODO add your handling code here:
             new DeuxDate().setVisible(true);
              dispose();  
    }//GEN-LAST:event_btnDateActionPerformed
//##############################################################################################

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
            java.util.logging.Logger.getLogger(Achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Achat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntClient;
    private javax.swing.JButton btnAchat;
    private javax.swing.JButton btnChiffre;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnMateriel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label6;
    private javax.swing.JTextField recherche;
    private javax.swing.JTable tableAchat;
    private javax.swing.JTable tableMat;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txtChiffre;
    // End of variables declaration//GEN-END:variables
//---------------------------------------------------------------------------------- affichage de la table Achat
    /* private void settableAchatData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
          //  ResultSet rs = smt.executeQuery("select design,Pu,qte from materiel , client ,achat where (materiel.numMat = achat.idMat) And (client.numCli=achat.idCli)";
          //ResultSet rs = smt.executeQuery("SELECT Design,Pu,stock FROM achat, materiel, client WHERE (materiel.numMat = achat.idMat) AND (client.numCli = achat.idCli)");
         // ResultSet rs = smt.executeQuery("SELECT *FROM achat, materiel, client WHERE (materiel.numMat = achat.idMat) AND (client.numCli = achat.idCli)"); 
          ResultSet rs = smt.executeQuery("SELECT nomCli,Design,pu,qte ,dateAchat FROM achat, materiel, client WHERE (materiel.numMat = achat.idMat) AND (client.numCli = achat.idCli)");
 
         // ResultSet rs = smt.executeQuery("select Design,Pu,stock from materiel"); 
            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][4];
            while (rs.next()) {
                data[rowIndex][0] =  rs.getString(1) + "";
               data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getInt(3) + " Ar";
                data[rowIndex][3] = rs.getInt(4)+"";
                //data[rowIndex][4] = rs.getDate(5)+"";
               
                rowIndex++;
            }
           String[] cols = {"Acheteur","Designation", "Prix Unitaire", "Nombre d'Achat","Date"};
            // String[] cols = {"numMat", "Designation", "Prix Unitaire"};
            DefaultTableModel model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableAchat.setModel(model);

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }
    }*/

    private void settableAchatData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(" SELECT nomCli,Design,pu,qte ,dateAchat FROM achat, materiel, client WHERE (materiel.numMat = achat.idMat) AND (client.numCli = achat.idCli)");

            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][5];
            while (rs.next()) {
                data[rowIndex][0] = rs.getString(1) + "";
                data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getInt(3) + "";
                data[rowIndex][3] = rs.getInt(4) + " ";
                data[rowIndex][4] = rs.getString(5) + " ";

                rowIndex++;
            }
            String[] cols = {"Nom Client    ", "Designation", "Prix Unitaire", "Quantiter", "Date"};
            DefaultTableModel model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableAchat.setModel(model);

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }

    }

//---------------------------------------------------------------------------------- affichage de la table Materiel
    private void settableMatData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT materiel.Design, materiel.pu, SUM(achat.qte) AS nbrs, (materiel.pu * SUM(achat.qte)) AS montant FROM achat JOIN materiel ON materiel.numMat = achat.idMat JOIN client ON client.numCli = achat.idCli GROUP BY materiel.numMat");

            // ResultSet rs = smt.executeQuery("select Design,Pu,stock from materiel"); 
            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();

            }
            // System.out.println(rows);

            String[][] data = new String[rows][4];
            while (rs.next()) {
                data[rowIndex][0] = rs.getString(1) + "";
                data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getInt(3) + " ";
                data[rowIndex][3] = rs.getString(4) + " Ar";

                rowIndex++;
            }
            String[] cols = {"Designation", "Prix Unitaire", "Quantite", "Montant"};
            // String[] cols = {"numMat", "Designation", "Prix Unitaire"};
            model = new DefaultTableModel(data, cols);   // importena koa alohany DefaultTableModel
            tableMat.setModel(model);

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }
    }

    public void search(String str) {
        model = (DefaultTableModel) tableAchat.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableAchat.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public void essai() {

        try {
            //con.createStatement();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT SUM(achat.qte * materiel.PU) "
                    + "AS essai FROM achat join materiel ON "
                    + "achat.idMat = materiel.numMat");
            int essai = 0;
            if (rs.next()) {
                essai = rs.getInt("essai");
            }

            System.out.println("La valeur d'essai est : " + essai);
            String essaiText = Integer.toString(essai); // Conversion en texte
            total.setText(essaiText);

            String enLettres = convertirEnLettres(essai);
            System.out.println(enLettres);
            txtChiffre.setText(enLettres);

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "non non ");
            JOptionPane.showMessageDialog(this, ex);
            System.out.println(ex);

        }

    }
    //------------------------------------------------------- mameriana ny commande  tsy novalidena       

    private void recuperedonnee() {
        try {
            Statement smt = con.createStatement();
            // smt.execute("UPDATE materiel set stock = stock + (select numMatx from  materielv,materiel where (materiel.numMat = materielv.PuMatx))" );
            smt.execute("update materiel join materielv on materielv.PuMatx = materiel.numMat set materiel.stock = materiel.stock + materielv.numMatx");

        } catch (SQLException ex) {
            // Logger.getLogger(Achat.class.getName()).log(Level.SEVERE, null, ex);
            // JOptionPane.showMessageDialog(this, "erreur");
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
