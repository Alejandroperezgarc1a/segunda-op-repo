import java.util.Scanner;
public class Pedido{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de salchipapas a pedir: ");
		int cantidad = sc.nextInt();
		double impuesto = 0.08;
		double precio_unidad = 65.000;
		double precio = cantidad * precio_unidad;
		double res = precio_imp(precio, impuesto);
		double res2 = total(precio, res);
		System.out.println(res);
		System.out.println(res2);


		
	}
	public static double precio_imp(double precio, double impuesto){
		double resultado = precio*impuesto;
		return resultado;
	}
	public static double total(double precio, double res){
		double resultado2 = precio + res;
		return resultado2;
	}

}