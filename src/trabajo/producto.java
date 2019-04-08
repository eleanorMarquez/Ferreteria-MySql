
package trabajo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.Image;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static trabajo.FuncionesExternas.CantidadMaximaDeCaracteres;
import static trabajo.Menu_Principal.Info;
import static trabajo.Login.Chulito;
import static trabajo.Login.Equiz;

public class producto extends javax.swing.JFrame {

    FuncionesExternas FE = new FuncionesExternas();
    
    VariablesDelServicio2 Var2 = new VariablesDelServicio2();
    FuncionesASerializar2 Ser2 = new FuncionesASerializar2();
    DefaultTableModel TablaDeDatos;
    Vector Cabeceras4 = new Vector();
    
    public static int CantidadMinimaDeCaracteres = 3;

    public producto() {
        super("Registrar Productos");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/settings.png")).getImage());
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        
    
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/fondo.png");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(IconoBackground2);
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la galeria de productos", "BIENVENIDO", JOptionPane.WARNING_MESSAGE, Info);
        
        Chulito = new ImageIcon(getClass().getResource("/iconos/success.png"));
        
        Equiz = new ImageIcon(getClass().getResource("/iconos/cancel.png"));
        
        Info = new ImageIcon(getClass().getResource("/iconos/info.png"));
        llenarTabla();
    }

    public producto(DefaultTableModel TablaDeDatos, JLabel Fondo, JButton jButton1, JButton jButton4, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel6, JScrollPane jScrollPane1, JScrollPane jScrollPane2, JTextArea jTextArea1, JTable tabla2, JTextField txtCodigo, JTextField txtNombre, JTextField txtPrecio) {
        this.TablaDeDatos = TablaDeDatos;
        this.jButton1 = jButton1;
        this.jButton4 = jButton4;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jScrollPane1 = jScrollPane1;
        this.jScrollPane2 = jScrollPane2;
        this.txtDescripcion = jTextArea1;
        this.tabla2 = tabla2;
        this.txtCodigo = txtCodigo;
        this.txtNombre = txtNombre;
        this.txtPrecio = txtPrecio;
    }

    public FuncionesExternas getFE() {
        return FE;
    }

    public void setFE(FuncionesExternas FE) {
        this.FE = FE;
    }

    public VariablesDelServicio2 getVar2() {
        return Var2;
    }

    public void setVar2(VariablesDelServicio2 Var2) {
        this.Var2 = Var2;
    }

    public FuncionesASerializar2 getSer2() {
        return Ser2;
    }

    public void setSer2(FuncionesASerializar2 Ser2) {
        this.Ser2 = Ser2;
    }

    public DefaultTableModel getTablaDeDatos() {
        return TablaDeDatos;
    }

    public void setTablaDeDatos(DefaultTableModel TablaDeDatos) {
        this.TablaDeDatos = TablaDeDatos;
    }

    public Vector getCabeceras4() {
        return Cabeceras4;
    }

    public void setCabeceras4(Vector Cabeceras4) {
        this.Cabeceras4 = Cabeceras4;
    }

    public static int getCantidadMinimaDeCaracteres() {
        return CantidadMinimaDeCaracteres;
    }

    public static void setCantidadMinimaDeCaracteres(int CantidadMinimaDeCaracteres) {
        producto.CantidadMinimaDeCaracteres = CantidadMinimaDeCaracteres;
    }

    public static JLabel getFotoProd() {
        return fotoProd;
    }

    public static void setFotoProd(JLabel fotoProd) {
        producto.fotoProd = fotoProd;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea getjTextArea1() {
        return txtDescripcion;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.txtDescripcion = jTextArea1;
    }

    public JTable getTabla2() {
        return tabla2;
    }

    public void setTabla2(JTable tabla2) {
        this.tabla2 = tabla2;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrar = new javax.swing.JLabel();
        atras = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        fotoProd = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/miniminizel.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 50, 60));

        atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 750, 10));

        Titulo.setBackground(new java.awt.Color(0, 51, 255));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registrar Productos");
        Titulo.setOpaque(true);
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 80, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 170, 30));

        fotoProd.setForeground(new java.awt.Color(255, 255, 255));
        fotoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(fotoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 260, 150));

        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/slr_camera.png"))); // NOI18N
        jButton4.setText("Buscar foto");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 261, 260, 40));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CODIGO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 30));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PRECIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 30));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 240, 30));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPCION:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 30));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        jButton1.setText("Registrar Producto");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 260, 41));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 330, 170));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Precio", "Nombre"
            }
        ));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(1).setResizable(false);
            tabla2.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 720, 140));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if(txtCodigo.getText().equals("") && txtNombre.getText().equals("") && txtPrecio.getText().equals("") || txtCodigo.getText().equals("") && txtNombre.getText().equals("") || txtCodigo.getText().equals("") && txtPrecio.getText().equals("") || txtNombre.getText().equals("") && txtPrecio.getText().equals("") || txtCodigo.getText().equals("") || txtNombre.getText().equals("") || txtPrecio.getText().equals("")){
        
            JOptionPane.showMessageDialog(null, "Todos los campos son OBLIGATORIOS", "DENEGADO", JOptionPane.WARNING_MESSAGE, Equiz);

            txtCodigo.requestFocus();
            
        }else{
        
            if(txtPrecio.getText().length() < CantidadMinimaDeCaracteres){
            
                JOptionPane.showMessageDialog(null, "El precio minimo es de 100");
                
            }else{
            
                if(txtCodigo.getText().equals("") && txtPrecio.getText().equals("") && txtNombre.getText().equals("") || txtCodigo.getText().equals("") && txtPrecio.getText().equals("") || txtCodigo.getText().equals("") && txtNombre.getText().equals("") || txtPrecio.getText().equals("") && txtNombre.getText().equals("") || txtCodigo.getText().equals("") || txtPrecio.getText().equals("") || txtNombre.getText().equals("Seleccionar")){
            
                    JOptionPane.showMessageDialog(null, "Todos los campos son OBLIGATORIOS", "DENEGADO", JOptionPane.WARNING_MESSAGE, Equiz);
        
                    txtCodigo.requestFocus();
            
                }else{
            
                    String codigo = txtCodigo.getText();                    
                    int precio = Integer.valueOf(txtPrecio.getText());
                    String nombre = txtNombre.getText();
                   String descripcion = txtDescripcion.getText();
                   String imagen= urlImagenSeleccionada;
                    
                    try {
                         ProductoBD conexionProducto= new ProductoBD(false);
                         boolean exito=conexionProducto.insertarProductoBD(codigo, precio, descripcion, nombre, imagen);
                        if (exito) {
                           llenarTabla();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(),"DENEGADO",JOptionPane.WARNING_MESSAGE,Equiz);
                    }
                  
//                    String co = txtCodigo.getText();
//                    String ca = txtPrecio.getText();
//                    String na = txtNombre.getText();
//                   
//                  
//                    Var2.setCode(co);
//                    Var2.setCash(ca);
//                    Var2.setName(na);
//        
//                    Ser2.guardar2(Var2);
//                    Ser2.guardarTXT2(Var2);
//        
//                    tabla2.setModel(Ser2.listaTabla2());
            
                     
                }
        
            }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
private String urlImagenSeleccionada;

private String[][] generarTabla(ArrayList<ProductoC> productos){
    String[][] pro= new String[productos.size()][5];
    for (int i = 0; i < productos.size(); i++) {
        pro[i][0]=productos.get(i).getCodigo();
        pro[i][1]=productos.get(i).getPrecio()+"";
        pro[i][2]=productos.get(i).getNombre();
    }
    return pro;
}

private void llenarTabla(){
   
    ProductoBD conexionProducto= new ProductoBD(false);
    String[][] datos= generarTabla((ArrayList)conexionProducto.listarProductos());
    tabla2.setModel(new DefaultTableModel(datos, new String[]{"Codigo","Precio","Nombre"}));
   
   
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       urlImagenSeleccionada= FE.CargarFoto();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
// TODO add your handling code here:
    }//GEN-LAST:event_tabla2MouseClicked

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        
        FE.ValidarSolamenteNumeros(evt);
        
        if(txtCodigo.getText().length() > CantidadMaximaDeCaracteres){
        
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Maximo 10 caracteres para el codigo");
                
        }
        
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        
        FE.ValidarSolamenteNumeros(evt);
        
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
        FE.ValidarSolamenteLetras(evt);
        
    }//GEN-LAST:event_txtNombreKeyTyped

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
        
    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_cerrarMouseClicked

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
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel atras;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fondo;
    public static javax.swing.JLabel fotoProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel separador;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

   //To change body of generated methods, choose Tools | Templates.
    
}
