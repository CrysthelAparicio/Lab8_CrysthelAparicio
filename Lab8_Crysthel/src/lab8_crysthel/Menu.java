package lab8_crysthel;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    int contador = 0;
    int conteo = 0;
    String user = "erick123";
    String password = "321kcire";
    ArrayList<productos> productos = new ArrayList();
    ArrayList<cliente> clientela = new ArrayList();
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    cliente cliente = new cliente();
    factura inve2 = new factura();
    factura fact = new factura();

    public Menu() {
        initComponents();
        logout.setVisible(false);
        model.addColumn("cantidad");
        model.addColumn("nombre");
        model.addColumn("precio");
        model.addColumn("fecha");;
        jt_tabla_productos.setModel(model);
        ///////////////////////////////////////////////
        model2.addColumn("nombre");
        model2.addColumn("usuario");
        model2.addColumn("contraseña");
        model2.addColumn("productos");
        model2.addColumn("ID");
        model2.addColumn("saldo");
        model2.addColumn("cuenta");
        jt_clientes.setModel(model2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_contraseña = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jd_menu = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombre_cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_usuario_cliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_contraseña_cliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_cuenta = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_clientes = new javax.swing.JTable();
        agregar_cliente = new javax.swing.JButton();
        modificar_cliente = new javax.swing.JButton();
        elim_cliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tf_saldo_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_id_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_productos = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombre_pro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        js_cantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        tf_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tabla_productos = new javax.swing.JTable();
        agregar_productos = new javax.swing.JButton();
        modificar_productos = new javax.swing.JButton();
        eliminar_productos = new javax.swing.JButton();
        jd_fecha = new com.toedter.calendar.JDateChooser();
        jd_cliente = new javax.swing.JDialog();
        jd_factura = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_escoger = new javax.swing.JList<>();
        cargar_arreglo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        login_1 = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jButton1.setText("Iniciar Sesión");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_loginLayout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_loginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_loginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_loginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel7.setText("Nombre");

        jLabel8.setText("Usuario");

        jLabel9.setText("Contraseña");

        jLabel13.setText("Cuenta");

        jt_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Usuario", "Contraseña", "Porductos", "ID", "Saldo", "cuenta"
            }
        ));
        jScrollPane3.setViewportView(jt_clientes);

        agregar_cliente.setText("Agregar");
        agregar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_clienteMouseClicked(evt);
            }
        });

        modificar_cliente.setText("Modificar");
        modificar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_clienteMouseClicked(evt);
            }
        });

        elim_cliente.setText("Eliminar");
        elim_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elim_clienteMouseClicked(evt);
            }
        });

        jLabel12.setText("Saldo");

        jLabel11.setText("ID");

        jLabel10.setText("Productos");

        jl_productos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_productos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel11)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_saldo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_usuario_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_contraseña_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modificar_cliente)
                                    .addComponent(agregar_cliente)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elim_cliente)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(32, 32, 32)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_usuario_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_contraseña_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(agregar_cliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(modificar_cliente)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_saldo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(elim_cliente)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTES", jPanel2);

        jLabel3.setText("Nombre");

        jLabel4.setText("Cantidad");

        js_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setText("Precio");

        jLabel6.setText("Fecha de Vencimiento");

        jt_tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cantidad", "nombre", "precio", "fecha"
            }
        ));
        jScrollPane1.setViewportView(jt_tabla_productos);

        agregar_productos.setText("Agregar");
        agregar_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_productosMouseClicked(evt);
            }
        });

        modificar_productos.setText("Modificar");
        modificar_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_productosMouseClicked(evt);
            }
        });

        eliminar_productos.setText("Eliminar");
        eliminar_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_productosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar_productos)
                            .addComponent(modificar_productos)
                            .addComponent(eliminar_productos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(95, 95, 95)
                                .addComponent(tf_nombre_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(jd_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(js_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(js_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jd_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                        .addComponent(agregar_productos)
                        .addGap(43, 43, 43)
                        .addComponent(modificar_productos)
                        .addGap(48, 48, 48)
                        .addComponent(eliminar_productos)
                        .addGap(63, 63, 63))))
        );

        jTabbedPane1.addTab("PRODUCTOS", jPanel1);

        javax.swing.GroupLayout jd_menuLayout = new javax.swing.GroupLayout(jd_menu.getContentPane());
        jd_menu.getContentPane().setLayout(jd_menuLayout);
        jd_menuLayout.setHorizontalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_menuLayout.setVerticalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_clienteLayout = new javax.swing.GroupLayout(jd_cliente.getContentPane());
        jd_cliente.getContentPane().setLayout(jd_clienteLayout);
        jd_clienteLayout.setHorizontalGroup(
            jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_clienteLayout.setVerticalGroup(
            jd_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton2.setText("CREAR LA FACTURA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jl_escoger.setModel(new DefaultListModel()
        );
        jScrollPane4.setViewportView(jl_escoger);

        cargar_arreglo.setText("AGREGAR AL CARRITO");
        cargar_arreglo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargar_arregloMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_facturaLayout = new javax.swing.GroupLayout(jd_factura.getContentPane());
        jd_factura.getContentPane().setLayout(jd_facturaLayout);
        jd_facturaLayout.setHorizontalGroup(
            jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_facturaLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cargar_arreglo)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_facturaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );
        jd_facturaLayout.setVerticalGroup(
            jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_facturaLayout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargar_arreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jd_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_facturaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Admin SuperMercado");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        login_1.setText("Login");
        login_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_1ActionPerformed(evt);
            }
        });
        jMenu1.add(login_1);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuItem1.setText("Facturas");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_1ActionPerformed
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_login_1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login_1.setVisible(true);
        jd_menu.setVisible(false);
        jd_cliente.setVisible(false);
        logout.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (tf_usuario.getText().equals(user) && tf_contraseña.getText().equals(password)) {
            jd_menu.setModal(true);
            jd_menu.pack();
            jd_menu.setLocationRelativeTo(this);
            jd_menu.setVisible(true);
            jd_login.setVisible(false);
        }
        for (int i = 0; i < clientela.size(); i++) {
            if ((clientela.get(i).getUsuario().equals(user)) && (clientela.get(i).getContraseña().equals(password))) {
                jd_login.setVisible(false);
                login_1.setVisible(false);
                logout.setVisible(true);
                tf_usuario.setText("");
                tf_contraseña.setText("");
            }
        }
        System.out.println("noooo");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

    }//GEN-LAST:event_jButton1MouseEntered

    private void agregar_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_productosMouseClicked
        Dba db = new Dba("./baseSuper.mdb");
        db.conectar();
        try {
            String nombre = tf_nombre_pro.getText();
            int cantidad = Integer.parseInt(js_cantidad.getValue().toString());
            double precio = Double.parseDouble(tf_precio.getText());
            java.util.Date fecha1 = new java.util.Date();
            String fecha_caducidad = fecha1.toString();
            db.query.execute("INSERT INTO tabla_productos (nombre, precio, fecha,cantidad)VALUES('" + nombre
                    + "'," + precio + ",'" + fecha_caducidad + "'," + cantidad + ")");
            productos.add(new productos(cantidad, nombre, precio, fecha1));
            System.out.println(productos);
            Object[] newrow = new Object[4];
            newrow[0] = productos.get(conteo).getCantidad();
            newrow[1] = productos.get(conteo).getNombre();
            newrow[2] = productos.get(conteo).getPrecio();
            newrow[3] = productos.get(conteo).getFecha();
            model.addRow(newrow);
            conteo++;
            tf_nombre_pro.setText("");
            tf_precio.setText("");
            DefaultListModel modelo_lista = (DefaultListModel) jl_productos.getModel();
            modelo_lista.addElement(new productos(cantidad, nombre, precio, fecha1));
            jl_productos.setModel(modelo_lista);
            db.commit();
            JOptionPane.showMessageDialog(jd_menu, "producto agregado exitosamente :D");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_agregar_productosMouseClicked

    private void modificar_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_productosMouseClicked
        int x = jt_tabla_productos.getSelectedRow();
        if (x >= 0) {
            String nombre = productos.get(x).getNombre();
            productos product = new productos();
            java.util.Date fecha1 = new java.util.Date();
            String fecha_caducidad = fecha1.toString();
            tf_nombre_pro.setText(jt_tabla_productos.getValueAt(x, 0).toString());
            tf_precio.setText(jt_tabla_productos.getValueAt(x, 2).toString());
            model.removeRow(x);
            Dba db = new Dba("./baseSuper.mdb");
            db.conectar();
            try {
                db.query.execute("update tabla_productos set nombre='"
                        + tf_nombre_pro.getText() + "',cantidad=" + Integer.parseInt(js_cantidad.getValue().toString())
                        + ",precio='" + Double.parseDouble(tf_precio.getText()) + "'  where nombre='" + nombre + "'");
                db.commit();
                productos.get(x).setNombre(tf_nombre_pro.getText());
                productos.get(x).setCantidad(Integer.parseInt(js_cantidad.getValue().toString()));
                productos.get(x).setPrecio(Double.parseDouble(tf_precio.getText()));
                JOptionPane.showMessageDialog(jd_menu, "producto modificado exitosamente :D");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        }
    }//GEN-LAST:event_modificar_productosMouseClicked

    private void eliminar_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_productosMouseClicked
        int x = jt_tabla_productos.getSelectedRow();
        if (x >= 0) {
            String nombre = productos.get(x).getNombre();
            Dba db = new Dba("./baseSuper.mdb");
            db.conectar();
            try {
                db.query.execute("delete from tabla_productos where nombre='" + nombre + "'");
                db.commit();
                model.removeRow(x);
                productos.remove(x);
                JOptionPane.showMessageDialog(jd_menu, "producto eliminado :(");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        }
    }//GEN-LAST:event_eliminar_productosMouseClicked

    private void agregar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_clienteMouseClicked
        Dba db = new Dba("./baseSuper.mdb");
        db.conectar();
        try {
            String cuenta = tf_cuenta.getText();
            String nombre = tf_nombre_cliente.getText();
            String usuario2 = tf_usuario_cliente.getText();
            String contra = tf_contraseña_cliente.getText();
            String ID = tf_id_cliente.getText();
            double saldo = Double.parseDouble(tf_saldo_cliente.getText());
            productos pro = productos.get(jl_productos.getSelectedIndex());
            String p = pro.toString();
            db.query.execute("INSERT INTO tabla_cliente ( nombre, usuario, contraseña,productos,ID, saldo,cuenta"
                    + ")VALUES('" + nombre + "','" + usuario2 + "','" + contra + "','" + p + "'," + Integer.parseInt(ID) + "," + saldo + "," + Integer.parseInt(cuenta) + ")");
            clientela.add(new cliente(cuenta, nombre, usuario2, contra, ID, saldo));
            clientela.get(contador).setProductos(pro);
            Object[] newrow2 = new Object[7];
            newrow2[0] = clientela.get(contador).getNombre();
            newrow2[1] = clientela.get(contador).getUsuario();
            newrow2[2] = clientela.get(contador).getContraseña();
            newrow2[3] = clientela.get(contador).getProductos();
            newrow2[4] = clientela.get(contador).getID();
            newrow2[5] = clientela.get(contador).getSaldo();
            newrow2[6] = clientela.get(contador).getCuenta();
            model2.addRow(newrow2);
            contador++;
            tf_nombre_cliente.setText("");
            tf_usuario_cliente.setText("");
            tf_contraseña_cliente.setText("");
            tf_cuenta.setText("");
            tf_saldo_cliente.setText("");
            tf_id_cliente.setText("");
            db.commit();
            JOptionPane.showMessageDialog(jd_menu, "cliente agregado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.desconectar();

    }//GEN-LAST:event_agregar_clienteMouseClicked

    private void modificar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_clienteMouseClicked
        int x = jt_clientes.getSelectedRow();
        if (x >= 0) {
            String nombre = clientela.get(x).getNombre();
            tf_nombre_cliente.setText(jt_clientes.getValueAt(x, 0).toString());
            tf_usuario_cliente.setText(jt_clientes.getValueAt(x, 1).toString());
            tf_contraseña_cliente.setText(jt_clientes.getValueAt(x, 2).toString());
            tf_id_cliente.setText(jt_clientes.getValueAt(x, 4).toString());
            tf_saldo_cliente.setText(jt_clientes.getValueAt(x, 5).toString());
            tf_cuenta.setText(jt_clientes.getValueAt(x, 6).toString());
            productos pro = productos.get(jl_productos.getSelectedIndex());
            String p = pro.toString();
            model2.removeRow(x);
            Dba db = new Dba("./baseSuper.mdb");
            db.conectar();
            try {
                db.query.execute("update tabla_cliente set nombre='" + tf_nombre_cliente.getText() + "',usuario='" + tf_usuario_cliente.getText() + "'"
                        + ",productos='" + p + "',ID='" + tf_saldo_cliente + "',cuenta='" + tf_cuenta.getText() + "'where nombre='" + nombre + "'");
                db.commit();
                clientela.get(x).setNombre(tf_nombre_cliente.getText());
                clientela.get(x).setUsuario(tf_usuario_cliente.getText());
                clientela.get(x).setContraseña(tf_contraseña_cliente.getText());
                clientela.get(x).setCuenta(tf_cuenta.getText());
                clientela.get(x).setID(tf_id_cliente.getText());
                clientela.get(x).setSaldo(Double.parseDouble(tf_saldo_cliente.getText()));
                JOptionPane.showMessageDialog(jd_menu, "cliente modificado exitosamente :D");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        }
    }//GEN-LAST:event_modificar_clienteMouseClicked

    private void elim_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elim_clienteMouseClicked
        int x = jt_clientes.getSelectedRow();
        if (x >= 0) {
            String nombre = clientela.get(x).getNombre();
            Dba db = new Dba("./baseSuper.mdb");
            db.conectar();
            try {
                db.query.execute("delete from tabla_cliente where nombre='" + nombre + "'");
                db.commit();
                model2.removeRow(x);
                clientela.remove(x);
                JOptionPane.showMessageDialog(jd_menu, "cliente eliminado");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            db.desconectar();
        }
    }//GEN-LAST:event_elim_clienteMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        //crear factura
        productos produc = new productos();
        //guardar factura
        double total = 0;
        String muestra_produc = "";
        System.out.println(inve2.getProductos().size());
        for (int i = 0; i < inve2.getProductos().size(); i++) {

        }
        String CAI = JOptionPane.showInputDialog("ingrese CAI:");
        String RTN = JOptionPane.showInputDialog("ingrese RTN:");

        String correo = JOptionPane.showInputDialog("ingrese correo");
        String nombre_cliente = JOptionPane.showInputDialog("ingrese nombre de cliente");

        fact.setNombre_cliente(nombre_cliente);
        fact.setCAI(CAI);
        fact.setCorreo(correo);
        fact.setRTN(RTN);
        fact.setCAI(CAI);

    }//GEN-LAST:event_jButton2MouseClicked

    private void cargar_arregloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_arregloMouseClicked
        // TODO add your handling code here:
        //AGREGAR AL CARRITO
        int d = jl_escoger.getSelectedIndex();
        if (d >= 0) {
            //            Object x=inve2.getProductos().get(d).getNombre();
            //            arreglo.add(x);
            //            System.out.println(arreglo);
            fact.getProductos().add(inve2.getProductos().get(d));

          
        } else {
            
        }
    }//GEN-LAST:event_cargar_arregloMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_cliente;
    private javax.swing.JButton agregar_productos;
    private javax.swing.JButton cargar_arreglo;
    private javax.swing.JButton elim_cliente;
    private javax.swing.JButton eliminar_productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_cliente;
    private javax.swing.JDialog jd_factura;
    private com.toedter.calendar.JDateChooser jd_fecha;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_menu;
    private javax.swing.JList<String> jl_escoger;
    private javax.swing.JList<String> jl_productos;
    private javax.swing.JSpinner js_cantidad;
    private javax.swing.JTable jt_clientes;
    private javax.swing.JTable jt_tabla_productos;
    private javax.swing.JMenuItem login_1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JButton modificar_cliente;
    private javax.swing.JButton modificar_productos;
    private javax.swing.JTextField tf_contraseña;
    private javax.swing.JTextField tf_contraseña_cliente;
    private javax.swing.JTextField tf_cuenta;
    private javax.swing.JTextField tf_id_cliente;
    private javax.swing.JTextField tf_nombre_cliente;
    private javax.swing.JTextField tf_nombre_pro;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_saldo_cliente;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuario_cliente;
    // End of variables declaration//GEN-END:variables
}
