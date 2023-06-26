/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movieticketorder.user;

import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import movieticketorder.object.Movie;
/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form MovieList
     */
    Movie movie = new Movie();
    String URL = "jdbc:sqlserver://HiepPC\\SQLEXPRESS:1433;"
                    + "username=sa;password=123456;databasename=movieTicketBooking;encrypt=false";
    int firstID = 0, lastID = 0, movieID_Display = 0;
    
    public Home() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Movie List");
        if(GetID())
            movieID_Display = firstID;
        Display(movieID_Display);
    }
    public boolean GetID(){
        boolean flag = false;
        try{
            Connection connect = DriverManager.getConnection(URL);
            String sql = "SELECT TOP 1 movieID FROM movie ORDER BY movieID ASC";
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                firstID = rs.getInt("movieID");
                connect.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        try{
            Connection connect = DriverManager.getConnection(URL);
            String sql = "SELECT TOP 1 movieID FROM movie ORDER BY movieID DESC";
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                lastID = rs.getInt("movieID");
                connect.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        if(lastID >= firstID)
            flag = true;
        
        return flag;
    }
    public void Display(int id){
        try{
            Connection connect = DriverManager.getConnection(URL);
            String sql = "SELECT name, autor, description, time, poster, trailer FROM movie WHERE movieID=?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                movie.setMovieName(rs.getString("name"));
                movie.setMovieAutor(rs.getString("autor"));
                movie.setMovieDescription(rs.getString("description"));
                movie.setMovieTime(rs.getInt("time"));
                movie.setMoviePoster(rs.getString("poster"));
                movie.setMovieTrailer(rs.getString("trailer"));
            }
            jTextMovieName.setText(movie.getMovieName());
            jTextMovieName.setEditable(false);
            
            jTextAutor.setText(movie.getMovieAutor());
            jTextAutor.setEditable(false);
            
            jTextArea1.setText(movie.getMovieDescription());
            jTextArea1.setEditable(false);
            
            jTextTime.setText(String.valueOf(movie.getMovieTime()));
            jTextTime.setEditable(false);
            
            jLabelPoster.setIcon(ResizeImage(jLabelPoster,movie.getMoviePoster()));
            
            connect.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public ImageIcon ResizeImage(JLabel j,String ImagePath){
        // resize image fit to jlabel 
        ImageIcon MyImage = new ImageIcon(getClass().getResource("/resources/movies/poster/" + ImagePath));
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(j.getWidth(), j.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public boolean Remove(int id){
        boolean flag = true;
        try{
            Connection connect = DriverManager.getConnection(URL);
            String sql = "DELETE FROM movie WHERE movieID=?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, id);
            if(ps.executeUpdate() > 0){
                for(int i=id+1; i <= lastID; i++){
                    sql = "UPDATE movie SET movieID=? WHERE movieID=" + i;
                    ps = connect.prepareStatement(sql);
                    ps.setInt(1, i-1);
                    ps.executeUpdate();
                }
                return true;
            }
        }catch(SQLException ex){
            flag = false;
            ex.printStackTrace();
        }
        return flag;
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
        jLabelPoster = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextMovieName = new javax.swing.JTextField();
        jTextAutor = new javax.swing.JTextField();
        jTextTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButtonPlay = new javax.swing.JButton();
        jButtonBooking = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPoster.setBackground(new java.awt.Color(0, 255, 51));
        jLabelPoster.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelPoster.setForeground(new java.awt.Color(0, 153, 0));
        jLabelPoster.setText("       Poster");
        jLabelPoster.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        jPanel1.add(jLabelPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 260, 390));

        jButtonNext.setBackground(new java.awt.Color(0, 153, 0));
        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/right-32.png"))); // NOI18N
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 40, -1));

        jButtonPrevious.setBackground(new java.awt.Color(0, 153, 0));
        jButtonPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/left-32.png"))); // NOI18N
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 40, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Movie Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Autor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Description");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jTextMovieName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextMovieName.setForeground(new java.awt.Color(0, 0, 0));
        jTextMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMovieNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 250, -1));

        jTextAutor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextAutor.setForeground(new java.awt.Color(0, 0, 0));
        jTextAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAutorActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 250, -1));

        jTextTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextTime.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 250, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 250, 130));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Movie List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 230, -1));

        jButtonPlay.setBackground(new java.awt.Color(153, 255, 153));
        jButtonPlay.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonPlay.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Button-Play-32.png"))); // NOI18N
        jButtonPlay.setText("Trailer");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 140, -1));

        jButtonBooking.setBackground(new java.awt.Color(153, 255, 153));
        jButtonBooking.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonBooking.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Ticket-32.png"))); // NOI18N
        jButtonBooking.setText("Booking");
        jButtonBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookingActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Food-Popcorn-48.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Food-Drink-Coke-48.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cinema/assortiment-elements-cinema-fond-rouge-espace-copie.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAutorActionPerformed

    private void jTextMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMovieNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextMovieNameActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        movieID_Display++;
        if(movieID_Display > lastID)
            movieID_Display = firstID;
        Display(movieID_Display);
        
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        // TODO add your handling code here:
        movieID_Display--;
        if(movieID_Display < firstID)
            movieID_Display = lastID;
        Display(movieID_Display);
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        // TODO add your handling code here:
        String path = "/resources/movies/trailer/" + movie.getMovieTrailer();
        System.out.println("trailer: " + path);
        new playTrailer(path);
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookingActionPerformed
        // TODO add your handling code here:
        BookingTicket book = new BookingTicket();
        this.setVisible(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        book.pack();
        book.setLocationRelativeTo(null);
        book.setTitle("Home");
        book.setVisible(true);
    }//GEN-LAST:event_jButtonBookingActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBooking;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPoster;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextMovieName;
    private javax.swing.JTextField jTextTime;
    // End of variables declaration//GEN-END:variables
}
