package Joel_Larry;
import java.util.*;
public class Buses {
static Scanner lector = new Scanner(System.in);
	public void presentacion(double[]viajes,int gasolina, int parqueo,String[] chofer) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("         PRESENTACION DE GANANCIAS GENERALES DEL DIA             ");
		System.out.println("-----------------------------------------------------------------");
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
		int verificar=1,verificar1=1,verificar2=1;
		double suma=0;
		for(int i=0,j=1;i<buses;i++,j++) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("Nombre del chofer del bus # "+j);
			System.out.println("-----------------------------------------------------------");
			lector.nextLine();
			chofer[i] = lector.nextLine();
			 while(verificar==1) {
			 try {
			System.out.println("-¿Cuanto dinero recolecto en el primer viaje (6:00AM)?");
			 primer[i] = lector.nextInt();
			 while (primer[i]<0) {
				 System.out.println("*Es una cantidad invalida de dinero,por favor vuelva a intentarlo:");
				 primer[i]=lector.nextInt();
			 }
			 verificar=0;
			 }catch(InputMismatchException e) {
				 System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
					System.out.println("");
					lector.next();
					verificar=1;
			 }
			 }
			 System.out.println("");
			 System.out.println("--------------------------------------------------------");
			 System.out.println("|DETALLES:                                             |");
			 System.out.println("--------------------------------------------------------");
			 System.out.println("-Detalles del primer viaje del bus #"+j);
			 System.out.println("Ganancias netas:                   "+primer[i]);
			 System.out.println("Gasolina:                          -600");
			 double pagChofer=primer[i]*0.12;
			 System.out.println("Pago a chofer:                     "+pagChofer);
			 double brutas= primer[i]-600-pagChofer;
			 System.out.println("Ganancias brutas primer viaje:     "+brutas);
			 System.out.println("--------------------------------------------------------");
			 System.out.println("");
			 while(verificar1==1) {
			 try {
			System.out.println("-¿Cuanto dinero recolecto en el segundo  viaje (1:00PM)?");
			segundo[i] = lector.nextInt();
			while(segundo[i]<=0) {
				System.out.println("*Esta es una cantidad invalida de dinero,por favor vuelva a intentarlo:");
				segundo[i]=lector.nextInt();
			}
			verificar1=0;
			}catch(InputMismatchException e) {
				 System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
					System.out.println("");
					lector.next();
					verificar1=1;
			}
			}
			 System.out.println("");
			 System.out.println("--------------------------------------------------------");
			 System.out.println("|DETALLES:                                             |");
			 System.out.println("--------------------------------------------------------");
			System.out.println("Detalles del segundo viaje del bus # "+j);
			 System.out.println("Ganancias netas:                     "+segundo[i]);
			 System.out.println("Gasolina:                            -600");
			  pagChofer=segundo[i]*0.12;
			 System.out.println("Pago a chofer:                       "+pagChofer);
			  brutas= segundo[i]-600-pagChofer;
			 System.out.println("Ganancias brutas segundo viaje:      "+brutas);
			 System.out.println("--------------------------------------------------------");
			 System.out.println("");
			 while(verificar2==1) {
			 try {
			System.out.println("-¿Cuanto dinero recolecto en el tercer  viaje (6:00PM)?");
			tercer[i] = lector.nextInt();
			while(tercer[i]<0) {
				System.out.println("*Esta es una cantidad invalida de dinero,por favor vuelva a intentarlo:");
				tercer[i]=lector.nextInt();
			}
			verificar2=0;
			}catch(InputMismatchException e) {
				 System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
					System.out.println("");
					lector.next();
					verificar2=1;
			 }
			 }
			System.out.println("--------------------------------------------------------");
			 System.out.println("|DETALLES:                                             |");
			 System.out.println("--------------------------------------------------------");
			System.out.println("Detalles del tercer viaje del bus # "+j);
			 System.out.println("Ganancias netas:                  "+tercer[i]);
			 System.out.println("Gasolina:                         -600");
			  pagChofer=tercer[i]*0.12;
			 System.out.println("Pago a chofer:                    "+pagChofer);
			  brutas= tercer[i]-600-pagChofer;
			 System.out.println("Ganancias brutas tercer viaje:    "+brutas);
			 System.out.println("--------------------------------------------------------");
			 System.out.println("");
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
	public void RegistroDeBuses() {
		Buses a = new Buses();
		int t=0,buses=0,verificar3=1;
		do {
			System.out.println("");
			System.out.println("====================================================================================");
			System.out.println("|        BIENVENIDO Al CONTROL DE INGRESOS DIARIOS DE BUSES DE SU COMPAÑIA         |");
			System.out.println("====================================================================================");
			System.out.println("");
			System.out.println("------------------------------------------------------------------");
			System.out.println("SE LE MOSTRARA LOS PARAMATROS PARA LA ADIMINISTRACION DE GANANCIAS:");
			System.out.println("------------------------------------------------------------------");
			System.out.println("");
			System.out.println("==========================================================================================================================================");
			System.out.println("|1.- A los choferes se paga el 12% de las ganancias totales                                                                              |");
			System.out.println("|2.- Se le estara administrando 600 cordobas de gasolina por cada vuelta que realice el vehiculo                                         |");
			System.out.println("|3.- Al finalizar cada turno del vehiculo,se tiene que pagar 30 cordobas por bus correspondiente al parqueo                              |");
			System.out.println("==========================================================================================================================================");
			System.out.println("");
			System.out.println("");
			System.out.println("*************************************");
			System.out.println("*REGISTRO:                          *");
			System.out.println("*************************************");
			System.out.println("");
			while(verificar3==1) {
			try {
			System.out.println("¿Cuantos buses salieron hoy?");
			buses = lector.nextInt();
			while(buses<1) {
				System.out.println("   --Esta no es una cantidad de buses valida,por favor vuleva a intentarlo:");
				buses=lector.nextInt();
			}
			verificar3=0;
			}catch(InputMismatchException e) {
				System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
				System.out.println("");
				lector.next();
				verificar3=1;
			}
			}
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
		System.out.println("");
		System.out.println("***********************************************************************");
		System.out.println("*      QUEDARON REGISTRADOS TODOS LOS DATOS CORRECTAMENTE             *");
		System.out.println("***********************************************************************");
	}

}
