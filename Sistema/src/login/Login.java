package login;

import regular.Regular;
import admin.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends javax.swing.JFrame {
    
    private ActionListener listener = new listener();
    private Regular regular;
    private Administrador administrador;
    
    private class listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object objeto = e.getActionCommand();
            if(objeto.equals("Cerrar")){setVisible(true);}
        }
    }
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsuario = new javax.swing.JTextField();
        rbAdministrador = new javax.swing.JRadioButton();
        pfContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1024, 736));

        rbAdministrador.setText("administrador");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(btnIngresar))
                    .addComponent(tfUsuario)
                    .addComponent(pfContraseña))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAdministrador)
                    .addComponent(btnIngresar))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        if(!tfUsuario.getText().equals("") && !pfContraseña.getText().equals("")) {
            if(!rbAdministrador.isSelected()) {
                regular = new Regular(listener);
                regular.setVisible(true);
            } else {
                administrador = new Administrador(listener);
                administrador.setVisible(true);
            }
            setVisible(false);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
