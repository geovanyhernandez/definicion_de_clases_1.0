import java.util.Scanner;

public class Inmueble {
private String departamento;
private String garaje;




public void setDepartamento(String departamento)
  {
this.departamento = departamento; 
  }

  public void setGaraje(String garaje)
  {
this.garaje = garaje; 
  }

public String getDepartamento()
  {
	return departamento;
  }
public String getGaraje()
  {
	return garaje;
  }

 Scanner sc = new Scanner(System.in);
  String guardarstring;
  int guardarint;
  
  protected void crearinmueble(){
      System.out.println("tipo de inmueble: caserio/departamento");
      guardarstring=sc.next();
      setDepartamento(guardarstring);
      
      System.out.println("Cuenta con garaje");
      guardarstring=sc.next();
      setGaraje(guardarstring);
      
      System.out.println("-----------datos del inmueble-----------");
			System.out.println("El nombre del habitante es: " + getDepartamento()+ "");
			System.out.println("El apellido del habitante es: " + getGaraje()+ "");
  
  }



 //}
}