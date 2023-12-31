/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieticketorder.admin;

/**
 *
 * @author Admin
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Home");
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
        jLabelBackGround = new javax.swing.JLabel();
        jButtonAddMovie = new javax.swing.JButton();
        jButtonSetRoom = new javax.swing.JButton();
        jButtonSetSchedule = new javax.swing.JButton();
        jButtonMovieList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cinema/cinema.jpg"))); // NOI18N
        jLabelBackGround.setText("background");
        jPanel1.add(jLabelBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 548, -1));

        jButtonAddMovie.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAddMovie.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAddMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Film-add32.png"))); // NOI18N
        jButtonAddMovie.setText("Add Movie");
        jButtonAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMovieActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 357, 156, 51));

        jButtonSetRoom.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSetRoom.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSetRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/room.png"))); // NOI18N
        jButtonSetRoom.setText("Set Room");
        jButtonSetRoom.setMaximumSize(new java.awt.Dimension(145, 40));
        jButtonSetRoom.setMinimumSize(new java.awt.Dimension(145, 40));
        jButtonSetRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetRoomActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSetRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 426, 156, 51));

        jButtonSetSchedule.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSetSchedule.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSetSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Movie-Schedule.32.png"))); // NOI18N
        jButtonSetSchedule.setText("Set Schedule");
        jButtonSetSchedule.setMaximumSize(new java.awt.Dimension(145, 40));
        jButtonSetSchedule.setMinimumSize(new java.awt.Dimension(145, 40));
        jButtonSetSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetScheduleActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSetSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 357, -1, 51));

        jButtonMovieList.setBackground(new java.awt.Color(204, 255, 204));
        jButtonMovieList.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMovieList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Movie_List-32.png"))); // NOI18N
        jButtonMovieList.setText("Movie List");
        jButtonMovieList.setMaximumSize(new java.awt.Dimension(145, 40));
        jButtonMovieList.setMinimumSize(new java.awt.Dimension(145, 40));
        jButtonMovieList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMovieListActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMovieList, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 426, 156, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMovieActionPerformed
        // TODO add your handling code here:
        AddMovie add = new AddMovie();
        this.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        add.pack();
        add.setLocationRelativeTo(null);
        add.setTitle("Add Movie");
        add.setVisible(true);
    }//GEN-LAST:event_jButtonAddMovieActionPerformed

    private void jButtonSetRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetRoomActionPerformed
        // TODO add your handling code here:
        SetRoom room = new SetRoom();
        this.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        room.pack();
        room.setLocationRelativeTo(null);
        room.setTitle("Set Room");
        room.setVisible(true);
    }//GEN-LAST:event_jButtonSetRoomActionPerformed

    private void jButtonSetScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetScheduleActionPerformed
        // TODO add your handling code here:
        SetSchedule schedule = new SetSchedule();
        this.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        schedule.pack();
        schedule.setLocationRelativeTo(null);
        schedule.setTitle("Set Schedule");
        schedule.setVisible(true);
    }//GEN-LAST:event_jButtonSetScheduleActionPerformed

    private void jButtonMovieListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovieListActionPerformed
        // TODO add your handling code here:
        MovieList list = new MovieList();
        this.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        list.pack();
        list.setLocationRelativeTo(null);
        list.setTitle("Movie List");
        list.setVisible(true);
    }//GEN-LAST:event_jButtonMovieListActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMovie;
    private javax.swing.JButton jButtonMovieList;
    private javax.swing.JButton jButtonSetRoom;
    private javax.swing.JButton jButtonSetSchedule;
    private javax.swing.JLabel jLabelBackGround;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
