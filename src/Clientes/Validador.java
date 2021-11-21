package Clientes;
/**
 * @author Agustin Martinez y Lucas Manzanares
*/

import javax.swing.JOptionPane;

public class Validador extends JFClientes{
    
    //Validador de cliente
    public static void ClientValidation() {
        if(ValCampVacios(textNombre.getText(), textDireccion.getText(), textTelefono.getText())){
            JOptionPane.showMessageDialog(null, "Registro incompleto", "Error",JOptionPane.ERROR_MESSAGE);
        }
        if(ValNombre(textNombre.getText())){
            JOptionPane.showMessageDialog(null, "El nombre propocionado contiene numeros", "Error",JOptionPane.ERROR_MESSAGE);
            textNombre.setText("");
        }
        if(ValExsCliente(textNombre.getText())){
            JOptionPane.showMessageDialog(null, "El cliente ya existe", "Error",JOptionPane.ERROR_MESSAGE);
            textNombre.setText("");
        }
        if(ValDigTel(textTelefono.getText())){
            JOptionPane.showMessageDialog(null, "Numero de telefono no valido", "Error",JOptionPane.ERROR_MESSAGE);
            textTelefono.setText("");
        }
        if(ValLetTel(textTelefono.getText())){
            JOptionPane.showMessageDialog(null, "Numero de telefono contiene letras", "Error",JOptionPane.ERROR_MESSAGE);
            textTelefono.setText("");
        }
        if(ValEspTel(textTelefono.getText())){
            JOptionPane.showMessageDialog(null, "Numero de telefono contiene espacios", "Error",JOptionPane.ERROR_MESSAGE);
            textTelefono.setText("");
        }
        //Si se validan todos los campos se agrega el cliente
        if(!ValCampVacios(textNombre.getText(), textDireccion.getText(), textTelefono.getText()) && !ValNombre(textNombre.getText()) && !ValExsCliente(textNombre.getText()) && !ValDigTel(textTelefono.getText()) && !ValLetTel(textTelefono.getText()) && !ValEspTel(textTelefono.getText())){
            GuardarCliente(textNombre.getText(), textDireccion.getText(), textTelefono.getText());
            JOptionPane.showMessageDialog(null, "Cliente registrado", "Registro",JOptionPane.INFORMATION_MESSAGE);
            textNombre.setText("");
            textDireccion.setText("");
            textTelefono.setText("");
        }
    }

    //Validar que ningun campo este vacio
    public static boolean ValCampVacios(String nombre, String direccion, String telefono){
        boolean vacio = false;
        if(nombre.equals("") || direccion.equals("") || telefono.equals("")) {
            vacio = true;
        }
        return vacio;
    }

    //validar que el nombre no tenga numeros
    public static boolean ValNombre(String nombre){
        boolean numeros = false;
        for(int i = 0; i < nombre.length(); i++){
            if(Character.isDigit(nombre.charAt(i))){
                numeros = true;
            }
        }
        return numeros;
    }

    //Comparador de nombres
	public static boolean ValExsCliente(String nombre){
		boolean retorno = false;
		String NombreCliente = nombre;
		for(int i = 0; i < Clientes.ListaClientes.size(); i++){
			Clientes NombreClientes = Clientes.ListaClientes.get(i);
			if (NombreCliente.equals(NombreClientes.getNombre())){
				retorno = true;
			}
		}
		return retorno;
	}

    //Validar que el numero no tenga mas de 9 digitos
    public static boolean ValDigTel(String telefono){
        boolean numeros = false;
        if(telefono.length() > 9){
            numeros = true;
        }
        return numeros;
    }

    //Validar que el telefono no tenga letras
    public static boolean ValLetTel(String telefono){
        boolean letras = false;
        for(int i = 0; i < telefono.length(); i++){
            if(Character.isLetter(telefono.charAt(i))){
                letras = true;
            }
        }
        return letras;
    }

    //Validar que el telefono no tenga espacios
    public static boolean ValEspTel(String telefono){
        boolean espacios = false;
        for(int i = 0; i < telefono.length(); i++){
            if(Character.isSpaceChar(telefono.charAt(i))){
                espacios = true;
            }
        }
        return espacios;
    }
    
    //Guarda el cliente
    public static void GuardarCliente(String nombre, String direccion, String telefono){
        Clientes cliente = new Clientes(nombre, direccion, telefono);
        Clientes.ListaClientes.add(cliente);
    }
}
