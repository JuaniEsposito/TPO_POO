package tpPOO;

public class Credito {
	private int CantidadCuotas;
	private CantidadDeCuotas cuotas;

	public int getCantidadCuotas() {
		return CantidadCuotas;
	}

	public void setCantidadCuotas(int cantidadCuotas) {
		this.CantidadCuotas = cantidadCuotas;
	}

	public CantidadDeCuotas getCuotas() {
		return cuotas;
	}

	public void setCuotas(CantidadDeCuotas cuotas) {
		this.cuotas = cuotas;
	}

	public Credito(int cantidadCuotas, CantidadDeCuotas cuotas) {
		CantidadCuotas = cantidadCuotas;
		this.cuotas = cuotas;
	}
	//agregar recargo por cuotas

}
