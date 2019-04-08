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


public class FuncionesASerializar2 implements Serializable{
    
    public FuncionesASerializar2(){
    
    }
    
    Vector Cabeceras3 = new Vector();
    
    public void guardar2(VariablesDelServicio2 variables2){
    
        Cabeceras3.addElement(variables2);
        
    }
    
    public void guardarTXT2(VariablesDelServicio2 Variables2){
    
        try {
            
            FileWriter fx = new FileWriter("Facturado2.txt",true);
            BufferedWriter bx = new BufferedWriter(fx);
            PrintWriter px = new PrintWriter(bx);
            
            px.print(Variables2.getCode());
            px.print("|"+Variables2.getCash());
            px.println("|"+Variables2.getName());
            px.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
  
    }
    
    public DefaultTableModel listaTabla2(){
    
        Vector vCabe2 = new Vector();
        
        vCabe2.addElement("Codigo");
        vCabe2.addElement("Precio");
        vCabe2.addElement("Nombre");
        
        DefaultTableModel tabla2 = new DefaultTableModel(vCabe2,0);
        
        try {
            
            FileReader fq = new FileReader("Facturado2.txt");
            BufferedReader ft = new BufferedReader(fq);
            String leer2;
            
            while((leer2=ft.readLine())!=null){
            
                StringTokenizer dato2 = new StringTokenizer(leer2,"|");
                Vector b = new Vector();
                
                while(dato2.hasMoreTokens()){
                    
                    b.addElement(dato2.nextToken());
                    
                }
                
                tabla2.addRow(b);
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
     
        return tabla2;
        
    }

    
    
}
