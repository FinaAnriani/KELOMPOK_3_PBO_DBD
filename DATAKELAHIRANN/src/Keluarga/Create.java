/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Keluarga;

import Keluarga.Read;
import datakelahirann.KK;
import datakelahirann.Login;
//import KK;
import datakelahirann.Database;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.sql.ResultSet; // Add this import
import models.DataBayi;
import models.Staff;
import models.kk;
/**
 *
 * @author ASUS
 */
public class Create extends javax.swing.JFrame {
    private String jenisKelamin;
    private final kk NoKK;
    private final Staff staff;
    
    /**
     * Creates new form DataBayi
     */
    public Create(Staff staff, kk NoKK) {
        this.NoKK = NoKK;
        this.staff = staff;
        initComponents();
    
        
//        public DataBayi(String noKK) {
//            this.noKK = noKK;
//        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date,null, null,Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        ButtonGroup buttonGroup = new ButtonGroup();
        JenisKelamin2 = new javax.swing.JRadioButton();
        JenisKelamin = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("MASUKKAN DATA BAYI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 350, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Bayi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 20));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 153, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 30));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Waktu Lahir");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, 20));

        txtNama.setBackground(new java.awt.Color(0, 0, 0));
        txtNama.setForeground(new java.awt.Color(204, 153, 255));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 280, 30));

        jDateChooser2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        JenisKelamin2.setForeground(new java.awt.Color(0, 0, 0));
        JenisKelamin2.setText("Perempuan");
        JenisKelamin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisKelamin2ActionPerformed(evt);
            }
        });
        buttonGroup.add(JenisKelamin2);
        jPanel1.add(JenisKelamin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 90, -1));

        JenisKelamin.setForeground(new java.awt.Color(0, 0, 0));
        JenisKelamin.setText("Laki-Laki");
        JenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisKelaminActionPerformed(evt);
            }
        });
        // Tambahkan JenisKelamin ke dalam buttonGroup
        buttonGroup.add(JenisKelamin);
        jPanel1.add(JenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tempat Lahir");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, 20));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tanggal Lahir");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, 20));

        txtTempatLahir.setBackground(new java.awt.Color(0, 0, 0));
        txtTempatLahir.setForeground(new java.awt.Color(204, 153, 255));
        txtTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempatLahirActionPerformed(evt);
            }
        });
        jPanel1.add(txtTempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 280, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(204, 153, 255));
        jButton2.setText("INPUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/Fancy/2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 340));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        // TODO add your handling code here:
        this.setVisible(false);
        new Keluarga.Read(staff, this.NoKK).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void JenisKelamin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisKelamin2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JenisKelamin2ActionPerformed

    private void JenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JenisKelaminActionPerformed

    private void txtTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempatLahirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        final String namaBayi = txtNama.getText();
        final String tempatLahir = txtTempatLahir.getText();
        final Date tanggalLahir = jDateChooser2.getDate();
        final Date waktuLahir = (Date) jSpinner1.getValue();

        // Validasi jenis kelamin
        final String jenisKelamin;
        if (JenisKelamin2.isSelected()) {
            jenisKelamin = "Perempuan";
        } else if (JenisKelamin.isSelected()) {
            jenisKelamin = "Laki-Laki";
        } else {
            JOptionPane.showMessageDialog(this, "Pilih jenis kelamin.");
            return; // Keluar dari metode jika jenis kelamin tidak dipilih.
        }
        
        if (namaBayi.isEmpty() || tempatLahir.isEmpty() || tanggalLahir == null || waktuLahir == null) {
        JOptionPane.showMessageDialog(this, "Pastikan semua kolom telah diisi.");
        return; // Keluar dari metode jika ada data yang belum diisi.
        }

        if (namaBayi.matches(".*\\d.*")|| tempatLahir.matches(".*\\d.*")) {
        JOptionPane.showMessageDialog(this, "Nama Bayi atau Tempat Lahirtidak boleh mengandung angka.");
        return; // Keluar dari metode jika "Nama Bayi" mengandung angka.
        }

        
        Connection conn = Database.configDB();

//        if (isIdStaffValid(this.staff.idStaff(), conn) && isNoKKValid(this.NoKK.noKK(),conn)) {
            DataBayi dataBayi = new DataBayi(null, namaBayi, jenisKelamin, tempatLahir, tanggalLahir, waktuLahir, this.staff.idStaff, this.NoKK.noKK);

        // Panggil metode Tambah untuk menambahkan data kelahiran baru
            final boolean added = dataBayi.Tambah();

            if (added) {
                JOptionPane.showMessageDialog(null, "Data kelahiran berhasil ditambahkan.");
                // Lakukan tindakan lanjutan, misalnya memperbarui tampilan tabel.
                this.setVisible(false);
                new Keluarga.Read(this.staff, this.NoKK).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menambahkan data kelahiran.");

            }
        }
    
        

        private boolean isIdStaffValid(int Id_Staff, Connection conn) {
            try {
                String query = "SELECT * FROM staff WHERE Id_Staff = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, Id_Staff);
                ResultSet result = preparedStatement.executeQuery();

                // Jika data dengan Id_SuperAdmin tersebut ditemukan, maka return true
                return result.next();
            } catch (SQLException ex) {
                return false;
            }
        }

        private boolean isNoKKValid(int No_KK, Connection conn) {
            try {
                String query = "SELECT * FROM keluarga WHERE No_KK = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, No_KK);
                ResultSet result = preparedStatement.executeQuery();

                // Jika data dengan Id_SuperAdmin tersebut ditemukan, maka return true
                return result.next();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }

    }//GEN-LAST:event_jButton2ActionPerformed

        // Metode untuk mereset input fields
    private void resetInputFields() {
        txtNama.setText("");
        txtTempatLahir.setText("");
        jDateChooser2.setDate(null);
        jSpinner1.setValue(new Date());
    }  
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
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create(null, null).setVisible(true);
            }
        });
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DataBayi(String noKK).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JenisKelamin;
    private javax.swing.JRadioButton JenisKelamin2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
