
package trabajo;

import trabajo.VariablesDelServicio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FuncionesASerializar implements Serializable{
    
    public FuncionesASerializar(){
    
    }
    
    Vector Cabeceras = new Vector();
    
    public void guardar2(VariablesDelServicio variables){
    
        Cabeceras.addElement(variables);
        
    }
    
    public void guardarTXT2(VariablesDelServicio Variables){
    
        try {
            
            FileWriter fw = new FileWriter("Facturado.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print(Variables.getCliente());
            pw.print("|"+Variables.getRut());
            pw.print("|"+Variables.getProducto());
            pw.print("|"+Variables.getCodigo());
            pw.print("|"+Variables.getCantidad());
            pw.print("|"+Variables.getPrecio());
            pw.println("|"+Variables.getTotal());
            pw.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
  
    }
    
    public DefaultTableModel listaTabla2(){
    
        Vector vCabe = new Vector();
        
        vCabe.addElement("Cliente");
        vCabe.addElement("Rut");
        vCabe.addElement("Producto");
        vCabe.addElement("Codigo");
        vCabe.addElement("Cantidad");
        vCabe.addElement("Precio");
        vCabe.addElement("Total");
        
        DefaultTableModel tabla = new DefaultTableModel(vCabe,0);
        
        try {
            
            FileReader fr = new FileReader("Facturado.txt");
            BufferedReader br = new BufferedReader(fr);
            String leer;
            
            while((leer=br.readLine())!=null){
            
                StringTokenizer dato = new StringTokenizer(leer,"|");
                Vector a = new Vector();
                
                while(dato.hasMoreTokens()){
                    
                    a.addElement(dato.nextToken());
                    
                }
                
                tabla.addRow(a);
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
     
        return tabla;
        
    }

    
    
}
