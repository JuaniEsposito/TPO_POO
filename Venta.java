package tpPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
	private int PrecioTotal;
	private ArrayList<Cobro> Producto;
	private MetodoDePago MetodoDePago;
	
	public Venta() {
		this.Producto = new ArrayList<Cobro>();
		this.MetodoDePago = null;
	}
	
	public void RealizarVenta(Catalogo ca) {
		Scanner a = new Scanner(System.in);
		while(true) {
			this.Cobrar(ca);
			System.out.println("presione 0 para elegir el metodo de pago: ");
			int v = a.nextInt();
			if(v == 0) {
					break;
			}
		}
		int pt = 0;
		for(Cobro c : Producto) {
			pt = pt + c.getPrecioTotal() ;
		}
		this.setPrecioTotal(pt);
		Scanner d = new Scanner(System.in);
		
		System.out.println("efectivo: 1");
		System.out.println("credito: 2");
		System.out.println("debito: 3");
		System.out.println("elija su opcion: ");
		int op4 = d.nextInt();
		if(op4 == 1) {
			Efectivo ef = new Efectivo((int) (this.getPrecioTotal()*0.9));
			MetodoDePago mp = new MetodoDePago();
			mp.setEfec(ef);
			this.setMetodoDePago(mp);
		} // no esta funcionando revisar!!!
		if(op4 == 2) {
			Scanner d1 = new Scanner(System.in);
			System.out.println("elija entre 1, 2, 3, o 6 cuotas: ");
			int op5 = d1.nextInt();
			
			if(op5 == 1) {
				Credito cr = new Credito(this.getPrecioTotal(), CantidadDeCuotas.UNO);
				MetodoDePago mp = new MetodoDePago();
				mp.setCred(cr);
				this.setMetodoDePago(mp);
			}
			if(op5 == 2) {
				Credito cr = new Credito(this.getPrecioTotal()/2 , CantidadDeCuotas.DOS);
				MetodoDePago mp = new MetodoDePago();
				mp.setCred(cr);
				this.setMetodoDePago(mp);
			}
			if(op5 == 3) {
				Credito cr = new Credito(this.getPrecioTotal()/3 , CantidadDeCuotas.TRES);
				MetodoDePago mp = new MetodoDePago();
				mp.setCred(cr);
				this.setMetodoDePago(mp);
			}
			if(op5 == 6) {
				Credito cr = new Credito(this.getPrecioTotal()/6 , CantidadDeCuotas.SEIS);
				MetodoDePago mp = new MetodoDePago();
				mp.setCred(cr);
				this.setMetodoDePago(mp);
			}
			
		}
		if(op4 == 3) {
			Debito deb = new Debito(pt); 
			MetodoDePago mp = new MetodoDePago();
			mp.setDeb(deb);
			this.setMetodoDePago(mp);
		}
	}

	public int getPrecioTotal() {
		return PrecioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.PrecioTotal = precioTotal;
	}

	public ArrayList<Cobro> getProducto() {
		return Producto;
	}

	public void setProducto(Cobro ps) {
		this.Producto.add(ps);
	}

	public MetodoDePago getMetodoDePago() {
		return MetodoDePago;
	}

	public void setMetodoDePago(MetodoDePago metodoDePago) {
		this.MetodoDePago = metodoDePago;
	}
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
			this.setProducto(co);
		}
	}

	

}
