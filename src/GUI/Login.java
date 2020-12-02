/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Code.TournamentManagementSystem;
import GUI.AdminWindow.Admin;
import GUI.HomeWindow.Home;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import keeptoo.Drag;

/**
 *
 * @author Ashish Kumar Singh
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form SIgnUpForm
     */
    public Login() {
        setIcon();
        initComponents();
        this.setLocationRelativeTo(null);
//        LogUser.setBackground(new java.awt.Color(0,0,0,1));
//        LogPass.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new keeptoo.KGradientPanel();
        UserIcon = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        LabelPass = new javax.swing.JLabel();
        TextPass = new javax.swing.JPasswordField();
        BtnGuest = new keeptoo.KButton();
        BtnOr = new javax.swing.JLabel();
        BtnAdmin = new keeptoo.KButton();
        ExitIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 110));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePanel.setkEndColor(new java.awt.Color(0, 0, 153));
        HomePanel.setkGradientFocus(1000);
        HomePanel.setkStartColor(new java.awt.Color(51, 255, 255));
        HomePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HomePanelMouseDragged(evt);
            }
        });
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomePanelMousePressed(evt);
            }
        });
        HomePanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HomePanelKeyPressed(evt);
            }
        });
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N
        HomePanel.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 70, 70));

        LabelUser.setForeground(new java.awt.Color(254, 254, 254));
        LabelUser.setText("Username");
        HomePanel.add(LabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 250, 40));

        TextUser.setBackground(new java.awt.Color(0,0,0,1));
        TextUser.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        TextUser.setForeground(new java.awt.Color(254, 254, 254));
        TextUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });
        HomePanel.add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 390, 40));

        LabelPass.setForeground(new java.awt.Color(254, 254, 254));
        LabelPass.setText("Password");
        HomePanel.add(LabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 250, 40));

        TextPass.setBackground(new java.awt.Color(0,0,0,1));
        TextPass.setForeground(new java.awt.Color(254, 254, 254));
        TextPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        HomePanel.add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 390, 40));

        BtnGuest.setText("View as Guest");
        BtnGuest.setkBorderRadius(30);
        BtnGuest.setkEndColor(new java.awt.Color(51, 255, 255));
        BtnGuest.setkHoverEndColor(new java.awt.Color(50, 130, 184));
        BtnGuest.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BtnGuest.setkHoverStartColor(new java.awt.Color(26, 166, 183));
        BtnGuest.setkStartColor(new java.awt.Color(50, 130, 184));
        BtnGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuestActionPerformed(evt);
            }
        });
        HomePanel.add(BtnGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 160, -1));

        BtnOr.setText("Or");
        HomePanel.add(BtnOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        BtnAdmin.setText("Login as Admin");
        BtnAdmin.setkBackGroundColor(new java.awt.Color(198, 171, 229));
        BtnAdmin.setkBorderRadius(30);
        BtnAdmin.setkEndColor(new java.awt.Color(0, 204, 204));
        BtnAdmin.setkFillButton(false);
        BtnAdmin.setkHoverEndColor(new java.awt.Color(217, 236, 242));
        BtnAdmin.setkHoverForeGround(new java.awt.Color(227, 223, 200));
        BtnAdmin.setkHoverStartColor(new java.awt.Color(30, 95, 116));
        BtnAdmin.setkStartColor(new java.awt.Color(254, 254, 254));
        BtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdminActionPerformed(evt);
            }
        });
        HomePanel.add(BtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 160, -1));

        ExitIcon.setFont(new java.awt.Font("Ubuntu", 1, 21)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(254, 254, 254));
        ExitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Exit_25px.png"))); // NOI18N
        ExitIcon.setText("X");
        ExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitIconMouseClicked(evt);
            }
        });
        HomePanel.add(ExitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, 20, 30));

        getContentPane().add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/logo_50.png")));
    }

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserActionPerformed

    private void HomePanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HomePanelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomePanelKeyPressed

    private void HomePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseDragged
        // TODO add your handling code here:
        //Drag here
        new Drag(HomePanel).moveWindow(evt);
    }//GEN-LAST:event_HomePanelMouseDragged

    private void HomePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMousePressed
        // TODO add your handling code here:
        new Drag(HomePanel).onPress(evt);
        //Use Mouse Always
    }//GEN-LAST:event_HomePanelMousePressed

    private void BtnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuestActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnGuestActionPerformed

    private void BtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAdminActionPerformed

    private void ExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitIconMouseClicked
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(new JFrame(),
        "Would you like to save this sessions data?",
        "An Inane Question",
        JOptionPane.YES_NO_OPTION);
        
        if(n == 0) {
            try {
                System.out.println("check saveclose");
                tms.saveAndClose();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                new FileWriter("History.dat", false).close();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
        
    }//GEN-LAST:event_ExitIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        tms = new TournamentManagementSystem("lmaoooo.dat");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginPage = new Login();
                LoginPage.setVisible(true);
            }
        });
    }

    private static TournamentManagementSystem tms;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton BtnAdmin;
    private keeptoo.KButton BtnGuest;
    private javax.swing.JLabel BtnOr;
    private javax.swing.JLabel ExitIcon;
    private keeptoo.KGradientPanel HomePanel;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JTextField TextUser;
    private javax.swing.JLabel UserIcon;
    // End of variables declaration//GEN-END:variables
    private static Login LoginPage;
}
