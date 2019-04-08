
package trabajo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import static trabajo.FuncionesExternas.CantidadMaximaDeCaracteres;
import static trabajo.Menu_Principal.Info;
import static trabajo.Login.Chulito;
import static trabajo.Login.Equiz;

public class Ventas extends javax.swing.JFrame {

    VariablesDelServicio Var = new VariablesDelServicio();
    FuncionesASerializar Ser = new FuncionesASerializar();
    DefaultTableModel TablaDeDatos;
    Vector Cabeceras2 = new Vector();

    ImageIcon Producto = new ImageIcon("/Productos/Seleccionar.png");
    Icon ProductoElegido;

    ImageIcon DVD = new ImageIcon(getClass().getResource("/Productos/DVD.PNG"));
    Icon RDVD;

    ImageIcon Plasma = new ImageIcon(getClass().getResource("/Productos/tv.png"));
    Icon TvPlasma;

    ImageIcon Computador = new ImageIcon(getClass().getResource("/Productos/compu.png"));
    Icon PC;

    ImageIcon Ventilador = new ImageIcon(getClass().getResource("/Productos/ventila.png"));
    Icon Ventila;

    ImageIcon Estufa = new ImageIcon(getClass().getResource("/Productos/estufa.jpg"));
    Icon Estuf;

    ImageIcon Microondas = new ImageIcon(getClass().getResource("/Productos/micro.png"));
    Icon Micro;

    ImageIcon Nevera = new ImageIcon(getClass().getResource("/Productos/neve.png"));
    Icon Neve;

    FuncionesExternas FE = new FuncionesExternas();

    public Ventas() {

        super("SISTEMA INTEGRADO DE FACTURACIÓN");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/invoice.png")).getImage());
        setResizable(false);
        initComponents();
        setLocationRelativeTo(this);
        
        ImageIcon ImagenBackground3 = new ImageIcon("src/Imagenes/logoFranco.png");
        Icon IconoBackground3 = new ImageIcon(ImagenBackground3.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(IconoBackground3);
        
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/fondo.png");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(fondo2.getWidth(), fondo2.getHeight(), Image.SCALE_DEFAULT));
        fondo2.setIcon(IconoBackground2);

        ProductoElegido = new ImageIcon(Producto.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
        TipoDeProducto.setIcon(ProductoElegido);

        Cabeceras2.addElement("Cliente");
        Cabeceras2.addElement("Rut");
        Cabeceras2.addElement("Producto");
        Cabeceras2.addElement("Codigo");
        Cabeceras2.addElement("Cantidad");
        Cabeceras2.addElement("Precio");
        Cabeceras2.addElement("Total");

        TablaDeDatos = new DefaultTableModel(Cabeceras2, 0);
        tabla.setModel(TablaDeDatos);

        SpinnerNumberModel AS = new SpinnerNumberModel();
        AS.setMaximum(99);
        AS.setMinimum(0);
        AS.setValue(0);
        cantidad.setModel(AS);

        codigo.setText("- - - - - - - - - -");
        precio.setText("0");
        total.setText("0");
        cantidad.setValue(0);

        JOptionPane.showMessageDialog(null, "Bienvenido al módulo de facturación", "BIENVENIDO", JOptionPane.WARNING_MESSAGE, Info);

        EliminarI.setEnabled(false);

        Chulito = new ImageIcon(getClass().getResource("/iconos/success.png"));

        Equiz = new ImageIcon(getClass().getResource("/iconos/cancel.png"));

        Info = new ImageIcon(getClass().getResource("/iconos/info.png"));

        llenarSelect();
    }

    public Ventas(DefaultTableModel TablaDeDatos, Icon ProductoElegido, Icon RDVD, Icon TvPlasma, Icon PC, Icon Ventila, Icon Estuf, Icon Micro, Icon Neve, JButton Agregar, JLabel TipoDeProducto, JLabel Transparente, JSpinner cantidad, JTextField cliente, JTextField codigo, JLabel fondo, JButton jButton2, JButton jButton3, JLabel jLabel1, JLabel jLabel10, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel8, JLabel jLabel9, JScrollPane jScrollPane2, JPanel panel1, JTextField precio, JComboBox<String> producto, JTextField rut, JTable tabla, JTextField total, JLabel atras, JLabel logo) {
        this.TablaDeDatos = TablaDeDatos;
        this.ProductoElegido = ProductoElegido;
        this.RDVD = RDVD;
        this.TvPlasma = TvPlasma;
        this.PC = PC;
        this.Ventila = Ventila;
        this.Estuf = Estuf;
        this.Micro = Micro;
        this.Neve = Neve;
        this.Agregar = Agregar;
        this.TipoDeProducto = TipoDeProducto;
        this.Transparente = Transparente;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.codigo = codigo;
        this.jLabel10 = jLabel10;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
        this.jScrollPane2 = jScrollPane2;
        this.panel1 = panel1;
        this.precio = precio;
        this.producto = producto;
        this.rut = rut;
        this.tabla = tabla;
        this.total = total;
        this.atras = atras;
        this.logo = logo;
    }

    public VariablesDelServicio getVar() {
        return Var;
    }

    public void setVar(VariablesDelServicio Var) {
        this.Var = Var;
    }

    public FuncionesASerializar getSer() {
        return Ser;
    }

    public void setSer(FuncionesASerializar Ser) {
        this.Ser = Ser;
    }

    public DefaultTableModel getTablaDeDatos() {
        return TablaDeDatos;
    }

    public void setTablaDeDatos(DefaultTableModel TablaDeDatos) {
        this.TablaDeDatos = TablaDeDatos;
    }

    public Vector getCabeceras2() {
        return Cabeceras2;
    }

    public void setCabeceras2(Vector Cabeceras2) {
        this.Cabeceras2 = Cabeceras2;
    }

    public ImageIcon getProducto() {
        return Producto;
    }

    public void setProducto(ImageIcon Producto) {
        this.Producto = Producto;
    }

    public Icon getProductoElegido() {
        return ProductoElegido;
    }

    public void setProductoElegido(Icon ProductoElegido) {
        this.ProductoElegido = ProductoElegido;
    }

    public ImageIcon getDVD() {
        return DVD;
    }

    public void setDVD(ImageIcon DVD) {
        this.DVD = DVD;
    }

    public Icon getRDVD() {
        return RDVD;
    }

    public void setRDVD(Icon RDVD) {
        this.RDVD = RDVD;
    }

    public ImageIcon getPlasma() {
        return Plasma;
    }

    public void setPlasma(ImageIcon Plasma) {
        this.Plasma = Plasma;
    }

    public Icon getTvPlasma() {
        return TvPlasma;
    }

    public void setTvPlasma(Icon TvPlasma) {
        this.TvPlasma = TvPlasma;
    }

    public ImageIcon getComputador() {
        return Computador;
    }

    public void setComputador(ImageIcon Computador) {
        this.Computador = Computador;
    }

    public Icon getPC() {
        return PC;
    }

    public void setPC(Icon PC) {
        this.PC = PC;
    }

    public ImageIcon getVentilador() {
        return Ventilador;
    }

    public void setVentilador(ImageIcon Ventilador) {
        this.Ventilador = Ventilador;
    }

    public Icon getVentila() {
        return Ventila;
    }

    public void setVentila(Icon Ventila) {
        this.Ventila = Ventila;
    }

    public ImageIcon getEstufa() {
        return Estufa;
    }

    public void setEstufa(ImageIcon Estufa) {
        this.Estufa = Estufa;
    }

    public Icon getEstuf() {
        return Estuf;
    }

    public void setEstuf(Icon Estuf) {
        this.Estuf = Estuf;
    }

    public ImageIcon getMicroondas() {
        return Microondas;
    }

    public void setMicroondas(ImageIcon Microondas) {
        this.Microondas = Microondas;
    }

    public Icon getMicro() {
        return Micro;
    }

    public void setMicro(Icon Micro) {
        this.Micro = Micro;
    }

    public ImageIcon getNevera() {
        return Nevera;
    }

    public void setNevera(ImageIcon Nevera) {
        this.Nevera = Nevera;
    }

    public Icon getNeve() {
        return Neve;
    }

    public void setNeve(Icon Neve) {
        this.Neve = Neve;
    }

    public JButton getAgregar() {
        return Agregar;
    }

    public void setAgregar(JButton Agregar) {
        this.Agregar = Agregar;
    }

    public JLabel getTipoDeProducto() {
        return TipoDeProducto;
    }

    public void setTipoDeProducto(JLabel TipoDeProducto) {
        this.TipoDeProducto = TipoDeProducto;
    }

    public JLabel getTransparente() {
        return Transparente;
    }

    public void setTransparente(JLabel Transparente) {
        this.Transparente = Transparente;
    }

    public JSpinner getCantidad() {
        return cantidad;
    }

    public void setCantidad(JSpinner cantidad) {
        this.cantidad = cantidad;
    }

    public JTextField getCliente() {
        return cliente;
    }

    public void setCliente(JTextField cliente) {
        this.cliente = cliente;
    }

    public JTextField getCodigo() {
        return codigo;
    }

    public void setCodigo(JTextField codigo) {
        this.codigo = codigo;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JTextField getPrecio() {
        return precio;
    }

    public void setPrecio(JTextField precio) {
        this.precio = precio;
    }

    public void setProducto(JComboBox<String> producto) {
        this.producto = producto;
    }

    public JTextField getRut() {
        return rut;
    }

    public void setRut(JTextField rut) {
        this.rut = rut;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JTextField getTotal() {
        return total;
    }

    public void setTotal(JTextField total) {
        this.total = total;
    }

    public JLabel getAtras() {
        return atras;
    }

    public void setAtras(JLabel atras) {
        this.atras = atras;
    }

    public JLabel getLogo() {
        return logo;
    }

    public void setLogo(JLabel logo) {
        this.logo = logo;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        atras = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        EliminarI = new javax.swing.JButton();
        Transparente = new javax.swing.JLabel();
        TipoDeProducto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        cliente = new javax.swing.JTextField();
        rut = new javax.swing.JTextField();
        producto = new javax.swing.JComboBox<>();
        codigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Agregar = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/miniminizel.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        panel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, 60));

        atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        panel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFranco.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        panel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 100));

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        panel1.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 590, 10));

        Titulo.setBackground(new java.awt.Color(102, 0, 153));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Factura");
        Titulo.setOpaque(true);
        panel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        EliminarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recycle_bin_f.png"))); // NOI18N
        EliminarI.setText("Eliminar del Inventario");
        EliminarI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EliminarI.setBorderPainted(false);
        EliminarI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarIActionPerformed(evt);
            }
        });
        panel1.add(EliminarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 200, 40));
        panel1.add(Transparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 590, 10));

        TipoDeProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.add(TipoDeProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 210, 130));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 204));
        jLabel8.setText("CANTIDAD:");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 30));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 153));
        jLabel9.setText("PRECIO:");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 90, 30));

        precio.setEditable(false);
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });
        panel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 120, 30));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("<html>Precio Total:<html>");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 120, 30));

        total.setEditable(false);
        panel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 120, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLIENTE:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RUT:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 50, 30));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODUCTO:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("CODIGO:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadStateChanged(evt);
            }
        });
        panel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 30));

        cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clienteKeyTyped(evt);
            }
        });
        panel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 171, 30));

        rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutKeyTyped(evt);
            }
        });
        panel1.add(rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 171, 30));

        producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "DVD", "TV PLASMA", "COMPUTADOR", "VENTILADOR", "ESTUFA", "MICROONDAS", "NEVERA" }));
        producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        producto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productoItemStateChanged(evt);
            }
        });
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        panel1.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 171, 30));

        codigo.setEditable(false);
        panel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 140, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Rut", "Producto", "Codigo", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 570, 130));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        Agregar.setText("Generar Factura");
        Agregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Agregar.setBorderPainted(false);
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        panel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 210, 40));
        panel1.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 510));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productoItemStateChanged

    }//GEN-LAST:event_productoItemStateChanged


    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        if (cliente.getText().equals("") && rut.getText().equals("") && producto.getSelectedItem().toString().equals("Seleccionar") || cliente.getText().equals("") && rut.getText().equals("") || cliente.getText().equals("") && producto.getSelectedItem().toString().equals("Seleccionar") || rut.getText().equals("") && producto.getSelectedItem().toString().equals("Seleccionar") || cliente.getText().equals("") || rut.getText().equals("") || producto.getSelectedItem().toString().equals("Seleccionar")) {

            JOptionPane.showMessageDialog(null, "Todos los campos son OBLIGATORIOS", "DENEGADO", JOptionPane.WARNING_MESSAGE, Equiz);

            cliente.requestFocus();

        } else {

            EliminarI.setEnabled(true);

            String client = cliente.getText();
            String rt = rut.getText();
            String prod = producto.getSelectedItem().toString();
            String cod = codigo.getText();
            String Cant = cantidad.getValue().toString();
            String Pre = precio.getText();
            String PT = total.getText();

            Factura factura= new Factura(0,client, rt,null, cod,Integer.valueOf(Cant), Integer.valueOf(Pre),Integer.valueOf(PT));
            FacturaBD conexionFactura= new FacturaBD(false);
            conexionFactura.insertarFactura(factura);
            llenarTabla();
        }

    }//GEN-LAST:event_AgregarActionPerformed

    
    private String[][] generarTabla(ArrayList<Factura> facturas) {
        String[][] pro = new String[facturas.size()][8];
        for (int i = 0; i < facturas.size(); i++) {
            pro[i][0] = facturas.get(i).getId()+"";
            pro[i][1] = facturas.get(i).getCliente()+"";
            pro[i][2] = facturas.get(i).getRut()+"";
            pro[i][3] = facturas.get(i).getProducto()+"";
            pro[i][4] = facturas.get(i).getCodigoProducto()+"";
            pro[i][5] = facturas.get(i).getCantidad()+"";
            pro[i][6] = facturas.get(i).getPrecio()+"";
            pro[i][7] = facturas.get(i).getPrecioTotal()+"";
        }
        return pro;
    }
    
    private void llenarTabla() {

        FacturaBD conexionFactura = new FacturaBD(false);
        String[][] datos = generarTabla((ArrayList) conexionFactura.listarFacturas());
        tabla.setModel(new DefaultTableModel(datos, new String[]{"Id", "Cliente", "Rut","Producto","Codigo","Cantidad","Precio","Total"}));

    }
    
    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed

        if (producto.getSelectedItem().toString().equals("Seleccionar")) {

            ProductoElegido = new ImageIcon(Producto.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
            TipoDeProducto.setIcon(ProductoElegido);

            codigo.setText("- - - - - - - - - -");
            precio.setText("0");
            total.setText("0");
            cantidad.setValue(0);

        } else {
            ProductoBD conexion = new ProductoBD(false);
            ProductoC producto = conexion.listarProductoNombre(this.producto.getSelectedItem().toString());
            if (producto != null) {
                ImageIcon DVD = new ImageIcon(producto.getImagen());
                Icon icono = new ImageIcon(DVD.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
                TipoDeProducto.setIcon(icono);

                codigo.setText(producto.getCodigo());
                precio.setText(producto.getPrecio() + "");
                total.setText(producto.getPrecio() + "");
                cantidad.setValue(1);
            }

        }
//        else if(producto.getSelectedItem().toString().equals("DVD")){
//        
//            RDVD = new ImageIcon(DVD.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(RDVD);
//            
//            codigo.setText("1234567890");
//            precio.setText("120000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }else if(producto.getSelectedItem().toString().equals("TV PLASMA")){
//        
//            TvPlasma = new ImageIcon(Plasma.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(TvPlasma);
//            
//            codigo.setText("0987654321");
//            precio.setText("2300000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }else if(producto.getSelectedItem().toString().equals("COMPUTADOR")){
//        
//            PC = new ImageIcon(Computador.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(PC);
//            
//            codigo.setText("2537049715");
//            precio.setText("1800000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }else if(producto.getSelectedItem().toString().equals("VENTILADOR")){
//        
//            Ventila = new ImageIcon(Ventilador.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(Ventila);
//            
//            codigo.setText("9462837103");
//            precio.setText("97000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }else if(producto.getSelectedItem().toString().equals("ESTUFA")){
//        
//            Estuf = new ImageIcon(Estufa.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(Estuf);
//            
//            codigo.setText("9482750381");
//            precio.setText("380000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }else if(producto.getSelectedItem().toString().equals("MICROONDAS")){
//        
//            Micro = new ImageIcon(Microondas.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(Micro);
//            
//            codigo.setText("5849202160");
//            precio.setText("85000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }else if(producto.getSelectedItem().toString().equals("NEVERA")){
//        
//            Neve = new ImageIcon(Nevera.getImage().getScaledInstance(TipoDeProducto.getWidth(), TipoDeProducto.getHeight(), Image.SCALE_DEFAULT));
//            TipoDeProducto.setIcon(Neve);
//            
//            codigo.setText("1122336690");
//            precio.setText("1800000");
//            total.setText(""+precio);
//            cantidad.setValue(1);
//            
//        }

    }//GEN-LAST:event_productoActionPerformed

    private void llenarSelect() {
        ProductoBD conexionProducto = new ProductoBD(false);
        ArrayList<ProductoC> productos = (ArrayList) conexionProducto.listarProductos();
        while (this.producto.getItemCount() > 1) {
            this.producto.removeItemAt(this.producto.getItemCount() - 1);
        }
        for (int i = 0; i < productos.size(); i++) {
            this.producto.addItem(productos.get(i).getNombre());
        }
    }
    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped

    }//GEN-LAST:event_precioKeyTyped

    private void cantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadStateChanged

        String Extraido = precio.getText();

        int Valor = Integer.parseInt(Extraido);

        int Valor2 = (int) cantidad.getValue();

        int Resultado = Valor2 * Valor;

        if (producto.getSelectedItem().toString().equals("Seleccionar")) {

            cantidad.setValue(0);

        } else if (!producto.getSelectedItem().toString().equals("Seleccionar")) {

            if (cantidad.getValue().toString().equals("0")) {

                cantidad.setValue(1);

            } else {

                total.setText("" + Resultado);

            }

        }

    }//GEN-LAST:event_cantidadStateChanged

    private void clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteKeyTyped

        FE.ValidarSolamenteLetras(evt);

    }//GEN-LAST:event_clienteKeyTyped

    private void rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutKeyTyped

        FE.ValidarSolamenteNumeros(evt);

        if (rut.getText().length() > CantidadMaximaDeCaracteres) {

            evt.consume();

            JOptionPane.showMessageDialog(null, "Maximo 8 caracteres en el Root");

        }

    }//GEN-LAST:event_rutKeyTyped

    private void EliminarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarIActionPerformed

        int ConfirmarEliminar = JOptionPane.showConfirmDialog(null, "Seguro que deseas eliminar?");

        if (JOptionPane.YES_OPTION == ConfirmarEliminar) {

           FacturaBD conexionFactura= new FacturaBD(false);
           int registro= tabla.getSelectedRow();
           
           conexionFactura.eliminarProducto(Integer.valueOf((String)tabla.getValueAt(registro, 0)));
            llenarTabla();
        }

    }//GEN-LAST:event_EliminarIActionPerformed

    public void Atras() {

        int salir = JOptionPane.showConfirmDialog(null, "¿Esta seguro que deseas regresar?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (salir == 1) {
        } else if (salir == 0) {
            dispose();
        }
    }
    
    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Atras();
    }//GEN-LAST:event_atrasMouseClicked

    public void MenuPrincipal() {

        int salir = JOptionPane.showConfirmDialog(null, "¿Esta seguro que deseas regresar a la pantalla principal?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (salir == 1) {
        } else if (salir == 0) {
            new PRINCIPAL().setVisible(true);
            dispose();
        }
    }
    
    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        MenuPrincipal();
    }//GEN-LAST:event_logoMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_cerrarMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton EliminarI;
    private javax.swing.JLabel TipoDeProducto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Transparente;
    private javax.swing.JLabel atras;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JLabel cerrar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField precio;
    private javax.swing.JComboBox<String> producto;
    private javax.swing.JTextField rut;
    private javax.swing.JLabel separador;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
