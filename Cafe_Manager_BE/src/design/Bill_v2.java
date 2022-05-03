package design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import plurality.Bills;
import plurality.Customers;

import java.awt.Color;
import java.awt.Font;


public class Bill_v2 extends javax.swing.JFrame {

	public static DefaultTableModel tblBill;
    public Bill_v2() {
        initComponents();
        //method get time and date 
        dateRealTime();
        times();
        billInfo();
        initTable();
        getBill();
        priceInfo();
    }
    public void dateRealTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String date = sdf.format(d);
        lbDate.setText(date);
    }
    //create method get real time
    Timer t;
    SimpleDateFormat st;
    public void times(){
        t = new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                String tt = st.format(dt);
                lbTime.setText(tt);
                
            } 
        });
        t.start();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBill = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Total = new javax.swing.JLabel();
        Discount = new javax.swing.JLabel();
        Customer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 124, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 36)); // NOI18N
        jLabel1.setText("BILL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("Sub total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 20));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setText("Bill:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, -1, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 53, -1, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setText("Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 80, -1, 20));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 54, 114, -1));

        
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 82, 114, -1));
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 91, 20));
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 100, 20));
        tbBill.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tbBill.getTableHeader().setBackground(new Color(32,136,203));
        tbBill.getTableHeader().setForeground(new Color(0,0,0));
        jScrollPane1.setViewportView(tbBill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 420, 290));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setText("Customer:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel11.setText("Cashier:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 114, -1, -1));

        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 113, 114, -1));

        OK.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-ok-48.png")); // NOI18N
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        jPanel1.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, 32));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-iced-coffee-30.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 124, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 124, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 124, -1));

        Total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Total.setText("Total:");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, 20));

        Discount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Discount.setText("Discount:");
        jPanel1.add(Discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        Customer.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-customer-48.png")); // NOI18N
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });
        jPanel1.add(Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(452, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
    	if(!EmployeeTB.phoneC.equals("")) {
        BE.Customer c = new BE.Customer();
        c = Customers.printSQL(EmployeeTB.phoneC);
        c.setPoint(EmployeeTB.pointM+Bills.getPlusPoint(EmployeeTB.Cid));
        c.setMember(BE.Customer.checkPoint(c.getPoint()));
        Customers.updateCustomer(EmployeeTB.Cid, c);
    	}
    	new EmployeeTB().setVisible(true);
    	this.setVisible(false);
    }//GEN-LAST:event_OKActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        new register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustomerActionPerformed
    private void initTable() {
    	tblBill = new DefaultTableModel();
    	tblBill.setColumnIdentifiers(new String[] {"STT","Name","Amount","Price"});
    	tbBill.setModel(tblBill);
    }
    public void getBill() {
    	Bills b = new Bills();
    	b.printSQL(EmployeeTB.Cid);
    	Iterator<BE.Bill> it = b.iterator();
    	int j = 1;
    	tblBill.setRowCount(0);
    	while(it.hasNext()) {
    		BE.Bill bi = new BE.Bill();
    		bi = it.next();
    		Object[] row = new Object[] {
    				j++,bi.getName(),bi.getAmount(),bi.getPrice()
    		};
    		tblBill.addRow(row);
    	}
    	tblBill.fireTableDataChanged();
    }
    public void billInfo() {
    	jTextField1.setText(EmployeeTB.Cid);
    	jTextField2.setText(EmployeeTB.Bid);
    	jTextField6.setText(EmployeeTB.Ename);
    }
    public void priceInfo() {
    	float total = Bills.getTotal(EmployeeTB.Cid);
    	if(total < 200000.0)
    		EmployeeTB.discountM = 0;
    	float discount = EmployeeTB.discountM;
    	jTextField3.setText(String.valueOf(total));
    	jTextField4.setText(String.valueOf(discount*100)+"%");
    	jTextField5.setText(String.valueOf(total-(total*discount)));
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
            java.util.logging.Logger.getLogger(Bill_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Customer;
    private javax.swing.JLabel Discount;
    private javax.swing.JButton OK;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTable tbBill;
    // End of variables declaration//GEN-END:variables
}
