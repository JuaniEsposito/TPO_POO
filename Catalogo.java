package tpPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
	private ArrayList<Productos> Inventario;
	
	public Catalogo() {
		this.Inventario = new ArrayList<Productos>();
	}
	
	public void ListarProductos() {
		for(Productos p : Inventario) {
			System.out.println(p.getDescipcion());
		}
		System.out.println("  ");
		System.out.println("Productos que necesitan reposicion urgente:");
		for(Productos p : Inventario) {
			if(p.getCantidadStock()<p.getStockMinimo()) {
				System.out.println(p.getDescipcion());
			}	
		}
	}
	
	public void ModificarProductos(int cod) {
		Productos b = this.BuscarProducto(cod);
		if(b==null) {
			System.out.println("el producto no existe");
		}else {
			Scanner s = new Scanner	(System.in);
			System.out.println("nuevo nombre: ");
			String desc = s.next();
			b.setDescipcion(desc);
			System.out.println("nuevo precio unitario: ");
			int precint = s.nextInt();
			b.setPrecioUnitario(precint);
			System.out.println("nuevo stock: ");
			int sto = s.nextInt();
			b.setCantidadStock(sto);
		}
		
		
	}
	public void CargarProductos(Productos prod) {
	    Inventario.add(prod);
	}
	
	public void BajarProducto(int cod) {
		Productos b = this.BuscarProducto(cod);
		if(b==null) {
			System.out.println("el producto no existe");
		}else {
		Inventario.remove(b);
		}
	}
	
	public Productos BuscarProducto(int cod) {
	    Productos aux = null;
	    for (Productos p : Inventario) {
	        if (p.getCodigo() == cod) {
	            aux = p;
	            break;
	        }
	    }
	    return aux;
	}
	public ArrayList<Productos> getInventario() {
		return Inventario;
	}
	public void setInventario(ArrayList<Productos> inventario) {
		Inventario = inventario;
	}

}
