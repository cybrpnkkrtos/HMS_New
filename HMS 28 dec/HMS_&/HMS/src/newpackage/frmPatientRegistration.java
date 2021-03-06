package newpackage;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frm_PatientRegistration.java
 *
 * Created on May 3, 2017, 11:49:54 AM
 */

/**
 *
 * @author PC 20
 */
public class frmPatientRegistration extends javax.swing.JFrame {

    /** Creates new form frm_PatientRegistration */
    public frmPatientRegistration() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t_rgid = new javax.swing.JTextField();
        t_dt = new javax.swing.JTextField();
        t_pid = new javax.swing.JTextField();
        t_nm = new javax.swing.JTextField();
        t_age = new javax.swing.JTextField();
        t_cno = new javax.swing.JTextField();
        t_dis = new javax.swing.JTextField();
        t_stsdis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_ad = new javax.swing.JTextArea();
        cmb_rmtp = new javax.swing.JComboBox();
        rd_ml = new javax.swing.JRadioButton();
        rd_fml = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        cmb_rmno = new javax.swing.JComboBox();
        cmb_rmtyp = new javax.swing.JComboBox();
        t_pri = new javax.swing.JTextField();
        b_up = new javax.swing.JButton();
        b_new = new javax.swing.JButton();
        b_sv = new javax.swing.JButton();
        b_prv = new javax.swing.JButton();
        b_frs = new javax.swing.JButton();
        b_lst = new javax.swing.JButton();
        b_nxt = new javax.swing.JButton();
        b_dlt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 32));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Registration");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel2.setText("Registration ID");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel4.setText("Patient ID");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel7.setText("Age");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel9.setText("Contact No.");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel10.setText("Status of Disease");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel11.setText("Disease");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel12.setText("Room Type");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel13.setText("Room No.");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel14.setText("Price");

        t_ad.setColumns(20);
        t_ad.setRows(5);
        jScrollPane1.setViewportView(t_ad);

        cmb_rmtp.setEditable(true);
        cmb_rmtp.setFont(new java.awt.Font("Century Gothic", 1, 14));
        cmb_rmtp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Medium", "VIP" }));

        rd_ml.setFont(new java.awt.Font("Century Gothic", 1, 18));
        rd_ml.setText("Male");

        rd_fml.setFont(new java.awt.Font("Century Gothic", 1, 18));
        rd_fml.setText("Female");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12));
        jLabel15.setText("(YYYY-MM-DD)");

        cmb_rmno.setFont(new java.awt.Font("Century Gothic", 1, 14));
        cmb_rmno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "101", "102", "103", "104" }));

        cmb_rmtyp.setFont(new java.awt.Font("Century Gothic", 1, 14));
        cmb_rmtyp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Medium", "VIP" }));

        b_up.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_up.setText("Update");
        b_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_upActionPerformed(evt);
            }
        });

        b_new.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_new.setText("New");
        b_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_newActionPerformed(evt);
            }
        });

        b_sv.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_sv.setText("Save");
        b_sv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_svActionPerformed(evt);
            }
        });

        b_prv.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_prv.setText("<<");
        b_prv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_prvActionPerformed(evt);
            }
        });

        b_frs.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_frs.setText("First");
        b_frs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_frsActionPerformed(evt);
            }
        });

        b_lst.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_lst.setText("Last");
        b_lst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lstActionPerformed(evt);
            }
        });

        b_nxt.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_nxt.setText(">>");
        b_nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nxtActionPerformed(evt);
            }
        });

        b_dlt.setFont(new java.awt.Font("Century Gothic", 1, 16));
        b_dlt.setText("Delete");
        b_dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(jLabel15))
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t_cno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(t_rgid, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(t_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(t_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(118, 118, 118)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel13)
                                                                    .addComponent(jLabel14)
                                                                    .addComponent(jLabel11)
                                                                    .addComponent(jLabel10))
                                                                .addGap(26, 26, 26))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(b_new)
                                                                    .addComponent(jLabel12))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                                .addComponent(b_sv)
                                                                .addGap(20, 20, 20))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(t_age, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                                        .addComponent(b_frs)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                                        .addComponent(b_prv)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addGap(6, 6, 6)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(cmb_rmno, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cmb_rmtyp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(t_stsdis, javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(t_dis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(t_pri, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmb_rmtp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(b_up)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(b_dlt)
                                                                .addGap(18, 18, 18))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(b_nxt)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(b_lst))))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(rd_ml)
                                        .addGap(50, 50, 50)
                                        .addComponent(rd_fml))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cmb_rmtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(t_rgid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(t_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(t_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(t_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(rd_ml)
                                    .addComponent(rd_fml))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(t_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_dlt)
                                    .addComponent(b_new)
                                    .addComponent(b_sv)
                                    .addComponent(b_up)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(t_dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(t_stsdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cmb_rmno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cmb_rmtyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(t_pri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(t_cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_frs)
                                    .addComponent(b_prv)
                                    .addComponent(b_nxt)
                                    .addComponent(b_lst))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con=null;
Statement stmt=null;
String dr="java.sql.Driver";
String url="jdbc:mysql://localhost:3306/HMS";
String usr="root";
String pwd="a";
String qry="";
ResultSet rs=null;
    private void b_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_newActionPerformed
        // TODO add your handling code here:
        t_rgid.setText("");
        t_dt.setText("");
        t_pid.setText("");
        t_nm.setText("");
        t_age.setText("");
        t_ad.setText("");
        t_cno.setText("");
        t_dis.setText("");
        t_stsdis.setText("");
        t_pri.setText("");
        buttonGroup1.clearSelection();
        

    }//GEN-LAST:event_b_newActionPerformed

    private void b_svActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_svActionPerformed
        // TODO add your handling code here:
  try{

//            qry="insert into stud_record values("+ tid.getText() +" , '"+tnm.getText()+"' ,'"+tcls.getText()+"' )";
             stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(rootPane,"saved record ");
        }catch(Exception e){JOptionPane.showMessageDialog(rootPane,"falied"+"\n"+ e);}

//        tnm.setText("");
//        tcls.setText("");
//        tid.setText("");

        
    }//GEN-LAST:event_b_svActionPerformed

    private void b_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_upActionPerformed
        // TODO add your handling code here:

        try{

//        qry="update stud_record set name='"+tnm.getText()+"',class='"+tcls.getText()+"' where id="+tid.getText()+"";
           stmt.executeUpdate(qry);
        JOptionPane.showMessageDialog(rootPane,"record updated");}
        catch(Exception e){JOptionPane.showMessageDialog(rootPane,"falied"+"\n"+ e);}

//           tnm.setText("");
//           tcls.setText("");
//        tid.setText("");
    }//GEN-LAST:event_b_upActionPerformed

    private void b_dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dltActionPerformed
        // TODO add your handling code here:

       try{


//        qry="delete from stud_record where id="+tid.getText();
        stmt.executeUpdate(qry);
         JOptionPane.showMessageDialog(rootPane,"record deleted");}
        catch(Exception e){JOptionPane.showMessageDialog(rootPane,"falied"+"\n"+ e);}

//          tnm.setText("");
//           tcls.setText("");
//        tid.setText("");

         
    }//GEN-LAST:event_b_dltActionPerformed

    private void b_frsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_frsActionPerformed
        // TODO add your handling code here:


        try{  rs.first();
//        tid.setText(rs.getInt("id")+"");
//        tnm.setText(rs.getString("name"));
//        tcls.setText(rs.getString("class"));

        }catch(Exception e){}
    }//GEN-LAST:event_b_frsActionPerformed

    private void b_prvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_prvActionPerformed
        // TODO add your handling code here:\

          try{  rs.previous();
//        tid.setText(rs.getInt("id")+"");
//        tnm.setText(rs.getString("name"));
//        tcls.setText(rs.getString("class"));

        }catch(Exception e){}
    }//GEN-LAST:event_b_prvActionPerformed

    private void b_nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nxtActionPerformed
        // TODO add your handling code here:

           try{  rs.next();
//        tid.setText(rs.getInt("id")+"");
//        tnm.setText(rs.getString("name"));
//        tcls.setText(rs.getString("class"));

        }catch(Exception e){}
    }//GEN-LAST:event_b_nxtActionPerformed

    private void b_lstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lstActionPerformed
        // TODO add your handling code here:

           try{  rs.last();
//        tid.setText(rs.getInt("id")+"");
//        tnm.setText(rs.getString("name"));
//        tcls.setText(rs.getString("class"));

        }catch(Exception e){}
    }//GEN-LAST:event_b_lstActionPerformed



    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPatientRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_dlt;
    private javax.swing.JButton b_frs;
    private javax.swing.JButton b_lst;
    private javax.swing.JButton b_new;
    private javax.swing.JButton b_nxt;
    private javax.swing.JButton b_prv;
    private javax.swing.JButton b_sv;
    private javax.swing.JButton b_up;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_rmno;
    private javax.swing.JComboBox cmb_rmtp;
    private javax.swing.JComboBox cmb_rmtyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd_fml;
    private javax.swing.JRadioButton rd_ml;
    private javax.swing.JTextArea t_ad;
    private javax.swing.JTextField t_age;
    private javax.swing.JTextField t_cno;
    private javax.swing.JTextField t_dis;
    private javax.swing.JTextField t_dt;
    private javax.swing.JTextField t_nm;
    private javax.swing.JTextField t_pid;
    private javax.swing.JTextField t_pri;
    private javax.swing.JTextField t_rgid;
    private javax.swing.JTextField t_stsdis;
    // End of variables declaration//GEN-END:variables

}
