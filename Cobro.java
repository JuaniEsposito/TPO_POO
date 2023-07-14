package tpPOO;

import java.util.Scanner;

public class Cobro {
	private int Cantidad;
	private int PrecioTotal;
	private int ProductoVendido;
	
	public Cobro(int cant, int preciot, int prodvend) {
		this.Cantidad = cant;
		this.PrecioTotal = preciot;
		this.ProductoVendido = prodvend;
	}
	
	/*
	public void Cobrar(Catalogo cat) {
		Scanner op2 = new Scanner(System.in);
		System.out.println("codigo del producto: ");
		int cod = op2.nextInt();
		Productos p = cat.BuscarProducto(cod); 
		System.out.println("cantidad de unidades: ");
		int cantidad = op2.nextInt();
		int anterior = p.getCantidadStock();
		if(anterior<cantidad) {
			System.out.println("no hay stock suficiente!");
		}else {
			Cobro co = new Cobro(cantidad, p.getPrecioUnitario()*cantidad, p.getCodigo() );
			p.setCantidadStock(anterior - cantidad);
		}
	}*/
	
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		this.Cantidad = cantidad;
	}
	public int getPrecioTotal() {
		return PrecioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.PrecioTotal = precioTotal;
	}
	public int getProductoVendido() {
		return ProductoVendido;
	}
	public void setProductoVendido(int productoVendido) {
		this.ProductoVendido = productoVendido;
	}
	
	

}
