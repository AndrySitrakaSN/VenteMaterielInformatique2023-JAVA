
package fenetre.mat;
import connection.DatabaseConnection;
import fenetre.achat.*;
import fenetre.cli.*;

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
import javax.swing.table.TableRowSorter;



public class Materiel extends javax.swing.JFrame {
    private Connection con;
    private int numMat1;
    
    //private int personId;
    public Materiel() {
        initComponents();
                DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();  // miantso le fonctoin connecter @le base de donnee 
                con = dbc.getConnection();   //dbc.getConnection();
                 settableMaterielData(); // Mise a jour du table
             
    } 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMateriel = new javax.swing.JTable();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtDesignation = new javax.swing.JTextField();
        txtPu = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCherche = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btnAchat = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label6 = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnVente = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Materiel Informatique");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        tableMateriel.setBackground(new java.awt.Color(204, 204, 255));
        tableMateriel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        label2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Designation");

        label3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Prix Unitaire");

        label4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Nombre de Stock");

        txtCherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChercheKeyReleased(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Chercher");

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fenetre/mat/[028936].png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAchat.setBackground(new java.awt.Color(255, 255, 204));
        btnAchat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAchat.setForeground(new java.awt.Color(153, 153, 153));
        btnAchat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-ajouter (1).png"))); // NOI18N
        btnAchat.setText("Achat");
        btnAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAchatActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupprimer.setForeground(new java.awt.Color(255, 153, 153));
        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-supprimer.png"))); // NOI18N
        btnSupprimer.setText("Suprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModifier.setForeground(new java.awt.Color(102, 255, 102));
        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editer.png"))); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnAjouter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAjouter.setForeground(new java.awt.Color(153, 153, 255));
        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bouton-ajouter.png"))); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesignation)
                                    .addComponent(txtPu)
                                    .addComponent(txtStock)))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAchat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesignation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCherche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("Materiel informatique");

        label6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("#Projet 12 L3 IG Vente de Materiel Informatique ENI Fianrantsoa 2023");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clavier.png"))); // NOI18N
        jButton1.setText("Materiel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        btnClient.setBackground(new java.awt.Color(204, 204, 255));
        btnClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClient.setForeground(new java.awt.Color(153, 153, 153));
        btnClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/client.png"))); // NOI18N
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVente))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnVente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(1297, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//####################################################################################################### Go Client
    // Boutton mandeha @ Client
    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        
                         new Client().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
    }//GEN-LAST:event_btnClientActionPerformed
//########################################################################################################## Go Vente
    // Boutton mandeha @ Vente
    private void btnVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenteActionPerformed
 
                 new Achat().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
    }//GEN-LAST:event_btnVenteActionPerformed
//########################################################################################################## Ajouter
    // Bouton Ajouter
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        String designation = txtDesignation.getText();               // System.out.println(name);
        String pu = txtPu.getText();                 // System.out.println(age);
        //int age = Intger.parseInt(ageTextField.getText());
        String stock = txtStock.getText();          //System.out.println(contact);
        try {
            Statement smt = con.createStatement();
           
             smt.execute("insert into materiel (Design,Pu,stock) values ('" + designation + "','" + pu + "','" + stock + "')");
            // smt.execute("insert into persons (name,age,contact) values ('an',22,'9000Ts')");
            JOptionPane.showMessageDialog(this, "Ajout avec succes");
            settableMaterielData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b                      
            smt.close();
           
        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur d'ajout");
        }
        
    }//GEN-LAST:event_btnAjouterActionPerformed
//======================================================================================= Clique Tableau
    // tableu Clique de miseho @ formulaire
    private void tableMaterielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMaterielMouseClicked
                 try {
             numMat1 = Integer.parseInt(tableMateriel.getValueAt(tableMateriel.getSelectedRow(), 0).toString());
            //personTable.getValueAt(personTable.getSelectedRow(),toString();
            // System.out.println(personId);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from materiel where numMat=" + numMat1);
            if (rs.next()) {
                txtDesignation.setText(rs.getString(2));
                txtPu.setText(rs.getInt(3) + "");
                txtStock.setText(rs.getString(4));
            }
            rs.close();
            smt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tableMaterielMouseClicked
//=========================================================================================== Modifier
    // Modifier
    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
               if (numMat1 != 0) {
            String designe = txtDesignation.getText();
            String pu = txtPu.getText();
            String stock = txtStock.getText();

                    try {
            Statement smt = con.createStatement();
            smt.execute("update materiel set Design='"+designe+"',Pu='"+pu+"',stock='"+stock+"' where numMat="+numMat1);
            JOptionPane.showMessageDialog(this, "Modification Avec Succes");
            settableMaterielData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b  
            numMat1=0;
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur de Modification");
        }
            }
    }//GEN-LAST:event_btnModifierActionPerformed
//=========================================================================================== Suppriemer
    // Supprimer
    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
                  if (numMat1 != 0) 
                {
               try {
            Statement smt = con.createStatement();
            smt.execute("delete from materiel where numMat ="+numMat1);
            JOptionPane.showMessageDialog(this, "Suppretion avec Succes");
            settableMaterielData(); // Mise a jour du table
            resetData();  // novana ho methode ary ambany ny end ny teto b  
            numMat1=0;
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur de Suppretion");
        }
          }
    }//GEN-LAST:event_btnSupprimerActionPerformed
//=============================================================================== Go Achat
    private void btnAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchatActionPerformed
        
        //new Achat2.setVisible(true);
       new Achat2().setVisible(true); // Ouvre la deuxième page
        dispose();
    }//GEN-LAST:event_btnAchatActionPerformed
//======================================================================================== et le manao recherche
    private void txtChercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChercheKeyReleased
     
          String chercherString = txtCherche.getText();
        chercher(chercherString);
    }//GEN-LAST:event_txtChercheKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

        public void chercher(String str){
            DefaultTableModel model = (DefaultTableModel)tableMateriel.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableMateriel.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }

//##########################################################################################

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
            java.util.logging.Logger.getLogger(Materiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Materiel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAchat;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnVente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private javax.swing.JTable tableMateriel;
    private javax.swing.JTextField txtCherche;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtPu;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
 private void resetData() {
        txtDesignation.setText("");
        txtPu.setText(" ");
        txtStock.setText(" ");
       
    }

//=============================================================== 
    // Affichage de donne sur le tabeau materiel
    private void settableMaterielData() {
        try {
            //con.createStatement();
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from materiel order by numMat desc");

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

            rs.close();
            smt.close();

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Donne Vide ");
        }
    }

    //=============================================================== 
}
