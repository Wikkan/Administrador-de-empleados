package login;

import conexion.Conexion;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import regular.Regular;
import admin.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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
        pContrasena = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(pContrasena))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (pContrasena.getText().isEmpty() || tfUsuario.getText().isEmpty())
        {
            System.out.println("Ingrese un usuario y contraseña");
        }else
        {
            Boolean found = false;
            Boolean admin = false;
            Usuario u = new Usuario();
            u.setUsuario(tfUsuario.getText());
            u.setContraseña(pContrasena.getText());
            
            try {
                Conexion db = new Conexion();
                // Crear conexion
                Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
                // Crear declaracion
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario WHERE nombreUsuario=? AND contraseña=MD5(?)");
                stmt.setString(1, u.getUsuario());
                stmt.setString(2, u.getContraseña());
                // Ejecutar SQL
                ResultSet rs = stmt.executeQuery();
                
                if (rs.next())
                {
                    if (rs.getInt("administrador") == 1) admin = true;
                    found = true;
                }
                con.close();
                    
            }
            catch (Exception e){
                //e.printStackTrace();
                System.out.println("No se logro conectar con el servidor, contacte al administrador");
            }
            if (found)
            {
                if (admin)
                {
                    regular = new Regular(listener);
                    regular.setVisible(true);
                    
                    //administrador = new Administrador(listener);
                    //administrador.setVisible(true);
                }else
                {
                    regular = new Regular(listener);
                    regular.setVisible(true);
                }
                setVisible(false);
                
				//
            }else
            {
                System.out.append("Usuario o contraseña incorrecta");
            }
            
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField pContrasena;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
