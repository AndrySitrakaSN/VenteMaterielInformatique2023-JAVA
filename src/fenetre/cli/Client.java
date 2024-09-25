
package fenetre.cli;
import fenetre.achat.*;
import fenetre.mat.*;

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
import javax.swing.*;
import javax.swing.table.DefaultTableModel; // ito indray @ Affichage @ le tableau vo miasa 
import connection.DatabaseConnection;
import javax.swing.table.TableRowSorter;   // ito le @le cherche anaty  Table

public class Client extends javax.swing.JFrame {
        private Connection con;
        private int numCli1;

    public Client() {
        initComponents();
                DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();  // miantso le fonctoin connecter @le base de donnee 
                con = dbc.getConnection();   //dbc.getConnection();
                settableClientData(); // Mise a jour du table
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        label3 = new java.awt.Label();
        txtNom = new javax.swing.JTextField();
        txtCherche = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btnAchat = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnMateriel = new javax.swing.JButton();
        btnVente = new javax.swing.JButton();
        label6 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Enregistrer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        tableClient.setBackground(new java.awt.Color(204, 204, 255));
        tableClient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableClient.setModel(new javax.swing.table.DefaultTableModel(
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
        tableClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClient);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        label3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Nom de Client");

        txtCherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChercheKeyReleased(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Chercher");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-vente-66.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupprimer.setForeground(new java.awt.Color(255, 102, 102));
        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-supprimer.png"))); // NOI18N
        btnSupprimer.setText("Suprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModifier.setForeground(new java.awt.Color(153, 255, 153));
        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editer.png"))); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnAjouter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAjouter.setForeground(new java.awt.Color(153, 204, 255));
        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter (1).png"))); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAchat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAchat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Client Enregistrer");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/client.png"))); // NOI18N

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

        btnVente.setBackground(new java.awt.Color(204, 204, 255));
        btnVente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVente.setForeground(new java.awt.Color(153, 153, 153));
        btnVente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cashier_icon-icons.com_53629.png"))); // NOI18N
        btnVente.setText("Vente");
        btnVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMateriel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVente)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVente)
                        .addComponent(btnMateriel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        label6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("#Projet 12 L3 IG Vente de Materiel Informatique ENI Fianrantsoa 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        setSize(new java.awt.Dimension(1304, 850));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//################################################################################################ Go Vente
    // Boutton mandeha @ Vente
    private void btnVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenteActionPerformed

                 new Achat().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
    }//GEN-LAST:event_btnVenteActionPerformed
//============================================================================================ Go Materiel
    private void btnMaterielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterielActionPerformed
        
                 new Materiel().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
    }//GEN-LAST:event_btnMaterielActionPerformed
//================================================================================================ Ajouter
    // Ajouter
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
          String nom = txtNom.getText();               // System.out.println(name);

        try {
            Statement smt = con.createStatement();
            smt.execute("insert into client (nomCli) values ('" + nom +"')");
            // smt.execute("insert into persons (name,age,contact) values ('an',22,'9000Ts')");
            JOptionPane.showMessageDialog(this, "Ajout avec succes");
            settableClientData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b                      
            smt.close();
            

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur d'ajout");
        }
    }//GEN-LAST:event_btnAjouterActionPerformed
//========================================================================================== Cliquena
    // rehefa cliquena dia le mandeha ary  e
    private void tableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientMouseClicked
                         try {
             numCli1 = Integer.parseInt(tableClient.getValueAt(tableClient.getSelectedRow(), 0).toString());
            //personTable.getValueAt(personTable.getSelectedRow(),toString();
            // System.out.println(personId);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from client where numCli=" + numCli1);
            if (rs.next()) {
                txtNom.setText(rs.getString(2));
 
            }
            rs.close();
            smt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tableClientMouseClicked
//============================================================================================== Modifier
    // boutton Modifier
    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
                     if (numCli1 != 0) {
            String nom = txtNom.getText();


                    try {
            Statement smt = con.createStatement();
            smt.execute("update client set nomCli='"+nom+"' where numCli="+numCli1);
            JOptionPane.showMessageDialog(this, "Modification Avec Succes");
            settableClientData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b  
            numCli1=0;
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur de Modification");
        }
            }
    }//GEN-LAST:event_btnModifierActionPerformed
//============================================================================================== Supprimer
    //Boutton SUppriemer
    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
                          if (numCli1 != 0) 
                {
               try {
            Statement smt = con.createStatement();
            smt.execute("delete from Client where numCLi ="+numCli1);
            JOptionPane.showMessageDialog(this, "Suppretion avec Succes");
            settableClientData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b  
            numCli1=0;
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur de Suppretion");
        }
          }
    }//GEN-LAST:event_btnSupprimerActionPerformed
//========================================================================================== Go Achat2
    private void btnAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchatActionPerformed
        
                         new Achat2().setVisible(true); // Ouvre la deuxième page
                          dispose(); // Ferme la première page
    }//GEN-LAST:event_btnAchatActionPerformed
//======================================================================================== ito le recherche @ le tableu iny 
    private void txtChercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChercheKeyReleased
        // TODO add your handling code here:
        String chercherString = txtCherche.getText();
        chercher(chercherString);
    }//GEN-LAST:event_txtChercheKeyReleased
// =======>  mamorona foction ray  de  zay  le antsoina 
    public void chercher(String str){
            DefaultTableModel model = (DefaultTableModel)tableClient.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableClient.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }

//################################################################################################ fin chercher

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAchat;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnMateriel;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnVente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTable tableClient;
    private javax.swing.JTextField txtCherche;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

     private void resetData() {
        txtNom.setText("");
  
       
    }
//=============================================================== 
    // Affichage de donne sur le tabeau 
    private void settableClientData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from client order by numCli desc");

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
            tableClient.setModel(model);

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "can not Retrive DATA ");
        }
    }

    //=============================================================== 
}
