package ejer3colecciones;
/*3)Se tiene ordenada por código de producto, una lista donde cada Producto, tiene como 
* atributos código, descripción, importe y stock. Implementar métodos para:
A)Imprimir la lista completa.
B)Dado un entero k, imprimir el k-ésimo elemento.
C)Incrementar el importe de un producto dado en un 10%.
D)Devolver el stock de un producto dado o cero si no esta.
E)Devolver una lista de productos con stock inferior a 50 unidades.
F)Devolver una lista de productos con stock superior o iguala 50 unidades
 * */
import java.util.LinkedList;
public class Lista {
	private LinkedList <Producto> productos;
//--------------------------------CONSTRUCTORES--------------------------------------------------
	public Lista(){
		
	}
	public Lista(LinkedList<Producto> productos)
	{
		setProductos(productos);
	}
//---------------------------------GETTERS Y SETTERS---------------------------------------------
	public void setProductos(LinkedList<Producto> productos) 
	{
		this.productos=productos;
	}
	public LinkedList<Producto> getProductos()
	{
		return this.productos;
	}
//-----------------------------------METODOS RESOLUTIVOS----------------------------------------
//A)Imprimir la lista completa.
	public void imprimirLista() 
	{	
		System.out.println("Lista:");
		for(Producto es:getProductos()) 
		{
			System.out.println( es.toString() );
		
		}
	}
//B)Dado un entero k, imprimir el k-ésimo elemento.
	public void imprimirIndice(int indice)
	{
		System.out.println("\nContenido de lista en la ubicacion: "+indice);
		System.out.println(getProductos().get(indice));
	}
//C)Incrementar el importe de un producto dado en un 10%.
	public void incrementoImporte(Producto producto) 
	{	double porciento;
		double incremento;
		
			porciento=producto.getImporte()*0.1;
			incremento=producto.getImporte()+porciento;
			System.out.println(producto.getDescripcion());
			System.out.println("el 10% del producto es: "+ porciento);
			System.out.println("el incremento del Importe del producto es : "+incremento);
	}
//METODOS QUE FALTAN
/*D)Devolver el stock de un producto dado o cero si no esta.*/
	
	public int controlStock(Producto producto) 
	{
		if(producto.getStock()>0) 
		{
			return producto.getStock();
		}
		return 0;
	}
/*	
E)Devolver una lista de productos con stock inferior a 50 unidades.*/

	public void listaProductos()
	{		System.out.println("Lista de productos con stock inferior a 50: ");
			for(Producto producto:getProductos()) 
			{	
				if((producto.getStock()<50)) {
					System.out.println(producto.toString());
				}
			}
	}

/*
F)Devolver una lista de productos con stock superior o iguala 50 unidades*/
	public void listaProductos2() 
	{	System.out.println(" Lista de productos con stock mayor o igual a 50: ");
		for(Producto producto:getProductos()) 
		{	
			if((producto.getStock()>=50)) {
		
				System.out.println(producto);
			}
		}
	}
}
