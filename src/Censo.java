import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Censo {
	protected void crearcenso(){
		try{
			
			
			File listaPartido = new File("Censo.txt");
			FileInputStream fis = new FileInputStream(listaPartido);
	        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
	        BufferedReader br = new BufferedReader(isr);
	        
	        String linea;
	        linea = br.readLine();
	        String [] campos = null;
	        System.out.println("\ntus partidos...");
	        
	
	    
	        
	        while(linea!=null){
	        	campos = linea.split(",");
	        	int edad = Integer.parseInt(campos[3]);
	        	if( edad >= 18){
	        		System.out.println("-----------Informacion del censo-----------");
		        	System.out.println("nombre: "+campos[0]);
		       		System.out.println("apellido: "+campos[1]);
		       		System.out.println("direccion: "+campos[2]);
		       		System.out.println("edad: "+campos[3]);
		       		System.out.println("numero calle : "+campos[4]);
		       	
		       		
	        	}
	        	
	        	
	       		
	       		
	       		linea = br.readLine();
	        }
		}catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }
       
	}
	
}