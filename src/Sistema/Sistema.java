package Sistema;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JButton;

import Interfaz.Rotiseria;

public class Sistema {

	//Crear Botones con los productos de cada categoria
	public static void BotonesPRO(){
		for(int i = 0; i < Productos.listaProductos.size(); i ++){
			if(Productos.listaProductos.get(i).getCategoria().equals(Rotiseria.comboProductos.getSelectedItem().toString())){
				//para todo los productos de la categoria seleccionada
				JButton boton = new JButton(Productos.listaProductos.get(i).getNombre());
				boton.setMargin(new Insets(-5, -5, -5, -5));
				boton.setBackground(Color.BLACK);
				boton.setForeground(Color.WHITE);
				boton.setText("" +"$" +""); // texto ejemplo, a completar;
				boton.addActionListener(new ActionListener( ) {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						
					}
				});
				Rotiseria.panelProducto.add(boton);
			}
		}	
	}
	
    //Cargar Categorias al comboProductos
    public static void cargarComboP(){
	Rotiseria.comboProductos.setModel(new javax.swing.DefaultComboBoxModel<String>(){
	    String[] strings = Categorias.arrayCategorias();
	    @Override
	    public int getSize() { return strings.length; }
	    @Override
	    public String getElementAt(int i) { return strings[i]; }
        });
    }

}
