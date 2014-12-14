package EmployeeManagement;


import static java.lang.reflect.Array.set;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sasini
 */
public class ViewSalaryHistory extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form ViewSalaryHistory
     */
    public ViewSalaryHistory() {
        initComponents();
        con = DBConnection1.getConnection();
        
    }

    private void populate_table(){
        try{
            int id = Integer.parseInt(Enter_ID.getText());
            String sql = "SELECT * FROM salary_history WHERE Emp_Id = "+id;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            salary.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void populate_table_by_both(String Combomonth, String Comboyear){
        
        String combo_month_year = Combomonth.concat(" "+Comboyear);
    
        try{
            int id = Integer.parseInt(Enter_ID.getText());
            String sql = "SELECT * FROM salary_history WHERE Emp_Id = "+id+" AND Period = '" +combo_month_year+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            salary.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void populate_table_by_month(String Combomonth){
         try{
            int id = Integer.parseInt(Enter_ID.getText());
            String sql = "SELECT * FROM salary_history WHERE Period LIKE '"+Combomonth+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            salary.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void populate_table_by_year(String Comboyear){
         try{
            int id = Integer.parseInt(Enter_ID.getText());
            String sql = "SELECT * FROM salary_history WHERE Period LIKE '%"+Comboyear+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            salary.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(ViewAttendanceHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Enter_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        combo_month = new javax.swing.JComboBox();
        combo_year = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salary = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Enter the employee ID to view salary history");

        jLabel2.setText("time period");

        jButton2.setText("View Employee Salary Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        combo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Months", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        combo_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Years", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        combo_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_yearActionPerformed(evt);
            }
        });

        jLabel3.setText("month");

        jLabel4.setText("year");

        salary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_Id", "Period", "Salary_Paid_Date", "Basic_Salary", "OverTime_Payment", "Incentives", "Total_Amount"
            }
        ));
        jScrollPane1.setViewportView(salary);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enter_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Enter_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        EmployeeSelectTask est = new EmployeeSelectTask();
        est.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Combomonth, Comboyear;
        if(Enter_ID.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Empty fields detected. Please fill all the fields..");
        }
        else{
            Combomonth = combo_month.getSelectedItem().toString();
            Comboyear = combo_year.getSelectedItem().toString();
            if("All Months".equals(Combomonth) && "All Years".equals(Comboyear))
                populate_table();
            else if(!"All Months".equals(Combomonth) && "All Years".equals(Comboyear))
                populate_table_by_month(Combomonth);
            else if("All Months".equals(Combomonth) && !"All Years".equals(Comboyear))
                populate_table_by_year(Comboyear);
            else
                populate_table_by_both(Combomonth, Comboyear);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_yearActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSalaryHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Enter_ID;
    private javax.swing.JComboBox combo_month;
    private javax.swing.JComboBox combo_year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salary;
    // End of variables declaration//GEN-END:variables

   
}
