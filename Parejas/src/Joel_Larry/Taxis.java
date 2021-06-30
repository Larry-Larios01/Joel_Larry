package Joel_Larry;
import java.util.*;
public class Taxis {
	static Scanner a = new Scanner (System.in);	
	static Scanner b = new Scanner (System.in);
	public void RegistroDeTaxis() {
		int verificar=1,verificar1=1,verificar2=1,verificar3=1,verificar4=1,verificar5=1,verificar6=1,verificar7=1,turno=0,numTurnos=0,numTaxis=0,trabajador=0;
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("|                                           EL CONTROL DIARIO DE TAXIS                                      |");
		System.out.println("=============================================================================================================");
		System.out.println("");		
		System.out.println("---------------------------");
		System.out.println("|     datos generales     |");
		System.out.println("---------------------------");
		System.out.println("");
		while(verificar==1) {
		try {
		System.out.println("---Por favor ingrese el numero de taxis que tiene, o el numero de taxis que desea registrar:---");
		numTaxis = a.nextInt();
		
		while (numTaxis<0) {
			System.out.println("*Esta es una cantidad invalida de taxis,la cantidad minima de taxis es 1,por favor ingrese nuevamente");
			numTaxis = a.nextInt();
		}
		verificar=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar=1;
		}
		}
		int x =1;
		while(verificar1==1){
		try {
		do {
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println("|*Le recomedamos que:                                                                                     |");
		System.out.println("|     -La cantidad que vaya a ingresar no sea menor a 300, ya que la ganancia seria mas baja de lo normal.|");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println("Por favor ingrese la cantidad fija de turno que dara cada trabajador: ");
		turno = a.nextInt();
		while (turno<1) {
			System.out.println("Esta es una cantidad invalida,por favor ingrese nuevamente:");
			turno = a.nextInt();
		}
		if (turno<300) {
			System.out.println("**Estas seguro que deseas continuar con la cantidad de turno mas baja de lo normal? escriba si(1) o no(2)");
			int decision = a.nextInt();
			while (decision < 0 || decision > 2) {
				System.out.println("Esta no es una opcion,por favor vuelva a intentarlo:");
				decision = a.nextInt();
			}
			switch (decision) {
			case 1:
				x=0;
				break;
			case 2:
				x=1;
			}
		}else {
			x=0;
		}
		verificar1=0;
		}while (x==1);
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar1=1;
		}
		}
		String nombres [] = new String [numTaxis];
		String modeloCarro[] = new String[numTaxis];
		while(verificar2==1) {
		try {
		System.out.println("");
		System.out.println("---INGRESE LOS NOMBRES DE CADA UNO LOS CADETES O TRABAJADORES (2 nombres y 2 apellidos) DE LOS VEHICULOS:---");
		System.out.println("");
		
		for (int i =0 ;i<numTaxis;i++) {
			nombres[i] = b.nextLine();
		}
		verificar2=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar2=1;
		}
		}
		while (verificar3==1) {
		try {
		System.out.println("");
		for (int i = 0 ;i<numTaxis;i++) {
			System.out.println("---INGRESE EL MODELO DEL CARRO QUE TRABAJA: "+nombres[i]);
			modeloCarro[i] = b.nextLine();
		}
		verificar3=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar3=1;
		}
		}
		System.out.println("==================================================================================================");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("                 DATOS GENERALES COMPLETADOS                    ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		System.out.println("TURNO FIJO POR TAXI:                  "+turno);
		System.out.println("HORAS DE ALQUILER:                    24 hrs");
		System.out.println("*Los datos de los trabajadores son los siguientes:");
		System.out.println("");
		System.out.println("NOMBRES                            MODELO DEL TAXI");
		for (int i = 0 ;i<numTaxis;i++) {
			System.out.println(nombres[i]+" \t "+modeloCarro[i]);
		}
		System.out.println("");
		System.out.println("==================================================================================================");
		System.out.println("");
		System.out.println("");
		int w=1;
		do {
		System.out.println("-----------------------------------------------");
		System.out.println("|             REGISTRO DE ALQUILER            |");
		System.out.println("-----------------------------------------------");
		while(verificar4==1) {
		try {
		System.out.println("");
		System.out.println("Cuantos turnos desea registrar?");
		numTurnos = a.nextInt();
		while (numTurnos < 1) {
			System.out.println("No es una cantidad valida de turnos para registrar, vuelva a intentarlo:");
			numTurnos = a.nextInt();
		}
		verificar4=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar4=1;
		}
		}
		while(verificar5==1) {
		try {
		System.out.println("");
		System.out.println("---De que trabajador desea registrar el numero de turnos:---");
		for (int i = 0;i<numTaxis;i++) {
			int v=1;
			System.out.println(v+".- "+nombres[i]);
			v=v+1;
		}
		System.out.println("escriba el numero del trabajador del cual se va a registrar el turno:");
		trabajador = a.nextInt();
		while (trabajador>numTaxis || trabajador < 1) {
			System.out.println("Este es una opcion invalida,por favor vuelva a ingresar");
			trabajador = a.nextInt();
		}
		verificar5=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar5=1;
		}
		}
		String fechas []= new String [numTurnos];
		System.out.println("Escriba las fechas de los dias de cada turno que va a registrar:");
		System.out.println("*Ejemplo:  15/10/2021, 15.10.2021, 15 de octubre del 2021");
		System.out.println("");
		while(verificar6==1) {
		try {
		System.out.println("Son "+numTurnos+" fechas que va a registrar:");
		for (int i=0;i<fechas.length;i++) {
			fechas[i] = b.nextLine();
		}
		verificar6=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar6=1;
		}
		}
		System.out.println("---REGISTRO FINALIZADO---");
		System.out.println("");
		System.out.println("=========================================================================================");
		System.out.println("SE REGISTRO LO SIGUIENTE:");
		System.out.println("=========================================================================================");
		System.out.println("");
		System.out.println("Numero de turno:                             "+numTurnos);
		System.out.println("Nombre del trabajador:                       "+nombres[trabajador-1]);
		System.out.println("Cantidad por turno                           "+turno);
		System.out.println("--CON LAS SIGUIENTES FECHAS:--");
		int v = 1;
		for(int i = 0;i<fechas.length;i++) {
			System.out.println(v+".- "+fechas[i]);
			v=v+1;
		}
		System.out.println("total de dinero registrado:                  "+turno*numTurnos);
		System.out.println("");
		System.out.println("=========================================================================================");
		System.out.println("");
		while(verificar7==1) {
		try {
		System.out.println("Desea registrar turnos de otra persona? si(1) o no(2)");
		w=a.nextInt();
		while(w>2 || w<1) {
			System.out.println("Esta no es una opcion valida,por favor vuelva a intentarlo (si=1 o no=2):");
			w=a.nextInt();
		}
		verificar7=0;
		}catch(InputMismatchException e) {
			System.out.println("***Esta no es un dato valido,ya que el dato que tiene que ingresar es de tipo entero,es decir, es un numero.***");
			System.out.println("");
			a.next();
			verificar7=1;
		}
		}
		}while(w==1);
		System.out.println("");
		System.out.println("***********************************************************************");
		System.out.println("*      QUEDARON REGISTRADOS TODOS LOS DATOS CORRECTAMENTE             *");
		System.out.println("***********************************************************************");
		
	}
	
	
}
