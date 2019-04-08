
package trabajo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static trabajo.Login.Chulito;
import static trabajo.Login.Equiz;

public class Menu_Principal_Empleado extends javax.swing.JFrame {

    public static Icon Info;
    
    Font fuenteBig = new Font("Dialog", Font.BOLD, 36);
    Font fuenteSmall = new Font("Dialog", Font.BOLD, 20);
    
    Color azul = new Color(0, 51, 255);
    Color rojo = new Color(204, 0, 0);
    Color Vinotinto = new Color(153, 0, 0);
    Color verde = new Color(0, 204, 51);
    
    Ventas ven = new Ventas();
    
    public Menu_Principal_Empleado() {
        
        super("SISTEMA INTEGRADO DE FACTURACION - MENÚ PRINCIPAL");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/invoice.png")).getImage());
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        
        ImagenFactura.requestFocus();
        

        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/facturacion.gif");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(ImagenFactura.getWidth(), ImagenFactura.getHeight(), Image.SCALE_DEFAULT));
        ImagenFactura.setIcon(IconoBackground);
        
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/333.jpg");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(IconoBackground2);
        
       
        Chulito = new ImageIcon(getClass().getResource("/iconos/success.png"));
        
        Equiz = new ImageIcon(getClass().getResource("/iconos/cancel.png"));
        
        Info = new ImageIcon(getClass().getResource("/iconos/info.png"));
        
        JOptionPane.showMessageDialog(null, "Bienvenid@, has tu factura YA!!!", "BIENVENID@", JOptionPane.WARNING_MESSAGE, Info);

        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atras = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        facturar = new javax.swing.JButton();
        ImagenFactura = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(102, 102, 0));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/powerButton.png"))); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross-out (2).png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 60));

        Titulo.setBackground(new java.awt.Color(102, 0, 153));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menú");
        Titulo.setOpaque(true);
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        facturar.setBackground(new java.awt.Color(0, 51, 255));
        facturar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        facturar.setForeground(new java.awt.Color(255, 255, 255));
        facturar.setText("Facturar");
        facturar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        facturar.setBorderPainted(false);
        facturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturarMouseExited(evt);
            }
        });
        facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarActionPerformed(evt);
            }
        });
        jPanel1.add(facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 450, 70));

        ImagenFactura.setBackground(new java.awt.Color(153, 153, 0));
        ImagenFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.gif"))); // NOI18N
        jPanel1.add(ImagenFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 360, 320));

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        jPanel1.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 570, 10));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/333.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarActionPerformed
        
        Ventas ven = new Ventas();
        ven.setVisible(true);
        
    }//GEN-LAST:event_facturarActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        salir();
    }//GEN-LAST:event_cerrarMouseClicked

    public void salir(){
    
    int salir=JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?", "Confirmar",JOptionPane.YES_NO_OPTION);
    
     if(salir==1){
     }
         else if (salir==0){
          System.exit(0); 
         }
    }
    
    public void MenuPrincipal() {

        int salir = JOptionPane.showConfirmDialog(null, "¿Esta seguro que deseas regresar a la pantalla principal?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (salir == 1) {
        } else if (salir == 0) {
            new PRINCIPAL().setVisible(true);
            dispose();
        }
    }
    
    private void facturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturarMouseEntered
        facturar.setFont(fuenteBig);
        facturar.setBackground(verde);
        facturar.setText("FACTURAR");
    }//GEN-LAST:event_facturarMouseEntered

    private void facturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturarMouseExited
        facturar.setFont(fuenteSmall);
        facturar.setBackground(azul);
        facturar.setText("Facturar");
    }//GEN-LAST:event_facturarMouseExited

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        MenuPrincipal();
    }//GEN-LAST:event_atrasMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenFactura;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel atras;
    private javax.swing.JLabel cerrar;
    private javax.swing.JButton facturar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel separador;
    // End of variables declaration//GEN-END:variables
}
