/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package sas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arijit
 */
public class AddEmployee extends javax.swing.JFrame {
    private String username;
    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
    }
    public AddEmployee(String username) {
        this.username = username;
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        post = new javax.swing.JComboBox<>();
        fname = new javax.swing.JFormattedTextField();
        lname = new javax.swing.JFormattedTextField();
        sex = new javax.swing.JComboBox<>();
        address = new javax.swing.JFormattedTextField();
        mobile = new javax.swing.JFormattedTextField();
        email = new javax.swing.JFormattedTextField();
        salary = new javax.swing.JFormattedTextField();
        bankaccount = new javax.swing.JFormattedTextField();
        submit = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        location = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        passwd = new javax.swing.JFormattedTextField();
        uname = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Post");

        jLabel1.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Sex");

        jLabel5.setText("Date of Birth");

        jLabel6.setText("Address");

        jLabel7.setText("Mobile No");

        jLabel8.setText("Email");

        jLabel9.setText("Salary");

        jLabel10.setText("Bank Account No");

        post.setBackground(new java.awt.Color(255, 255, 255));
        post.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales Clerk", "Supermarket Staff" }));

        sex.setBackground(new java.awt.Color(255, 255, 255));
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setText("Add Employee");

        jLabel12.setText("Location");

        jLabel13.setText("Password");

        jLabel14.setText("Username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(submit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bankaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(154, 154, 154)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(44, 44, 44)
                .addComponent(submit)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private String quotate(String s) {
        return ("'" + s + "'");
    }
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String uName,password,fName,lName,add,emailAddress,acnumber,phone,Sex,Location,sql;
        int salaryValue, id = 0;
        java.util.Date DOB = new Date();
        if((fName = fname.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "First name not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((lName = lname.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Last name not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((uName = uname.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((password = passwd.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((add = address.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Address not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((Location = location.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Location not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((emailAddress = email.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Email address not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!isValidEmail(email.getText()))
        {
            JOptionPane.showMessageDialog(null, "Email address is not valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((phone = mobile.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Mobile number not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((acnumber=bankaccount.getText()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Bank account number not specified!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            DOB = dob.getDate();
            System.out.println(DOB);
            java.sql.Date sqlDate = new java.sql.Date(DOB.getTime());
            salaryValue = Integer.parseInt(salary.getText());
            if(sex.getSelectedIndex() == 0)
            {
                Sex = "Male";
            }
            else
            {
                Sex = "Female";
            }
            
            if(post.getSelectedIndex() == 0)
            {
                try {
                    id=1000;
                    Connection conn = new ConnectionHandler().createConnection();
                    Statement statement = conn.createStatement();
                    String get = "select Employee_ID from SalesClerkDatabase";
                    ResultSet rs = statement.executeQuery(get);
                    
                    while(rs.next()) {
                        id = rs.getInt("Employee_ID");
                    }
                    id++;
                    sql = "insert into SalesClerkDatabase (Employee_ID, Username, Password, First_Name, Last_Name, Sex, DOB, Address, Location, Mobile_No, Email, Salary, Bank_Account_No) values"
                            + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1,id);
                    pst.setString(2,uName);
                    pst.setString(3,password);
                    pst.setString(4,fName);
                    pst.setString(5,lName);
                    pst.setString(6,Sex);
                    pst.setDate(7,sqlDate);
                    pst.setString(8,add);
                    pst.setString(9,Location);
                    pst.setString(10,phone);
                    pst.setString(11,emailAddress);
                    pst.setInt(12,salaryValue);
                    pst.setString(13,acnumber);
                    pst.executeUpdate();
                    pst.close();
                    
                    JOptionPane.showMessageDialog(null, "Sign Up Complete!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                try {
                    id=2000;
                    Connection conn = new ConnectionHandler().createConnection();
                    Statement statement = conn.createStatement();
                    String get = "select Employee_ID from SupermarketStaffDatabase";
                    ResultSet rs = statement.executeQuery(get);
                    
                    while(rs.next()) {
                        id = rs.getInt("Employee_ID");
                    }
                    id++;
                    sql = "insert into SupermarketStaffDatabase (Employee_ID, Username, Password, First_Name, Last_Name, Sex, DOB, Address, Location, Mobile_No, Email, Salary, Bank_Account_No) values"
                            + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setInt(1,id);
                    pst.setString(2,uName);
                    pst.setString(3,password);
                    pst.setString(4,fName);
                    pst.setString(5,lName);
                    pst.setString(6,Sex);
                    pst.setDate(7,sqlDate);
                    pst.setString(8,add);
                    pst.setString(9,Location);
                    pst.setString(10,phone);
                    pst.setString(11,emailAddress);
                    pst.setInt(12,salaryValue);
                    pst.setString(13,acnumber);
                    pst.executeUpdate();
                    pst.close();
                    
                    JOptionPane.showMessageDialog(null, "Sign Up Complete!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            fname.setText("");
            lname.setText("");
            address.setText("");
            dob.setDate(new Date());
            location.setText("");
            mobile.setText("");
            email.setText("");
            bankaccount.setText("");
            salary.setText("");
            
            new ManagerPage(username).setVisible(true);
            dispose();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed
    
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }
    public boolean isValidEmail(String emailAddr){
        if(emailAddr.isEmpty())
        {
            return false;
        }
        char[] invalidChar={'/',',',';',':'};
        for(int i=0;i<invalidChar.length;i++){
            if(emailAddr.indexOf(invalidChar[i])>=0){
                return false;
            }
        }
        int posofat = emailAddr.indexOf('@');
        if(posofat<0){
            return false;
        }
        if(emailAddr.indexOf('@', posofat)<0){
            return false;
        }
        int periodpos = emailAddr.lastIndexOf('.');
        if(periodpos<0 || periodpos<posofat){
            return false;
        }
        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField address;
    private javax.swing.JFormattedTextField bankaccount;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JFormattedTextField email;
    private javax.swing.JFormattedTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField lname;
    private javax.swing.JFormattedTextField location;
    private javax.swing.JFormattedTextField mobile;
    private javax.swing.JFormattedTextField passwd;
    private javax.swing.JComboBox<String> post;
    private javax.swing.JFormattedTextField salary;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JButton submit;
    private javax.swing.JFormattedTextField uname;
    // End of variables declaration//GEN-END:variables
}