
package design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import BE.Customer;
import BE.Ingredient;
import plurality.Customers;
import plurality.Employees;
import plurality.Ingredients;

@SuppressWarnings("serial")
public class ManagerHome extends javax.swing.JFrame {
	public static DefaultTableModel tblModel;
    public ManagerHome() {
        initComponents();
        initTableEmployee();
        loadEmployee();
        initTableIngredient();
        loadIgredient();
        initTableCustomer();
        loadCustomer();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        new javax.swing.JScrollBar();
        jPanel7 = new javax.swing.JPanel();
        manager = new javax.swing.JLabel();
        text_manager = new javax.swing.JLabel();
        lbreturn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbleEmployee = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmployee = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lbUpdate = new javax.swing.JLabel();
        lbAdd = new javax.swing.JLabel();
        lbDelete = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        inventory = new javax.swing.JLabel();
        thung = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        point = new javax.swing.JLabel();
        hcmcity = new javax.swing.JLabel();
        member = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(139, 217, 189));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manager.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-manager-100.png")); // NOI18N
        manager.setPreferredSize(new java.awt.Dimension(110, 110));
        jPanel7.add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, -1, -1));

        text_manager.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        text_manager.setForeground(new java.awt.Color(102, 102, 255));
        text_manager.setText("MANAGER");
        jPanel7.add(text_manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 127, -1, -1));

        lbreturn.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-logout-50.png")); // NOI18N
        lbreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbreturnMouseClicked(evt);
            }
        });
        jPanel7.add(lbreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 390, 79, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-coffee-100.png")); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 217, -1, -1));

        jTabbleEmployee.setBackground(new java.awt.Color(198, 236, 233));
        jTabbleEmployee.setForeground(new java.awt.Color(198, 236, 233));

        jPanel1.setBackground(new java.awt.Color(198, 236, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(tbEmployee);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 729, 268));

        jLabel4.setFont(new java.awt.Font("FreeMono", 3, 24)); // NOI18N
        jLabel4.setText("Employee's Information");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 18, -1, -1));

        lbUpdate.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-update-48.png")); // NOI18N
        lbUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(lbUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 65, 58));

        lbAdd.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-add-48.png")); // NOI18N
        lbAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAddMouseClicked(evt);
            }
        });
        jPanel1.add(lbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 360, 59, 59));

        lbDelete.setIcon(new javax.swing.ImageIcon("D:/eclipse/Github/Cafe_Manager/Cafe_Manager_BE/src/design/Icon/icons8-delete-48.png")); // NOI18N
        lbDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(lbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 354, -1, 65));

        jTabbleEmployee.addTab("Static Employee", jPanel1);

        jPanel3.setBackground(new java.awt.Color(198, 236, 233));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(tbProduct);
        if (tbProduct.getColumnModel().getColumnCount() > 0) {
            tbProduct.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbProduct.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbProduct.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 742, 266));

        jLabel7.setFont(new java.awt.Font("FreeMono", 3, 24)); // NOI18N
        jLabel7.setText("Product's Information");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 27, -1, -1));

        inventory.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        inventory.setText("Inventory <3");
        inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryMouseClicked(evt);
            }
        });
        jPanel3.add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        thung.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        thung.setText("Thung");
        thung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thungMouseClicked(evt);
            }
        });
        jPanel3.add(thung, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        price.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        price.setText("Watch");
        price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceMouseClicked(evt);
            }
        });
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        jTabbleEmployee.addTab("Static Product", jPanel3);

        jPanel2.setBackground(new java.awt.Color(198, 236, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane3.setViewportView(tbCustomer);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 742, 273));

        jLabel5.setFont(new java.awt.Font("FreeMono", 3, 24)); // NOI18N
        jLabel5.setText("Customer's Information");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 27, -1, -1));

        point.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        point.setText("Point >=100");
        point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pointMouseClicked(evt);
            }
        });
        jPanel2.add(point, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        hcmcity.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        hcmcity.setText("HCM city");
        hcmcity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hcmcityMouseClicked(evt);
            }
        });
        jPanel2.add(hcmcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        member.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        member.setText("Gold member");
        member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberMouseClicked(evt);
            }
        });
        jPanel2.add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        jTabbleEmployee.addTab("Static Customer", jPanel2);

        jPanel7.add(jTabbleEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 0, -1, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(983, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointMouseClicked
       initTableCustomer();
       pointStatistic();
    }//GEN-LAST:event_pointMouseClicked

    private void hcmcityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcmcityMouseClicked
        initTableCustomer();
        HCMcityStatistic();
    }//GEN-LAST:event_hcmcityMouseClicked

    private void memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberMouseClicked
        initTableCustomer();
        memberStatistic();
    }//GEN-LAST:event_memberMouseClicked

    private void inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseClicked
    	initTableIngredient();
        inventoryStatistic();
    }//GEN-LAST:event_inventoryMouseClicked

    private void thungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thungMouseClicked
        initTableIngredient();
        thungStatistic();
    }//GEN-LAST:event_thungMouseClicked

    private void priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMouseClicked
        initTableDrinks();
        watchProduct();
    }//GEN-LAST:event_priceMouseClicked

    private void lbAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddMouseClicked
        new Add_Employee().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbAddMouseClicked

    private void lbUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUpdateMouseClicked
        new Update_Employee().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbUpdateMouseClicked

    private void lbDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDeleteMouseClicked
        new Delete_Employee().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbDeleteMouseClicked

    private void lbreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbreturnMouseClicked
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbreturnMouseClicked

    public void initTableEmployee() {
    	tblModel = new DefaultTableModel();
    	tblModel.setColumnIdentifiers(new String[] {"STT", "ID", "Name", "Gender", "Birthday", "Address", "Phone", "Working hour", "Bonus", "Minus", "Coeffecient", "Salary","Experience", "Position", "Manager"});
    	tbEmployee.setModel(tblModel);
    }
    public void loadEmployee() {
    	Employees e = new Employees();
    	e.printSQL("");
    	int j = 1;
    	tblModel.setRowCount(0);
    	for(int i = 0; i<e.size(); i++) {
    		Object[] row = new Object[] {
    			j++,e.elementAt(i).getId(),e.elementAt(i).getSurname()+" "+e.elementAt(i).getName(),e.elementAt(i).getGender(),e.elementAt(i).getDay()+"/"+e.elementAt(i).getMonth()+"/"+e.elementAt(i).getYear(),e.elementAt(i).getAddress(),e.elementAt(i).getPhone(),e.elementAt(i).getWorking_hour(),e.elementAt(i).getBonus(),e.elementAt(i).getMinus(),e.elementAt(i).getCoefficients(),e.elementAt(i).getSalary(),e.elementAt(i).getExperience(),e.elementAt(i).getPosition(),e.elementAt(i).getManager()
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void initTableIngredient() {
    	tblModel = new DefaultTableModel();
    	tblModel.setColumnIdentifiers(new String[] {"STT", "ID", "Name", "Quantities", "Price", "Unit", "Date input", "Inventory"});
    	tbProduct.setModel(tblModel);
    }
    public void loadIgredient() {
    	Ingredients in = new Ingredients();
    	in.printSQL("");
    	int j = 1;
    	Iterator<Ingredient> it = in.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Ingredient i = new Ingredient();
    		i = it.next();
    		Object[] row = new Object[] {
    			j++,i.getId(),i.getName(),i.getAmount(),i.getPrice(),i.getUnit(),i.getDay()+"/"+i.getMonth()+"/"+i.getYear(),i.getInventory()
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void inventoryStatistic() {//statistic by inventory < 3
    	Ingredients in = new Ingredients();
    	in.printSQL("WHERE inventory <= 2 ORDER BY name ASC");
    	int j = 1;
    	Iterator<Ingredient> it = in.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Ingredient i = new Ingredient();
    		i = it.next();
    		Object[] row = new Object[] {
    			j++,i.getId(),i.getName(),i.getAmount(),i.getPrice(),i.getUnit(),i.getDay()+"/"+i.getMonth()+"/"+i.getYear(),i.getInventory()	
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void thungStatistic() {//statistic by thung unit
    	Ingredients in = new Ingredients();
    	in.printSQL("WHERE unit = 'thung' ORDER BY name ASC");
    	int j = 1;
    	Iterator<Ingredient> it = in.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Ingredient i = new Ingredient();
    		i = it.next();
    		Object[] row = new Object[] {
    			j++,i.getId(),i.getName(),i.getAmount(),i.getPrice(),i.getUnit(),i.getDay()+"/"+i.getMonth()+"/"+i.getYear(),i.getInventory()	
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void initTableDrinks() {
    	tblModel = new DefaultTableModel();
    	tblModel.setColumnIdentifiers(new String[] {"STT", "Drinks ID", "D_Name", "Ingredient ID", "I_Name"});
    	tbProduct.setModel(tblModel);
    }
    public void watchProduct() {
    	class Din{
    		public String D_id;
    		public String D_name;
    		public String I_id;
    		public String I_name;
			public Din() {
				super();
				D_id = "";
				D_name = "";
				I_id = "";
				I_name="";
			}
    	};
    	Vector<Din> d = new Vector<Din>();
    	String url = "jdbc:sqlserver://FAT\\SQLEXPRESS:1433;databaseName=CAFE_MANAGER;user=sa;password=phat12112002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT DISTINCT D1.M_id, M.name, (SELECT D2.I_id + ',' FROM DRINKS D2 WHERE D2.M_id = D1.M_id ORDER BY D2.M_id FOR XML PATH(''))[I_id], (SELECT I.name + ',' FROM INGREDIENT I INNER JOIN DRINKS D3 ON D3.I_id = I.I_id WHERE D3.M_id = D1.M_id ORDER BY D3.M_id FOR XML PATH(''))[I_name] FROM DRINKS D1 INNER JOIN MENU M ON D1.M_id = M.M_id";
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
				Din i = new Din();
				i.D_id = result.getString("M_id");
				i.D_name = result.getString("name");
				i.I_id = result.getString("I_id");
				i.I_id = i.I_id.substring(0,i.I_id.length()-1);
				i.I_name = result.getString("I_name");
				i.I_name = i.I_name.substring(0,i.I_name.length()-1);
				d.add(i);
			}
			cn.close();
		}catch(SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
		int j = 1;
		for(int i = 0; i<d.size();i++) {
			Object[] row = new Object[] {
				j++,d.elementAt(i).D_id,d.elementAt(i).D_name,d.elementAt(i).I_id,d.elementAt(i).I_name
			};
			tblModel.addRow(row);
		}
		tblModel.fireTableDataChanged();
    }
    public void initTableCustomer() {
    	tblModel = new DefaultTableModel();
    	tblModel.setColumnIdentifiers(new String[] {"STT", "ID", "Name", "Gender", "Birthday", "Address", "Point", "Member", "Phone"});
    	tbCustomer.setModel(tblModel);
    }
    public void loadCustomer() {
    	Customers c = new Customers();
    	c.getData("WHERE name IS NOT NULL");
    	int j = 1;
    	Iterator<Customer> it = c.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Customer cm = new Customer();
    		cm = it.next();
    		Object[] row = new Object[] {
    				j++,cm.getId(),cm.getSurname()+" "+cm.getName(),cm.getGender(),cm.getDay()+"/"+cm.getMonth()+"/"+cm.getYear(),cm.getAddress(),cm.getPoint(),cm.getMember(),cm.getPhone()
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void pointStatistic() {//statistic point >= 100
    	Customers c = new Customers();
    	c.getData("WHERE point >= 100 AND name IS NOT NULL ORDER BY name, surname ASC");
    	int j = 1;
    	Iterator<Customer> it = c.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Customer cm = new Customer();
    		cm = it.next();
    		Object[] row = new Object[] {
    				j++,cm.getId(),cm.getSurname()+" "+cm.getName(),cm.getGender(),cm.getDay()+"/"+cm.getMonth()+"/"+cm.getYear(),cm.getAddress(),cm.getPoint(),cm.getMember(),cm.getPhone()
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void HCMcityStatistic() {
    	Customers c = new Customers();
    	c.getData("WHERE Caddress LIKE '%Ho Chi Minh city' AND name IS NOT NULL ORDER BY name, surname ASC");
    	int j = 1;
    	Iterator<Customer> it = c.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Customer cm = new Customer();
    		cm = it.next();
    		Object[] row = new Object[] {
    				j++,cm.getId(),cm.getSurname()+" "+cm.getName(),cm.getGender(),cm.getDay()+"/"+cm.getMonth()+"/"+cm.getYear(),cm.getAddress(),cm.getPoint(),cm.getMember(),cm.getPhone()
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
    }
    public void memberStatistic() {//statistic gold member
    	Customers c = new Customers();
    	c.getData("WHERE member = 'gold' AND name IS NOT NULL ORDER BY name, surname ASC");
    	int j = 1;
    	Iterator<Customer> it = c.iterator();
    	tblModel.setRowCount(0);
    	while(it.hasNext()) {
    		Customer cm = new Customer();
    		cm = it.next();
    		Object[] row = new Object[] {
    				j++,cm.getId(),cm.getSurname()+" "+cm.getName(),cm.getGender(),cm.getDay()+"/"+cm.getMonth()+"/"+cm.getYear(),cm.getAddress(),cm.getPoint(),cm.getMember(),cm.getPhone()
    		};
    		tblModel.addRow(row);
    	}
    	tblModel.fireTableDataChanged();
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
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hcmcity;
    private javax.swing.JLabel inventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbleEmployee;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbDelete;
    private javax.swing.JLabel lbUpdate;
    private javax.swing.JLabel lbreturn;
    private javax.swing.JLabel manager;
    private javax.swing.JLabel member;
    private javax.swing.JLabel point;
    private javax.swing.JLabel price;
    private javax.swing.JTable tbCustomer;
    private javax.swing.JTable tbEmployee;
    private javax.swing.JTable tbProduct;
    private javax.swing.JLabel text_manager;
    private javax.swing.JLabel thung;
    // End of variables declaration//GEN-END:variables
}
