
package trabajo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static trabajo.producto.fotoProd;

public class FuncionesExternas {
    
    public static char Letras;
    public static char Numeros;
    public static char Caracteres;
    public static char Entrar;
    
    public static int CantidadMaximaDeCaracteres = 7;
    
    
    Ventas ventas;
    
    producto PROD;
    
    public void ValidarSolamenteLetras(KeyEvent evt){
        
        Letras = evt.getKeyChar();
        Entrar = evt.getKeyChar();
    
        if(!Character.isLetter(Letras)&& Letras != KeyEvent.VK_BACK_SPACE && Letras != KeyEvent.VK_SPACE && Letras != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }else if(evt.getKeyCode() == evt.VK_ENTER){
            
            ventas.getAgregar().doClick();
        
        }
    
    }
    
    public void ValidarSolamenteNumeros(KeyEvent evt){
        
        Numeros = evt.getKeyChar();
        Entrar = evt.getKeyChar();
    
        if(!Character.isDigit(Numeros)&& Numeros != KeyEvent.VK_BACK_SPACE && Numeros != KeyEvent.VK_SPACE && Numeros != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar Numeros.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }else if(evt.getKeyCode() == evt.VK_ENTER){
            
            ventas.getAgregar().doClick();
        
        }
    
    }
    
    public void ValidarNumerosYLetras(KeyEvent evt){
    
        Caracteres = evt.getKeyChar();
        Entrar = evt.getKeyChar();
        
        if(!Character.isLetterOrDigit(Caracteres) && Caracteres != KeyEvent.VK_MINUS && Caracteres != KeyEvent.VK_UNDERSCORE && Caracteres != KeyEvent.VK_PERIOD && Caracteres != KeyEvent.VK_BACK_SPACE && Caracteres != KeyEvent.VK_SPACE && Caracteres != KeyEvent.VK_DELETE && Entrar != KeyEvent.VK_ENTER){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras o numeros y ciertos caracteres tales como: '.' y '-'.", "ERROR DE DIGITACION", JOptionPane.ERROR_MESSAGE);
            
        }else if(evt.getKeyCode() == evt.VK_ENTER){
            
            ventas.getAgregar().doClick();
        
        }
        
    }
    
    public void CantidadRut(KeyEvent evt){
        
        if(ventas.getRut().getText().length() > CantidadMaximaDeCaracteres){
        
            evt.consume();
                
        }
    
    }
    
    public String CargarFoto(){
    String url="";
        File Fichero;
        
        int Resultado;
        
        Cargar FC = new Cargar();
        
        FileNameExtensionFilter Filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        
        FC.CargarFotos.setFileFilter(Filtro);
        
        Resultado = FC.CargarFotos.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == Resultado){
        
            Fichero = FC.CargarFotos.getSelectedFile();
            
            try {
                
                ImageIcon Iconito = new ImageIcon(Fichero.toString());
                
                Icon Icono = new ImageIcon(Iconito.getImage().getScaledInstance(fotoProd.getWidth(), fotoProd.getHeight(), Image.SCALE_DEFAULT));
                
                fotoProd.setText(null);
                
                fotoProd.setIcon(null);
                
                fotoProd.setIcon(Icono);
                url= Fichero.getPath();
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar tu foto"+e);
                
            }
            
        }
        return url;
    }
    
    public void BloquearPegadoAltYShitf(KeyEvent evt){
        
        if(evt.isControlDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes pegar, ni usar los demas atajos de teclado.\n\nPor favor digite un caracter valido.", "¿Intentas Trollearme?", JOptionPane.INFORMATION_MESSAGE);

        }
        
        if(evt.isAltDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes usar el Alt.\n\nPor favor digite un caracter valido.", "CARACTER NO VALIDO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        if(evt.isAltGraphDown()){
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "No puedes usar el Alt Gr.\n\nPor favor digite un caracter valido.", "CARACTER NO VALIDO", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
}
