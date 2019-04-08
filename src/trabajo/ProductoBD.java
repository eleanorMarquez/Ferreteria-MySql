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
public class ProductoBD {

    private Connection conn;
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String DBURL = "jdbc:mysql://localhost:3306/ferreteria";
    private String USER = "root";
    private String PASS = "";
    private boolean mantenerConexion;

    public ProductoBD(boolean mantenerConexion) {
        this.mantenerConexion = mantenerConexion;
        try {
            Class.forName(DRIVER).newInstance();
            //Get a connection
            conn = DriverManager.getConnection(DBURL, USER, PASS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean insertarProductoBD(String codigo, int precio, String descripcion, String nombre, String imagen) throws Exception {
        boolean exito = false;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement("insert into producto (codigo,precio,descripcion, nombre,imagen) values(?,?,?,?,?)");
            stm.setString(1, codigo);
            stm.setInt(2, precio);
            stm.setString(3, descripcion);
            stm.setString(4, nombre);
            stm.setString(5, imagen);
            int total = stm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stm.close();
        } catch (Exception e) {
            if (e.getMessage().contains("PRIMARY")) {
                throw new Exception("El codigo ingresado ya fue guardado en la base de datos");
            } else if (e.getMessage().contains("nombre")) {
                throw new Exception("El nombre ingresado ya fue guardado en la base de datos");
            }
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

    public List<ProductoC> listarProductos() {
        Object aux = null;
        List<ProductoC> l = null;
        try {
            String selectStatement = "SELECT codigo,descripcion,nombre,imagen,precio from producto";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);

            ResultSet rs = prepStmt.executeQuery();
            l = new ArrayList<ProductoC>();
            while (rs.next()) {
                ProductoC producto = new ProductoC(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                l.add(producto);
            }

            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public boolean eliminarProducto(String codigo) throws Exception{
        PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = conn.prepareStatement("delete from producto where producto.codigo=?");
            stmt.setString(1, codigo);
            int total = stmt.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stmt.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
                if (e.getMessage().contains("fkproducto")) {
                    throw new Exception("No puedes eliminar este producto ya que esta ligado a una o muchas facturas. Primero debes eliminar la o las facturas.");
                }else{
                    throw new Exception ("Error al eliminar el producto seleccionado");
                }
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

    public boolean editarDatoProducto(ProductoC producto, int columna, String codigo) throws Exception {
        boolean exito = false;
        PreparedStatement stm = null;
        Object[] col = this.nombreColumna(columna, producto);
        try {
            String consulta = "update producto set producto." + (String) col[1] + "=? where producto.codigo=?";

            stm = conn.prepareStatement(consulta);
            switch ((String) col[0]) {
                case "String":
                    stm.setString(1, (String) col[2]);
                    break;
                case "int":
                    stm.setInt(1, (int) col[2]);
                    break;
            }

            stm.setString(2, codigo);
            int total = stm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
            stm.close();
        } catch (Exception e) {
            if (e.getMessage().contains("PRIMARY")) {
                throw new Exception("El codigo ingresado ya fue guardado en la base de datos");
            } else if (e.getMessage().contains("nombre")) {
                throw new Exception("El nombre ingresado ya fue guardado en la base de datos");
            } else {
                throw new Exception("Error al editar producto");
            }
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

    private Object[] nombreColumna(int columna, ProductoC producto) {
        Object[] aux = new Object[3];

        switch (columna) {
            case 0:
                aux[0] = "String";
                aux[1] = "codigo";
                aux[2] = producto.getCodigo();
                break;
            case 1:
                aux[0] = "int";
                aux[1] = "precio";
                aux[2] = producto.getPrecio();
                break;
            case 2:
                aux[0] = "String";
                aux[1] = "nombre";
                aux[2] = producto.getNombre();
                break;
            case 3:
                aux[0] = "String";
                aux[1] = "descripcion";
                aux[2] = producto.getDescripcion();
                break;
        }
        return aux;
    }

    public ProductoC listarProductoNombre(String nombre) {
        PreparedStatement stmt = null;
        ProductoC producto = null;
        try {
            stmt = conn.prepareStatement("SELECT codigo,descripcion,nombre,imagen,precio from producto where producto.nombre=?");
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                producto = new ProductoC(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));

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
        return producto;
    }
}
