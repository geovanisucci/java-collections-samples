
public class TestaConversao {

	public static void main(String[] args) {
		
		try {
			double salario = 1270.50;
			
			String valor = String.valueOf(salario);
			
			System.out.println(valor);
			
			int a = 5;
			
			for (int i = 0; i <= a; i++) {
				
				System.out.println("la�o " + i);
				
				if(i == 2) {
					break;
				}
				
			}
			
			
			ICalculaSalario calc = null; //new CalculaSalario();
			
			double tot = calc.Calcula(250, 50);
			
			System.out.println(tot);
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
			
		}
		
		

	}

}
