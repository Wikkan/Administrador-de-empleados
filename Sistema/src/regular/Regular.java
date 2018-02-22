package regular;

import conexion.Conexion;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import usuario.Usuario;

public class Regular extends javax.swing.JFrame {
    
    private ActionListener listener;
    private Date actual = new Date();
    private Usuario usuario = new Usuario();
    
    public Regular(ActionListener listener, Usuario usuario) {
        initComponents();
        this.listener = listener;
        this.usuario = usuario;
        cargarUsuario();
        pBuscar.setVisible(false);
        pVacaciones.setVisible(false);
        pInfo.setVisible(false);
    }
    
    private void cargarUsuario()
    {
        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion 
            PreparedStatement stmt = con.prepareStatement("SELECT p.*, pu.nombrePuesto, u.idUsuario FROM persona p INNER JOIN usuario u ON p.cedula = u.Persona_cedula INNER JOIN puesto pu ON pu.idPuesto = p.puesto WHERE u.nombreUsuario LIKE ?");
            stmt.setString(1, usuario.getUsuario());
            // Ejecutar SQL
            ResultSet rs = stmt.executeQuery();

            if (rs.next())
            {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
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
        catch (Exception e){
            //e.printStackTrace();
            System.out.println("No se logro conectar con el servidor, contacte al administrador");
        }
        
        /*lblUsuario.setText(usuario.getPrimerNombre()+" "+usuario.getSegundoNombre()
                           +" "+usuario.getPrimerApellido()+usuario.getSegundoApellido());*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnVacaciones = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pVacaciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cCalendario = new com.toedter.calendar.JCalendar();
        btnSolicitud = new javax.swing.JButton();
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
        pBuscar = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        btnFamiliar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        btnInfo.setBackground(new java.awt.Color(0, 0, 0));
        btnInfo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 204, 0));
        btnInfo.setText("Información Personal");
        btnInfo.setBorderPainted(false);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnVacaciones.setBackground(new java.awt.Color(0, 0, 0));
        btnVacaciones.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnVacaciones.setForeground(new java.awt.Color(255, 204, 0));
        btnVacaciones.setText("Vacaciones");
        btnVacaciones.setBorderPainted(false);
        btnVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacacionesActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 204, 0));
        btnBuscar.setText("Buscar Usuario");
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tfBuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 204, 0));
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.setActionCommand("Cerrar");
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 404, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 478, Short.MAX_VALUE))
        );

        btnCerrar.getAccessibleContext().setAccessibleName("Cerrar");

        pVacaciones.setBackground(new java.awt.Color(0, 0, 0));
        pVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        pVacaciones.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Elija la fecha para solicitar sus vacaciones");

        cCalendario.setBackground(new java.awt.Color(255, 204, 0));

        btnSolicitud.setBackground(new java.awt.Color(0, 0, 0));
        btnSolicitud.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnSolicitud.setForeground(new java.awt.Color(255, 204, 0));
        btnSolicitud.setText("Solicitar Vacaciones");
        btnSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pVacacionesLayout = new javax.swing.GroupLayout(pVacaciones);
        pVacaciones.setLayout(pVacacionesLayout);
        pVacacionesLayout.setHorizontalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pVacacionesLayout.createSequentialGroup()
                        .addGroup(pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 566, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pVacacionesLayout.setVerticalGroup(
            pVacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVacacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pInfo.setBackground(new java.awt.Color(255, 204, 0));
        pInfo.setPreferredSize(new java.awt.Dimension(900, 600));

        infoNombreCompleto.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel16.setText("Nombre Completo");

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel17.setText("Puesto");

        infoPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel18.setText("Dirección");

        infoDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel20.setText("Correo");

        infoCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel19.setText("Casa");

        infoCasa.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel21.setText("Celular");

        infoCelular.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel22.setText("Cédula");

        infoCedula.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel24.setText("Fecha de Nacimiento");

        infoNacimiento.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(infoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pInfoLayout.createSequentialGroup()
                        .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pInfoLayout.createSequentialGroup()
                                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(infoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(infoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(infoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(infoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
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
                        .addComponent(infoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
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
                .addGap(118, 118, 118))
        );

        pBuscar.setBackground(new java.awt.Color(255, 204, 0));
        pBuscar.setPreferredSize(new java.awt.Dimension(900, 600));

        lblNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Puesto");

        lblPuesto.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Dirección");

        lbDireccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        btnFamiliar.setBackground(new java.awt.Color(0, 0, 0));
        btnFamiliar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnFamiliar.setForeground(new java.awt.Color(255, 204, 0));
        btnFamiliar.setText("Agregar Familiar");
        btnFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBuscarLayout = new javax.swing.GroupLayout(pBuscar);
        pBuscar.setLayout(pBuscarLayout);
        pBuscarLayout.setHorizontalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFamiliar)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pBuscarLayout.createSequentialGroup()
                        .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                            .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        pBuscarLayout.setVerticalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pBuscarLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(pBuscarLayout.createSequentialGroup()
                        .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFamiliar)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addComponent(pBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(108, Short.MAX_VALUE)
                    .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(pVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacacionesActionPerformed
        pVacaciones.setVisible(true);
        pBuscar.setVisible(false);
        pInfo.setVisible(false);
    }//GEN-LAST:event_btnVacacionesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!tfBuscar.getText().equals("")){
            pBuscar.setVisible(true);
            pVacaciones.setVisible(false);
            pInfo.setVisible(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        this.listener.actionPerformed(evt);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudActionPerformed
        Date vacaciones = cCalendario.getDate();
        
        if(vacaciones.after(actual)){
            
            try {
                Conexion db = new Conexion();
                // Crear conexion
                Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
                // Crear declaracion (conseguir id del puesto)
                PreparedStatement stmt = con.prepareStatement("INSERT INTO vacaciones (fecha, idUsuario, aprobada) VALUES (?, ?, 0)");
                DateFormat df = new SimpleDateFormat("yyy/MM/dd");
                stmt.setString(1, df.format(cCalendario.getDate()));
                stmt.setInt(2, usuario.getIdUsuario());
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
    }//GEN-LAST:event_btnSolicitudActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        pInfo.setVisible(true);
        pBuscar.setVisible(false);
        pVacaciones.setVisible(false);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliarActionPerformed
        try {
            Conexion db = new Conexion();
            // Crear conexion
            Connection con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContraseña());
            // Crear declaracion (conseguir id del puesto)
            PreparedStatement stmt = con.prepareStatement("INSERT INTO familiares (idUsuario1, idUsuario2, aprobada) VALUES (?, ?, 0)");
            DateFormat df = new SimpleDateFormat("yyy/MM/dd");
            stmt.setString(1, df.format(cCalendario.getDate()));
            stmt.setInt(2, usuario.getIdUsuario());
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
    }//GEN-LAST:event_btnFamiliarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFamiliar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnSolicitud;
    private javax.swing.JButton btnVacaciones;
    private com.toedter.calendar.JCalendar cCalendario;
    private javax.swing.JLabel infoCasa;
    private javax.swing.JLabel infoCedula;
    private javax.swing.JLabel infoCelular;
    private javax.swing.JLabel infoCorreo;
    private javax.swing.JLabel infoDireccion;
    private javax.swing.JLabel infoNacimiento;
    private javax.swing.JLabel infoNombreCompleto;
    private javax.swing.JLabel infoPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pVacaciones;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}