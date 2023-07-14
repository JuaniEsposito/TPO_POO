package tpPOO;

public class Productos {
	
	private String Descripcion;
	private int PrecioUnitario;
	private int CantidadStock;
	private int StockMinimo;
	private int Codigo;
	
	public Productos(String desc, int preciounit, int cantstock,int stockmin, int cod) {
		this.Descripcion = desc;
		this.PrecioUnitario = preciounit;
		this.CantidadStock = cantstock;
		this.StockMinimo = stockmin;
		this.Codigo = cod;
		
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}
	public String getDescipcion() {
		return Descripcion;
	}
	public void setDescipcion(String descipcion) {
		this.Descripcion = descipcion;
	}
	public int getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.PrecioUnitario = precioUnitario;
	}
	public int getCantidadStock() {
		return CantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.CantidadStock = cantidadStock;
	}
	public int getStockMinimo() {
		return StockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.StockMinimo = stockMinimo;
	}

}
