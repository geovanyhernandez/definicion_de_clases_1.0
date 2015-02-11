import java.util.Scanner;
public class Habitante {

  private String nombre;
  private String apellido;
  private String direccion;
  private int edad;
  private int dni;
  
  
   public void setNombre(String nombre)
    {
  this.nombre = nombre; 
    }
  
   public void setApellido(String apellido)
    {
  this.apellido = apellido; 
    }
  
   public void setEdad(int edad)
    {
  this.edad = edad; 
    }
  
  
  public void setDni(int dni)
    {
  this.dni = dni; 
    }
  
  public void setDireccion(String direccion)
    {
  this.direccion = direccion; 
    }
  
  
  public String getNombre()
  {
    return nombre;
  }
  public String getApellido()
  {
    return apellido;
  }
  public int getEdad()
  {
    return edad;
  }
  
  public int getDni()
  {
    return dni;
  }
  public String getDireccion()
  {
    return direccion;
  }
  
  Scanner sc = new Scanner(System.in);
  String guardarstring;
  int guardarint;
  
    protected void crearhabitante(){
      System.out.println("nombre del habitante");
      guardarstring=sc.next();
      setNombre(guardarstring);
     
      System.out.println("apellido del habitante");
      guardarstring=sc.next();
      setApellido(guardarstring);
      
      System.out.println("direccion el habitante");
      guardarstring=sc.next();
      setDireccion(guardarstring);
      
      System.out.println("edad del habitante");
      guardarint=sc.nextInt();
      setEdad(guardarint);
      
      System.out.println("dni del habitante");
      guardarint=sc.nextInt();
      setDni(guardarint);
      
      System.out.println("-----------datos del habitante-----------");
			System.out.println("El nombre del habitante es: " + getNombre()+ "");
			System.out.println("El apellido del habitante es: " + getApellido()+ "");
			System.out.println("El sexo del habitante es: " + getDireccion()+ "");
			System.out.println("La edad del habitante es: " + getEdad()+ "");
			System.out.println("El DNI del habitante es: " + getDni()+ "");
			
			
		
      
          }

 
}









