package desafios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

		public class Exer01 {

		public static void main(String[] args) throws IOException {
			
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int a = Integer.parseInt(st.nextToken()); // Pimentões amarelos
		    int b = Integer.parseInt(st.nextToken()); // Pimentões vermelhos
		    int total = a + b; // Altere o valor da variável com o cálculo esperado
		    
		    System.out.println("X = " + total);
		  }
		

	}


