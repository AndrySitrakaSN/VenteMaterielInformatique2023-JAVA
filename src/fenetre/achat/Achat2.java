
package fenetre.achat;
import fenetre.cli.*;
import fenetre.mat.*;



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

public class Achat2 extends javax.swing.JFrame {
        private int numCli1;
        private Connection con;
        private int  numMat1;
        
    public Achat2() {
        initComponents();
        initComponents();
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();  // miantso le fonctoin connecter @le base de donnee 
        con = dbc.getConnection();   //dbc.getConnection();
        settableClientData(); // Mise a jour du table
        supDonnee(); // mamafa ny ao @Client1

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnVente = new javax.swing.JButton();
        btnMateriel = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAjouter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        txtnom = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        btnVente.setBackground(new java.awt.Color(204, 204, 255));
        btnVente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVente.setForeground(new java.awt.Color(51, 51, 51));
        btnVente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cashier_icon-icons.com_53629.png"))); // NOI18N
        btnVente.setText("Vente");
        btnVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenteActionPerformed(evt);
            }
        });

        btnMateriel.setBackground(new java.awt.Color(204, 204, 255));
        btnMateriel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMateriel.setForeground(new java.awt.Color(51, 51, 51));
        btnMateriel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clavier.png"))); // NOI18N
        btnMateriel.setText("materiel");
        btnMateriel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterielActionPerformed(evt);
            }
        });

        btnClient.setBackground(new java.awt.Color(204, 204, 255));
        btnClient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClient.setForeground(new java.awt.Color(51, 51, 51));
        btnClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/client.png"))); // NOI18N
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel4.setText("Choisir une Client ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMateriel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnMateriel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnAjouter.setBackground(new java.awt.Color(0, 153, 153));
        btnAjouter.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/[034561].png"))); // NOI18N
        btnAjouter.setText("Oui");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("Nom");

        jLabel2.setText("Numero");

        txtClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClientKeyReleased(evt);
            }
        });

        jLabel3.setText("Chercher");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("#Projet 12 L3 IG Vente de Materiel Informatique ENI Fianrantsoa 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1254, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// ---------------------------------------------------------------------------------------- ### Go Client
    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        
                new Client().setVisible(true); // Ouvre la deuxième page
                 dispose(); // Ferme la première page
    }//GEN-LAST:event_btnClientActionPerformed
// ---------------------------------------------------------------------------------------- ### Go Vente
    private void btnVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenteActionPerformed
        new Achat().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVenteActionPerformed
// ---------------------------------------------------------------------------------------- ### Go Materiel
    private void btnMaterielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterielActionPerformed
        new Materiel().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMaterielActionPerformed
//------------------------------------------------------------------------------------------ ### Recherche
    private void txtClientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientKeyReleased
        // TODO add your handling code here:
        String chercherString = txtClient.getText();
        chercher(chercherString);
    }//GEN-LAST:event_txtClientKeyReleased
// -----------------------------------------------------------------------------------------n###  rehefa cliquena 
    
    private void tableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientMouseClicked
        // TODO add your handling code here:
               try {
             numCli1 = Integer.parseInt(tableClient.getValueAt(tableClient.getSelectedRow(), 0).toString());
            //personTable.getValueAt(personTable.getSelectedRow(),toString();
            // System.out.println(personId);
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from client where numCli=" + numCli1);
            if (rs.next()) {
                txtnum.setText(rs.getString(1));
                txtnom.setText(rs.getString(2));
 
            }
            rs.close();
            smt.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_tableClientMouseClicked
// ------------------------------------------------------------------------------------------ Ajouter de nuveaux acheteteur 
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
        String nom = txtnum.getText();               // System.out.println(name);
        String num = txtnom.getText();               // System.out.println(name);
        String nom1 = num;
        String num1 = nom;

        try {
            Statement smt = con.createStatement();
            smt.execute("INSERT INTO client1 (numCli1, nomCli1) VALUES ('" + num1 + "','" + nom1 + "')");
            settableClientData(); // Mise a jour du table
            //resetData();  // novana ho methode ary ambany ny end ny teto b                      
            smt.close();
              new Achat3().setVisible(true); // Ouvre la deuxième page
              dispose(); // Ferme la première page

        } catch (Exception ex) {
            //Logger.getLogger(MainFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Inseret une Cllient!");
        }
    }//GEN-LAST:event_btnAjouterActionPerformed
// =======>  mamorona foction ray  de  zay  le antsoina 
    public void chercher(String str){
            DefaultTableModel model = (DefaultTableModel)tableClient.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableClient.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }
// ----------------------------------------------------------------------------------------

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Achat2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnMateriel;
    private javax.swing.JButton btnVente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClient;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables




//=============================================================== ######### Affichage de donne sur le tabeau 
     
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
//============================================================ mamafa ny donneee abi2
 public void supDonnee(){
      
            try {
                Statement smt = con.createStatement();
                smt.execute("Delete from client1");
                smt.execute("Delete from MaterielV");
                //JOptionPane.showMessageDialog(this, "Supp Ok");
            } catch (SQLException ex) {
                Logger.getLogger(Achat2.class.getName()).log(Level.SEVERE, null, ex);
            }
 }

}
