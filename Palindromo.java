public class Palindromo {
    public static void main(String[] args) {
    	String palavra = args[0];
		int tamanho = Integer.parseInt(args[1]);
		int qteLetras = palavra.length();

		String plv1[], plv2[];
		int i, j, inicio, fim;
      	boolean teste = false;
	
		plv1 = new String[qteLetras];
		plv2 = new String[qteLetras];

		for(i = 1; i <= qteLetras; i++){
			plv1[i] = palavra.substring(i,i);
		}

		for(i = qteLetras; i >= 1; i--){
			plv2[i] = palavra.substring(i,i);
		}
		
      	j = tamanho;
     	for(i=1; i<j && teste == false; i++){
            if(plv1[i].equals(plv2[j])){
              inicio = i;
              fim = j;
              do{
                for(i=inicio; i<j; i++){
                  if(plv1[i].equals(plv2[j])){
                  	teste = true;
                  	i++;
                    j--;
                  }else{
                  	teste = false;
                  }
                }
              }while(teste == true);
            }
          j++;
      	}
      	
      for(i=1; i<=qteLetras; i++){
      	System.out.print(plv1[i]);
      }
	}
}
