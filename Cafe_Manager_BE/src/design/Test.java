package design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import BE.Customer;
import BE.Employee;
import plurality.Accounts;
import plurality.Bills;
import plurality.Customers;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Test extends JFrame {
	public static String usernameM;

    int count = 1; //limit the attempt login 
    public Test() {
        initComponents();
        //method get time and date 
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lbForget = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/bckMAP.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setPreferredSize(new java.awt.Dimension(508, 435));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 440));

        jPanel2.setBackground(new java.awt.Color(162, 124, 86));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tlwg Typist", 1, 36)); // NOI18N
        jLabel3.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel4.setText("Let's get started");

        jLabel5.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel5.setText("Username:");

        btnClose.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-close-30.png")); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel6.setText("Password:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(188, 143, 143));
        btnLogin.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(188, 143, 143));
        btnReset.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lbForget.setFont(new java.awt.Font("FreeMono", 2, 14)); // NOI18N
        lbForget.setText("Forget password ?");
        lbForget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(420, Short.MAX_VALUE)
        			.addComponent(btnClose)
        			.addGap(14))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(64)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(jLabel5)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        							.addGap(27)
        							.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(187)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(69, GroupLayout.PREFERRED_SIZE))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(167)
        			.addComponent(lbForget)
        			.addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnClose)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel4)
        			.addGap(20)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addGap(3)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(57)
        					.addComponent(jLabel6))
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addGap(51)
        					.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        			.addGap(37)
        			.addComponent(lbForget)
        			.addGap(41))
        );
        jPanel2.setLayout(jPanel2Layout);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 470, 440));

        setSize(new java.awt.Dimension(913, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // GET DATA INPUT
    	Accounts a = new Accounts();
    	a.printSQL("mn%");
        String username = txtUser.getText();
        String password = new String(txtPassword.getPassword());
        //USE OBJECT TO DECLARE
        StringBuilder sb = new StringBuilder();
        //CASE: EMPTY DATA
        if(username.equals("")){
            sb.append("Username is empty\n");
        } 
        if (password.equals("")){
            sb.append("Password is empty\n");
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(a.check(username, password) && count < 3){
            JOptionPane.showMessageDialog(this, "Login successfully");
            usernameM = username;
            if(usernameM.equals("mn004")||usernameM.equals("mn010")) {
            	new EmployeeTB().setVisible(true);
                this.setVisible(false);
            }else {
            	new ManagerHome().setVisible(true);
            	this.setVisible(false);
            }
            
        } else if (count != 3){
            JOptionPane.showMessageDialog(this, "Invalid username or password, denied " + count,"Failure",JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "The last attempt to login! ");
        }
        if(count == 4){
            this.dispose();
        }
        count++;
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtUser.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void lbForgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetMouseClicked
        // TODO add your handling code here:
        new ForgetPassword().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbForgetMouseClicked

    private void no(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no
   
    }//GEN-LAST:event_no

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:
//        boolean isCheck= Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
//        if(isCheck == true){
//            lbCaplockUser.setText("Caplock is on");
//        }          
    }//GEN-LAST:event_jPanel2KeyPressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbForget;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
