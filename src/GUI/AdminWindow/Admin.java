/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AdminWindow;

import GUI.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Vishal Singh Rajput
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    CardLayout cd;
    JTabbedPane t = new JTabbedPane();

    public Admin() {
        initComponents();
        initAddMatchPanel();
        initAddTeamPanel();
        initAddPlayerPanel();
        this.setLocationRelativeTo(null);
        cd = (CardLayout) (CardHolder.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavBar = new javax.swing.JPanel();
        LogoTournify = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AddTeamsBtn = new keeptoo.KButton();
        AddPlayersBtn = new keeptoo.KButton();
        HomeBtn = new keeptoo.KButton();
        AddMatchesBtn = new keeptoo.KButton();
        TopBar = new javax.swing.JPanel();
        SearchBar = new javax.swing.JTextField();
        SearchIcon = new javax.swing.JLabel();
        ExitIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CardHolder = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(360, 110));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(990, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavBar.setBackground(new java.awt.Color(23, 35, 51));
        NavBar.setPreferredSize(new java.awt.Dimension(230, 680));
        NavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoTournify.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        LogoTournify.setForeground(new java.awt.Color(255, 255, 255));
        LogoTournify.setText("TOURNIFY");
        NavBar.add(LogoTournify, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jSeparator1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSeparator1MouseClicked(evt);
            }
        });
        NavBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 10));

        AddTeamsBtn.setText("Add Teams");
        AddTeamsBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AddTeamsBtn.setkAllowGradient(false);
        AddTeamsBtn.setkAllowTab(true);
        AddTeamsBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        AddTeamsBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        AddTeamsBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        AddTeamsBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        AddTeamsBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        AddTeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeamsBtnActionPerformed(evt);
            }
        });
        NavBar.add(AddTeamsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 60));

        AddPlayersBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddPlayersBtn.setText("Add Players");
        AddPlayersBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AddPlayersBtn.setkAllowGradient(false);
        AddPlayersBtn.setkAllowTab(true);
        AddPlayersBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        AddPlayersBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        AddPlayersBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        AddPlayersBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        AddPlayersBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        AddPlayersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPlayersBtnActionPerformed(evt);
            }
        });
        NavBar.add(AddPlayersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 60));

        HomeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        HomeBtn.setText("Home");
        HomeBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        HomeBtn.setkAllowGradient(false);
        HomeBtn.setkAllowTab(true);
        HomeBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        HomeBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        HomeBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        HomeBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        HomeBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        NavBar.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 60));

        AddMatchesBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddMatchesBtn.setText("Add Matches");
        AddMatchesBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AddMatchesBtn.setkAllowGradient(false);
        AddMatchesBtn.setkAllowTab(true);
        AddMatchesBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        AddMatchesBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        AddMatchesBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        AddMatchesBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        AddMatchesBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        AddMatchesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMatchesBtnActionPerformed(evt);
            }
        });
        NavBar.add(AddMatchesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 60));

        getContentPane().add(NavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 680));

        TopBar.setBackground(new java.awt.Color(71, 120, 197));
        TopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopBarMouseDragged(evt);
            }
        });
        TopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopBarMousePressed(evt);
            }
        });

        SearchBar.setBackground(new java.awt.Color(123, 156, 225));
        SearchBar.setForeground(new java.awt.Color(255, 255, 255));
        SearchBar.setCaretColor(new java.awt.Color(255, 255, 255));
        SearchBar.setPreferredSize(new java.awt.Dimension(2, 20));

        SearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Search_18px.png"))); // NOI18N

        ExitIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(255, 255, 255));
        ExitIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Exit_25px.png"))); // NOI18N
        ExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitIconMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow-black-circular-button.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createSequentialGroup()
                .addContainerGap(719, Short.MAX_VALUE)
                .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchIcon)
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitIcon)
                    .addComponent(SearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 980, 80));

        CardHolder.setPreferredSize(new java.awt.Dimension(830, 750));
        CardHolder.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(102, 102, 0));
        HomePanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        CardHolder.add(HomePanel, "card2");

        Admin.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        CardHolder.add(Admin, "card5");

        getContentPane().add(CardHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 980, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void initAddTeamPanel() {
        AddTeam = new AddTeamPanel();
        CardHolder.add(AddTeam, "card3");
    }

    void initAddPlayerPanel() {
        AddPlayer = new AddPlayerPanel();
        CardHolder.add(AddPlayer, "card3");
    }

    void initAddMatchPanel() {
        AddMatch = new AddMatchPanel();
        CardHolder.add(AddMatch, "card3");
    }

    int xx, xy;
    private void TopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMousePressed
        // TODO add your handling code here:
        //drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_TopBarMousePressed

    private void TopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMouseDragged
        // TODO add your handling code here:

        //source to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_TopBarMouseDragged

    private void ExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitIconMouseClicked

    private void jSeparator1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSeparator1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator1MouseClicked

    private void AddTeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeamsBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        CardHolder.add(AddTeam);
    }//GEN-LAST:event_AddTeamsBtnActionPerformed

    private void AddPlayersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPlayersBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        CardHolder.add(AddPlayer);
    }//GEN-LAST:event_AddPlayersBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        this.setVisible(false);
//        GuestHome.setVisible(true);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void AddMatchesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMatchesBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        CardHolder.add(AddMatch);
    }//GEN-LAST:event_AddMatchesBtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(23, 35, 51));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }
    private AddMatchPanel AddMatch;
    private AddTeamPanel AddTeam;
    private AddPlayerPanel AddPlayer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton AddMatchesBtn;
    private keeptoo.KButton AddPlayersBtn;
    private keeptoo.KButton AddTeamsBtn;
    private javax.swing.JPanel Admin;
    private javax.swing.JPanel CardHolder;
    private javax.swing.JLabel ExitIcon;
    private keeptoo.KButton HomeBtn;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel LogoTournify;
    private javax.swing.JPanel NavBar;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel SearchIcon;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
