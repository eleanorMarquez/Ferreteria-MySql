package trabajo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PRINCIPAL extends javax.swing.JFrame {
    
    Font fuenteBig = new Font("Dialog", Font.BOLD, 20);
    Font fuenteSmall = new Font("Dialog", Font.BOLD, 18);
    
    Color azul = new Color(0, 51, 255);
    Color rojo = new Color(204, 0, 0);
    Color Vinotinto = new Color(153, 0, 0);
    Color verde = new Color(0, 204, 51);
    
    public int Contador = 0;
    
    int ContadorAdmin = 0;
    
    public PRINCIPAL() {
        super("TERAN GYM");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(this);

        /*hilo h = new hilo();
        h.start();
        System.out.println("holiwis");
*/
        Titulo.requestFocus();
        
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/lacupula.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(Banner.getWidth(), Banner.getHeight(), Image.SCALE_DEFAULT));
        Banner.setIcon(IconoBackground);
        
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/333.jpg");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(IconoBackground2);
        
        ImageIcon ImagenBackground3 = new ImageIcon("src/Imagenes/logo.jpg");
        Icon IconoBackground3 = new ImageIcon(ImagenBackground3.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(IconoBackground3);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/strong.png"));
        return retValue;
    }

    /*private class hilo extends Thread {

        private int contador = 0;

        public void run() {
            while (true) {
                try {
                    Fondo.setText(Integer.toString(contador++));
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }*/
    
    public void salir(){
    
    int salir=JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?", "Confirmar",JOptionPane.YES_NO_OPTION);
    
     if(salir==1){
     }
         else if (salir==0){
          System.exit(0); 
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        miniminize = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user8.png"))); // NOI18N
        jLabel1.setText("Entrar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        Principal.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 150, 160));

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        Principal.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 820, 10));

        miniminize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miniminize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/miniminizel.png"))); // NOI18N
        miniminize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniminize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniminizeMouseClicked(evt);
            }
        });
        Principal.add(miniminize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 40));

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross-out (2).png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        Principal.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, 40));

        Titulo.setBackground(new java.awt.Color(102, 0, 153));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("RESTAURANTE EL DELEITE DE LA REZ");
        Titulo.setOpaque(true);
        Principal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 820, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("<html>Sean bienvenidos al mejor restaurante con las mejores recetas.</html>");
        Principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 260, 250));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/333.jpg"))); // NOI18N
        Principal.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 820, 370));

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lacupula.jpg"))); // NOI18N
        Principal.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 210));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        jMenu1.setText("Menú");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menu.add(jMenu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        salir();
    }//GEN-LAST:event_cerrarMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void miniminizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniminizeMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_miniminizeMouseClicked
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
                
            }
        });
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel miniminize;
    private javax.swing.JLabel separador;
    // End of variables declaration//GEN-END:variables
}
