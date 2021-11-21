package Sistema;
/**
 * @author Agustin Martinez y Lucas Manzanares
*/

import java.util.ArrayList;

public class Clientes {
    //Atributos del cliente
    private String nombre;
    private String direccion;
    private String telefono;

    //Constructor
    public Clientes(String nombre, String direccion, String telefono) {
	this.nombre = nombre;
	this.direccion = direccion;
	this.telefono = telefono;
    }

    //Getters y setters
    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
	this.telefono = telefono;
    }

    //Metodo para imprimir los datos del cliente
    @Override
    public String toString() {
	return getNombre()+ " ("+ getDireccion() + " - " + getTelefono()+ ")";
    }

    //Arraylist de clientes
    public static ArrayList<Clientes> ListaClientes = new ArrayList<Clientes>();
    //Metodo para imprimir los datos del cliente
    public static void imprimirCliente() {
	for(Clientes cliente : ListaClientes) {
	    System.out.println(cliente);
	}
    }
    
    //Pasar de arraylist a array
    public static String[] arrayClientes(){
        String[] arrayClientes = new String[ListaClientes.size()];
        for (int i = 0; i < ListaClientes.size(); i++) {
	    arrayClientes[i] = ListaClientes.get(i).getNombre();
        }
        return arrayClientes;
    }

    //Guarda el cliente
    public static void GuardarCliente(String nombre, String direccion, String telefono){
	Clientes cliente = new Clientes(nombre, direccion, telefono);
	Clientes.ListaClientes.add(cliente);
    }
}