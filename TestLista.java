package ejer3colecciones;
/*
 * */
import java.util.LinkedList;
public class TestLista {
	public static void main(String[] args) 
	{	
		Producto producto1=new Producto("023dsdwe","Papel Higienico",30.3,30);
		Producto producto2=new Producto("123euu2","Yerba Mate",20.5,40);
		Producto producto3=new Producto("40231esa","Mate Cocido",50,12);
		Producto producto4=new Producto("1256ESP","Azucar",40.00,52);
		
		LinkedList<Producto> productos1=new LinkedList<Producto>();
		productos1.add(producto1);
		productos1.add(producto2);
		productos1.add(producto3);
		productos1.add(producto4);
		
		Lista lista1=new Lista(productos1);
		
		/*lista1.imprimirLista();
		lista1.incrementoImporte(producto1);
		//falta terminar de probar*/
		lista1.controlStock(producto1);
		lista1.listaProductos();
		lista1.listaProductos2();
	}
}
