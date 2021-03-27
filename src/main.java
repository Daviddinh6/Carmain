/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class main extends javax.swing.JFrame {
    Connection conn = null;
    int mouseposX;
    int mouseposY;
    

    /**
     * Creates new form main
     */
    public main() {
        
        initComponents();
        
        Manage_Vehicle_Panel.hide();
            //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("your image here")));
           this.setTitle("DavidFix's Car Maintenance");
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainframe = new javax.swing.JPanel();
        Move_Panel = new javax.swing.JPanel();
        Exit_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Minimize_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Home_Panel = new javax.swing.JPanel();
        LeftHome_panel = new javax.swing.JPanel();
        Manage_Vehicle_Button = new javax.swing.JButton();
        Schedule_button = new javax.swing.JButton();
        History_button = new javax.swing.JButton();
        Service_rec_button = new javax.swing.JButton();
        User_icon = new javax.swing.JLabel();
        User_name_label = new javax.swing.JLabel();
        Righthome_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Manage_Vehicle_Panel = new javax.swing.JPanel();
        Left_MV_Panel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        Right_MV_Panel = new javax.swing.JPanel();
        Vehicle_ID = new javax.swing.JTextField();
        Make = new javax.swing.JTextField();
        Model = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        Mileage = new javax.swing.JTextField();
        manage_table_pane = new javax.swing.JScrollPane();
        Vehicle_manage_table = new javax.swing.JTable();
        Schedule_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1275, 700));
        setMinimumSize(new java.awt.Dimension(1275, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1275, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mainframe.setBackground(new java.awt.Color(255, 255, 255));
        Mainframe.setMaximumSize(new java.awt.Dimension(1275, 700));
        Mainframe.setMinimumSize(new java.awt.Dimension(1275, 700));
        Mainframe.setNextFocusableComponent(SaveButton);
        Mainframe.setPreferredSize(new java.awt.Dimension(1275, 700));
        Mainframe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Move_Panel.setPreferredSize(new java.awt.Dimension(1275, 700));
        Move_Panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Move_PanelMouseDragged(evt);
            }
        });
        Move_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Move_PanelMousePressed(evt);
            }
        });
        Move_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit_Panel.setMaximumSize(new java.awt.Dimension(50, 40));
        Exit_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Exit_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 50, 40));

        Move_Panel.add(Exit_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 50, 40));

        Minimize_Panel.setMaximumSize(new java.awt.Dimension(50, 40));
        Minimize_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Minimize_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 50, 40));

        Move_Panel.add(Minimize_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DavidFix\"s Car Maintenance");
        jLabel1.setToolTipText("");
        Move_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 390, 30));

        Mainframe.add(Move_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1350, 40));
        Move_Panel.getAccessibleContext().setAccessibleParent(Move_Panel);

        Home_Panel.setMaximumSize(new java.awt.Dimension(1275, 700));
        Home_Panel.setMinimumSize(new java.awt.Dimension(1275, 700));
        Home_Panel.setNextFocusableComponent(SaveButton);
        Home_Panel.setPreferredSize(new java.awt.Dimension(1275, 700));
        Home_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftHome_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manage_Vehicle_Button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        Manage_Vehicle_Button.setText("Manage Vehicle");
        Manage_Vehicle_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Manage_Vehicle_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manage_Vehicle_ButtonActionPerformed(evt);
            }
        });
        LeftHome_panel.add(Manage_Vehicle_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 190, 70));

        Schedule_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        Schedule_button.setText("Schedule");
        Schedule_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schedule_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Schedule_buttonActionPerformed(evt);
            }
        });
        LeftHome_panel.add(Schedule_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 190, 70));

        History_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        History_button.setText("History");
        LeftHome_panel.add(History_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 190, 70));

        Service_rec_button.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        Service_rec_button.setText("Service Record");
        Service_rec_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Service_rec_buttonActionPerformed(evt);
            }
        });
        LeftHome_panel.add(Service_rec_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 190, 70));

        User_icon.setText("Icon");
        LeftHome_panel.add(User_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 24, 120, 110));

        User_name_label.setText("Name");
        LeftHome_panel.add(User_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, 20));

        Home_Panel.add(LeftHome_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 710));

        Righthome_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Righthome_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        Home_Panel.add(Righthome_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 970, 710));

        Mainframe.add(Home_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1290, 690));
        Home_Panel.getAccessibleContext().setAccessibleParent(Home_Panel);

        Manage_Vehicle_Panel.setMaximumSize(new java.awt.Dimension(1275, 700));
        Manage_Vehicle_Panel.setMinimumSize(new java.awt.Dimension(1275, 700));
        Manage_Vehicle_Panel.setPreferredSize(new java.awt.Dimension(1275, 700));
        Manage_Vehicle_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left_MV_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        Left_MV_Panel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 100, 50));

        SaveButton.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        Left_MV_Panel.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 100, 50));

        Manage_Vehicle_Panel.add(Left_MV_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, 680));

        Right_MV_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vehicle_ID.setBackground(new java.awt.Color(240, 240, 240));
        Vehicle_ID.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        Vehicle_ID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 15))); // NOI18N
        Right_MV_Panel.add(Vehicle_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 70));

        Make.setBackground(new java.awt.Color(240, 240, 240));
        Make.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        Make.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Make", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 15))); // NOI18N
        Right_MV_Panel.add(Make, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 280, 70));

        Model.setBackground(new java.awt.Color(240, 240, 240));
        Model.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        Model.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 15))); // NOI18N
        Right_MV_Panel.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 260, 70));

        Year.setBackground(new java.awt.Color(240, 240, 240));
        Year.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        Year.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 15))); // NOI18N
        Right_MV_Panel.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 70));

        Mileage.setBackground(new java.awt.Color(240, 240, 240));
        Mileage.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        Mileage.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mileage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 15))); // NOI18N
        Right_MV_Panel.add(Mileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 280, 70));

        Vehicle_manage_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Year", "Make", "Model", "Mileage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manage_table_pane.setViewportView(Vehicle_manage_table);
        if (Vehicle_manage_table.getColumnModel().getColumnCount() > 0) {
            Vehicle_manage_table.getColumnModel().getColumn(0).setResizable(false);
            Vehicle_manage_table.getColumnModel().getColumn(1).setResizable(false);
            Vehicle_manage_table.getColumnModel().getColumn(2).setResizable(false);
            Vehicle_manage_table.getColumnModel().getColumn(3).setResizable(false);
            Vehicle_manage_table.getColumnModel().getColumn(4).setResizable(false);
        }

        Right_MV_Panel.add(manage_table_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 870, 370));

        Manage_Vehicle_Panel.add(Right_MV_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 970, 690));

        Mainframe.add(Manage_Vehicle_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        Manage_Vehicle_Panel.getAccessibleContext().setAccessibleDescription("");
        Manage_Vehicle_Panel.getAccessibleContext().setAccessibleParent(Manage_Vehicle_Panel);

        Schedule_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Schedule_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 430, 720));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        Schedule_panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 980, 730));

        Mainframe.add(Schedule_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 750));

        getContentPane().add(Mainframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 1290, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Manage_Vehicle_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manage_Vehicle_ButtonActionPerformed
        // TODO add your handling code here:
        Home_Panel.hide();
        Manage_Vehicle_Panel.show();
    }//GEN-LAST:event_Manage_Vehicle_ButtonActionPerformed

    private void Move_PanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Move_PanelMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - mouseposX, Y - mouseposY);
    }//GEN-LAST:event_Move_PanelMouseDragged

    private void Move_PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Move_PanelMousePressed
        // TODO add your handling code here:
        mouseposX = evt.getX();
        mouseposY = evt.getY();
    }//GEN-LAST:event_Move_PanelMousePressed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        Home_Panel.show();
        Manage_Vehicle_Panel.hide();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Schedule_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Schedule_buttonActionPerformed
        // TODO add your handling code here:
                Home_Panel.hide();
        Schedule_panel.show();
    }//GEN-LAST:event_Schedule_buttonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
                this.setState(main.ICONIFIED);

    }//GEN-LAST:event_jLabel2MouseClicked

    private void Service_rec_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Service_rec_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Service_rec_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel Exit_Panel;
    private javax.swing.JButton History_button;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JPanel LeftHome_panel;
    private javax.swing.JPanel Left_MV_Panel;
    private javax.swing.JPanel Mainframe;
    private javax.swing.JTextField Make;
    private javax.swing.JButton Manage_Vehicle_Button;
    private javax.swing.JPanel Manage_Vehicle_Panel;
    private javax.swing.JTextField Mileage;
    private javax.swing.JPanel Minimize_Panel;
    private javax.swing.JTextField Model;
    private javax.swing.JPanel Move_Panel;
    private javax.swing.JPanel Right_MV_Panel;
    private javax.swing.JPanel Righthome_panel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton Schedule_button;
    private javax.swing.JPanel Schedule_panel;
    private javax.swing.JButton Service_rec_button;
    private javax.swing.JLabel User_icon;
    private javax.swing.JLabel User_name_label;
    private javax.swing.JTextField Vehicle_ID;
    private javax.swing.JTable Vehicle_manage_table;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane manage_table_pane;
    // End of variables declaration//GEN-END:variables
}
