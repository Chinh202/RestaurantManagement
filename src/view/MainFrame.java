/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;

/**
 *
 * @author Jame Moriarty
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
//        Toolkit tk = Toolkit.getDefaultToolkit();
        initComponents();
//        int x = tk.getScreenSize().width;
//        int y = tk.getScreenSize().height;
//        this.setSize(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MIuser = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("MainFrame"); // NOI18N

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(160);
        jSplitPane1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(160, 800));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiter-serving.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/business-icon.png"))); // NOI18N

        btnUser.setBackground(new java.awt.Color(255, 255, 255));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_accounts.png"))); // NOI18N
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 800));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(105, 40));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Hoạt Động");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setMargin(new java.awt.Insets(0, 0, 0, 5));
        jMenu1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/App-login-manager-icon.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list.png"))); // NOI18N
        jMenuItem1.setText("Danh sách bàn");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jame Moriarty\\Documents\\NetBeansProjects\\RestaurantManagerment\\src\\images\\t1.png")); // NOI18N
        jMenuItem2.setText("Thêm bàn");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Thực Đơn");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setMargin(new java.awt.Insets(0, 0, 0, 5));

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/re.png"))); // NOI18N
        jMenuItem3.setText("Xem Thực Đơn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jMenuItem4.setText("Thêm Món");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Filter-List-icon.png"))); // NOI18N
        jMenuItem5.setText("Phân Loại");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Nhân Viên");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMargin(new java.awt.Insets(0, 0, 0, 5));
        jMenu3.setPreferredSize(new java.awt.Dimension(69, 30));

        MIuser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        MIuser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jame Moriarty\\Documents\\NetBeansProjects\\RestaurantManagerment\\src\\images\\App-login-manager-icon.png")); // NOI18N
        MIuser.setText("Danh Sách Nhân Viên");
        MIuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIuserActionPerformed(evt);
            }
        });
        jMenu3.add(MIuser);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setText("Thống Kê");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        setSize(new java.awt.Dimension(1109, 817));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MIuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIuserActionPerformed
        new Frm_user().setVisible(true);
    }//GEN-LAST:event_MIuserActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
       jSplitPane1.setRightComponent(new Pln_User_addNew());
    }//GEN-LAST:event_btnUserActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jSplitPane1.setRightComponent(new Pnl_MenuItem_List());
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIuser;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}