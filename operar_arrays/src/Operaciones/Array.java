package Operaciones;

public class Array {

	public static void main(String[] args) {
		
		int m[]=new int[10];
		rellenar_array(m);
		System.out.println();
		imprimir_array(m);
		System.out.println();
		sumar_array(m);
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	 //Metodo que rellena  un Array
		public static void rellenar_array(int x[]) {
			int i=0;
			for ( i=0;i<x.length;i++) {
				x[i]=(int)(Math.random()*20+1);
				System.out.print(x[i]+" ");
			}
			
		}
		//Metodo que rellena  un Array
				public static void ArrayLLeno(int x[]) {
					int i=0;
					for ( i=0;i<x.length;i++) {
						x[i]=(int)(Math.random()*20+1);
						System.out.print(x[i]+" ");
					}
					
				}
		
		//Metodo que imprime un Array
		
		public static void imprimir_array(int x[]) {
			int i=0;
			
			for ( i=0;i<x.length;i++) {
				
				System.out.print(x[i]+" ");
			}
					
		}

		//Metodo sumar elementos de un Array   
		
		public static void sumar_array(int x[]) {
			int i=0;
			int suma=0;
	           for ( i=0;i<x.length;i++) {
				 suma+= x[i];  
				
			}
	                  System.out.print(suma);     
		}
}
