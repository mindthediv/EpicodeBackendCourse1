package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println("Moltiplica 3 e 5");
		System.out.println(Moltiplica(3,5));
		System.out.println("Concatena 'wow' e 5");
		System.out.println(Concatena("wow",5));
		System.out.println("Inserisci in Array");
		String[] arr = {"a","e","i","o","u"} ;
		System.out.println(InserisciInArray(arr, "ciao"));
		System.out.println("///GetWords///");
		System.out.println(GetWords());
		System.out.println("///Perimetro del rettangolo///");
		System.out.println(PerimetroRettangolo());
		System.out.println("Verifica un numero (Dispari = 1, Pari = 0)");
		PariDispari();
		System.out.println("///Area del triangolo///");
		AreaTriangolo();
		}

		static int Moltiplica(int x, int y) {
			return  x*y;
		}
		
		static String Concatena(String abc, int x) {
			return abc+x;
		}

	
		static String[] InserisciInArray(String[] arr, String def) {
			arr = new String[6];
			String iii = arr[2];
			String iv = arr[3];
			String v = arr[4];
			arr[2] = def;
			arr[3] = iii;
			arr[4] = iv;
			arr[5] = v;
			for (int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			return arr;
		}
		
		static String GetWords() {
			Scanner input = new Scanner(System.in);
			System.out.println("inserisci la prima stringa: ");
			String a = input.nextLine();
			System.out.println("inserisci la seconda stringa: ");
			String b = input.nextLine();
			System.out.println("inserisci la terza stringa: ");
			String c = input.nextLine();
			System.out.println("Ecco qui: ");
			return a + " " + b + " " + c + ", al contrario: " + c + " " + b+ " " +a; 
		}
		
		
		static double PerimetroRettangolo() {
			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci il valore della base");
			double x = input.nextDouble();
			System.out.println("Inserisci il valore dell'altezza");
			double y = input.nextDouble();
			System.out.println("Risultato:");
			return x*2+y*2;
		}
		static void PariDispari() {
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			if (x%2==0) {
				System.out.println("Risultato: " + 0);
			}else {
				System.out.println("Risultato: " + 1);
			}
		}
		static void AreaTriangolo() {
			
			Scanner s1 = new Scanner(System.in);
	         System.out.println("Inserisci il primo lato: ");
	          double x = s1.nextDouble();
	         System.out.println("Inserisci il secondo lato: ");
	          double y = s1.nextDouble();
	         System.out.println("Inserisci il terzo lato: ");
	         double z = s1.nextDouble();  
	        if((x+y)>z && (x+z)>y && (y+z)>x) {
	            double s=(x+y+z)/2;
	            double  area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
	             System.out.println("L'area del triangolo è: " + area);    
	           }
	         else  {
	           System.out.println("L'area del triangolo non esiste");
	         }
		}

}



