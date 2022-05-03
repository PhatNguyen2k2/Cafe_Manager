
package design;

import javax.swing.JOptionPane;

import BE.Employee;
import plurality.Accounts;
import plurality.Employees;

public class Add_Employee extends javax.swing.JFrame {

    public Add_Employee() {
        initComponents();
        setId();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ibID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ibname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ibAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ibCoffecient = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ibSalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ibDay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ibMonth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ibYear = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ibSurname = new javax.swing.JTextField();
        ibsex = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ibphone = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel5.setText("Position:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 124, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("FreeMono", 3, 24)); // NOI18N
        jLabel1.setText("Add Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 90, -1, -1));

        ibID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibID, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 90, 70, -1));

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 138, -1, -1));

        ibname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 137, 70, -1));

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel4.setText("Position:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 181, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Bartender", "Waiter", "Guard" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 194, -1));

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel6.setText("Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel7.setText("Sex:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 224, -1, -1));

        ibAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 230, -1));

        jLabel8.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel8.setText("Salary:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 313, -1, -1));

        ibCoffecient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibCoffecient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, -1));

        jLabel9.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel9.setText("Coffecient:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 355, -1, -1));

        ibSalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 80, -1));

        jLabel10.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel10.setText("Birthday:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 398, -1, 30));

        ibDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 40, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("/");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 10, 50));

        ibMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 40, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("/");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 10, 50));

        ibYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 50, -1));

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, -1));

        jLabel13.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel13.setText("Surname:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        ibSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 137, 110, -1));

        ibsex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 70, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Phone number:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        ibphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ibphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(398, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	Employee em = new Employee();
    	em.setId(ibID.getText());
        em.setSurname(ibSurname.getText());
        em.setName(ibname.getText());
        em.setGender(ibsex.getText().toLowerCase());
        em.setAddress(ibAddress.getText());
        em.setPhone(ibphone.getText());
        em.setPosition(jComboBox1.getSelectedItem().toString());
        StringBuilder sb = new StringBuilder();
    	if(em.getSurname().equals("")||em.getName().equals("")||em.getGender().equals("")||ibDay.getText().equals("")||ibMonth.getText().equals("")||ibYear.getText().equals("")||em.getAddress().equals("")||ibSalary.getText().equals("")||ibCoffecient.getText().equals("")||em.getPhone().equals(""))
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
    	em.setMonth(Integer.parseInt(ibMonth.getText()));
    	em.setYear(Integer.parseInt(ibYear.getText()));
    	if(!Employee.timeTest(em.getDay(), em.getMonth(), em.getYear())) {
    		JOptionPane.showMessageDialog(this, "Invalid birthday!" ,"Failure",JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	em.setSalary(Float.parseFloat(ibSalary.getText()));
    	em.setCoefficients(Float.parseFloat(ibCoffecient.getText()));
    	if(em.getSalary()<0||em.getCoefficients()<0) {
    		JOptionPane.showMessageDialog(this, "Invalid number!" ,"Failure",JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	em.setWorking_hour(0);
    	em.setBonus(0);
    	em.setMinus(0);
    	em.setExperience(0);
    	Accounts ac = new Accounts();
    	ac.printSQL(LoginForm.usernameM);
    	em.setManager(ac.elementAt(0).getE_id());
    	Employees.writeSQL(em);
    	JOptionPane.showMessageDialog(this, "Add successfully");
    	new ManagerHome().setVisible(true);
    	this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    void setId() {
    	int id = Integer.parseInt(Employees.getBottomId());
    	ibID.setText("0"+String.valueOf(++id));
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ibAddress;
    private javax.swing.JTextField ibCoffecient;
    private javax.swing.JTextField ibDay;
    private javax.swing.JTextField ibID;
    private javax.swing.JTextField ibMonth;
    private javax.swing.JTextField ibSalary;
    private javax.swing.JTextField ibSurname;
    private javax.swing.JTextField ibYear;
    private javax.swing.JTextField ibname;
    private javax.swing.JTextField ibphone;
    private javax.swing.JTextField ibsex;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
