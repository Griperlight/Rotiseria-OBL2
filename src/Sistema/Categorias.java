package Sistema;
/**
 * @author Agustin Martinez y Lucas Manzanares
*/

import java.util.ArrayList;

public class Categorias {
    //Atributos
    private String descripcion;
    private String prioridad; //1 a 10
    private String detalles;

    //Constructor
    public Categorias(String descripcion, String prioridad, String detalles) {
	this.descripcion = descripcion;
	this.prioridad = prioridad;
	this.detalles = detalles;
    }

    //Getters y setters
    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public String getPrioridad() {
	return prioridad;
    }

    public void setPrioridad(String prioridad) {
	this.prioridad = prioridad;
    }

    public String getDetalles() {
	return detalles;
    }

    public void setDetalles(String detalles) {
	this.detalles = detalles;
    }

    //Metodos
    @Override
    public String toString() {
	return "Descripcion:" + descripcion + " Prioridad:" + prioridad + " Detalles:" + detalles;
    }
    
    //ArrayList de categorias
    public static ArrayList<Categorias> ListaCategorias = new ArrayList<>();
    //Imprimir todas las categorias
    public static void imprimirCategorias(){
	for (Categorias categoria : ListaCategorias) {
	    System.out.println(categoria);
	}
    }

    //Pasar de arraylist a array
    public static String[] arrayCategorias(){
        String[] arrayCategorias = new String[ListaCategorias.size()];
        for (int i = 0; i < ListaCategorias.size(); i++) {
	    arrayCategorias[i] = ListaCategorias.get(i).getDescripcion();
        }
        return arrayCategorias;
    }

    //Guarda el Categoria
    public static void GuardarCategoria(String descripcion, String prioridad, String detalles){
	Categorias categorias = new Categorias(descripcion, prioridad, detalles);
	Categorias.ListaCategorias.add(categorias);
    }
}
