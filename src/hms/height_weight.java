/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hms;

/**
 *
 * @author Asadujjaman(181311066)
 */
public class height_weight extends javax.swing.JFrame {

    /** Creates new form height_weight */
    public height_weight() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Exit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("<html>\n<pre>\nHeight\t                                      Weight<br>\n \t       Normal\t                      Overweight\t                    Obese     <br> <br>\n4' 10\"\t    91 to 118 lbs.\t            119 to 142 lbs.\t                  143 to 186 lbs.<br>\n4' 11\"\t    94 to 123 lbs.\t            124 to 147 lbs.\t                  148 to 193 lbs.<br>\n5'\t    97 to 127 lbs.\t            128 to 152 lbs.\t                  153 to 199 lbs.<br>\n5' 1\"\t   100 to 131 lbs.\t            132 to 157 lbs.\t                  158 to 206 lbs.<br>\n5' 2\"\t   104 to 135 lbs.\t            136 to 163 lbs.\t                  164 to 213 lbs.<br>\n5' 3\"\t   107 to 140 lbs.\t            141 to 168 lbs.\t                  169 to 220 lbs.<br>\n5' 4\"\t   110 to 144 lbs.\t            145 to 173 lbs.\t                  174 to 227 lbs.<br>\n5' 5\"\t   114 to 149 lbs.\t            150 to 179 lbs.\t                  180 to 234 lbs.<br>\n5' 6\"\t   118 to 154 lbs.\t            155 to 185 lbs.\t                  186 to 241 lbs.<br>\n5' 7\"\t   121 to 158 lbs.\t            159 to 190 lbs.\t                  191 to 249 lbs.<br>\n5' 8\"\t   125 to 163 lbs.\t            164 to 196 lbs.\t                  197 to 256 lbs.<br>\n5' 9\"\t   128 to 168 lbs.\t            169 to 202 lbs.\t                  203 to 263 lbs.<br>\n5' 10\"\t   132 to 173 lbs.\t            174 to 208 lbs.\t                  209 to 271 lbs.<br>\n5' 11\"\t   136 to 178 lbs.\t            179 to 214 lbs.\t                  215 to 279 lbs.<br>\n6'\t   140 to 183 lbs.\t            184 to 220 lbs.\t                  221 to 287 lbs.<br>\n6' 1\"\t   144 to 188 lbs.\t            189 to 226 lbs.\t                  227 to 295 lbs.<br>\n6' 2\"\t   148 to 193 lbs.\t            194 to 232 lbs.\t                  233 to 303 lbs.<br>\n6' 3\"\t   152 to 199 lbs.\t            200 to 239 lbs.\t                  240 to 311 lbs.<br>\n6' 4\"\t   156 to 204 lbs.\t            205 to 245 lbs.\t                  246 to 320 lbs.<br>\nBMI\t    19 to 24\t                       25 to 29\t                              30 to 39<br></pre>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(height_weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(height_weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(height_weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(height_weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new height_weight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
