/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmMDI.java
 *
 * Created on May 10, 2017, 10:15:28 AM
 */

/**
 *
 * @author PC 20
 */
public class frmMDI extends javax.swing.JFrame {

    /** Creates new form frmParent */
    public frmMDI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mn_rminfo = new javax.swing.JMenuItem();
        mn_ptntrgsrt = new javax.swing.JMenuItem();
        mn_ptntnchkout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mn_ptntnrgssrch = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hospital Management System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 250, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAMSUNG\\Documents\\NetBeansProjects\\HMS\\HMS 28 dec\\HMS_&\\projct OMAGES\\mdi.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 890, 470);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Masters");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        mn_rminfo.setBackground(new java.awt.Color(107, 198, 198));
        mn_rminfo.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        mn_rminfo.setForeground(new java.awt.Color(255, 255, 255));
        mn_rminfo.setText("Room Info");
        mn_rminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRoomInfoActionPerformed(evt);
            }
        });
        jMenu1.add(mn_rminfo);

        mn_ptntrgsrt.setBackground(new java.awt.Color(107, 198, 198));
        mn_ptntrgsrt.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        mn_ptntrgsrt.setForeground(new java.awt.Color(255, 255, 255));
        mn_ptntrgsrt.setText("Patient Registration");
        mn_ptntrgsrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPateientRgsActionPerformed(evt);
            }
        });
        jMenu1.add(mn_ptntrgsrt);

        mn_ptntnchkout.setBackground(new java.awt.Color(107, 198, 198));
        mn_ptntnchkout.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        mn_ptntnchkout.setForeground(new java.awt.Color(255, 255, 255));
        mn_ptntnchkout.setText("Patient Checkout");
        mn_ptntnchkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPatncheoutActionPerformed(evt);
            }
        });
        jMenu1.add(mn_ptntnchkout);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Search");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        mn_ptntnrgssrch.setBackground(new java.awt.Color(107, 198, 198));
        mn_ptntnrgssrch.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        mn_ptntnrgssrch.setForeground(new java.awt.Color(255, 255, 255));
        mn_ptntnrgssrch.setText("Patient Registration Search");
        mn_ptntnrgssrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_ptntnrgssrchMenuPateientRgsActionPerformed(evt);
            }
        });
        jMenu2.add(mn_ptntnrgssrch);

        jMenuItem1.setBackground(new java.awt.Color(107, 198, 198));
        jMenuItem1.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Patient Checkout Search ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPateientRgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPateientRgsActionPerformed
        // TODO add your handling code here:

        frmPatientRegistration obPrg= new frmPatientRegistration();
        obPrg.setVisible(true);



    }//GEN-LAST:event_MenuPateientRgsActionPerformed

    private void menuRoomInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRoomInfoActionPerformed
        // TODO add your handling code here:
        frmRoomInfo obPrg= new frmRoomInfo();
        obPrg.setVisible(true);
        
    }//GEN-LAST:event_menuRoomInfoActionPerformed

    private void MenuPatncheoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPatncheoutActionPerformed
        // TODO add your handling code here:
        frmPatientCheckout obPrg= new frmPatientCheckout();
        obPrg.setVisible(true);
        
    }//GEN-LAST:event_MenuPatncheoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setBounds(250, 120, 900, 534 );
        
    }//GEN-LAST:event_formWindowOpened

    private void mn_ptntnrgssrchMenuPateientRgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_ptntnrgssrchMenuPateientRgsActionPerformed
        // TODO add your handling code here:
        frmPatntRgsSearch obPrg= new frmPatntRgsSearch();
        obPrg.setVisible(true);
    }//GEN-LAST:event_mn_ptntnrgssrchMenuPateientRgsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:]
        
        frmPatChkotSearch obchksr=new frmPatChkotSearch();
        obchksr.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mn_ptntnchkout;
    private javax.swing.JMenuItem mn_ptntnrgssrch;
    private javax.swing.JMenuItem mn_ptntrgsrt;
    private javax.swing.JMenuItem mn_rminfo;
    // End of variables declaration//GEN-END:variables

}
