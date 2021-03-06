
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author trist
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

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
        Username = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Password2 = new javax.swing.JPasswordField();
        Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alreadyReg = new javax.swing.JButton();
        emailWrong = new javax.swing.JLabel();
        passNotMatch = new javax.swing.JLabel();
        Empty2 = new javax.swing.JLabel();
        bot1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 253, 40));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 253, 37));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 253, 34));

        Password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password2ActionPerformed(evt);
            }
        });
        jPanel1.add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 253, 34));

        Register.setText("REGISTER");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 253, 33));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 29));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 83, 37));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Password ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 26));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Retype password ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, -1));

        alreadyReg.setText("Already Registered? ");
        alreadyReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alreadyRegActionPerformed(evt);
            }
        });
        jPanel1.add(alreadyReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 158, -1));
        jPanel1.add(emailWrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 216, 253, -1));
        jPanel1.add(passNotMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 274, 253, -1));
        jPanel1.add(Empty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 317, 253, -1));

        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        jPanel1.add(bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Prove Not A bot");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 133, 24));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 228, 246, -1));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 230, -1));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 250, -1));

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project background.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alreadyRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alreadyRegActionPerformed
        // TODO add your handling code here:
        dispose();
        loginGUI alreadyReg = new loginGUI();
        alreadyReg.setVisible(true);

    }//GEN-LAST:event_alreadyRegActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        passwordCheck m = new passwordCheck();

        String text2 = Password.getText();
        String text = Password2.getText();
        //password check to see if password is strong enough to be registered
        int pwdStrength = m.calculatePasswordStrength(text2);
        if (pwdStrength == 0 || pwdStrength == 2) {
            System.out.println("Password length is too small");
            jLabel8.setText("Length of password is smaller than " + m.getMinPwd()
                    + " or greater than " + m.getMaxPwd());
        } else if (pwdStrength < 9) {
            jLabel8.setText("Password does not contain one digit, one lower case, one upper case letter and one special character ");
        }
        //This makes the user have to prove there not a bot before login
        else {
            if (!bot1.isSelected()) {
                JOptionPane.showMessageDialog(null, "prove not bot");
                bot1.equals(false);
            } else {
                 // tells the user both password text fields must match
                if (!text.equals(text2)) {
                    jLabel9.setText("Passwords do not match");
                     //This tells the user they must enter in to fields to continue 
                } else if (Username.getText().trim().isEmpty() && Password.getText().trim().isEmpty() && Password2.getText().trim().isEmpty() && Email.getText().trim().isEmpty()) {
                    jLabel7.setText("one or more fields are empty");

                } else if (Username.getText().trim().isEmpty()) {

                   jLabel7.setText("one or more fields are empty");
                } else if (Password.getText().trim().isEmpty()) {

                   jLabel7.setText("one or more fields are empty");
                } else if (Password2.getText().trim().isEmpty()) {

                    jLabel7.setText("one or more fields are empty");
                } else if (Email.getText().trim().isEmpty()) {

                    jLabel7.setText("one or more fields are empty");
                } else {
                    Connection connection = null;
                    //creates connection to Database
                    try {

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                        } catch (ClassNotFoundException e) {
                            System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
                            e.printStackTrace();
                            return;
                        }

                        connection = DriverManager.getConnection("jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1549895_0",
                                "w1549895", "qlHyxUJpoxxK");
                    } catch (SQLException e) {
                        System.out.println("ERROR: MySQL Connection Failed!");
                        e.printStackTrace();
                        return;
                    }
                    System.out.println("Database connected!");
                    Statement stmt = null;
                    try // create a Statement for the SQL query
                    {
                        stmt = connection.createStatement();
                    } catch (SQLException e) {
                        System.out.println("ERROR: Failed to create Statement.");
                        e.printStackTrace();
                        return;
                    }                  
                    try // try to run an SQL query
                    {
                        String username = Username.getText();
                        String email = Email.getText();
                        String password = Password.getText();
                        //String password = encrypt(Password.getText(), secretKey);
                        System.out.println("username " + username + " email " + email + " password" + password);
                        stmt.executeUpdate("INSERT into UserLog( Username, Email, Password) values('" + username + "','" + email + "','" + password + "')");

                    } catch (SQLException e) // check for a query error
                    {
                        System.out.println("ERROR: Cannot execute query.");
                        e.printStackTrace();
                        return;
                    }
                    try // close the connection now we've finished with it.
                    {
                        connection.close();
                    } catch (SQLException e) {
                        System.out.println("WARNING: Failed to close database!");
                        e.printStackTrace();
                        return;
                    }
                    System.out.println("Database closed.");
                }
            }
        }
    }//GEN-LAST:event_RegisterActionPerformed


    private void Password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_Password2ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_PasswordActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Empty2;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField Password2;
    private javax.swing.JButton Register;
    private javax.swing.JTextField Username;
    private javax.swing.JButton alreadyReg;
    private javax.swing.JCheckBox bot1;
    private javax.swing.JLabel emailWrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel passNotMatch;
    // End of variables declaration//GEN-END:variables
}
