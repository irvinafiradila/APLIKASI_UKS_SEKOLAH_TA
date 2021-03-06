
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irvina
 */
public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        obat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        keluhan = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        admin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Century751 BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrasi UKS");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Swis721 Cn BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SD Pintar Bersama");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 110);

        obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obatActionPerformed(evt);
            }
        });
        getContentPane().add(obat);
        obat.setBounds(180, 330, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Obat yang dibutuhkan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 340, 150, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No. Pengunjung");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 110, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keluhan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 300, 110, 20);

        keluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluhanActionPerformed(evt);
            }
        });
        getContentPane().add(keluhan);
        keluhan.setBounds(180, 290, 160, 30);

        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });
        getContentPane().add(kelas);
        kelas.setBounds(180, 250, 160, 30);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(180, 210, 160, 30);

        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no);
        no.setBounds(180, 170, 160, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pendaftaran Pengunjung UKS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 120, 200, 30);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NoPengunjung", "Nama", "Kelas", "Keluhan", "Obat"
            }
        ));
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(370, 60, 510, 190);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Pengunjung");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(580, 20, 120, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(70, 280, 73, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 150, 60, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 110, 31, 14);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(200, 280, 73, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Penjaga");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(610, 280, 80, 30);

        admin.setEditable(false);
        jPanel2.add(admin);
        admin.setBounds(680, 280, 100, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 110, 890, 330);

        setBounds(0, 0, 908, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obatActionPerformed

    private void keluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluhanActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("".equals(no.getText()) || 
            "".equals(nama.getText()) || 
            "".equals(kelas.getText()) ||
            "".equals(keluhan.getText()) || 
            "".equals(obat.getText()))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }
    
    else
    {
        
        String SQL = "INSERT INTO `pengunjung` (`NoPengunjung`,`Nama`,`Kelas`,`Keluhan`,`Obat`) "
                + "VALUES('"+no.getText()+"','"+nama.getText()+"',"
                + "', '"+kelas.getText()+"', '"+keluhan.getText()+"', '"+obat.getText()+"')";
        int status = KoneksiDB.execute(SQL);
        if (status == 1)
        {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
        }
    }      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
    int baris = tabeldata.getSelectedRow();
        if (baris != -1)
        {
            no.setText(tabeldata.getValueAt(baris, 0).toString());
            nama.setText(tabeldata.getValueAt(baris, 1).toString());
            kelas.setText(tabeldata.getValueAt(baris, 2).toString());
            keluhan.setText(tabeldata.getValueAt(baris, 3).toString());
            obat.setText(tabeldata.getValueAt(baris, 4).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldataMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1 = Login.user;
        admin.setText(user1);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField keluhan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no;
    private javax.swing.JTextField obat;
    private javax.swing.JTable tabeldata;
    // End of variables declaration//GEN-END:variables

   private void selectData() {
            String kolom[] = {"NoPengunjung","Nama","Kelas","Keluhan","Obat"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQL = "SELECT * FROM pengunjung";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try{
                while(rs.next()) {
                    String NoPengunjung = rs.getString(1);
                    String Nama = rs.getString(2);
                    String Kelas = rs.getString(3);
                    String Keluhan = rs.getString(4);
                    String Obat = rs.getString(5);
                    String data[] = {NoPengunjung,Nama,Kelas,Keluhan,Obat};
                    dtm.addRow(data);
                }
            } catch (SQLException ex){
                Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            tabeldata.setModel(dtm);
    }
}
