package Sistema;

import java.util.ArrayList;

public class Productos {
    //Atributos
    private String categoria;
    private String nombre;
    private String Precio;

    //constructor
    public Productos(String categoria, String nombre, String precio) {
	this.categoria = categoria;
	this.nombre = nombre;
	this.Precio = precio;
    }

    //Getters y setters
    public String getCategoria() {
	return categoria;
    }

    public void setCategoria(String categoria) {
	this.categoria = categoria;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getPrecio() {
	return Precio;
    }

    public void setPrecio(String precio) {
	Precio = precio;
    }

    //Metodos
    @Override
    public String toString() {
	return "Producto: [categoria:" + categoria + ", nombre:" + nombre + ", Precio:" + Precio + "]";
    }

    //ArrayList de categorias
    public static ArrayList<Productos> listaProductos = new ArrayList<>();
    //Metodo para imprimir los datos del cliente
    public static void imprimirProductos() {
	for(Productos productos : listaProductos) {
	    System.out.println(productos);
	}
    }
	
    //Pasar de arraylist a array
    public static String[] arrayProductos(){
	String[] arrayProductos = new String[listaProductos.size()];
	for (int i = 0; i < listaProductos.size(); i++) {
	    arrayProductos[i] = listaProductos.get(i).getNombre();
	}
	return arrayProductos;
    }
    
    //Guarda el cliente
    public static void GuardarProducto(String categoria, String nombre, String precio){
	Productos productos = new Productos(categoria, nombre, precio);
	Productos.listaProductos.add(productos);
    }
}
