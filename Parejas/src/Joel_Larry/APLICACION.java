package Joel_Larry;
import java.util.*;
public class APLICACION {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int elegir=0;
		int verificar = 1,volver=1,verificar5=1;
		do{
		System.out.println("=====================================================================================================================");
		System.out.println("|                                                                                                                   |");
		System.out.println("|                                             LARIOS-OBANDO S.A                                                     |");
		System.out.println("|                                                                                                                   |");
		System.out.println("=====================================================================================================================");
		System.out.println("");
		System.out.println("------BIENVENIDOS!!!!!------");
		System.out.println("Estimado usuario,");
		System.out.println("Esta app te permite registrar y administrar de mejor forma tu empresa de taxis y/o buses, optimizando tiempo, esfuerzo y tambien ayuda a tener datos de forma mas segura.");
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|Esto te permite hacer:                                                                  |");
		System.out.println("|  -Registrar la cantidad de dinero que ingresa dependiendo de los buses o taxis.        |");
		System.out.println("|   -Te realiza los calculos para determinar las ganancias.                              |");
		System.out.println("|   -Realiza los calculos dependiendo con lo que trabajes.                               |");
		System.out.println("|   -Te muestra que cantidad de dinero corresponde tanto al trabajador,como a ti (buses).|");
		System.out.println("|   -Puedes ingresar los datos de los trabajadores,y te permite mostrarlos.              |");
		System.out.println("|   -En el caso de los taxis,te muestra un soporte para daselo al trabajador.            |");
		System.out.println("|   -En el caso de los buses,te muestra un registro y soporte por cada viaje que realice.|");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		while(verificar==1) {
		try {
		System.out.println("---------------------------------------");
		System.out.println("| Que desea hacer?                    |");
		System.out.println("---------------------------------------");
		System.out.println("1.-Registrar ganancias y administrar los buses.");
		System.out.println("2.-Registrar turnos y administrar los taxis.");
		System.out.println("Ingrese el numero de la accion que desea realizar:");
		elegir = lector.nextInt();
		while (elegir <1 || elegir > 2) {
			System.out.println("    ***ESTA NO ES UNA OPCION VALIDA,POR FAVOR VUELVA A INTENTARLO:");
			System.out.println("");
			System.out.println("1.-Registrar ganancias y administrar los buses.");
			System.out.println("2.-Registrar turnos y administrar los taxis");
			elegir = lector.nextInt();
		}
		verificar=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			lector.next();
			verificar=1;
		}
		}
		switch(elegir) {
		case 1:
			Buses obj1 = new Buses();
			int t=0,buses=0,verificar3=1;
			do {
				System.out.println("");
				System.out.println("====================================================================================");
				System.out.println("|        BIENVENIDO Al CONTROL DE INGRESOS DIARIOS DE BUSES DE SU COMPAÑIA         |");
				System.out.println("====================================================================================");
				System.out.println("");
				System.out.println("------------------------------------------------------------------");
				System.out.println("SE LE MOSTRARA LOS PARAMATROS PARALA ADIMINISTRACION DE GANANCIAS:");
				System.out.println("------------------------------------------------------------------");
				System.out.println("");
				System.out.println("==========================================================================================================================================");
				System.out.println("|1.- A los choferes se paga el 12% de las ganancias totales                                                                              |");
				System.out.println("|2.- Se le estara administrando 600 cordobas de gasolina por cada vuelta que realice el vehiculo                                         |");
				System.out.println("|3.- Al finalizar cada turno del vehiculo, al finalizar cada turno, se  tiene que pagar 30 cordobas por bus correspondiente al parqueo   |");
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
				obj1.viajes(buses);
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
			break;
		case 2:
			Taxis obj2 = new Taxis();
			obj2.RegistroDeTaxis();
			break;
		}
		while(verificar5==1) {
		try {
		System.out.println("DESEA VOLVER A INICIAR LA APLICACION? si(1) o no(0)");
		volver=lector.nextInt();
		while (volver<0 || volver>1) {
			System.out.println("No es un comando valido, por favor vuelva a ingresarlo");
			volver = lector.nextInt();
		}
		verificar5 = 0;
		}catch (InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			lector.next();
			verificar5 = 1;
		}
		}
		}while(volver==1);
	}

}
