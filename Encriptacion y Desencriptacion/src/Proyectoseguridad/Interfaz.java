/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyectoseguridad;

import javax.swing.JOptionPane;

/**
 *
 * @author eugen
 */
public class Interfaz extends javax.swing.JFrame {

    Encriptado proceso = new Encriptado();
    Desencriptado proceso2 = new Desencriptado();
    Limpiar limpiacampos = new Limpiar();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        btn_desencriptar = new javax.swing.JButton();
        btn_encodefiles = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logotipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_encriptar = new javax.swing.JButton();
        Cadenadecoded = new javax.swing.JTextField();
        CadenaPlana = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        Cadenaencriptada = new javax.swing.JTextField();
        Llave_encrip = new javax.swing.JTextField();
        btn_cargarllave = new javax.swing.JButton();
        btn_cargarcadena = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        btn_desencriptar.setBackground(new java.awt.Color(0, 153, 153));
        btn_desencriptar.setFont(new java.awt.Font("Roboto Slab Medium", 0, 12)); // NOI18N
        btn_desencriptar.setText("Desencriptar");
        btn_desencriptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desencriptarActionPerformed(evt);
            }
        });

        btn_encodefiles.setBackground(new java.awt.Color(0, 153, 153));
        btn_encodefiles.setFont(new java.awt.Font("Roboto Slab Medium", 0, 12)); // NOI18N
        btn_encodefiles.setText("Archivos");
        btn_encodefiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_encodefiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encodefilesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imageedit_1_9344314895.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logotipo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Roboto Slab ExtraBold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encriptación y Desencriptación");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btn_encriptar.setBackground(new java.awt.Color(0, 153, 153));
        btn_encriptar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btn_encriptar.setText("Encriptar");
        btn_encriptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encriptarActionPerformed(evt);
            }
        });

        Cadenadecoded.setFont(new java.awt.Font("Roboto Slab Light", 0, 12)); // NOI18N
        Cadenadecoded.setForeground(new java.awt.Color(0, 204, 51));

        CadenaPlana.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        CadenaPlana.setText("Ingresa la cadena a encriptar");

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 153));
        btn_limpiar.setFont(new java.awt.Font("Roboto Slab Medium", 0, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        Cadenaencriptada.setFont(new java.awt.Font("Roboto Slab Light", 0, 12)); // NOI18N
        Cadenaencriptada.setForeground(new java.awt.Color(204, 51, 0));

        Llave_encrip.setFont(new java.awt.Font("Roboto Slab Light", 0, 12)); // NOI18N
        Llave_encrip.setText("Ingresa la llave...");

        btn_cargarllave.setBackground(new java.awt.Color(0, 153, 153));
        btn_cargarllave.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btn_cargarllave.setText("Cargar Llave");
        btn_cargarllave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cargarllave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarllaveActionPerformed(evt);
            }
        });

        btn_cargarcadena.setBackground(new java.awt.Color(0, 153, 153));
        btn_cargarcadena.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btn_cargarcadena.setText("Cargar Cadena");
        btn_cargarcadena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cargarcadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarcadenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_encodefiles)
                        .addGap(205, 205, 205))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cargarllave)
                            .addComponent(btn_cargarcadena)
                            .addComponent(btn_desencriptar)
                            .addComponent(btn_encriptar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(Llave_encrip, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cadenaencriptada, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CadenaPlana, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cadenadecoded, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Llave_encrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargarllave))
                .addGap(15, 15, 15)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadenaPlana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargarcadena))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_encriptar)
                    .addComponent(Cadenaencriptada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_desencriptar)
                    .addComponent(Cadenadecoded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_encodefiles)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String contra = "";
    String cadena = "";
    String aux;

    private void btn_cargarllaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarllaveActionPerformed
        // TODO add your handling code here:
        contra = Llave_encrip.getText();
    }//GEN-LAST:event_btn_cargarllaveActionPerformed

    private void btn_cargarcadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarcadenaActionPerformed
        // TODO add your handling code here:
        cadena = CadenaPlana.getText();
    }//GEN-LAST:event_btn_cargarcadenaActionPerformed


    private void btn_encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encriptarActionPerformed
        // TODO add your handling code here:
        Cadenaencriptada.setText(proceso.encode(contra, cadena));
        JOptionPane.showMessageDialog(null, "Cadena Encriptada");
        aux = proceso.encode(contra, cadena);
    }//GEN-LAST:event_btn_encriptarActionPerformed

    private void btn_desencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desencriptarActionPerformed
        Cadenadecoded.setText(proceso2.decode(contra, aux));
        JOptionPane.showMessageDialog(null, "Cadena Desencriptada");
    }//GEN-LAST:event_btn_desencriptarActionPerformed

    private void btn_encodefilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encodefilesActionPerformed
        Archivos nuevaventana = new Archivos();
        nuevaventana.setVisible(true);
    }//GEN-LAST:event_btn_encodefilesActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiacampos.limpiar(PanelPrincipal);
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CadenaPlana;
    private javax.swing.JTextField Cadenadecoded;
    private javax.swing.JTextField Cadenaencriptada;
    private javax.swing.JTextField Llave_encrip;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btn_cargarcadena;
    private javax.swing.JButton btn_cargarllave;
    private javax.swing.JButton btn_desencriptar;
    private javax.swing.JButton btn_encodefiles;
    private javax.swing.JButton btn_encriptar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logotipo;
    // End of variables declaration//GEN-END:variables
}
