    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static commonfunction.Common.removeAccent;
import commonfunction.MD5;
import dal.dao.UsersJpaController;
import dal.entity.Users;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jame Moriarty
 */
public class Frm_user extends javax.swing.JFrame {

    /**
     * Creates new form User_addNew
     */
    public Users entity = new Users();
    List<Users> Userlst;

    public Frm_user() {
        initComponents();
        showtable();
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
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbuserID = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        lbpass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        lbname = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        lbIDN = new javax.swing.JLabel();
        userIDN = new javax.swing.JTextField();
        lbadd = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        lbphone = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        lbrole = new javax.swing.JLabel();
        position = new javax.swing.JComboBox();
        lbemail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Người Dùng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên Đăng Nhập", "Họ Tên", "Số CMT", "Địa chỉ", "Điện thoại", "Email", "chức vụ"
            }
        ));
        tblUser.setGridColor(new java.awt.Color(204, 204, 204));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12)))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(8, 2));

        lbuserID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbuserID.setForeground(new java.awt.Color(51, 51, 51));
        lbuserID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbuserID.setText("Tên Đăng Nhập:");
        jPanel2.add(lbuserID);
        jPanel2.add(userID);

        lbpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbpass.setForeground(new java.awt.Color(51, 51, 51));
        lbpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbpass.setText("Mật khẩu");
        jPanel2.add(lbpass);
        jPanel2.add(password);

        lbname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbname.setForeground(new java.awt.Color(51, 51, 51));
        lbname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbname.setText("Họ Tên:");
        jPanel2.add(lbname);
        jPanel2.add(userName);

        lbIDN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbIDN.setForeground(new java.awt.Color(51, 51, 51));
        lbIDN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIDN.setText("Số chứng minh thư:");
        jPanel2.add(lbIDN);
        jPanel2.add(userIDN);

        lbadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbadd.setForeground(new java.awt.Color(51, 51, 51));
        lbadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbadd.setText("Địa chỉ:");
        jPanel2.add(lbadd);
        jPanel2.add(address);

        lbphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbphone.setForeground(new java.awt.Color(51, 51, 51));
        lbphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbphone.setText("Điện thoại:");
        jPanel2.add(lbphone);
        jPanel2.add(phone);

        lbrole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbrole.setForeground(new java.awt.Color(51, 51, 51));
        lbrole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbrole.setText("Chức vụ:");
        jPanel2.add(lbrole);

        position.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quản Lý", "Nhân Viên" }));
        jPanel2.add(position);

        lbemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbemail.setForeground(new java.awt.Color(51, 51, 51));
        lbemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbemail.setText("Email:");
        jPanel2.add(lbemail);
        jPanel2.add(email);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Thêm");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        jPanel3.add(btnSubmit);

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Xóa");
        jPanel3.add(jButton1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validateSubmit(String userid, String Password, String Name, String IDN, String Address, String phone, String position, String email) {
        if (userid.length() == 0) {
            JOptionPane.showMessageDialog(null, "Tên Đăng Nhập không được phép trống !");
            userName.requestFocus();
            return false;
        }
        if (userid.length() < 6) {
            JOptionPane.showMessageDialog(null, "Tên Đăng Nhập tối thiểu 6 ký tự !");
            userName.requestFocus();
            return false;
        }
        if (userid.length() > 50) {
            JOptionPane.showMessageDialog(null, "Tên Đăng Nhập tối đa 50 ký tự !");
            userName.requestFocus();
            return false;
        }
        if (userid.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Tên Đăng Nhập không được phép có khoảng trắng!");
            userName.requestFocus();
            return false;
        }
        return true;
    }
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        boolean check;
        check = validateSubmit(userID.getText(), password.getText(), userName.getText(), userIDN.getText(), address.getText(), phone.getText(), position.getSelectedItem().toString(), email.getText());
        if (check == true) {
            String Pass = MD5.encryptMD5(password.getText());
            entity.setUserID(userID.getText());
            try {
                entity.setPassword(Pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
            entity.setUserName(userName.getText());
            entity.setUserIDN(userIDN.getText());
            entity.setAddress(address.getText());
            entity.setPhone(phone.getText());
            entity.setPosition(position.getSelectedItem().toString());
            entity.setEmail(email.getText());
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestaurantManagermentPU");
            UsersJpaController dao = new UsersJpaController(emf);
            try {
                dao.create(entity);
            } catch (Exception ex) {
                Logger.getLogger(Frm_user.class.getName()).log(Level.SEVERE, null, ex);
            }
            showtable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Thêm mới thất bại !");
        }
        System.out.println(check);
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        int row = tblUser.getSelectedRow();
        String id = tblUser.getValueAt(row, 0).toString();
        userID.setText(tblUser.getValueAt(row, 0).toString());
//        password.setText(tblUser.getValueAt(row, 1).toString());
        userName.setText(tblUser.getValueAt(row, 1).toString());
        userIDN.setText(tblUser.getValueAt(row, 2).toString());
        address.setText(tblUser.getValueAt(row, 3).toString());
        phone.setText(tblUser.getValueAt(row, 4).toString());
        position.setSelectedItem(tblUser.getValueAt(row, 5).toString());
        email.setText(tblUser.getValueAt(row, 6).toString());
        userID.setEditable(false);
    }//GEN-LAST:event_tblUserMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestaurantManagermentPU");
                UsersJpaController dao = new UsersJpaController(emf);
                entity = dao.findUsers(userID.getText());
                String Pass = MD5.encryptMD5(password.getText());
                entity.setPassword(Pass);
                entity.setUserName(userName.getText());
                entity.setUserIDN(userIDN.getText());
                entity.setAddress(address.getText());
                entity.setPhone(phone.getText());
                entity.setPosition(position.getSelectedItem().toString());
                entity.setEmail(email.getText());               
                dao.edit(entity);
            } catch (Exception ex) {
                Logger.getLogger(Frm_user.class.getName()).log(Level.SEVERE, null, ex);

            }
            showtable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String tex_search = txtSearch.getText().trim();
        Vector data = new Vector();
        Vector cols = new Vector();
        cols.addElement("Tên Đăng Nhập");
        cols.addElement("Họ Tên");
        cols.addElement("Số CMT");
        cols.addElement("Địa Chỉ");
        cols.addElement("Điện Thoại");
        cols.addElement("Chức Vụ");
        cols.addElement("Email");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestaurantManagermentPU");
        UsersJpaController dao = new UsersJpaController(emf);
        Userlst = dao.findUsersEntities();
        for (Users u : Userlst) {
            Vector user = new Vector();
            user.addElement(u.getUserID());
            user.addElement(u.getUserName());
            user.addElement(u.getUserIDN());
            user.addElement(u.getAddress());
            user.addElement(u.getPhone());
            user.addElement(u.getPosition());
            user.addElement(u.getEmail());
            if (removeAccent(user.toString().toLowerCase()).contains(removeAccent(tex_search).toLowerCase())) {
                data.add(user);
            }
            System.out.println(removeAccent(tex_search));
        }
        tblUser.setModel(new DefaultTableModel(data, cols));
    }//GEN-LAST:event_btnSearchActionPerformed
    public void showtable() {
        Vector data = new Vector();
        Vector cols = new Vector();
        cols.addElement("Tên Đăng Nhập");
        cols.addElement("Họ Tên");
        cols.addElement("Số CMT");
        cols.addElement("Địa Chỉ");
        cols.addElement("Điện Thoại");
        cols.addElement("Chức Vụ");
        cols.addElement("Email");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestaurantManagermentPU");
        UsersJpaController dao = new UsersJpaController(emf);
        Userlst = dao.findUsersEntities();
        for (Users u : Userlst) {
            Vector user = new Vector();
            user.addElement(u.getUserID());
            user.addElement(u.getUserName());
            user.addElement(u.getUserIDN());
            user.addElement(u.getAddress());
            user.addElement(u.getPhone());
            user.addElement(u.getPosition());
            user.addElement(u.getEmail());
            data.add(user);
        }
        tblUser.setModel(new DefaultTableModel(data, cols));
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
            java.util.logging.Logger.getLogger(Frm_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIDN;
    private javax.swing.JLabel lbadd;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbpass;
    private javax.swing.JLabel lbphone;
    private javax.swing.JLabel lbrole;
    private javax.swing.JLabel lbuserID;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox position;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField userID;
    private javax.swing.JTextField userIDN;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
