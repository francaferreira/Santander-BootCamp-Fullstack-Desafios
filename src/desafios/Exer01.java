package desafios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

		public class Exer01 {

		public static void main(String[] args) throws IOException {
			
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int a = Integer.parseInt(st.nextToken()); // Piment�es amarelos
		    int b = Integer.parseInt(st.nextToken()); // Piment�es vermelhos
		    int total = a + b; // Altere o valor da vari�vel com o c�lculo esperado
		    
		    System.out.println("X = " + total);
		  }
		

	}


