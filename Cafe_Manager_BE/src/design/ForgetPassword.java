
package design;

import java.awt.Font;

import javax.swing.JOptionPane;

import plurality.Accounts;

public class ForgetPassword extends javax.swing.JFrame {

    public ForgetPassword() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
        private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonConfirm = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yourpass = new javax.swing.JLabel();
        yourpass.setFont(new Font("Tahoma", Font.PLAIN, 17));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(162, 124, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 5), "Forgot Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FreeMono", 3, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("MAP COFFEE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, -1, 67));

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel3.setText("Security question:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel4.setText("Answer:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 208, -1, -1));

        jButtonConfirm.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-confirm-24.png")); // NOI18N
        jButtonConfirm.setText("CONFIRM");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 115, 38));

        jButtonReset.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-reset-24.png")); // NOI18N
        jButtonReset.setText("RESET");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 115, 38));

        txtUsername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 249, -1));

        txtAnswer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 247, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel5.setText("Your mother's name?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 211, 30));

        jButtonReturn.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-return-24.png")); // NOI18N
        jButtonReturn.setText("RETURN LOGIN");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 155, 36));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 52, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Your password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-forgot-password-64.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jPanel1.add(yourpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 244, 200, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 380));

        setSize(new java.awt.Dimension(473, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        txtUsername.setText("");
    	txtAnswer.setText("");
    	yourpass.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        LoginForm.usernameM = txtUsername.getText();
    	String answer = txtAnswer.getText();
        Accounts a = new Accounts();
        a.printSQL("mn%");
        //USE OBJECT TO DECLARE
        StringBuilder sb = new StringBuilder();
        //CASE: EMPTY DATA
        if(LoginForm.usernameM.equals("")) {
        	sb.append("User name is empty\n");
        }
        if(answer.equals("")){
            sb.append("Answer is empty\n");
        } 
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!a.checkMother(LoginForm.usernameM,answer))
        	JOptionPane.showMessageDialog(this, "Invalid username or answer security, denied " ,"Failure",JOptionPane.ERROR_MESSAGE);
        else
        	yourpass.setText(a.getPass(LoginForm.usernameM));
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReturnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel yourpass;
    // End of variables declaration//GEN-END:variables
}
