/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electronicmanagementsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DELL
 */
public class EmployeeSalary extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeSalary
     */
    public EmployeeSalary() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpIDSearchSalary = new javax.swing.JTextField();
        btnEmpIDSearchSalary = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeSalary = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 475));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 102)), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Employee ID");

        txtEmpIDSearchSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDSearchSalaryActionPerformed(evt);
            }
        });

        btnEmpIDSearchSalary.setBackground(new java.awt.Color(0, 102, 102));
        btnEmpIDSearchSalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpIDSearchSalary.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpIDSearchSalary.setText("Search");
        btnEmpIDSearchSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpIDSearchSalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtEmpIDSearchSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnEmpIDSearchSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpIDSearchSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmpIDSearchSalary)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblEmployeeSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Salary"
            }
        ));
        jScrollPane1.setViewportView(tblEmployeeSalary);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EMPLOYEE SALARY");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronicmanagementsystem/pictures/icons8-payroll-80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        btnBack1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(0, 102, 102));
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnBack1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpIDSearchSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDSearchSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDSearchSalaryActionPerformed

    private void btnEmpIDSearchSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpIDSearchSalaryActionPerformed
        // TODO add your handling code here:
        // make a table model
        DefaultTableModel tblModel = (DefaultTableModel) tblEmployeeSalary.getModel();

        String EmpID = txtEmpIDSearchSalary.getText().trim();
        String mgrID = "E001"; // SET THE MGR ID AS U WISH
        int sal = 0, sal1 = 0, sal2 = 0, total = 0;
        String totsal;

        final String dbUrl = "jdbc:mysql://localhost:3306/repair_system";
        final String dbUsername = "root";
        final String dbPassword = "Waybig@123";

        try {
            Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            Statement st = conn.createStatement();

            if (!EmpID.equals(mgrID)) {
                String query2 = "SELECT SUM(Cost*0.4) AS Cost "
                        + "FROM add_new_repair REP "
                        + "JOIN add_new_emp EMP ON EMP.EMP_ID = REP.EMP_ID "
                        + "JOIN repair_cost RC ON RC.Job_NO = REP.Job_NO "
                        + "WHERE EMP.EMP_ID = ?";

                PreparedStatement pstmt1 = conn.prepareStatement(query2);
                pstmt1.setString(1, EmpID);  // Set the parameter value

                ResultSet rs2 = pstmt1.executeQuery();

                while (rs2.next()) {
                    sal = rs2.getInt(1);
                }

                totsal = Integer.toString(sal);

            } else {
                String query3 = "SELECT SUM(Cost*0.6)  AS Cost "
                        + "FROM add_new_repair REP "
                        + "JOIN add_new_emp EMP ON EMP.EMP_ID = REP.EMP_ID "
                        + "JOIN repair_cost RC ON RC.Job_NO = REP.Job_NO "
                        + "WHERE EMP.EMP_ID <> ?";

                PreparedStatement pstmt2 = conn.prepareStatement(query3);
                pstmt2.setString(1, EmpID);  // Set the parameter value

                ResultSet rs3 = pstmt2.executeQuery();

                while (rs3.next()) {
                    sal1 = rs3.getInt(1);
                }

                String query4 = "SELECT SUM(Cost) AS Cost "
                        + "FROM add_new_repair REP "
                        + "JOIN add_new_emp EMP ON EMP.EMP_ID = REP.EMP_ID "
                        + "JOIN repair_cost RC ON RC.Job_NO = REP.Job_NO "
                        + "WHERE EMP.EMP_ID = ?";

                PreparedStatement pstmt3 = conn.prepareStatement(query4);
                pstmt3.setString(1, EmpID);  // Set the parameter value

                ResultSet rs4 = pstmt3.executeQuery();

                while (rs4.next()) {
                    sal2 = rs4.getInt(1);
                }

                total = sal1 + sal2;
                totsal = Integer.toString(total);
            }

            String query5 = "SELECT EMP_ID, CONCAT(EMP_FirstName,' ',EMP_LastName) AS Employee_Name "
                    + "FROM add_new_emp "
                    + "WHERE EMP_ID = ?";

            PreparedStatement pstmt2 = conn.prepareStatement(query5);
            pstmt2.setString(1, EmpID);  // Set the parameter value

            ResultSet rs5 = pstmt2.executeQuery();

            // Check if there are results before entering the loop
            if (rs5.next()) {
                String empID = String.valueOf(rs5.getString("EMP_ID"));
                String empName = String.valueOf(rs5.getString("Employee_Name"));

                // string array for store data into jtable
                String tblData[] = {empID, empName, totsal};

                // add row into the table
                tblModel.addRow(tblData);
            }

            // Close ResultSet
            rs5.close();

            // Close Statement and Connection
            st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        txtEmpIDSearchSalary.setText("");

    }//GEN-LAST:event_btnEmpIDSearchSalaryActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        int msg=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to go back?",
            "Update Confirmation", JOptionPane.YES_NO_OPTION);

        //if they press yes then make the connection and delete it.
        if (msg == 0) {
            this.dispose();
            Employee wid1 = new Employee();
            wid1.setVisible(true);
        }
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int msg=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want Exit The Application?",
                        "Update Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (msg == JOptionPane.YES_OPTION) {  
                dispose(); // Close the window
                }  
    }//GEN-LAST:event_formWindowClosing

//    public void resetSalaries() {
//        final String dbUrl = "jdbc:mysql://localhost:3306/repair_system";
//        final String dbUsername = "root";
//        final String dbPassword = "Waybig@123";
//
//        try {
//            Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//            Statement st = conn.createStatement();
//
//            String query = "UPDATE your_table_name SET salary = 0";
//            st.executeUpdate(query);
//
//            st.close();
//            conn.close();
//
//            JOptionPane.showMessageDialog(null, "Salaries reset successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    // Schedule the resetSalaries method to run at the end of each month
//    ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
//
//    scheduler.scheduleAtFixedRate(() -> resetSalaries(), 0, 1, TimeUnit.MONTH);

    
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
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSalary().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnEmpIDSearchSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblEmployeeSalary;
    private javax.swing.JTextField txtEmpIDSearchSalary;
    // End of variables declaration//GEN-END:variables
}
