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
import java.util.ArrayList;
import java.util.List;
import usuario.Persona;
import usuario.Usuario;
import usuario.Usuario;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class Administrador extends javax.swing.JFrame {
    
    private ActionListener listener;
    private Usuario usuario;
    private static DefaultListModel modeloFamiliares = new DefaultListModel();
    private static DefaultListModel modeloHistorialVacaciones = new DefaultListModel();
    
    public Administrador(ActionListener listener, Usuario usuario) {
        initComponents();
        this.listener = listener;
        this.usuario = usuario;
        cargarUsuario();
        pUsuarios.setVisible(false);
        pVacaciones.setVisible(false);
        pPuesto.setVisible(false);
        tpUsuario.setVisible(false);
        modeloFamiliares.clear();
        modeloHistorialVacaciones.clear();
        
        infoNombreCompleto.setText(usuario.getPrimerNombre()+" "+
                                   usuario.getSegundoNombre()+" "+
                                   usuario.getPrimerApellido()+" "+
                                   usuario.getSegundoApellido());
        infoPuesto.setText(usuario.getPuesto());
        infoDireccion.setText(usuario.getDireccion());
        infoCedula.setText(""+usuario.getCedula());
        infoCorreo.setText(usuario.getCorreo());
        infoCasa.setText(""+usuario.getNumeroCasa());
        infoCelular.setText(""+usuario.getNumeroCelular());
        infoNacimiento.setText(usuario.getFechaNacimiento().toString());
    }
    
    private void cargarUsuario()
    {
        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion 
            PreparedStatement stmt = con.prepareStatement("SELECT p.*, pu.nombrePuesto FROM persona p INNER JOIN usuario u ON p.cedula = u.Persona_cedula INNER JOIN puesto pu ON pu.idPuesto = p.puesto WHERE u.nombreUsuario LIKE ?");
            stmt.setString(1, usuario.getUsuario());
            // Ejecutar SQL
            ResultSet rs = stmt.executeQuery();

            if (rs.next())
            {
                usuario.setCedula(rs.getInt("cedula"));
                usuario.setNumeroCuenta(rs.getInt("numeroCuenta"));
                usuario.setPrimerNombre(rs.getString("primerNombre"));
                usuario.setSegundoNombre(rs.getString("segundoNombre"));
                usuario.setPrimerApellido(rs.getString("primerApellido"));
                usuario.setSegundoApellido(rs.getString("segundoApellido"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setNumeroCelular(rs.getInt("numeroCelular"));
                usuario.setNumeroCasa(rs.getInt("numeroCasa"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPuesto(rs.getString("nombrePuesto"));
                usuario.setFechaNacimiento(rs.getDate("fechaNacimiento"));
            }
            con.close();

        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregarPuesto = new javax.swing.JButton();
        btnVacaciones = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        pUsuarios = new javax.swing.JPanel();
        tfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pAgregar = new javax.swing.JPanel();
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
        jLabel25 = new javax.swing.JLabel();
        tfPrimerNombre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tfSegundoNombre = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfPrimerApellido = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfSegundoApellido = new javax.swing.JTextField();
        tpUsuario = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstVacaciones = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        tFamiliares = new javax.swing.JTable();
        pVacaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVacaciones = new javax.swing.JTable();
        btnCompleta = new javax.swing.JButton();
        pPuesto = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        tfPuesto = new javax.swing.JTextField();
        btnPuesto = new javax.swing.JButton();
        pInfo = new javax.swing.JPanel();
        infoNombreCompleto = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        infoPuesto = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        infoDireccion = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        infoCorreo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        infoCasa = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        infoCelular = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        infoCedula = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        infoNacimiento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        btnAgregarPuesto.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnAgregarPuesto.setForeground(new java.awt.Color(255, 204, 51));
        btnAgregarPuesto.setText("Agregar Puesto");
        btnAgregarPuesto.setBorderPainted(false);
        btnAgregarPuesto.setSelected(true);
        btnAgregarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPuestoActionPerformed(evt);
            }
        });

        btnVacaciones.setBackground(new java.awt.Color(0, 0, 0));
        btnVacaciones.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnVacaciones.setForeground(new java.awt.Color(255, 204, 51));
        btnVacaciones.setText("Aprobar Vacaciones");
        btnVacaciones.setBorderPainted(false);
        btnVacaciones.setSelected(true);
        btnVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacacionesActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 204, 51));
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.setActionCommand("Cerrar");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setSelected(true);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 204, 51));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setSelected(true);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnInfo.setBackground(new java.awt.Color(0, 0, 0));
        btnInfo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 204, 51));
        btnInfo.setText("Información Personal"); // NOI18N
        btnInfo.setBorderPainted(false);
        btnInfo.setSelected(true);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        pUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        pUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        pUsuarios.setPreferredSize(new java.awt.Dimension(800, 450));

        tfBuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 204, 51));
        btnBuscar.setText("Buscar Usuario");
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(255, 204, 51));
        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.setBorderPainted(false);
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 204, 51));
        btnEliminar.setText("Eliminar Usuario");
        btnEliminar.setBorderPainted(false);

        pAgregar.setBackground(new java.awt.Color(255, 204, 0));
        pAgregar.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Dirección");

        tfDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Puesto");

        cbPuestos.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel7.setText("Cédula");

        tfCedula.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        tfCedula.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel8.setText("Celular");

        tfCel.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel9.setText("Cuenta");

        tfCuenta.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Facha de nacimiento");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel11.setText("Sueldo");

        tfSueldo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel12.setText("Nombre de Usuario");

        tfUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel13.setText("Contraseña");

        tfContrasena.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel14.setText("Casa");

        tfCasa.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel15.setText("Correo");

        jTextField1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel25.setText("Primer Nombre");

        tfPrimerNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel26.setText("Segundo Nombre");

        tfSegundoNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel27.setText("Primer Apellido");

        tfPrimerApellido.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel28.setText("Segundo Apellido");

        tfSegundoApellido.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        javax.swing.GroupLayout pAgregarLayout = new javax.swing.GroupLayout(pAgregar);
        pAgregar.setLayout(pAgregarLayout);
        pAgregarLayout.setHorizontalGroup(
            pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrimerNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregar))
                        .addGap(24, 24, 24)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCedula))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfContrasena))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfUsuario))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfDireccion))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        pAgregarLayout.setVerticalGroup(
            pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAgregarLayout.createSequentialGroup()
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(tfPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfCel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(tfCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar))
                    .addGroup(pAgregarLayout.createSequentialGroup()
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(tfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tpUsuario.setBackground(new java.awt.Color(255, 204, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        lblNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Puesto");

        lblPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dirección");

        lbDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sueldo");

        lblSueldo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

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
                        .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(78, Short.MAX_VALUE))
        );

        tpUsuario.addTab("Información de Usuario", jPanel2);

        jScrollPane5.setBackground(new java.awt.Color(255, 204, 0));

        lstVacaciones.setBackground(new java.awt.Color(255, 204, 0));
        lstVacaciones.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lstVacaciones.setPreferredSize(new java.awt.Dimension(275, 147));
        jScrollPane5.setViewportView(lstVacaciones);

        tpUsuario.addTab("Vacaciones", jScrollPane5);

        tFamiliares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tFamiliares);

        tpUsuario.addTab("tab4", jScrollPane2);

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUsuariosLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pUsuariosLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(tpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pUsuariosLayout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pUsuariosLayout.createSequentialGroup()
                    .addComponent(pAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                    .addGap(0, 79, Short.MAX_VALUE)
                    .addComponent(pAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pVacaciones.setBackground(new java.awt.Color(255, 204, 0));
        pVacaciones.setPreferredSize(new java.awt.Dimension(800, 450));

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 0));

        tbVacaciones.setBackground(new java.awt.Color(255, 204, 0));
        tbVacaciones.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        tbVacaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cédula", "Empleado", "", "Fecha", "Aceptar Solicitud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVacaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbVacaciones);

        btnCompleta.setBackground(new java.awt.Color(0, 0, 0));
        btnCompleta.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnCompleta.setForeground(new java.awt.Color(255, 204, 0));
        btnCompleta.setText("Completar Solicitud");
        btnCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pVacacionesLayout = new javax.swing.GroupLayout(pVacaciones);
        pVacaciones.setLayout(pVacacionesLayout);
        pVacacionesLayout.setHorizontalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addGroup(pVacacionesLayout.createSequentialGroup()
                        .addComponent(btnCompleta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pVacacionesLayout.setVerticalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompleta)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pPuesto.setBackground(new java.awt.Color(255, 204, 0));
        pPuesto.setPreferredSize(new java.awt.Dimension(800, 450));

        lbl.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        lbl.setText("Nombre del Puesto");

        tfPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N

        btnPuesto.setBackground(new java.awt.Color(0, 0, 0));
        btnPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnPuesto.setForeground(new java.awt.Color(255, 204, 0));
        btnPuesto.setText("Agregar Puesto");
        btnPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPuestoLayout = new javax.swing.GroupLayout(pPuesto);
        pPuesto.setLayout(pPuestoLayout);
        pPuestoLayout.setHorizontalGroup(
            pPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl)
                    .addGroup(pPuestoLayout.createSequentialGroup()
                        .addComponent(tfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnPuesto)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        pPuestoLayout.setVerticalGroup(
            pPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPuestoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl)
                .addGap(18, 18, 18)
                .addGroup(pPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPuesto)
                    .addComponent(tfPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pInfo.setBackground(new java.awt.Color(255, 204, 0));
        pInfo.setPreferredSize(new java.awt.Dimension(800, 450));

        infoNombreCompleto.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel16.setText("Nombre Completo");

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel17.setText("Puesto");

        infoPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel18.setText("Dirección");

        infoDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel20.setText("Correo");

        infoCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel19.setText("Casa");

        infoCasa.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel21.setText("Celular");

        infoCelular.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel22.setText("Cédula");

        infoCedula.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel24.setText("Fecha de Nacimiento");

        infoNacimiento.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(infoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(infoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)))
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(infoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(infoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(255, 255, 255)
                                .addComponent(jLabel24))
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(infoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(infoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17)
                            .addComponent(infoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(8, 8, 8))))
                    .addComponent(jLabel18))
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pInfoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19))
                                    .addGroup(pInfoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(infoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarPuesto)
                .addGap(18, 18, 18)
                .addComponent(btnVacaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addComponent(pPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(pPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(139, Short.MAX_VALUE)
                    .addComponent(pVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(94, Short.MAX_VALUE)
                    .addComponent(pUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(173, Short.MAX_VALUE)
                    .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrar.getAccessibleContext().setAccessibleName("Cerrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPuestoActionPerformed
        pPuesto.setVisible(true);
        pUsuarios.setVisible(false);
        pVacaciones.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnAgregarPuestoActionPerformed
    
    private void cargarSolicitudesVacaciones()
    {
        DefaultTableModel modeloVacaciones = (DefaultTableModel) tbVacaciones.getModel();
        int rowCount = modeloVacaciones.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modeloVacaciones.removeRow(i);
        }
        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion 
            PreparedStatement stmt = con.prepareStatement("SELECT p.*, v.fecha, v.idVacacion FROM vacaciones v INNER JOIN usuario u ON u.idUsuario = v.idUsuario INNER JOIN persona p ON p.cedula = u.Persona_cedula WHERE v.aprobada = 0");
            // Ejecutar SQL
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
            {
                String nombre = rs.getString("primerNombre") + " " + rs.getString("segundoNombre") + " " + rs.getString("primerApellido") + " " + rs.getString("segundoApellido");
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                String fecha = df.format(rs.getDate("fecha"));
                //Integer.toString(rs.getInt("idVacacion"))
                String[] fila = {Integer.toString(rs.getInt("idVacacion")), 
                                 Integer.toString(rs.getInt("cedula")), nombre, "", fecha};
                modeloVacaciones.addRow(fila);
            }
            con.close();

        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }
        for(int i=0; i<tbVacaciones.getRowCount(); i++){
            tbVacaciones.setValueAt(false, i, 3);
        }
    }
    
    private void btnVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacacionesActionPerformed
        cargarSolicitudesVacaciones();
        pVacaciones.setVisible(true);
        pPuesto.setVisible(false);
        pUsuarios.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnVacacionesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        pUsuarios.setVisible(true);
        pPuesto.setVisible(false);
        pVacaciones.setVisible(false);
        pAgregar.setVisible(false);
        tpUsuario.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        this.listener.actionPerformed(evt);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modeloVacaciones = (DefaultTableModel) tFamiliares.getModel();
        if(!tfBuscar.getText().equals("")){
            String nombreUsuario = "%" + tfBuscar.getText() + "%";
            Boolean found = false;
            Boolean except = false;
            Persona p = new Persona();
            ArrayList<Persona> familia = new ArrayList<Persona>();
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
                
                if (found)
                {
                    // Crear declaracion 
                    stmt = con.prepareStatement("SELECT p.*, pu.nombrePuesto FROM persona p " +
                            "INNER JOIN ( " +
                            "SELECT cedula1 AS cedula FROM familiares WHERE cedula2 = ? " +
                            "UNION (SELECT cedula2 AS cedula FROM familiares WHERE cedula1 = ?) " +
                            ") familia " +
                            "ON p.cedula = familia.cedula " +
                            "INNER JOIN puesto pu ON pu.idPuesto = p.puesto");
                    stmt.setInt(1, p.getCedula());
                    stmt.setInt(2, p.getCedula());
                    // Ejecutar SQL
                    rs = stmt.executeQuery();
                    while (rs.next())
                    {
                        Persona familiar = new Persona();
                        familiar.setCedula(rs.getInt("cedula"));
                        familiar.setNumeroCuenta(rs.getInt("numeroCuenta"));
                        familiar.setPrimerNombre(rs.getString("primerNombre"));
                        familiar.setSegundoNombre(rs.getString("segundoNombre"));
                        familiar.setPrimerApellido(rs.getString("primerApellido"));
                        familiar.setSegundoApellido(rs.getString("segundoApellido"));
                        familiar.setDireccion(rs.getString("direccion"));
                        familiar.setNumeroCelular(rs.getInt("numeroCelular"));
                        familiar.setNumeroCasa(rs.getInt("numeroCasa"));
                        familiar.setCorreo(rs.getString("correo"));
                        familiar.setPuesto(rs.getString("nombrePuesto"));
                        familiar.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                        familia.add(familiar);
                    }
                }
                
                con.close();

            }
            catch (Exception e){
                //e.printStackTrace();
                except = true;
                System.out.println("No se logro conectar con el servidor, contacte al administrador");
            }

            if (found && !except)
            {
                lblNombre.setText(p.getPrimerNombre() + " " + p.getSegundoNombre() + " " + p.getPrimerApellido() + " " + p.getSegundoApellido());
                lblPuesto.setText(p.getPuesto());
                lbDireccion.setText(p.getDireccion());
                
                for(int i=0; i<familia.size(); i++)
                {
                    String nombre = familia.get(i).getPrimerNombre() + " " + familia.get(i).getSegundoNombre() + " " + familia.get(i).getPrimerApellido() + " " + familia.get(i).getSegundoApellido();
                    int cedula = familia.get(i).getCedula();
                    //Integer.toString(rs.getInt("idVacacion"))
                    String[] fila = {nombre, Integer.toString(cedula)};
                    modeloVacaciones.addRow(fila);
                }
                
                tpUsuario.setVisible(true);
            }else if(!found && !except)
            {
                System.out.append("No se encontro el usuario: "+ nombreUsuario);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        cbPuestos.removeAllItems();
        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion 
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM puesto");
            // Ejecutar SQL
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
            {
                cbPuestos.addItem(rs.getString("nombrePuesto"));
            }
            con.close();

        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }
        
        pAgregar.setVisible(true);
        tpUsuario.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Validar celdas vacias
        String primerNombre = tfPrimerNombre.getText();
        String segundoNombre = tfSegundoNombre.getText();
        String primerApellido = tfPrimerApellido.getText();
        String segundoApellido = tfSegundoApellido.getText();
        
       if (primerNombre.equals("") || primerApellido.equals("") || segundoApellido.equals(""))
       {
           System.out.println("Campos en el nombre vacios");
       }
        
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
            int idPuesto = 0;
            if (rs.next())
            {
                idPuesto = rs.getInt("idPuesto");
            }
            // Crear declaracion (insertar persona)
            stmt = con.prepareStatement("INSERT INTO persona (cedula, numeroCuenta, primerNombre, segundoNombre, primerApellido, segundoApellido, direccion, numeroCelular, numeroCasa, correo, puesto, fechaNacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, tfCedula.getText());
            stmt.setString(2, tfCuenta.getText());
            stmt.setString(3, primerNombre);
            stmt.setString(4,(segundoNombre.equals("") ? "" : segundoNombre));
            stmt.setString(5, primerApellido);
            stmt.setString(6, segundoApellido);
            stmt.setString(7, tfDireccion.getText());
            stmt.setString(8, tfCel.getText());
            stmt.setString(9, tfCasa.getText());
            stmt.setString(10, jTextField1.getText());
            stmt.setString(11, String.valueOf(idPuesto));
            DateFormat df = new SimpleDateFormat("yyy/MM/dd");
            stmt.setString(12, df.format(jCalendar1.getDate()));
            // Ejecutar SQL
            int rsn = stmt.executeUpdate();
            
            //Insertar usuario
            stmt = con.prepareStatement("INSERT INTO usuario (nombreUsuario, contraseña, Persona_cedula, administrador) VALUES (?, MD5(?), ?, 0)");
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

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ///
    }                                            

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        pInfo.setVisible(true);
        pUsuarios.setVisible(false);
        pVacaciones.setVisible(false);
        pPuesto.setVisible(false);
        tpUsuario.setVisible(false);
        infoNombreCompleto.setText(usuario.getPrimerNombre()+" "+
                                   usuario.getSegundoNombre()+" "+
                                   usuario.getPrimerApellido()+" "+
                                   usuario.getSegundoApellido());
        infoPuesto.setText(usuario.getPuesto());
        infoDireccion.setText(usuario.getDireccion());
        infoCedula.setText(""+usuario.getCedula());
        infoCorreo.setText(usuario.getCorreo());
        infoCasa.setText(""+usuario.getNumeroCasa());
        infoCelular.setText(""+usuario.getNumeroCelular());
        infoNacimiento.setText(usuario.getFechaNacimiento().toString());
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletaActionPerformed
        for(int i=0; i<tbVacaciones.getRowCount(); i++){
            if(tbVacaciones.getValueAt(i, 4).equals(true)){
                try {
                    Conexion db = new Conexion();
                    // Crear conexion
                    Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
                    // Crear declaracion (conseguir id del puesto)
                    PreparedStatement stmt = con.prepareStatement("UPDATE vacaciones SET aprobada = 1 WHERE idVacacion = ?");
                    stmt.setInt(1, Integer.parseInt((String)tbVacaciones.getValueAt(i, 0)));
                    // Ejecutar SQL
                    int rsn = stmt.executeUpdate();

                    if (rsn == 1)
                    {
                        System.out.println("Solicitud enviada");
                    }
                    con.close();

                }
                catch (Exception e){
                    e.printStackTrace();
                    System.out.println("No se logro conectar con el servidor, contacte al administrador");
                }
            }
        }
        cargarSolicitudesVacaciones();
    }//GEN-LAST:event_btnCompletaActionPerformed

    private void btnPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestoActionPerformed
        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion (conseguir id del puesto)
            PreparedStatement stmt = con.prepareStatement("INSERT INTO puesto (nombrePuesto) VALUES (?)");
            stmt.setString(1, tfPuesto.getText());
            // Ejecutar SQL
            int rsn = stmt.executeUpdate();
            con.close();

        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }
    }//GEN-LAST:event_btnPuestoActionPerformed
                                     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarPuesto;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCompleta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnPuesto;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVacaciones;
    private javax.swing.JComboBox<String> cbPuestos;
    private javax.swing.JLabel infoCasa;
    private javax.swing.JLabel infoCedula;
    private javax.swing.JLabel infoCelular;
    private javax.swing.JLabel infoCorreo;
    private javax.swing.JLabel infoDireccion;
    private javax.swing.JLabel infoNacimiento;
    private javax.swing.JLabel infoNombreCompleto;
    private javax.swing.JLabel infoPuesto;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JList lstVacaciones;
    private javax.swing.JPanel pAgregar;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pPuesto;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JPanel pVacaciones;
    private javax.swing.JTable tFamiliares;
    private javax.swing.JTable tbVacaciones;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCasa;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCel;
    private javax.swing.JTextField tfContrasena;
    private javax.swing.JTextField tfCuenta;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfPrimerApellido;
    private javax.swing.JTextField tfPrimerNombre;
    private javax.swing.JTextField tfPuesto;
    private javax.swing.JTextField tfSegundoApellido;
    private javax.swing.JTextField tfSegundoNombre;
    private javax.swing.JTextField tfSueldo;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JTabbedPane tpUsuario;
    // End of variables declaration//GEN-END:variables
}