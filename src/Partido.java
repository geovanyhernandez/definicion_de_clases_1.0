import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Partido
{
private String nombre;
private String presidente;
private int numero; 
private int edad;



public void setNombre(String nombre)
{
	this.nombre = nombre;
}

public void setPresidente(String presidente)
{
	this.presidente = presidente;
}

public void setNumero(int numero)
{
	this.numero = numero;
}

public void setEdad(int edad)
{
	this.edad = edad;
}


public  String getNombre()
{
	return nombre;
}
public String getPresidente()
{
	return presidente;
}

public int getNumero()
{
	return numero;
}
public int getEdad()
{
	return edad;
}

Scanner sc= new Scanner(System.in);
 String guardarstring;
  int guardarint;
  
   protected void crearpartido(){
	 	System.out.println("\n nombre del Partido");
	 	guardarstring= sc.next();
	 	setNombre(guardarstring);
	 	
	 	System.out.println("nombre del Presidente del partido");
	 	guardarstring= sc.next();
	 	setPresidente(guardarstring);
	 	
	  	System.out.println("edad del Presidente del partido");
	 	guardarint= sc.nextInt();
	 	setEdad(guardarint);
	 	
	 	System.out.println("numero del partido");
	 	guardarint= sc.nextInt();
	 	setNumero(guardarint);
	 	
	 	 System.out.println("-----------datos del Partido-----------");
				System.out.println("El nombre del partido: " + getNombre()+ "");
				System.out.println("Nombre del presidente del partido: " + getPresidente()+ "");
				System.out.println("El numero del partido es : " + getNumero()+ "");
				System.out.println("La edad del presidente del partido es: " + getEdad()+ "");	
	}
	
	protected void Mostrarpartidos(){
		try{
			File listaPartido = new File("ListaPartido.txt");
			FileInputStream fis = new FileInputStream(listaPartido);
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
	        BufferedReader br = new BufferedReader(isr);
	        
	         String linea;
	        linea = br.readLine();
	        String [] campos = null;
	        System.out.println("\npartidos politicos");
	        
	         while(linea!=null){
	        	campos = linea.split(",");
	        	System.out.println("-----------Informacion del Partido-----------");
	        	System.out.println("nombre del partido: "+campos[0]);
	       		System.out.println("nombre del presidente: "+campos[1]);
	       		System.out.println("numero del partido: "+campos[2]);
	       		System.out.println("edad del presindete: "+campos[3]);
	       		
	       		
	       		
	       		linea = br.readLine();
	        }
		}catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }
 }
}


