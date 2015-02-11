import java.util.Scanner;

public class Main{
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int opcion =0;
	
	Partido partido = new Partido();
	
	do {
		System.out.println(" ");
		System.out.println("1- introducir Habitantes");
		System.out.println("2- introducir Espacio Publico");
		System.out.println("3- introducir Partidos ");
		System.out.println("4- ver partidos");
	    System.out.println("5- introducir Inmueble");
	    System.out.println("6- ver censo");
	
	System.out.println("Que eleccion deseas elegir?");	
	opcion= sc.nextInt();
	
	switch(opcion) {
		case 1:
			{
				Habitante habitante= new Habitante();
				habitante.crearhabitante();
				break;
			}
		case 2:
			{
				EspacioPublico espaciopublico = new EspacioPublico();
				espaciopublico.crearespaciopublico();
				break;
			}	
		case 3:
			{
				partido.crearpartido();
				break;
			}	
		case 4:
			{
				partido.Mostrarpartidos();
				break;
			}
		case 5:
			{
				Inmueble inmueble = new Inmueble();
				inmueble.crearinmueble();
				break;
			}
		case 6:
			{
				Censo censo = new Censo();
				censo.crearcenso();
				break;
			}
			
	     }	
		}while (opcion !=6); 
	     sc.close();
	
 
}
}


	