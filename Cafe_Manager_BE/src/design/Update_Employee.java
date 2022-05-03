
package design;

import javax.swing.JOptionPane;

import BE.Employee;
import plurality.Employees;

@SuppressWarnings("serial")
public class Update_Employee extends javax.swing.JFrame {
	public static int flag = 0;
    public Update_Employee() {
        initComponents();
    }
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ibID = new javax.swing.JTextField();
        ibcheck = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        inName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ibSurname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ibAddress = new javax.swing.JTextField();
        ibSalary = new javax.swing.JTextField();
        ibCoffecient = new javax.swing.JTextField();
        ibDay = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ibmonth = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ibYear = new javax.swing.JTextField();
        ibUpdate = new javax.swing.JButton();
        ibSex = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ibWorkhour = new javax.swing.JTextField();
        ibExperience = new javax.swing.JTextField();
        ibBonus = new javax.swing.JTextField();
        ibMinus = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel7.setText("Position:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 124, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("Update Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 77, 33, -1));

        ibID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibID, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 74, 50, -1));

        ibcheck.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        ibcheck.setText("CHECK");
        ibcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibcheckActionPerformed(evt);
            }
        });
        jPanel1.add(ibcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 125, -1, -1));

        inName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(inName, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 122, 70, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Surname:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 30));

        ibSurname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Position:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 170, -1, 30));

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Bartender", "Waiter", "Guard"}));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 172, 102, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Sex:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 206, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Address:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 254, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Salary:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 302, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Coffecient:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 355, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Birthday:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 403, -1, -1));

        ibAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 251, 260, -1));

        ibSalary.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, -1));

        ibCoffecient.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibCoffecient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 352, 60, -1));

        ibDay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 400, 50, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("/");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 403, -1, -1));

        ibmonth.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 400, 50, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("/");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 403, -1, -1));

        ibYear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(ibYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 50, -1));

        ibUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ibUpdate.setText("UPDATE");
        ibUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(ibUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 188, -1));

        ibSex.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ibSex.setText("");
        jPanel1.add(ibSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Working hour:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Experience: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Bonus:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Minus:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        ibWorkhour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibWorkhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 60, -1));

        ibExperience.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 69, -1));

        ibBonus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 96, -1));

        ibMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 91, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Phone number:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(433, 761));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void ibcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibcheckActionPerformed
    	String fixID = ibID.getText();
        StringBuilder sb = new StringBuilder();
    	if(fixID.equals(""))
    		sb.append("Empty\n");
    	else if(!fixID.equals(Employees.findId(fixID)))
    		sb.append("This id doesnt exist!\n");
    	if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    	JOptionPane.showMessageDialog(this, "Exist, continue your work");
    	Employees es = new Employees();
    	es.printSQL("WHERE E_id = '"+fixID+"'");
    	Employee em = new Employee();
    	em = es.elementAt(0);
    	ibSurname.setText(em.getSurname());
    	inName.setText(em.getName());
    	ibSex.setText(em.getGender());
    	ibAddress.setText(em.getAddress());
    	jTextField1.setText(em.getPhone());
    	ibDay.setText(String.valueOf(em.getDay()));
    	ibmonth.setText(String.valueOf(em.getMonth()));
    	ibYear.setText(String.valueOf(em.getYear()));
    	ibSalary.setText(String.valueOf(em.getSalary()));
    	ibWorkhour.setText(String.valueOf(em.getWorking_hour()));
    	ibCoffecient.setText(String.valueOf(em.getCoefficients()));
    	ibBonus.setText(String.valueOf(em.getBonus()));
    	ibMinus.setText(String.valueOf(em.getMinus()));
    	ibExperience.setText(String.valueOf(em.getExperience()));
    	jComboBox1.setSelectedItem(em.getPosition());
    	++flag;
    }//GEN-LAST:event_ibcheckActionPerformed

    private void ibUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibUpdateActionPerformed
    	if(flag == 0) {
    		JOptionPane.showMessageDialog(this, "Please click check button first!" ,"Failure",JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	Employee em = new Employee();
        em.setSurname(ibSurname.getText());
        em.setName(inName.getText());
        em.setGender(ibSex.getText().toLowerCase());
        em.setAddress(ibAddress.getText());
        em.setPhone(jTextField1.getText());
        em.setPosition(jComboBox1.getSelectedItem().toString());
        StringBuilder sb = new StringBuilder();
    	if(em.getSurname().equals("")||em.getName().equals("")||em.getGender().equals("")||ibDay.getText().equals("")||ibmonth.getText().equals("")||ibYear.getText().equals("")||em.getAddress().equals("")||ibSalary.getText().equals("")||ibCoffecient.getText().equals("")||ibWorkhour.getText().equals("")||ibBonus.getText().equals("")||ibMinus.getText().equals("")||ibExperience.getText().equals("")||em.getPhone().equals(""))
    		sb.append("Answer is empty\n");
    	else if(em.getPhone().charAt(0) != '0' || em.getPhone().length()>11 || em.getPhone().length()<10)
    		sb.append("Invalid phone number!\n");
    	else if(!em.getGender().equals("female")&&!em.getGender().equals("male"))
    		sb.append("Invalid gender!\n");
    	if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    	em.setDay(Integer.parseInt(ibDay.getText()));
    	em.setMonth(Integer.parseInt(ibmonth.getText()));
    	em.setYear(Integer.parseInt(ibYear.getText()));
    	if(!Employee.timeTest(em.getDay(), em.getMonth(), em.getYear())) {
    		JOptionPane.showMessageDialog(this, "Invalid birthday!" ,"Failure",JOptionPane.ERROR_MESSAGE);
    		return;
    	}
        em.setSalary(Float.parseFloat(ibSalary.getText()));
        em.setCoefficients(Float.parseFloat(ibCoffecient.getText()));
        em.setWorking_hour(Integer.parseInt(ibWorkhour.getText()));
        em.setBonus(Float.parseFloat(ibBonus.getText()));
        em.setMinus(Float.parseFloat(ibMinus.getText()));
    	em.setExperience(Float.parseFloat(ibExperience.getText()));
    	if(em.getSalary()<0||em.getCoefficients()<0||em.getWorking_hour()<0||em.getBonus()<0||em.getMinus()<0||em.getExperience()<0) {
    		JOptionPane.showMessageDialog(this, "Invalid number!" ,"Failure",JOptionPane.ERROR_MESSAGE);
    		return;
    	}
        Employees.updateEmployee(ibID.getText(), em);
        JOptionPane.showMessageDialog(this, "Update successfully");
    	new ManagerHome().setVisible(true);
    	this.setVisible(false);
    }//GEN-LAST:event_ibUpdateActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ibAddress;
    private javax.swing.JTextField ibBonus;
    private javax.swing.JTextField ibCoffecient;
    private javax.swing.JTextField ibDay;
    private javax.swing.JTextField ibExperience;
    private javax.swing.JTextField ibID;
    private javax.swing.JTextField ibMinus;
    private javax.swing.JTextField ibSalary;
    private javax.swing.JTextField ibSex;
    private javax.swing.JTextField ibSurname;
    private javax.swing.JButton ibUpdate;
    private javax.swing.JTextField ibWorkhour;
    private javax.swing.JTextField ibYear;
    private javax.swing.JButton ibcheck;
    private javax.swing.JTextField ibmonth;
    private javax.swing.JTextField inName;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
