package Joel_Larry;
import java.util.*;
public class Buses {
static Scanner lector = new Scanner(System.in);
	public void presentacion(double[]viajes,int gasolina, int parqueo,String[] chofer) {
		System.out.println("presentacion de ganacias general del dia");
		
	}






	public void viajes(int buses) {
		double[] viajes=new double[buses];
		double[] primer = new double[buses];
		double[] segundo = new double[buses];
		double[] tercer = new double[buses];
		String[] chofer = new String[buses];
		double brutoTotal;
		int gasolinaTotal;
		int parqueoTotal;
		double suma=0;
		for(int i=0,j=1;i<buses;i++,j++) {
			
			lector.nextLine();
			System.out.println("nombre del chofer del bus # "+j);
			 chofer[i] = lector.nextLine();
			System.out.println("¿Cuanto dinero recolecto en el primer viaje (6:00AM)?");
			 primer[i] = lector.nextInt();
			 System.out.println("detalles del primer viaje del bus # "+j);
			 System.out.println("ganancias netas "+primer[i]);
			 System.out.println("gasolina         -600");
			 double pagChofer=primer[i]*0.12;
			 System.out.println("pago a chofer    "+pagChofer);
			 double brutas= primer[i]-600-pagChofer;
			 System.out.println("ganancias brutas primer viaje "+brutas);
			 
			System.out.println("¿Cuanto dinero recolecto en el segundo  viaje (1:00PM)?");
			segundo[i] = lector.nextInt();
			System.out.println("detalles del segundo viaje del bus # "+j);
			 System.out.println("ganancias netas "+segundo[i]);
			 System.out.println("gasolina         -600");
			  pagChofer=segundo[i]*0.12;
			 System.out.println("pago a chofer    "+pagChofer);
			  brutas= segundo[i]-600-pagChofer;
			 System.out.println("ganancias brutas segundo viaje "+brutas);
			System.out.println("¿Cuanto dinero recolecto en el tercer  viaje (6:00PM)?");
			tercer[i] = lector.nextInt();
			System.out.println("detalles del tercer viaje del bus # "+j);
			 System.out.println("ganancias netas "+tercer[i]);
			 System.out.println("gasolina         -600");
			  pagChofer=tercer[i]*0.12;
			 System.out.println("pago a chofer    "+pagChofer);
			  brutas= tercer[i]-600-pagChofer;
			 System.out.println("ganancias brutas tercer viaje "+brutas);
		}
		for(int i=0; i<buses;i++) {
			viajes[i]=primer[i]+segundo[i]+tercer[i];
		}
		for(int i=0;i<buses;i++) {
			suma=suma+viajes[i];
		}
		int gasolina = 600*buses;
		int parqueo = 30*buses;
		System.out.println("numero de bus                       chofer                  ganancias netas");
		for(int i=0,j=1;i<buses;i++, j++) {
		System.out.println(j+"\t"+"\t"+"\t"+"\t"+chofer[i]+"\t"+"\t"+"\t"+"\t"+viajes[i]);
		}
		gasolinaTotal=gasolina*buses;
		parqueoTotal=parqueo*buses;
		brutoTotal= suma-gasolinaTotal-parqueoTotal;
		
		System.out.println("suma de las ganancias netas "+suma);
		System.out.println("gasolina total usada -"+gasolinaTotal);
		System.out.println("gastos por uso de parqueo -"+parqueoTotal);
		System.out.println("las ganacias brutas del dia fueron: "+brutoTotal);
		
	}
	



	public static void main(String[] args) {
		Buses a = new Buses();
		int t=0;
		do {
			System.out.println("Bienvenido a su control de ingresos diarios de su cooperatica de buses thelma mathus");
			System.out.println("a los choferes se paga el 12%");
			System.out.println("se echan 600 cordobas de gasolina por vuelta");
			System.out.println("y al final se paga 30 cordobas por bus de parqueo");
			System.out.println("¿Cuantos buses salieron hoy?");
			int buses = lector.nextInt();
			a.viajes(buses);
			System.out.println("¿Desea realizar otro control de ingresos de los buses?. Escriba (s) si o (n) no");
			char caract = lector.next().charAt(0);
		     switch(caract) {
		     case 's':
		     case 'S':
		    	 t=1;
		    	 System.out.println("con gusto");
		    	 break;
		     case 'n':
		     case 'N':
		    	 System.out.println("Para servirle!!!");
		    	 break;
		     default:
		     		while(caract!='s' && caract!='n') {
		     			System.out.println("Oops creo que se equivoco de caracter, porfavor introduzca uno valido (s) para otro control de ingresos de buses y (n) para salir");
		     			caract = lector.next().charAt(0);
		     			
		             }
		     		switch(caract) {
     				case 'n':
     				case 'N':
     					
     					System.out.println("Para servirle!!!");
   			    	 break;
     				case 's':
     				case 'S':
     					t=1;
     						System.out.println("con mucho gusto");
   			    	 break;
     			}
		     }
		}while(t==1);
		
		
		
	}

}
