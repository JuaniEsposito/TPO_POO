package tpPOO;

public class MetodoDePago {
	
	private Efectivo efec;
	private Debito deb;
	private Credito cred;
	private int PrecioTotal;

	public int getPrecioTotal() {
		return PrecioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.PrecioTotal = precioTotal;
	}

	public Efectivo getEfec() {
		return efec;
	}

	public void setEfec(Efectivo efec) {
		this.efec = efec;
		this.setPrecioTotal(efec.getPrecioTotal());
	}

	public Debito getDeb() {
		return deb;
	}

	public void setDeb(Debito deb) {
		this.deb = deb;
		this.setPrecioTotal(deb.getMonto());
	}

	public Credito getCred() {
		return cred;
	}

	public void setCred(Credito cred) {
		this.cred = cred;
		this.setPrecioTotal(cred.getCantidadCuotas());
	}
	
	public MetodoDePago() {
		
		efec = null;
		deb = null;
		cred = null;
	}
	
	

}
