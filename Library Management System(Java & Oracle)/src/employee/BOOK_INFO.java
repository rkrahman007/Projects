/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class BOOK_INFO extends javax.swing.JFrame {

    /**
     * Creates new form BOOK_INFO
     */
   
    public BOOK_INFO() {
        initComponents();
        t1.setEditable(false);
        t1.setEnabled(false);
        t3.setEditable(false);
        t3.setEnabled(false);
        t4.setEditable(false);
        t4.setEnabled(false);
        t2.setEditable(false);
        t2.setEnabled(false);
        t5.setEditable(false);
        t5.setEnabled(false);
        l1.setEnabled(false);
        l2.setEnabled(false);
        l3.setEnabled(false);
        l4.setEnabled(false);
        l5.setEnabled(false);
        show_user();
        add();
    }
    public void add()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rayhan", "rayhan", "123");
            String query =  "select book_id from book";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                cb1.addItem(rs.getString(1));
            }
             } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void show_user()
    {
          try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rayhan", "rayhan", "123");
            String query =  "select * from book order by book_id asc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row = new Object[5];
            while(rs.next())
            {
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(5);
                row[4]=rs.getString(4);
                model.addRow(row);
            }
             } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        l5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("BOOK INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK ID", "BOOK NAME", "AUTHOR NAME", "SUBJECT", "TOTAL BOOKS"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 837, 190));

        l5.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        l5.setText("Total Out Library");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, -1));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 80, -1));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 150, 30));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, 30));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 150, 30));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 30));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 150, 30));

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jLabel3.setText("Book ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, -1));

        l1.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        l1.setText("Book Name");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 270, -1, -1));

        l3.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        l3.setText("Author Name");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 70, -1));

        l4.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        l4.setText("Total In Library");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 80, -1));

        l2.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        l2.setText("Subject");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 50, -1));

        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 160, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        l1.setEnabled(true);
        l2.setEnabled(true);
        l3.setEnabled(true);
        l4.setEnabled(true);
        l5.setEnabled(true);
        t1.setEnabled(true);
        t3.setEnabled(true);
        t5.setEnabled(true);
        t4.setEnabled(true);
        t2.setEnabled(true);
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rayhan", "rayhan", "123");
            String query =  "select * from book where book_id=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, (String) cb1.getSelectedItem());
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                t1.setText(rs.getString(2));
                t2.setText(rs.getString(3));
                t3.setText(rs.getString(5));
                t4.setText(rs.getString(4));
                String qu = "select std_id from lib_acc where book_id=? and status=?";
                PreparedStatement st1 = con.prepareStatement(qu);
                st1.setString(1,(String) cb1.getSelectedItem());
                st1.setString(2,"pending");
                int cnt=0;
                ResultSet rs1 = st1.executeQuery();
                while(rs1.next())cnt++;
                t5.setText(String.valueOf(cnt));
            }
             } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        INFORMATION bi = new INFORMATION();
        bi.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BOOK_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOK_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOK_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOK_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOK_INFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
