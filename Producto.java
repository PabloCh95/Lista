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
public class Producto {
	private String codigo;
	private String descripcion;
	private double importe;
	private int stock;
	
	Producto()
	{
		
	}
	Producto(String codigo, String descripcion, double importe, int stock)
	{
		setCodigo(codigo);
		setDescripcion(descripcion);
		setImporte(importe);
		setStock(stock);
	}
//-----------------------------------GETTERS Y SETTERS-----------------------------------
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
//---------------------------------------toString------------------------------------------------
	public String toString() 
	{
		return "Codigo: "+ getCodigo() +"\t\t"+"Descripcion: " + getDescripcion() +"\t\t"+ "Importe: "+getImporte()+"\t\t"+"Stock: "+getStock();
	}
}
