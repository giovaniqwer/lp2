public class Calculadora {
        int x,y;
	public void soma(int x, int y){
		System.out.println("A soma dos dois números é: " + (this.x+this.y));
	}

	public void subtracao(int x, int y){
		System.out.println("A subtração dos dois números é: " + (this.x-this.y));
	}

	public void multiplicacao(int x, int y){
		System.out.println("A multiplicação dos dois números é: " + (this.x*this.y));
	}

	public void divisao(int x, int y){
		System.out.println("A divisão dos dois números é: " + (this.x/this.y));
	}

	public static void main (String [] args){
		Calculadora ca1 = new Calculadora();
		ca1.x =4;
		ca1.y=3;
		ca1.soma(ca1.x, ca1.y);
		ca1.subtracao(ca1.x, ca1.y);
		ca1.multiplicacao(ca1.x, ca1.y);
		ca1.divisao(ca1.x, ca1.y);

		Calculadora ca2 = new Calculadora();
		ca2.x=20;
		ca2.y=5;
		ca2.soma(ca2.x, ca2.y);		
		ca2.subtracao(ca2.x, ca2.y);
		ca2.multiplicacao(ca2.x, ca2.y);
		ca2.divisao(ca2.x, ca2.y);

		Calculadora ca3 = new Calculadora();
		ca3.x=10;
		ca3.y=2;
		ca3.soma(ca3.x, ca3.y);		
		ca3.subtracao(ca3.x, ca3.y);
		ca3.multiplicacao(ca3.x, ca3.y);
		ca3.divisao(ca3.x, ca3.y);	
    }
}
