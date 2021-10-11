/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.scene.chart.PieChart;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Uber;
import model.UberList;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author krupa
 */
public class searchPanel extends javax.swing.JPanel {
    UberList ubercars;

    /**
     * Creates new form searchPanel
     */
    ArrayList<Uber> searchList = new ArrayList<Uber>(); 

    public searchPanel(UberList ubercars) {
        initComponents();
        this.ubercars = ubercars;
//        displayComboBox();
        callComboBox();
        Date currDate = new Date();
        ubercars.setUpdatedTime(currDate);
        txtUpdatedTime.setText(currDate.toString());
        txtUpdatedTime.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxDropdownSearch = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarReg = new javax.swing.JTable();
        lblCount = new javax.swing.JLabel();
        txtRowCount = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblBasicSearch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        lblSerialNo = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        btnSearch2 = new javax.swing.JButton();
        btnSearch3 = new javax.swing.JButton();
        btnSearch5 = new javax.swing.JButton();
        btnSearch6 = new javax.swing.JButton();
        btnSearch7 = new javax.swing.JButton();
        btnSearch8 = new javax.swing.JButton();
        txtUpdatedTime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(193, 233, 242));

        comboBoxDropdownSearch.setBackground(new java.awt.Color(255, 0, 102));
        comboBoxDropdownSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboBoxDropdownSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First passenger car available", "Total Available cars", "Total Unavailable cars" }));
        comboBoxDropdownSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxDropdownSearchMouseClicked(evt);
            }
        });

        tblCarReg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblCarReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Name", "Is Car Available", "Car Manufacturer Name", "Car Manufacturer Year", "Number of a Seats in a car", "Car Serial Number", "Car Model Number", "City", "Car Maintenance Expiry Date", "Is Expired"
            }
        ));
        tblCarReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarRegMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarReg);

        lblCount.setText("Count:");

        txtRowCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRowCountActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblBasicSearch.setBackground(new java.awt.Color(153, 153, 153));
        lblBasicSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBasicSearch.setForeground(new java.awt.Color(255, 0, 51));
        lblBasicSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBasicSearch.setText("Filters");
        lblBasicSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Manufacturer Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mnf Year");

        jComboBox2.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Min Seats");

        jComboBox3.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jComboBox4.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Max Seats");

        jComboBox5.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblSerialNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSerialNo.setText("Serial Number");

        jComboBox6.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Model Number");

        jComboBox7.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("City");

        jComboBox8.setBackground(new java.awt.Color(255, 0, 102));
        jComboBox8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Expired maintenance certi");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Basic Search");

        btnSearch1.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnSearch2.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        btnSearch3.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch3.setText("Search");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        btnSearch5.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch5.setText("Search");
        btnSearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch5ActionPerformed(evt);
            }
        });

        btnSearch6.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch6.setText("Search");
        btnSearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch6ActionPerformed(evt);
            }
        });

        btnSearch7.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch7.setText("Search");
        btnSearch7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch7ActionPerformed(evt);
            }
        });

        btnSearch8.setBackground(new java.awt.Color(0, 0, 204));
        btnSearch8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch8.setText("Search");
        btnSearch8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch8ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Last Updated Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(208, 208, 208)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxDropdownSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBasicSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch8)
                            .addComponent(btnSearch7)
                            .addComponent(btnSearch6)
                            .addComponent(btnSearch5)
                            .addComponent(btnSearch3)
                            .addComponent(btnSearch2)
                            .addComponent(btnSearch1)
                            .addComponent(btnSearch))
                        .addGap(0, 595, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(63, 63, 63)
                        .addComponent(txtUpdatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addComponent(lblBasicSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxDropdownSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxDropdownSearch, jComboBox1, jComboBox2, jComboBox3, jComboBox4, jLabel2, jLabel3, jLabel4, jLabel5});

    }// </editor-fold>//GEN-END:initComponents
    private void insertToTable(List<Uber> ubercars) {
        try{
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        tblCarReg.setRowHeight(40);      
        tblCarReg.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblCarReg.getTableHeader().setPreferredSize(new Dimension(250, 40));
        tblCarReg.getTableHeader().setBackground(Color.RED);
        tblCarReg.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));
        tblCarReg.setFont(new Font("Times New Roman", Font.PLAIN,18 ));
        for(Uber uberObj: ubercars){
           
           if((uberObj.getCarName()== null || uberObj.getCarName().isEmpty()) 
                   || (uberObj.getCarManufacturer()== null || uberObj.getCarManufacturer().isEmpty()) 
                   || (uberObj.getSerialNum()== null || uberObj.getSerialNum().isEmpty()) 
                   || (uberObj.getModelNum()== null || uberObj.getModelNum().isEmpty()) 
                   || (uberObj.getCity()== null || uberObj.getCity().isEmpty()) 
                   || (uberObj.getMaintenanceExpiryCerti()== null || uberObj.getCarName().isEmpty())
//                   || (uberObj.getIsExpired()== null || uberObj.getIsExpired().isEmpty()) 

            ){
               return;
           }
           else{
            Object[] row = new Object[10];
            row[0] = uberObj.getCarName();
            row[1] = ((uberObj.isIsAvailable() == true) ? "Yes" : "No");
            row[2] = uberObj.getCarManufacturer();
            row[3] = uberObj.getCarManufacturingYear();
            row[4] = uberObj.getNumOfSeats();
            row[5] = uberObj.getSerialNum();
            row[6] = uberObj.getModelNum();
            row[7] = uberObj.getCity();
            row[8] = uberObj.getMaintenanceExpiryCerti();
            row[9] = uberObj.getIsExpired();
            model.addRow(row);
           }
            
        }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    } 
    private void comboBoxDropdownSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxDropdownSearchMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_comboBoxDropdownSearchMouseClicked

    private void tblCarRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarRegMouseClicked
        // TODO add your handling code here

    }//GEN-LAST:event_tblCarRegMouseClicked

    private void txtRowCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRowCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRowCountActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
            for( Uber carObj: ubercars.getUberCars()){

                    switch (comboBoxDropdownSearch.getSelectedIndex()) {
                        case 0:
                            if((carObj.isIsAvailable() == true) ){
                                searchList.add(carObj);
                                insertToTable(searchList);
                                lblCount.setVisible(false);
                                txtRowCount.setVisible(false);
                                return;
                            }       break;
                        case 1:
                            if((carObj.isIsAvailable() == true) ){
                                searchList.add(carObj);
                                insertToTable(searchList);
                                lblCount.setVisible(true);
                                txtRowCount.setVisible(true);
                                txtRowCount.setText(String.valueOf(searchList.size()));

                            }       break;
                        case 2:
                            if(carObj.isIsAvailable()==false) {
                                searchList.add(carObj);
                                insertToTable(searchList);
                                lblCount.setVisible(true);
                                txtRowCount.setVisible(true);
                                txtRowCount.setText(String.valueOf(searchList.size()));
                            }       break;
                        default:
                            break;
                    }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
        for( Uber carObj: ubercars.getUberCars()){
            if(jComboBox1.getSelectedItem().equals(carObj.getCarManufacturer())){
                searchList.add(carObj);
                insertToTable(searchList);   
            }
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
        for( Uber carObj: ubercars.getUberCars()){
            if(jComboBox2.getSelectedItem().equals(String.valueOf(carObj.getCarManufacturingYear()))){
                searchList.add(carObj);
                insertToTable(searchList);   
            }
        }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        // TODO add your handling code here
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
        for( Uber carObj: ubercars.getUberCars()){
            if( (carObj.getNumOfSeats() >= Integer.parseInt(jComboBox3.getSelectedItem().toString()) ) && (carObj.getNumOfSeats() <= Integer.parseInt(jComboBox4.getSelectedItem().toString()))){
                searchList.add(carObj);
                insertToTable(searchList);   
            }
        }
    }//GEN-LAST:event_btnSearch3ActionPerformed

    private void btnSearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
        for( Uber carObj: ubercars.getUberCars()){
            if(jComboBox5.getSelectedItem().equals(carObj.getSerialNum())){
                searchList.add(carObj);
                insertToTable(searchList);   
            }
        }
    }//GEN-LAST:event_btnSearch5ActionPerformed

    private void btnSearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
        for( Uber carObj: ubercars.getUberCars()){
            if(jComboBox6.getSelectedItem().equals(carObj.getModelNum())){
                searchList.add(carObj);
                insertToTable(searchList);   
            }
        }
    }//GEN-LAST:event_btnSearch6ActionPerformed

    private void btnSearch7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch7ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);
        for( Uber carObj: ubercars.getUberCars()){
            if(jComboBox7.getSelectedItem().equals(carObj.getCity())){
                searchList.add(carObj);
                insertToTable(searchList);   
            }
        }
    }//GEN-LAST:event_btnSearch7ActionPerformed

    private void btnSearch8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch8ActionPerformed
        // TODO add your handling code here:
//        Date currDate = new Date();
        DefaultTableModel model = (DefaultTableModel)tblCarReg.getModel();
        model.setRowCount(0);
        searchList.removeAll(searchList);

        for(Uber carObj: ubercars.getUberCars()){
            if((jComboBox8.getSelectedItem().equals("Yes")) && (carObj.getIsExpired().equals("Expired")) ) {
                searchList.add(carObj);
            }
            else if((jComboBox8.getSelectedItem().equals("No")) && (carObj.getIsExpired().equals("Not Expired")) )
            searchList.add(carObj);
            insertToTable(searchList);
        }
//        for( Uber carObj: ubercars.getUberCars()){
//            if(jComboBox8.getSelectedItem() == "Yes"){ 
//                if((carObj.getMaintenanceExpiryCerti().before(currDate))){  
//                    carObj.setIsExpired("Expired");
//                    searchList.add(carObj);
//                    insertToTable(searchList);
//                }
//            }
//            else if(jComboBox8.getSelectedItem() == "No"){
//                if((currDate.before(carObj.getMaintenanceExpiryCerti()))){
//                    carObj.setIsExpired("Not Expired");
//                    searchList.add(carObj);
//                    insertToTable(searchList);  
//                    }
//            }
//        }        
    }//GEN-LAST:event_btnSearch8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton btnSearch5;
    private javax.swing.JButton btnSearch6;
    private javax.swing.JButton btnSearch7;
    private javax.swing.JButton btnSearch8;
    private javax.swing.JComboBox<String> comboBoxDropdownSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBasicSearch;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JTable tblCarReg;
    private javax.swing.JTextField txtRowCount;
    private javax.swing.JTextField txtUpdatedTime;
    // End of variables declaration//GEN-END:variables

    private void displayComboBox(JComboBox jComboBoxName) {
        try{
                    ArrayList<String> mnfList = new ArrayList<>();
                Set<String> mnfSet = new HashSet<>();
                for(Uber uberObj: ubercars.getUberCars()){
                    jComboBoxName.removeAllItems();
                    if(jComboBoxName.equals(jComboBox1)){
                        mnfList.add(uberObj.getCarManufacturer());
                    }
                    else if(jComboBoxName.equals(jComboBox2)){
                        mnfList.add(String.valueOf(uberObj.getCarManufacturingYear()));
                    }
                    else if(jComboBoxName.equals(jComboBox3)){
                        mnfList.add(String.valueOf(uberObj.getNumOfSeats()));
                    }
                    else if(jComboBoxName.equals(jComboBox4)){
                        mnfList.add(String.valueOf(uberObj.getNumOfSeats()));
                    }
                     else if(jComboBoxName.equals(jComboBox5)){
                        mnfList.add(uberObj.getSerialNum());
                    }
                    else if(jComboBoxName.equals(jComboBox6)){
                        mnfList.add(uberObj.getModelNum());
                    }
                    else if(jComboBoxName.equals(jComboBox7)){
                        mnfList.add(uberObj.getCity());
                    }
                   
                    mnfSet.addAll(mnfList);         
                    mnfList.clear();
                    mnfList.addAll(mnfSet);
                    for(String a :mnfList)
                    {
                        jComboBoxName.addItem(a);
                    }
                }
            }
        catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);
                }
        }

    private void callComboBox() {
        displayComboBox(jComboBox1);
        displayComboBox(jComboBox2);
        displayComboBox(jComboBox3);
        displayComboBox(jComboBox4);
        displayComboBox(jComboBox5);
        displayComboBox(jComboBox6);
        displayComboBox(jComboBox7);
    }
}
