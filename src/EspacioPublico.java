import java.util.Scanner;
public class EspacioPublico {
  protected int id;
  private String nombreespacio;
  private String direccionespacio;
  
  
  public void setId(int id )
  {
    this.id=id;
  }
  public void setNombreespacio(String nombreespacio)
    {
  this.nombreespacio = nombreespacio; 
    }
  
  public void setDireccionespacio(String direccionespacio)
    {
  this.direccionespacio = direccionespacio; 
    }
  
  public int getId()
  {
    return id;
  }
    public String getNombreespacio()
  {
  	return nombreespacio;
  }
  public String getDireccionespacio()
  {
  	return direccionespacio;
  }

  Scanner sc = new Scanner(System.in);
  String guardarstring;
  int guardarint;
    protected void crearespaciopublico(){
      System.out.println("numero de ID del espacio publico");
      guardarint= sc.nextInt();
      setId(guardarint);
      System.out.println("Nombre de el espacio publico ");
      guardarstring=sc.next();
      setNombreespacio(guardarstring);
      System.out.println("Direccion de espacio publico ");
      guardarstring=sc.next();
      setDireccionespacio(guardarstring);
      
      
        System.out.println("******informacion de espacio publico*******");
      System.out.println("Nombre de espacio publico: " + getId()+ "");  
			System.out.println("Nombre de espacio publico: " + getNombreespacio()+ "");
			System.out.println("Direccion del espacio publico: " + getDireccionespacio()+ "");
    }
}
