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
        pEditar.setVisible(false);
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
        btnEditar = new javax.swing.JButton();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        lstFamiliares = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstVacaciones = new javax.swing.JList();
        pVacaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVacaciones = new javax.swing.JTable();
        btnCompletar = new javax.swing.JButton();
        pEditar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDireccion = new javax.swing.JTextArea();
        tfTelefono = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        btnEditar.setBackground(new java.awt.Color(31, 36, 121));
        btnEditar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Información");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVacaciones.setBackground(new java.awt.Color(31, 36, 121));
        btnVacaciones.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnVacaciones.setText("Aprobar Vacaciones");
        btnVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacacionesActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(31, 36, 121));
        btnCerrar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.setActionCommand("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(31, 36, 121));
        btnUsuarios.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnInfo.setBackground(new java.awt.Color(31, 36, 121));
        btnInfo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("Información Personal"); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        pUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pUsuarios.setPreferredSize(new java.awt.Dimension(800, 450));

        tfBuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(31, 36, 121));
        btnBuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar Usuario");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setBackground(new java.awt.Color(31, 36, 121));
        btnAgregarUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(31, 36, 121));
        btnEliminar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Usuario");

        pAgregar.setBackground(new java.awt.Color(255, 255, 255));
        pAgregar.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");

        tfDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Puesto");

        cbPuestos.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Cédula");

        tfCedula.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        tfCedula.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel8.setText("Celular");

        tfCel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel9.setText("Cuenta");

        tfCuenta.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Facha de nacimiento");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel11.setText("Sueldo");

        tfSueldo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel12.setText("Nombre de Usuario");

        tfUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel13.setText("Contraseña");

        tfContrasena.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel14.setText("Casa");

        tfCasa.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel15.setText("Correo");

        jTextField1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(31, 36, 121));
        btnAgregar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel25.setText("Primer Nombre");

        tfPrimerNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel26.setText("Segundo Nombre");

        tfSegundoNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel27.setText("Primer Apellido");

        tfPrimerApellido.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel28.setText("Segundo Apellido");

        tfSegundoApellido.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

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
                            .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAgregarLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1))
                                .addGroup(pAgregarLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfCedula))
                                .addGroup(pAgregarLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(101, Short.MAX_VALUE))
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
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pAgregarLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGroup(pAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tpUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
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
                .addContainerGap(78, Short.MAX_VALUE))
        );

        tpUsuario.addTab("Información de Usuario", jPanel2);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        lstFamiliares.setPreferredSize(new java.awt.Dimension(275, 147));
        jScrollPane4.setViewportView(lstFamiliares);

        tpUsuario.addTab("Familiares", jScrollPane4);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        lstVacaciones.setPreferredSize(new java.awt.Dimension(275, 147));
        jScrollPane5.setViewportView(lstVacaciones);

        tpUsuario.addTab("Vacaciones", jScrollPane5);

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUsuariosLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(tpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pUsuariosLayout.createSequentialGroup()
                        .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pUsuariosLayout.createSequentialGroup()
                                .addComponent(btnAgregarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
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
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                    .addGap(0, 22, Short.MAX_VALUE)
                    .addComponent(pAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pVacaciones.setPreferredSize(new java.awt.Dimension(800, 450));

        tbVacaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Empleado", "Fecha de vacaciones", "Aceptar Solicitud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbVacaciones);

        btnCompletar.setText("Completar proceso de solicitudes");
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
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
                        .addComponent(btnCompletar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pVacacionesLayout.setVerticalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar.setPreferredSize(new java.awt.Dimension(800, 450));

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
                    .addGroup(pEditarLayout.createSequentialGroup()
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addGroup(pEditarLayout.createSequentialGroup()
                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(291, Short.MAX_VALUE))
        );

        pInfo.setBackground(new java.awt.Color(255, 255, 255));
        pInfo.setPreferredSize(new java.awt.Dimension(800, 450));

        infoNombreCompleto.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel16.setText("Nombre Completo");

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel17.setText("Puesto");

        infoPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel18.setText("Dirección");

        infoDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel20.setText("Correo");

        infoCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel19.setText("Casa");

        infoCasa.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel21.setText("Celular");

        infoCelular.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel22.setText("Cédula");

        infoCedula.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel24.setText("Fecha de Nacimiento");

        infoNacimiento.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(infoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel20)
                                .addComponent(infoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                            .addComponent(infoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(infoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel18)
                                    .addComponent(infoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(infoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 418, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addComponent(infoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnVacaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addComponent(pEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(pEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addContainerGap(139, Short.MAX_VALUE)
                    .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrar.getAccessibleContext().setAccessibleName("Cerrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        pEditar.setVisible(true);
        pUsuarios.setVisible(false);
        pVacaciones.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacacionesActionPerformed
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
            PreparedStatement stmt = con.prepareStatement("SELECT p.*, v.fecha FROM vacaciones v INNER JOIN usuario u ON u.idUsuario = v.idUsuario INNER JOIN persona p ON p.cedula = u.Persona_cedula WHERE v.aprobada = 0");
            // Ejecutar SQL
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
            {
                String nombre = rs.getString("primerNombre") + " " + rs.getString("segundoNombre") + " " + rs.getString("primerApellido") + " " + rs.getString("segundoApellido");
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                String fecha = df.format(rs.getDate("fecha"));
                String[] fila = {Integer.toString(rs.getInt("cedula")), nombre, fecha};
                modeloVacaciones.addRow(fila);
            }
            con.close();

        }
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }
        pVacaciones.setVisible(true);
        pEditar.setVisible(false);
        pUsuarios.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnVacacionesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        pUsuarios.setVisible(true);
        pEditar.setVisible(false);
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
                //Agregar familia a la tabla
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

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        //Retorna los id's de las solicitudes aprobadas
        for(int i=0; i<tbVacaciones.getRowCount(); i++){
            if(tbVacaciones.getValueAt(i, 3) != null){
                System.out.println(tbVacaciones.getValueAt(i, 0));
            }
        }
    }//GEN-LAST:event_btnCompletarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        pInfo.setVisible(true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInfo;
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
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JPanel pVacaciones;
    private javax.swing.JTextArea taDireccion;
    private javax.swing.JTable tbVacaciones;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCasa;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfCel;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfContrasena;
    private javax.swing.JTextField tfCuenta;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfPrimerApellido;
    private javax.swing.JTextField tfPrimerNombre;
    private javax.swing.JTextField tfSegundoApellido;
    private javax.swing.JTextField tfSegundoNombre;
    private javax.swing.JTextField tfSueldo;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JTabbedPane tpUsuario;
    // End of variables declaration//GEN-END:variables
}