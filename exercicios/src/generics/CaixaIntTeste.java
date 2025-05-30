package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		
		Integer coisasA = caixaA.abrir();
		System.out.println(coisasA);
	}

}
