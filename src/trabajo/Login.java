
package trabajo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static org.junit.Assert.*;


public class Login extends javax.swing.JFrame {
    
    Cuenta cuenta = new Cuenta(this, rootPaneCheckingEnabled);
    QuienesSomos qs = new QuienesSomos(this, rootPaneCheckingEnabled);
    FuncionesExternas fe = new FuncionesExternas();
    
    public static Icon Chulito;
    public static Icon Equiz;

    public Login() {
        super("SISTEMA INTEGRADO DE FACTURACIÓN");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/invoice.png")).getImage());
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        
        Chulito = new ImageIcon(getClass().getResource("/iconos/success.png"));
        
        Equiz = new ImageIcon(getClass().getResource("/iconos/cancel.png"));
        
        usuario.requestFocus();
        
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/fondo.png");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(IconoBackground2);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        atras = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        subContraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        subUser = new javax.swing.JLabel();
        separadorNombre2 = new javax.swing.JSeparator();
        separadorContraseña = new javax.swing.JSeparator();
        entrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ingresarEmpleado = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross-out (2).png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 50, 60));

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 680, 10));

        Titulo.setBackground(new java.awt.Color(0, 51, 204));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Login");
        Titulo.setOpaque(true);
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 60));

        contraseña.setBackground(new java.awt.Color(60, 63, 65));
        contraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña.setText("Contraseña");
        contraseña.setBorder(null);
        contraseña.setOpaque(false);
        contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaFocusLost(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 520, 30));

        subContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subContraseña.setForeground(new java.awt.Color(0, 153, 51));
        subContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(subContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 520, 20));

        usuario.setBackground(new java.awt.Color(60, 63, 65));
        usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setText("Usuario");
        usuario.setBorder(null);
        usuario.setOpaque(false);
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 520, 30));

        subUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subUser.setForeground(new java.awt.Color(0, 153, 51));
        subUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(subUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 520, 20));

        separadorNombre2.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(separadorNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 520, -1));

        separadorContraseña.setBackground(new java.awt.Color(0, 153, 51));
        getContentPane().add(separadorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 520, -1));

        entrar.setBackground(new java.awt.Color(0, 204, 0));
        entrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("INGRESAR");
        entrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 520, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 660, 20));

        ingresarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingresarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        ingresarEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarEmpleado.setText("Ingresar como empleado");
        ingresarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarEmpleadoMouseClicked(evt);
            }
        });
        getContentPane().add(ingresarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 300, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion-electronica.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 680, 490));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Help.png"))); // NOI18N
        jMenu1.setText("Ayuda");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user.png"))); // NOI18N
        jMenuItem5.setText("Cuenta");
        jMenuItem5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        cuenta.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        new PRINCIPAL().setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasMouseClicked

    public void salir(){
    
    int salir=JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea salir?", "Confirmar",JOptionPane.YES_NO_OPTION);
    
     if(salir==1){
     }
         else if (salir==0){
          System.exit(0); 
         }
    }
    
    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
       salir();
    }//GEN-LAST:event_cerrarMouseClicked

    private void contraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusGained
        if (contraseña.getText().equalsIgnoreCase("Contraseña")) {
            contraseña.setText("");
            subContraseña.setText("Contraseña");
        }
    }//GEN-LAST:event_contraseñaFocusGained

    private void contraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusLost
        if (contraseña.getText().equalsIgnoreCase("")) {
            contraseña.setText("Contraseña");
            subContraseña.setText("");
        }
    }//GEN-LAST:event_contraseñaFocusLost

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        fe.BloquearPegadoAltYShitf(evt);

        char Entrar = evt.getKeyChar();

        if (evt.getKeyCode() == evt.VK_ENTER) {

            if (usuario.getText().equals("Usuario")) {
                usuario.requestFocus();
            } else if (!usuario.getText().equals("")) {
                entrar.doClick();
            }
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyTyped
        fe.ValidarNumerosYLetras(evt);

        int cantidad = 14;

        if(contraseña.getText().length() > cantidad){

            evt.consume();

            JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar es de 15 caracteres", "LIMITE EXCEDIDO", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_contraseñaKeyTyped

    private void usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusGained
        if (usuario.getText().equalsIgnoreCase("Usuario")) {
            usuario.setText("");
            subUser.setText("Usuario");
        }
    }//GEN-LAST:event_usuarioFocusGained

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        if (usuario.getText().equalsIgnoreCase("")) {
            usuario.setText("Usuario");
            subUser.setText("");
        }
    }//GEN-LAST:event_usuarioFocusLost

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        fe.BloquearPegadoAltYShitf(evt);

        char Entrar = evt.getKeyChar();

        if (evt.getKeyCode() == evt.VK_ENTER) {

            if (contraseña.getText().equals("Contraseña")) {
                contraseña.requestFocus();
            } else if (!contraseña.getText().equals("")) {
                entrar.doClick();
            }
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        fe.ValidarSolamenteLetras(evt);

        int cantidad = 26;

        if(usuario.getText().length() > cantidad){

            evt.consume();

            JOptionPane.showMessageDialog(null, "La cantidad maxima de caracteres que puedes ingresar es de 27 caracteres", "LIMITE EXCEDIDO", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_usuarioKeyTyped

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String UserUsuario = "admin";
        String PassContra = "administrador";

   
            if(usuario.getText().equalsIgnoreCase(UserUsuario) && contraseña.getText().equalsIgnoreCase(PassContra)){
                
                JOptionPane.showMessageDialog(null, "Usuario y Contraseña Correctos", "LOGGEADO", JOptionPane.WARNING_MESSAGE, Chulito);

                new Menu_Principal().setVisible(true);
                
                dispose();
                
            }else{
            
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE, Equiz);
                
            }
    }//GEN-LAST:event_entrarActionPerformed

    private void ingresarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarEmpleadoMouseClicked
        new Menu_Principal_Empleado().setVisible(true);
        dispose();
    }//GEN-LAST:event_ingresarEmpleadoMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel atras;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel ingresarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel separador;
    private javax.swing.JSeparator separadorContraseña;
    private javax.swing.JSeparator separadorNombre2;
    private javax.swing.JLabel subContraseña;
    private javax.swing.JLabel subUser;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
