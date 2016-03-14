public class Palindromo {
	public int ehpalindromo(String palavra){
		int qteLetras = palavra.length();
		String palavra2 = "";
		String palavra3 = "";

		for(int i=0; i <= qteLetras - 5; i++){
			palavra2 = palavra.substring(i,i+5);
			for(int j = 4; j>=0; j--){
				palavra3 = palavra3 + palavra2.charAt(j);
			} 
			if(palavra2.equals(palavra3)){
				return i;
			}
			palavra3 = "";
		}
		return -1;
	}

    //Feito por Giovani Júnior
    public static void main(String[] args) {
    	String palavra = args[0];
		Palindromo teste = new Palindromo();
		int a = teste.ehpalindromo(palavra);
		if(a == -1){
			System.out.println("Não é palíndromo!!!");		
		}else{
			System.out.println("O palíndromo é : " +palavra.substring(a,a+5));
			System.out.println("Inicia na posição " + a+" e vai até a posição " + (a+5));
		}
	}
}
