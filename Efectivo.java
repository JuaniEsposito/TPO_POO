package tpPOO;

public class Efectivo {
	private int PrecioTotalMenos10;

	public int getPrecioTotal() {
		return PrecioTotalMenos10;
	}

	public void setPrecioTotal(int precioTotal) {
		this.PrecioTotalMenos10 = precioTotal;
	}

	public Efectivo(int precioTotalMenos10) {
		PrecioTotalMenos10 = precioTotalMenos10;
	}
	
	

}
