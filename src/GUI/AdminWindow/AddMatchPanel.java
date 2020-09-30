/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AdminWindow;

import Code.TournamentManagementSystem;

/**
 *
 * @author Ashish Kumar Singh
 */
public class AddMatchPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTeam
     */
    public AddMatchPanel() {
        tms = new TournamentManagementSystem();
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

        AddMatchBtn = new keeptoo.KButton();
        ResetBtn = new keeptoo.KButton();
        TeamLabel2 = new javax.swing.JLabel();
        TeamField2 = new javax.swing.JTextField();
        PointsLabel2 = new javax.swing.JLabel();
        PointsField2 = new javax.swing.JTextField();
        TeamLabel1 = new javax.swing.JLabel();
        TeamField1 = new javax.swing.JTextField();
        PointsLabel1 = new javax.swing.JLabel();
        PointsField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(170, 102, 235));
        setForeground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(980, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddMatchBtn.setText("Add Match");
        AddMatchBtn.setkBackGroundColor(new java.awt.Color(198, 171, 229));
        AddMatchBtn.setkBorderRadius(30);
        AddMatchBtn.setkEndColor(new java.awt.Color(0, 204, 204));
        AddMatchBtn.setkFillButton(false);
        AddMatchBtn.setkHoverEndColor(new java.awt.Color(217, 236, 242));
        AddMatchBtn.setkHoverForeGround(new java.awt.Color(227, 223, 200));
        AddMatchBtn.setkHoverStartColor(new java.awt.Color(30, 95, 116));
        AddMatchBtn.setkStartColor(new java.awt.Color(254, 254, 254));
        AddMatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMatchBtnActionPerformed(evt);
            }
        });
        add(AddMatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 160, -1));

        ResetBtn.setText("Reset");
        ResetBtn.setkBorderRadius(30);
        ResetBtn.setkEndColor(new java.awt.Color(252, 218, 183));
        ResetBtn.setkHoverEndColor(new java.awt.Color(50, 130, 184));
        ResetBtn.setkHoverForeGround(new java.awt.Color(227, 223, 200));
        ResetBtn.setkHoverStartColor(new java.awt.Color(26, 166, 183));
        ResetBtn.setkStartColor(new java.awt.Color(50, 130, 184));
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, -1));

        TeamLabel2.setForeground(new java.awt.Color(254, 254, 254));
        TeamLabel2.setText("Team 2 Name");
        add(TeamLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 250, 40));

        TeamField2.setBackground(new java.awt.Color(0,0,0,1));
        TeamField2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        TeamField2.setForeground(new java.awt.Color(254, 254, 254));
        TeamField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        TeamField2.setOpaque(false);
        TeamField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamField2ActionPerformed(evt);
            }
        });
        add(TeamField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 390, 40));

        PointsLabel2.setForeground(new java.awt.Color(254, 254, 254));
        PointsLabel2.setText("Team 2 Points");
        add(PointsLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 250, 40));

        PointsField2.setBackground(new java.awt.Color(0,0,0,1));
        PointsField2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        PointsField2.setForeground(new java.awt.Color(254, 254, 254));
        PointsField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        PointsField2.setOpaque(false);
        PointsField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsField2ActionPerformed(evt);
            }
        });
        add(PointsField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 390, 40));

        TeamLabel1.setForeground(new java.awt.Color(254, 254, 254));
        TeamLabel1.setText("Team 1 Name");
        add(TeamLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, 40));

        TeamField1.setBackground(new java.awt.Color(0,0,0,1));
        TeamField1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        TeamField1.setForeground(new java.awt.Color(254, 254, 254));
        TeamField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        TeamField1.setOpaque(false);
        TeamField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamField1ActionPerformed(evt);
            }
        });
        add(TeamField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 390, 40));

        PointsLabel1.setForeground(new java.awt.Color(254, 254, 254));
        PointsLabel1.setText("Team 1 Points");
        add(PointsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 250, 40));

        PointsField1.setBackground(new java.awt.Color(0,0,0,1));
        PointsField1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        PointsField1.setForeground(new java.awt.Color(254, 254, 254));
        PointsField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(254, 254, 254)));
        PointsField1.setOpaque(false);
        PointsField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsField1ActionPerformed(evt);
            }
        });
        add(PointsField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 390, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void reset() {
        PointsField1.setText("");
        PointsField2.setText("");
        TeamField1.setText("");
        TeamField2.setText("");
    }
    
    private void AddMatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMatchBtnActionPerformed
        // TODO add your handling code here:
        String team1, team2;
        int team1Points, team2Points;
        team1 = TeamField1.getText();
        team2 = TeamField2.getText();
        team1Points = Integer.parseInt(PointsField1.getText());
        team2Points = Integer.parseInt(PointsField2.getText());
        tms.addNewMatch(team1, team2, team1Points,team2Points);
        reset();
    }//GEN-LAST:event_AddMatchBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void TeamField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamField2ActionPerformed

    private void PointsField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PointsField2ActionPerformed

    private void TeamField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamField1ActionPerformed

    private void PointsField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointsField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PointsField1ActionPerformed

    private TournamentManagementSystem tms;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton AddMatchBtn;
    private javax.swing.JTextField PointsField1;
    private javax.swing.JTextField PointsField2;
    private javax.swing.JLabel PointsLabel1;
    private javax.swing.JLabel PointsLabel2;
    private keeptoo.KButton ResetBtn;
    private javax.swing.JTextField TeamField1;
    private javax.swing.JTextField TeamField2;
    private javax.swing.JLabel TeamLabel1;
    private javax.swing.JLabel TeamLabel2;
    // End of variables declaration//GEN-END:variables
}
