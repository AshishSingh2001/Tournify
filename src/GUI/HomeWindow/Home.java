/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.HomeWindow;

import Code.TournamentManagementSystem;
import java.awt.*;
import javax.swing.*;
import GUI.Login;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vishal Singh Rajput
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    JTabbedPane t = new JTabbedPane();

    public Home() {
        setIcon();
        initComponents();
        initTeamScrollPanel();
        initPlayerScrollPanel();
        initLeaderboardScrollPanel();
        initMatchesScrollPanel();
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
        HomeBtn = new keeptoo.KButton();
        TeamsBtn = new keeptoo.KButton();
        PlayersBtn = new keeptoo.KButton();
        Leaderboardbtn = new keeptoo.KButton();
        MatchesBtn = new keeptoo.KButton();
        TopBar = new javax.swing.JPanel();
        SearchBar = new javax.swing.JTextField();
        SearchIcon = new javax.swing.JLabel();
        ExitIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CardHolder = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

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
        NavBar.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 60));

        TeamsBtn.setText("Teams");
        TeamsBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TeamsBtn.setkAllowGradient(false);
        TeamsBtn.setkAllowTab(true);
        TeamsBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        TeamsBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        TeamsBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        TeamsBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        TeamsBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamsBtnActionPerformed(evt);
            }
        });
        NavBar.add(TeamsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 60));

        PlayersBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PlayersBtn.setText("Players");
        PlayersBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        PlayersBtn.setkAllowGradient(false);
        PlayersBtn.setkAllowTab(true);
        PlayersBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        PlayersBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        PlayersBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        PlayersBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        PlayersBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        PlayersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayersBtnActionPerformed(evt);
            }
        });
        NavBar.add(PlayersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 60));

        Leaderboardbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Leaderboardbtn.setText("Leaderboard");
        Leaderboardbtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Leaderboardbtn.setkAllowGradient(false);
        Leaderboardbtn.setkAllowTab(true);
        Leaderboardbtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        Leaderboardbtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        Leaderboardbtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        Leaderboardbtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        Leaderboardbtn.setPreferredSize(new java.awt.Dimension(230, 60));
        Leaderboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderboardbtnActionPerformed(evt);
            }
        });
        NavBar.add(Leaderboardbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 60));

        MatchesBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MatchesBtn.setText("Matches");
        MatchesBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        MatchesBtn.setkAllowGradient(false);
        MatchesBtn.setkAllowTab(true);
        MatchesBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        MatchesBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        MatchesBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        MatchesBtn.setkSelectedColor(new java.awt.Color(55, 76, 106));
        MatchesBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        MatchesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchesBtnActionPerformed(evt);
            }
        });
        NavBar.add(MatchesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, 60));

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
        TopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchBar.setBackground(new java.awt.Color(123, 156, 225));
        SearchBar.setForeground(new java.awt.Color(255, 255, 255));
        SearchBar.setCaretColor(new java.awt.Color(255, 255, 255));
        SearchBar.setPreferredSize(new java.awt.Dimension(2, 20));
        TopBar.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 29, 141, -1));

        SearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Search_18px.png"))); // NOI18N
        TopBar.add(SearchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 29, -1, 20));

        ExitIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(255, 255, 255));
        ExitIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Exit_25px.png"))); // NOI18N
        ExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitIconMouseClicked(evt);
            }
        });
        TopBar.add(ExitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 29, 31, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-back-30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        TopBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 29, 25, 25));

        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 980, 80));

        CardHolder.setPreferredSize(new java.awt.Dimension(830, 750));
        CardHolder.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(187, 225, 250));
        HomePanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/stadium1.jpg"))); // NOI18N

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CardHolder.add(HomePanel, "card2");

        getContentPane().add(CardHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 980, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/logo_50.png")));
    }
    
    void initMatchesScrollPanel() {
        MatchesScrPanel = new MatchesScrollPanel();
        CardHolder.add(MatchesScrPanel, "card3");
    }

    void initLeaderboardScrollPanel() {
        LeaderboardScrPanel = new LeaderboardScrollPanel();
        CardHolder.add(LeaderboardScrPanel, "card3");
    }

    void initTeamScrollPanel() {
        TeamScrPanel = new TeamScrollPanel();
        CardHolder.add(TeamScrPanel, "card3");
    }

    void initPlayerScrollPanel() {
        PlayerScrPanel = new PlayerScrollPanel();
        CardHolder.add(PlayerScrPanel, "card3");
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
        int n = JOptionPane.showConfirmDialog(new JFrame(),
        "Would you like to save this sessions data?",
        "An Inane Question",
        JOptionPane.YES_NO_OPTION);
        
        if(n == 0) {
            System.out.println("check saveclose");
            TournamentManagementSystem tms = new TournamentManagementSystem();
            try {
                tms.saveAndClose();
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jSeparator1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSeparator1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator1MouseClicked

    private void TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamsBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        TeamScrPanel.removeAll();
        initTeamScrollPanel();
        CardHolder.add(TeamScrPanel);


    }//GEN-LAST:event_TeamsBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.add(HomePanel);
        CardHolder.repaint();
        CardHolder.revalidate();

    }//GEN-LAST:event_HomeBtnActionPerformed

    private void PlayersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayersBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        PlayerScrPanel.removeAll();
        initPlayerScrollPanel();
        CardHolder.add(PlayerScrPanel);
    }//GEN-LAST:event_PlayersBtnActionPerformed

    private void LeaderboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderboardbtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        LeaderboardScrPanel.removeAll();
        initLeaderboardScrollPanel();
        CardHolder.add(LeaderboardScrPanel);
    }//GEN-LAST:event_LeaderboardbtnActionPerformed

    private void MatchesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchesBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
        CardHolder.repaint();
        CardHolder.revalidate();
        MatchesScrPanel.removeAll();
        initMatchesScrollPanel();
        CardHolder.add(MatchesScrPanel);
    }//GEN-LAST:event_MatchesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }


    CardLayout cd;
    private MatchesScrollPanel MatchesScrPanel;
    private LeaderboardScrollPanel LeaderboardScrPanel;
    private TeamScrollPanel TeamScrPanel;
    private PlayerScrollPanel PlayerScrPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardHolder;
    private javax.swing.JLabel ExitIcon;
    private keeptoo.KButton HomeBtn;
    private javax.swing.JPanel HomePanel;
    private keeptoo.KButton Leaderboardbtn;
    private javax.swing.JLabel LogoTournify;
    private keeptoo.KButton MatchesBtn;
    private javax.swing.JPanel NavBar;
    private keeptoo.KButton PlayersBtn;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel SearchIcon;
    private keeptoo.KButton TeamsBtn;
    private javax.swing.JPanel TopBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
