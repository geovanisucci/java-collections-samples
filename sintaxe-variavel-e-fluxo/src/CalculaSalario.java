
public class CalculaSalario implements ICalculaSalario {

	@Override
	public double Calcula(double salarioBruto, double desconto) {
		
		double total = salarioBruto - desconto;
		
		return total;
	}

}
