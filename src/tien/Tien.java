/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tien;

/**
 *
 * @author Estudiante
 */
public class Tien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Tienda tienda= new Tienda("A");
    Producto producto= new Producto ("P", 1,2);
    
    tienda.producto = producto;
      
    
   double precioProductoTienda = tienda.producto.getPrecio();
   String nombreProducto = tienda.producto.getNombre();
   
   System.out.println("Precio producto "+ nombreProducto+ " = " + precioProductoTienda );
    
    }
    
    
    
    
    
    
}
