package controller;

public class somaController {
	
	public somaController() {
		
		super();
		
	}
	
	public int soma(int valor) {
		
		//O valor é subtraído toda vez que a função é chamada novamente, sendo assim, quando ele for menor ou igual a zero, ele deve retornar
		//o valor 0 para que possa ser realizada a soma apenas dos valores
		if (valor <= 0) {
			
			return 0;
			
		} else {
			
			return valor + soma(valor - 1);
			//O valor sempre será somado com ele mesmo subtraído por um a cada chamada da função
			
		}
		
	}
	
}