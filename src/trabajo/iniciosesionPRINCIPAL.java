
package trabajo;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioPlayer;

public class iniciosesionPRINCIPAL extends javax.swing.JFrame {

    Timer tiempo;

    public iniciosesionPRINCIPAL() {
        super.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        
        //jLabel5.setVisible(false);
        
        //timer.start();
        Tiempo();
        
        ImageIcon ImagenBackground = new ImageIcon("src/Imagenes/chef.jpg");
        Icon IconoBackground = new ImageIcon(ImagenBackground.getImage().getScaledInstance(portada.getWidth(), portada.getHeight(), Image.SCALE_DEFAULT));
        portada.setIcon(IconoBackground);
        
        ImageIcon ImagenBackground2 = new ImageIcon("src/Imagenes/fondo.png");
        Icon IconoBackground2 = new ImageIcon(ImagenBackground2.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(IconoBackground2);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/strong.png"));
        return retValue;
    }
    
    public void Tiempo(){
    
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (jProgressBar1.getValue() < 100) {
                    jProgressBar1.setValue(jProgressBar1.getValue()+10);
                }else{
                    tiempo.stop();
                    Entrar();
                }
                
            }
        };
        
        tiempo = new Timer(500, accion);
        tiempo.start();
    
    }
    
    public void Entrar(){
    
        PRINCIPAL prin = new PRINCIPAL();
        prin.setVisible(true);
        dispose();
    
    }

//    public class progreso implements ActionListener{
//        public void actionPerformed(ActionEvent evt){
//        
//            int tempo = jProgressBar1.getValue();
//            
//            if (tempo < 100) {
//                tempo++;
//                jProgressBar1.setValue(tempo);
//            }else{
//                timer.stop();
//                JOptionPane.showMessageDialog(null, "Bienvenido@ al sistema");
//                new PRINCIPAL().setVisible(true);
//            }
//        
//        }
//
//    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        portada = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross-out (2).png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 30, 30));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 400, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Desarrollador: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 290, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Codigo: 16132006");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>Ferreteria el <br> Herrero Asesino </center></html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 400, 130));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 51));
        jLabel4.setText("Christian Peña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Locomotive.jpg"))); // NOI18N
        jPanel1.add(portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 420));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARGANDO...");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 420, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //timer = new Timer(50, new progreso());
    }//GEN-LAST:event_formWindowOpened

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciosesionPRINCIPAL().setVisible(true);
            }
        });
    }

    //Timer timer;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel portada;
    // End of variables declaration//GEN-END:variables
}
