package Sistema;
/**
 * @author Agustin Martinez y Lucas Manzanares
*/

public class Validador {
//Validador de Clientes
    //Validar que ningun campo este vacio
    public static boolean ValCampVacios(String nombre, String direccion, String telefono){
	if(nombre.equals("") || direccion.equals("") || telefono.equals("")) {
	    return true;
	}
	return false;
    }
    //validar que el nombre no tenga numeros
    public static boolean ValNombre(String nombre){
	for(int i = 0; i < nombre.length(); i++){
	    if(Character.isDigit(nombre.charAt(i))){
		return true;
	    }
	}
	return false;
    }
    //Comparador de nombres
    public static boolean ValExsCliente(String nombre){
	String NombreCliente = nombre;
	for(int i = 0; i < Clientes.ListaClientes.size(); i++){
	    if (NombreCliente.equals(Clientes.ListaClientes.get(i).getNombre())){
		return true;
	    }
	}
	return false;
    }
    //Validar que el numero no tenga mas de 9 digitos
    public static boolean ValDigTel(String telefono){
	if(telefono.length() > 9){
	    return true;
	}
	return false;
    }
    //Validar que el telefono no tenga letras
    public static boolean ValLetTel(String telefono){
	for(int i = 0; i < telefono.length(); i++){
	    if(Character.isLetter(telefono.charAt(i))){
		return true;
	    }
	}
	return false;
    }
    //Validar que el telefono no tenga espacios
    public static boolean ValEspTel(String telefono){
	for(int i = 0; i < telefono.length(); i++){
	    if(Character.isSpaceChar(telefono.charAt(i))){
		return true;
	    }
	}
	return false;
    }

//Validador de Categorias
    //Validar que el campos no esten vacios
    public static boolean ValCamposVacios(String descripcion, String prioridad, String detalles){
	if(descripcion.equals("") || prioridad.equals("") || detalles.equals("")){
	    return false;
	}
	return true;
    }
    //Validar que el campo de prioridad sea un numero
    public static boolean ValPrioridad(String prioridad){
	for(int i = 0; i < prioridad.length(); i++){
	    if(Character.isLetter(prioridad.charAt(i))){
		return true;
	    }
	}
	return false;
    }
    //Validar que la prioridad este entre 1 y 10
    public static boolean ValPrioridadNum(String prioridad){
	if(Integer.parseInt(prioridad) > 1 || Integer.parseInt(prioridad) < 10){
	    return false;
	}
	return true;
    }

//Validador de Productos
//Validar que el campo de Precio sea un numero
    public static boolean ValPrecio(String precio){
	for(int i = 0; i < precio.length(); i++){
	    if(Character.isLetter(precio.charAt(i))){
		return true;
	    }
	}
	return false;
    }
}
