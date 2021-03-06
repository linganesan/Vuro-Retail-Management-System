package inventory;


import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class ProductSupplies extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
Statement st=null;
 int total;
    /**
     * Creates new form PatientRegistration
     */
    public ProductSupplies() {
        initComponents();
        setLocationRelativeTo(null);
        total=0;
    }
private void Reset()
{
    txtProductID.setText("");
    txtInvoiceNo.setText("");
    
    txtQuantity.setText("");
    btnSave.setEnabled(true);
    btnSupply.setEnabled(false);
   // txtProductID.requestDefaultFocus();
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
        jLabel2 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSupply = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        btnGetData1 = new javax.swing.JButton();
        btnGetData2 = new javax.swing.JButton();
        btnGetData3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Product Supply Request");
        setMinimumSize(new java.awt.Dimension(737, 327));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Details"));

        jLabel1.setText("Product ID");

        jLabel2.setText("Invoice No");

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantity");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSupply.setText("Get Supply");
        btnSupply.setEnabled(false);
        btnSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplyActionPerformed(evt);
            }
        });

        btnGetData.setText("View Supplies Items");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        btnGetData1.setText("View Supplies");
        btnGetData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetData1ActionPerformed(evt);
            }
        });

        btnGetData2.setText("View Products Details");
        btnGetData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetData2ActionPerformed(evt);
            }
        });

        btnGetData3.setText("View Inventory History");
        btnGetData3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetData3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGetData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGetData3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(txtQuantity)
                    .addComponent(txtInvoiceNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" Amount   :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     try{
            con=Connect.ConnectDB();
            if (txtProductID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter product id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtInvoiceNo.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter invoice no","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
           
          if (txtQuantity.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter amount of quantity","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
        try{
        int a = 0;
        String sq4= "Select Price from products where Product_Id= '" + txtProductID.getText() + "'";
        pst=con.prepareStatement(sq4);
        int quantity=  parseInt(txtQuantity.getText());
          rs= pst.executeQuery();
           while (rs.next()) {
             a = rs.getInt("Price");
             }
           total =(a*quantity);
           
           jLabel4.setText(String.valueOf(total));
           
          }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } 
         
               
          
     /* Statement stmt;
       stmt= con.createStatement();  
      String sql1="Select Product_Id from supplies_items where Product_Id= '" + txtProductID.getText() + "'";
      rs=stmt.executeQuery(sql1);
     */
     
           
            
            JOptionPane.showMessageDialog(this,"Successfully Requested","Supplies",JOptionPane.INFORMATION_MESSAGE);
         
             
            
            btnSave.setEnabled(false);
            btnSupply.setEnabled(true);

        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this,"ERROR","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_btnSaveActionPerformed

    
    
    private void btnSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplyActionPerformed
       
    try {
        con=Connect.ConnectDB();
          
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
           String da =(String) dateFormat.format(date);
          
         int amount = 0;
         int quantity=  parseInt(txtQuantity.getText());
         if(txtProductID.getText()!=null){
       String sq5= "Select * from products where Product_Id= '" + txtProductID.getText() + "'";
        pst=con.prepareStatement(sq5);
        rs= pst.executeQuery();
          while (rs.next()) {
            amount = rs.getInt("Total_Quantity");
          }
        amount+=quantity;  
          
            String sq2= "insert into supplies_items (Invoice_No,Product_Id,Order_Quantity) values('"+ txtInvoiceNo.getText() + "','"+txtProductID.getText()+ "','" + txtQuantity.getText() + "')";
       
        pst=con.prepareStatement(sq2);
            pst.execute();
  
               String sq1 = "UPDATE `products` SET `Total_Quantity`="+ amount +" where Product_Id= "+ txtProductID.getText();
         st=con.createStatement();
              st.executeUpdate(sq1);
        
        
              
        String query1 = "INSERT INTO `supplies`(`Invoice_No`, `Order_Date`, `Total_Amount`)" + "VALUES (?,?,?)";
            
            // create the mysql insert preparedstatement
            java.sql.PreparedStatement preparedStmt1 = con.prepareStatement(query1);
                       
            
            preparedStmt1.setString(1,txtInvoiceNo.getText());
            preparedStmt1.setString(2,da);
            preparedStmt1.setString(3,String.valueOf(total));   
              preparedStmt1.executeUpdate();
            preparedStmt1.close();      
       //String sq3= "INSERT INTO `supplies`(`Invoice_No`, `Order_Date`, `Total_Amount`) VALUES ("+ txtInvoiceNo.getText()+","+currentTime+","+total+")";     
     // pst=con.prepareStatement(sq3);
     //  pst.execute();
        
       
           
        String query = "INSERT INTO `inventory`(`Product_Id`, `Order_Type_Code`, `Order_Date`, `Quantity`, `Inventory_Level`)" + "VALUES (?,?,?,?,?)";
            
            // create the mysql insert preparedstatement
            java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
                       
            
            preparedStmt.setString(1,txtProductID.getText());
            preparedStmt.setString(2,"Supplies");
            preparedStmt.setString(3,da);
            preparedStmt.setString(4,txtQuantity.getText());   
            preparedStmt.setString(5,String.valueOf(amount));
              preparedStmt.executeUpdate();
            preparedStmt.close();
        
      //  String sq4= "insert into inventory (Product_Id,Order_Type_Code,Order_Date,Quantity,Inventory_Level) values('"+ txtProductID.getText() +",Supplies,"+da+ ","+txtQuantity.getText()+ "," + amount + ")";     
   
     //  pst=con.prepareStatement(sq4);
     //   pst.execute();
        
            JOptionPane.showMessageDialog(this,"Successfully Added","Supplies",JOptionPane.INFORMATION_MESSAGE); 
         }else{
         JOptionPane.showMessageDialog(this,"Please Reconfigure","Supplies",JOptionPane.INFORMATION_MESSAGE); 
         }
      }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,"ERROR","ERROR",JOptionPane.WARNING_MESSAGE);
        }   
        
        
        
        
        
      
    }//GEN-LAST:event_btnSupplyActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
    this.hide();
SuppliesItemsRecord frm=new SuppliesItemsRecord(this);
frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityKeyTyped

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnGetData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetData1ActionPerformed
    this.setVisible(false);
        SuppliesRecord frm=new SuppliesRecord(this);
        frm.setVisible(true);
    }//GEN-LAST:event_btnGetData1ActionPerformed

    private void btnGetData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetData2ActionPerformed
      //this.enable(false);
        ProductRecord frm=new ProductRecord();
        frm.setVisible(true);
    }//GEN-LAST:event_btnGetData2ActionPerformed

    private void btnGetData3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetData3ActionPerformed
        InventoryHistory frm=new InventoryHistory();
        frm.setVisible(true);
    }//GEN-LAST:event_btnGetData3ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnGetData1;
    private javax.swing.JButton btnGetData2;
    private javax.swing.JButton btnGetData3;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnSupply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtInvoiceNo;
    public javax.swing.JTextField txtProductID;
    public javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

   
}
