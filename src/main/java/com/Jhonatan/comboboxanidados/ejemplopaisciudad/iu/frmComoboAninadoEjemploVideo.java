package com.Jhonatan.comboboxanidados.ejemplopaisciudad.iu;

import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Logica.CiudadDao;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Logica.PaisDao;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.Ciudad;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.Pais;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;

public class frmComoboAninadoEjemploVideo extends javax.swing.JFrame {

    private PaisDao paisDao = new PaisDao();
    private CiudadDao ciudadDao = new CiudadDao();

    /*VARIAABLES NECESARIAS*/
    private Pais pais = new Pais();
    private Ciudad ciudad = new Ciudad();

    public frmComoboAninadoEjemploVideo() {
        initComponents();
        FlatMaterialLighterIJTheme.setup();
        this.setLocationRelativeTo(null);
        lblMensaje.setVisible(false);
        this.llenarComboxPais();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cbxPais = new javax.swing.JComboBox<>();
        cbxCiudad = new javax.swing.JComboBox<>();
        lblMensaje = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cbxPais.setFont(new java.awt.Font("Shruti", 0, 15)); // NOI18N
        cbxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPaisActionPerformed(evt);
            }
        });

        cbxCiudad.setFont(new java.awt.Font("Shruti", 0, 15)); // NOI18N
        cbxCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCiudadActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCargar.setText("Mostrar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(cbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jLabel1.setText("Pais");

        jLabel2.setText("Ciudad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPaisActionPerformed
        if (cbxPais.getSelectedIndex() > 0) {
            cbxCiudad.removeAllItems();
            int idPais;
            idPais = cbxPais.getItemAt(cbxPais.getSelectedIndex()).getIdPais();
            llenarComboxCiudad(idPais);
        } else {
            cbxCiudad.removeAllItems();
        }
    }//GEN-LAST:event_cbxPaisActionPerformed

    private void cbxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCiudadActionPerformed
        /**/
    }//GEN-LAST:event_cbxCiudadActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        String mensaje;
        if (cbxPais.getSelectedIndex() == 0) {
            mensaje = "DEBE SELECCIONAR UN PAIS";
            lblMensaje.setForeground(Color.red);
        } else if (cbxCiudad.getSelectedIndex() == 0) {
            mensaje = "DEBE SELECCIONAR UNA CIUDAD";
            lblMensaje.setForeground(Color.red);
        } else {
            mensaje = cbxPais.getSelectedItem() + " " + cbxCiudad.getSelectedItem();
            lblMensaje.setForeground(Color.green);
        }
        lblMensaje.setVisible(true);
        lblMensaje.setText(mensaje);
    }//GEN-LAST:event_btnCargarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComoboAninadoEjemploVideo().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<Ciudad> cbxCiudad;
    private javax.swing.JComboBox<Pais> cbxPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables

    private void llenarComboxPais() {
        pais.setNombre("=Seleccionar=");
        cbxPais.addItem(pais);
        paisDao.mostrarPais(cbxPais);
    }

    private void llenarComboxCiudad(int idPais) {
        ciudad.setNombre("=Seleccionar=");
        cbxCiudad.addItem(ciudad);
        ciudadDao.mostrarPais(cbxCiudad, idPais);
    }

}
