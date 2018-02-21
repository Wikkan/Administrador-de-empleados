package admin;

import java.awt.event.ActionListener;
import conexion.Conexion;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import usuario.Persona;
import usuario.Usuario;
import usuario.Usuario;

public class Administrador extends javax.swing.JFrame {
    
    private ActionListener listener;
    private Usuario usuario;
    
    public Administrador(ActionListener listener, Usuario usuario) {
        initComponents();
        this.listener = listener;
        this.usuario = usuario;
        
        pUsuarios.setVisible(false);
        pVacaciones.setVisible(false);
        pEditar.setVisible(false);
        tpUsuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        btnVacaciones = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        pUsuarios = new javax.swing.JPanel();
        tfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pAgregar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbPuestos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCuenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel11 = new javax.swing.JLabel();
        tfSueldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfContrasena = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfCasa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        tpUsuario = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstFamiliares = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstVacaciones = new javax.swing.JList();
        pVacaciones = new javax.swing.JPanel();
        btnSolicitud = new javax.swing.JButton();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        pEditar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDireccion = new javax.swing.JTextArea();
        tfTelefono = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        btnEditar.setText("Editar Información");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVacaciones.setText("Aprobar Vacaciones");
        btnVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacacionesActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.setActionCommand("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        pUsuarios.setPreferredSize(new java.awt.Dimension(1004, 590));

        btnBuscar.setText("Buscar Usuario");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Usuario");

        jLabel4.setText("Nombre");

        jLabel5.setText("Dirección");

        jLabel6.setText("Puesto");

        jLabel7.setText("Cédula");

        tfCedula.setToolTipText("");

        jLabel8.setText("Celular");

        jLabel9.setText("Cuenta");

        jLabel10.setText("Facha de nacimiento");

        jLabel11.setText("Sueldo");

        jLabel12.setText("Nombre de Usuario");

        jLabel13.setText("Contraseña");

        jLabel14.setText("Casa");

        jLabel15.setText("Correo");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAgregarLayout = new javax.swing.GroupLayout(pAgregar);
        pAgregar.setLayout(pAgregarLayout);
        pAgregarLayout.setHorizontalGroup(
            pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNombre))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDireccion))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pAgregarLayout.createSequentialGroup()
                                        .addGap(231, 231, 231)
                                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pAgregarLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfCedula))
                                            .addGroup(pAgregarLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfCel))))
                                    .addGroup(pAgregarLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pAgregarLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfContrasena))
                                            .addGroup(pAgregarLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfUsuario))
                                            .addGroup(pAgregarLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfSueldo))
                                            .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))))
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pAgregarLayout.setVerticalGroup(
            pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(tfCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jLabel1.setText("Puesto");

        jLabel2.setText("Dirección");

        jLabel3.setText("Sueldo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        tpUsuario.addTab("Información de Usuario", jPanel2);

        jScrollPane4.setViewportView(lstFamiliares);

        tpUsuario.addTab("Familiares", jScrollPane4);

        jScrollPane5.setViewportView(lstVacaciones);

        tpUsuario.addTab("Vacaciones", jScrollPane5);

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpUsuario)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pUsuariosLayout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                    .addContainerGap(12, Short.MAX_VALUE)
                    .addComponent(pAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpUsuario)
                .addContainerGap())
            .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                    .addContainerGap(83, Short.MAX_VALUE)
                    .addComponent(pAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pVacaciones.setPreferredSize(new java.awt.Dimension(1004, 590));

        btnSolicitud.setText("Solicitar Vacaciones");

        javax.swing.GroupLayout pVacacionesLayout = new javax.swing.GroupLayout(pVacaciones);
        pVacaciones.setLayout(pVacacionesLayout);
        pVacacionesLayout.setHorizontalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSolicitud)
                .addContainerGap(675, Short.MAX_VALUE))
        );
        pVacacionesLayout.setVerticalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitud))
                .addContainerGap(387, Short.MAX_VALUE))
        );

        pEditar.setPreferredSize(new java.awt.Dimension(1004, 590));

        taDireccion.setColumns(20);
        taDireccion.setRows(5);
        jScrollPane2.setViewportView(taDireccion);

        lblDireccion.setText("Dirección");

        lblTelefono.setText("Teléfono");

        lblCelular.setText("Celular");

        javax.swing.GroupLayout pEditarLayout = new javax.swing.GroupLayout(pEditar);
        pEditar.setLayout(pEditarLayout);
        pEditarLayout.setHorizontalGroup(
            pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEditarLayout.createSequentialGroup()
                .addGroup(pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(lblTelefono)
                    .addComponent(lblCelular))
                .addGap(27, 27, 27)
                .addGroup(pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pEditarLayout.createSequentialGroup()
                        .addGroup(pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pEditarLayout.setVerticalGroup(
            pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular))
                .addContainerGap(421, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 324, Short.MAX_VALUE)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(btnVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(pEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(pVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(pUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        btnCerrar.getAccessibleContext().setAccessibleName("Cerrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        pEditar.setVisible(true);
        pUsuarios.setVisible(false);
        pVacaciones.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacacionesActionPerformed
        pVacaciones.setVisible(true);
        pEditar.setVisible(false);
        pUsuarios.setVisible(false);
    }//GEN-LAST:event_btnVacacionesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        pUsuarios.setVisible(true);
        pEditar.setVisible(false);
        pVacaciones.setVisible(false);
        pAgregar.setVisible(false);
        tpUsuario.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        this.listener.actionPerformed(evt);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!tfBuscar.getText().equals("")){
            String nombreUsuario = "%" + tfBuscar.getText() + "%";
            Boolean found = false;
            Boolean except = false;

            Persona p = new Persona();

            try {
                Conexion db = new Conexion();
                // Crear conexion
                Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
                // Crear declaracion 
                PreparedStatement stmt = con.prepareStatement("SELECT p.*, pu.nombrePuesto FROM persona p INNER JOIN usuario u ON p.cedula = u.Persona_cedula INNER JOIN puesto pu ON pu.idPuesto = p.puesto WHERE u.nombreUsuario LIKE ?");
                stmt.setString(1, nombreUsuario);
                // Ejecutar SQL
                ResultSet rs = stmt.executeQuery();

                if (rs.next())
                {
                    p.setCedula(rs.getInt("cedula"));
                    p.setNumeroCuenta(rs.getInt("numeroCuenta"));
                    p.setPrimerNombre(rs.getString("primerNombre"));
                    p.setSegundoNombre(rs.getString("segundoNombre"));
                    p.setPrimerApellido(rs.getString("primerApellido"));
                    p.setSegundoApellido(rs.getString("segundoApellido"));
                    p.setDireccion(rs.getString("direccion"));
                    p.setNumeroCelular(rs.getInt("numeroCelular"));
                    p.setNumeroCasa(rs.getInt("numeroCasa"));
                    p.setCorreo(rs.getString("correo"));
                    p.setPuesto(rs.getString("nombrePuesto"));
                    p.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                    found = true;
                }
                con.close();

            }
            catch (Exception e){
                e.printStackTrace();
                except = true;
                System.out.println("No se logro conectar con el servidor, contacte al administrador");
            }

            if (found && !except)
            {
                lblNombre.setText(p.getPrimerNombre() + p.getSegundoNombre() + p.getPrimerApellido() + p.getSegundoApellido());
                lblPuesto.setText(p.getPuesto());
                lbDireccion.setText(p.getDireccion());
                tpUsuario.setVisible(true);
            }else if(!found && !except)
            {
                System.out.append("No se encontro el usuario: "+ nombreUsuario);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        pAgregar.setVisible(true);
        tpUsuario.setVisible(false);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Validar celdas vacias
        String nombre = tfNombre.getText();
        String[] partes = nombre.split(" ");
        if (partes.length == 3 || partes.length == 4)
        {
            // ok
        }
        //
        
        Boolean added = false;
        Boolean except = false;

        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion (conseguir id del puesto)
            PreparedStatement stmt = con.prepareStatement("SELECT idPuesto FROM puesto WHERE nombrePuesto=?");
            stmt.setString(1, String.valueOf(cbPuestos.getSelectedItem()));
            // Ejecutar SQL
            ResultSet rs = stmt.executeQuery();
            int idPuesto = rs.getInt("idPuesto");
            // Crear declaracion (insertar persona)
            stmt = con.prepareStatement("INSERT INTO persona (cedula, numeroCuenta, primerNombre, segundoNombre, primerApellido, segundoApellido, direccion, numeroCelular, numeroCasa, correo, puesto, fechaNacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, tfCedula.getText());
            stmt.setString(2, tfCuenta.getText());
            stmt.setString(3, partes[0]);
            if (partes.length == 3)
            {
                stmt.setString(4, "");
                stmt.setString(5, partes[1]);
                stmt.setString(6, partes[2]);
            }else
            {
                stmt.setString(4, partes[1]);
                stmt.setString(5, partes[2]);
                stmt.setString(6, partes[3]);
            }
            stmt.setString(7, tfDireccion.getText());
            stmt.setString(8, tfCel.getText());
            stmt.setString(9, tfCasa.getText());
            stmt.setString(10, jTextField1.getText());
            stmt.setString(11, String.valueOf(idPuesto));
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            stmt.setString(12, df.format(jCalendar1.getDate()));
            // Ejecutar SQL
            int rsn = stmt.executeUpdate();
            
            //Insertar usuario
            stmt = con.prepareStatement("INSERT INTO usuario (nombreUsuario, contraseña, Persona_cedula)" +
                                                           " VALUES (?, MD5(?), ?)");
            stmt.setString(1, tfUsuario.getText());
            stmt.setString(2, tfContrasena.getText());
            stmt.setString(3, tfCedula.getText());
            // Ejecutar SQL
            rsn = stmt.executeUpdate();
            
            if (rsn == 1)
            {
                added = true;
            }
            con.close();

        }
        catch (Exception e){
            //e.printStackTrace();
            except = true;
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }

        if (added && !except)
        {
            System.out.append("Se agrego el usuario: "+ tfUsuario.getText());
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSolicitud;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVacaciones;
    private javax.swing.JComboBox<String> cbPuestos;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JList lstFamiliares;
    private javax.swing.JList lstVacaciones;
    private javax.swing.JPanel pAgregar;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JPanel pVacaciones;
    private javax.swing.JTextArea taDireccion;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCasa;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCel;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfContrasena;
    private javax.swing.JTextField tfCuenta;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfSueldo;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JTabbedPane tpUsuario;
    // End of variables declaration//GEN-END:variables
}