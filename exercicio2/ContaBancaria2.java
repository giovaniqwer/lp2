public class ContaBancaria2 {
    int contaCorrente, agencia;
    double saldo, limiteExtra;
    String titularConta;
    
    public void imprimirAgencia(int agencia){
        System.out.println("A agência é: " + this.agencia);
    }
    
    public void imprimirContaCorrente(int contaCorrente){
        System.out.println("A conta-corrente é: "+ this.contaCorrente);
    }
    
    public void imprimirTitular(String titularConta){
        System.out.println("O titular da conta é: " + this.titularConta);
    }
    
    public void imprimirSaldo(double saldo){
        System.out.println("Saldo: "+ this.saldo);
    }

    public void imprimirSaldoTotal(double saldo, double limiteExtra){
        double soma = this.saldo + this.limiteExtra;
        System.out.println("O saldo total é: "+ soma);
    }
    
    public static void main(String[] args) {
	 	ContaBancaria2 cb1 = new ContaBancaria2();
    		cb1.titularConta = "Giovani";
		cb1.agencia=3610;
		cb1.contaCorrente=15766;
		cb1.saldo=35.54;
		cb1.limiteExtra=50;
		cb1.imprimirTitular(cb1.titularConta);
		cb1.imprimirAgencia(cb1.agencia);
		cb1.imprimirContaCorrente(cb1.contaCorrente);
		cb1.imprimirSaldo(cb1.saldo);
		cb1.imprimirSaldoTotal(cb1.saldo, cb1.limiteExtra);
		
		ContaBancaria2 cb2 = new ContaBancaria2();
    		cb2.titularConta="Rafaela";
		cb2.agencia=810;
		cb2.contaCorrente=6132;
		cb2.saldo=42.31;
		cb2.limiteExtra=75.00;
		cb2.imprimirTitular(cb2.titularConta);
		cb2.imprimirAgencia(cb2.agencia);
		cb2.imprimirContaCorrente(cb2.contaCorrente);
		cb2.imprimirSaldo(cb2.saldo);
		cb2.imprimirSaldoTotal(cb2.saldo, cb2.limiteExtra);
    }
