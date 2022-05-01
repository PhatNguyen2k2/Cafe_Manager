package design;

import plurality.Accounts;
import plurality.Bills;
import plurality.Customers;
import plurality.Drinks_Orders;
import plurality.Menu;
import plurality.Numdata;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import BE.Amount;
import BE.Customer;
import BE.Drinks;

@SuppressWarnings("serial")
public class EmployeeTB extends javax.swing.JFrame {
	public static String Bid;
	public static String Cid;
	public static String Eid;
	public static String Ename;
	public static String phoneC;
	public static float discountM;
	public static String memberM;
	public static int pointM;
	public static DefaultTableModel tblModel;
    public EmployeeTB() {
        initComponents();
        textField.setText("");
        //get real date
        dateRealTime();
        times();
        initTable();
        loadMenu();
        getData4Mn();
        getData4Bill();
    }
    //create method get real date
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMenu = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(139, 217, 189));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-cashier-100.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        btnOrder.setBackground(new java.awt.Color(0, 51, 255));
        btnOrder.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        btnOrder.setText("ORDER");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-logout-50.png")); // NOI18N
        btnLogout.setText("Ok");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CASHIER");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setText("User:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2))))))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(198, 236, 233));

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID BILL:");

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID CUSTOMER:");

        jLabel8.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DATE:");

        jLabel9.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TIME:");

        lbDate.setText("jLabel10");

        lbTime.setText("jLabel10");
        
        textField = new JTextField();
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Phone number:");
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(27)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        				.addComponent(jTextField6))
        			.addGap(49)
        			.addComponent(lblNewLabel)
        			.addGap(18)
        			.addComponent(textField, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel9)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(lbDate, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        				.addComponent(lbTime, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(22))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jLabel8)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jLabel7)
        					.addComponent(jLabel9)
        					.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lbTime, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(10))
        );
        jPanel3.setLayout(jPanel3Layout);
        
        tbMenu.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tbMenu.getTableHeader().setBackground(new Color(32,136,203));
        tbMenu.getTableHeader().setForeground(new Color(0,0,0));
        jScrollPane1.setViewportView(tbMenu);
        if (tbMenu.getColumnModel().getColumnCount() > 0) {
            tbMenu.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbMenu.getColumnModel().getColumn(1).setPreferredWidth(15);
            tbMenu.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
    	Drinks_Orders.writeSQL();
    	Bills.writeSQL(Bid,Cid,Eid);
    	phoneC = textField.getText();
    	if(phoneC.equals("")) {
    		discountM = 0;
    	}else{
    		Customers.printSQL(phoneC);
    		discountM = Customer.checkMember(memberM);
    	}
    	new Bill_v2().setVisible(true);
    	this.setVisible(false);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void initTable() {
    	tblModel = new DefaultTableModel();
    	tblModel.setColumnIdentifiers(new String[] {"STT","Id","Name","Price","Amount"});
    	tbMenu.setModel(tblModel);
    }
    public void loadMenu() {
    	Menu m = new Menu();
    	m.printSQL();//read data from sql
    	Iterator<Drinks> it = m.iterator();
    	int j = 1;
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Drinks d = new Drinks();
    		d = it.next();
    		Object[] row = new Object[] {
    				j++,d.getId(),d.getName(),d.getPrice(), 0
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public static Numdata getData() {//get data from menu
    	Numdata n = new Numdata();
    	for(int i = 0; i < tblModel.getRowCount(); i++) {
    		Amount x = new Amount();
    		x.id = tblModel.getValueAt(i, 1).toString();
    		x.number = Integer.parseInt(tblModel.getValueAt(i, 4).toString());
    		if(x.number != 0)
    			n.add(x);
    	}
    	return n;
    }
    public void getData4Mn() {
    	Accounts ac = new Accounts();
    	ac.printSQL(LoginForm.usernameM);
    		Eid = ac.elementAt(0).getE_id();
    		jTextField1.setText(Eid);
    		Ename = ac.printNameSQL(LoginForm.usernameM);
    		jTextField2.setText(Ename);
    		jTextField3.setText(ac.elementAt(0).getUsername());
    }
    @SuppressWarnings("static-access")
	public void getData4Bill() {
    	Bills b = new Bills();
    	Bid = b.getBottomId();
    	int ib = Integer.parseInt(Bid);
    	Bid = "0"+Bid.valueOf(++ib);
    	jTextField5.setText(Bid);
    	Customers c = new Customers();
    	Cid = c.getBottomId();
    	ib = Integer.parseInt(Cid);
    	Cid = "0"+Cid.valueOf(++ib);
    	jTextField6.setText(Cid);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeTB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTable tbMenu;
    private JTextField textField;
}
