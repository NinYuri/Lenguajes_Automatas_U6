package ValidarCadena;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cadena extends javax.swing.JFrame 
{
    FondoPanel fondo = new FondoPanel();
    int estAceptacion = 2; 
    String combinaciones[] = {"$,$", "a,$", "a,a", "b,a"};
            
    public Cadena() 
    {
        setContentPane(fondo);
        initComponents();
        initComponents();
        setResizable(false);
        setSize(790,380);
        setLocationRelativeTo(null);
    }

    private void IDK() {
        String acciones[][] = 
        {
            {"2,nada", "0,apilar", "0,apilar", "1,nada"}, //Estado 0
            {"", "", "", "0,desapilar"} //Estado 1
        };
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCadena = new javax.swing.JTextField();
        btnValidar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCadena.setBackground(new java.awt.Color(96, 200, 180, 50));
        txtCadena.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        txtCadena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txtCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 540, 30));

        btnValidar.setBackground(new java.awt.Color(0, 153, 153));
        btnValidar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnValidar.setText("Validar Cadena");
        btnValidar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidar.setOpaque(true);
        btnValidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidarMouseClicked(evt);
            }
        });
        getContentPane().add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 270, 40));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel7.setText("Ingrese la cadena a validar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setText("L = { a b   c  | n≥0, m≥1 }");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel8.setText("n");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 96, -1, -1));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel9.setText("n+m");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 96, -1, -1));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel10.setText("m");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 96, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseClicked
        
    }//GEN-LAST:event_btnValidarMouseClicked

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
            java.util.logging.Logger.getLogger(Cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnValidar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCadena;
    // End of variables declaration//GEN-END:variables
}

class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/img/Fondos.jpeg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }