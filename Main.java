package tpPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Productos p1 = new Productos("Gaseosa",50,100,25,111 );
		Productos p2 = new Productos("Papas fritas",20,10,30,222 );
		Productos p3 = new Productos("Doritos",15,40,15,333 );
		
		
		Catalogo c = new Catalogo();
		c.CargarProductos(p1);
		c.CargarProductos(p2);
		c.CargarProductos(p3);
		
		
		while(true) {
			System.out.println("---Menu Principal---");
			System.out.println("Opcion 1: Ver catalogo");
			System.out.println("Opcion 2: Realizar venta"); 
			Scanner op = new Scanner(System.in);
			System.out.print("Elija una opción o 0 para salir: ");
			int eleccion = op.nextInt();
			if (eleccion == 1) {
				System.out.println("---Catalogo---");
				System.out.println("Opcion 1: Modificar Productos");
				System.out.println("Opcion 2: Cargar Productos"); 
				System.out.println("Opcion 3: Bajar Productos"); 
				System.out.println("Opcion 4: Listar Productos"); 
				Scanner op1 = new Scanner(System.in);
				System.out.print("Elija una opción o 0 para salir: ");
				int eleccion1 = op.nextInt();
				if (eleccion1 == 1) {
					Scanner op2 = new Scanner(System.in);
					System.out.println("codigo del producto: ");
					int cod = op2.nextInt();
					c.ModificarProductos(cod);
					
				}else if(eleccion1 == 2) {
					Scanner op2 = new Scanner(System.in);
					System.out.println("codigo del producto: ");
					int cod = op2.nextInt();
					System.out.println("nombre del producto:");
					String nom = op2.next();
					System.out.println("stock disponible del producto: ");
					int st = op2.nextInt();
					System.out.println("stock minimo del producto: ");
					int stm = op2.nextInt();
					System.out.println("precio por unidad del producto: ");
					int pu = op2.nextInt();
					Productos ps = new Productos(nom, pu, st, stm, cod);
					c.CargarProductos(ps);
					System.out.println("Se ha añadido el producto:" + nom);
				}else if(eleccion1 == 3) {
					Scanner op2 = new Scanner(System.in);
					System.out.println("codigo del producto: ");
					int cod = op2.nextInt();
					c.BajarProducto(cod);
				}else if(eleccion1 == 4) {
					c.ListarProductos();
				}else {
					break;
				}
			}else if(eleccion == 2) {
				System.out.println("---Venta---");
				Venta v = new Venta();
				v.RealizarVenta(c);
				System.out.println("La venta se ha efectuado correctamente. El total es: " + v.getPrecioTotal());
				
			}else {
				break;
			}
		}
		
		
	}

}
