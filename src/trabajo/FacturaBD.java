/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class FacturaBD {
    private Connection conn;
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String DBURL = "jdbc:mysql://localhost:3306/ferreteria";
    private String USER = "root";
    private String PASS = "";
    private boolean mantenerConexion;
    
    
    public FacturaBD(boolean mantenerConexion){
        
        this.mantenerConexion = mantenerConexion;
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DBURL, USER, PASS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public boolean insertarFactura(Factura factura) {
        boolean exito = false;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement("insert into factura (cliente, rut,codigoproducto,cantidad,precio,preciototal) values(?,?,?,?,?,?)");
            stm.setString(1, factura.getCliente());            
            stm.setString(2,factura.getRut());
            stm.setString(3,factura.getCodigoProducto());
            stm.setInt(4, factura.getCantidad());
            stm.setInt(5, factura.getPrecio());
            stm.setInt(6, factura.getPrecioTotal());
            int total = stm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stm.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            try {
                if (!mantenerConexion) {
                    conn.close();
                }

            } catch (Exception e) {
            }

        }

        return exito;
    }
 
    
    
     public List<Factura> listarFacturas() {
        Object aux = null;
        List<Factura> l = null;
        try {
            String selectStatement = "select factura.id,factura.cliente,factura.rut,producto.nombre,producto.codigo,factura.cantidad,factura.precio,factura.preciototal from factura INNER JOIN producto on producto.codigo=factura.codigoproducto";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);

            ResultSet rs = prepStmt.executeQuery();
            l = new ArrayList<Factura>();
            while (rs.next()) {
                Factura factura=new Factura(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7),rs.getInt(8));
                l.add(factura);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!mantenerConexion) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }

        return l;
    }
    
     
     public boolean eliminarProducto(int id) {
        PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = conn.prepareStatement("delete from factura where factura.id=?");
            stmt.setInt(1, id);
            int total = stmt.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stmt.close();
        } catch (Exception e) {
        } finally {
            try {
                if (!mantenerConexion) {

                    conn.close();

                }
            } catch (Exception e) {
            }

        }

        return exito;

    }
     
}
