
package design;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;

import BE.Customer;
import BE.Employee;
import plurality.Bills;
import plurality.Customers;

@SuppressWarnings("serial")
public class register extends javax.swing.JFrame {
    public register() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textTille = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jTextID.setText(EmployeeTB.Cid);
        jTextSurname = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextGender = new javax.swing.JTextField();
        jTextDay = new javax.swing.JTextField();
        jTextMonth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextYear = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jTextPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 124, 86));
        jPanel1.setForeground(new java.awt.Color(162, 124, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        
        textTille.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        textTille.setText("Register Customer");
        jPanel1.add(textTille, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 24, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Surname:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 251, -1, 14));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 248, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 288, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Your Birthday:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 327, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 366, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Phone number:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 405, -1, -1));

        jTextID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 80, -1));

        jTextSurname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 120, -1));

        jTextName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 240, 85, -1));

        jTextGender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 80, -1));

        jTextDay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 34, -1));

        jTextMonth.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 36, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("/");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 10, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("/");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 10, 30));

        jTextYear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 52, -1));

        jTextAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 290, -1));

        jTextPhone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.add(jTextPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 119, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-customer-100.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jButtonAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        //action for resigter
    	String surname = jTextSurname.getText();
    	String name = jTextName.getText();
    	String gender = jTextGender.getText().toLowerCase();
    	String address = jTextAddress.getText();
    	String phone = jTextPhone.getText();
    	Customer s = new Customer();
    	s = Customers.printSQL(phone);
    	StringBuilder sb = new StringBuilder();
    	if(surname.equals("")||name.equals("")||gender.equals("")||jTextDay.getText().equals("")||jTextMonth.getText().equals("")||jTextYear.getText().equals("")||address.equals("")||phone.equals(""))
    		sb.append("Answer is empty\n");
    	else if(phone.charAt(0) != '0' || phone.length()>11 || phone.length()<10)
    		sb.append("Invalid phone number!\n");
    	else if(!gender.equals("female")&&!gender.equals("male"))
    		sb.append("Invalid gender!\n");
    	//TODO: check gender
    	else if(phone.equals(s.getPhone()))
    		sb.append("This customer is already a member!\n");
    	if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    	int day = Integer.parseInt(jTextDay.getText());
    	int month = Integer.parseInt(jTextMonth.getText());
    	int year = Integer.parseInt(jTextYear.getText());
    	if(!Employee.timeTest(day, month, year)) {
    		JOptionPane.showMessageDialog(this, "Invalid birthday!" ,"Failure",JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	Customer c = new Customer();
    	c.setSurname(surname);
    	c.setName(name);
    	c.setGender(gender);
    	c.setDay(day);
    	c.setMonth(month);
    	c.setYear(year);
    	c.setAddress(address);
    	c.setPoint(Bills.getPlusPoint(EmployeeTB.Cid));
    	c.setMember("normal");
    	c.setPhone(phone);
    	Customers.updateCustomer(EmployeeTB.Cid, c);
        JOptionPane.showMessageDialog(this, "Register successfully");
        new EmployeeTB().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextDay;
    private javax.swing.JTextField jTextGender;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextMonth;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextSurname;
    private javax.swing.JTextField jTextYear;
    private javax.swing.JLabel textTille;
    // End of variables declaration//GEN-END:variables
}
