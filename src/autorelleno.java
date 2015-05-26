import java.sql.*;

	
	public class autorelleno {

	
	 
	
	public void Generador ()
	{
	 
		String [] nombres =  {"JUAN","PABLO","ERICK","ANGEL","LEONARDO","VICTOR","GABRIEL","JOSE","ENRIQUE","ESTABAN","ADRIANA","ARTURO","CARLOS","ANA","CARLA"
				+"CLAUDIA","ALEJANDRA","ABIGAIL","ABRIL","AIDA","ALBERTO","ALDO","ALEJANDRO","ALIZ","ALONSO","ANDREA"} ;
		
		String [] apellidos = {"MARTINEZ","URIBE","RAMIREZ","MIRELES","RAMOS","ARREOLA","gUTIERREZ","SANCHEZ","FLORES","TORRES","VALDEZ","MORENO","ARRELANO","SALAZAR"
				+"TOLEDO","ARMENDARIZ","SALAS"};
		
		for (int i=0;i<1000;i++) { 
		try {
			int valorNombre = (int)(Math.random()*nombres.length + 0);
			int valorApellido = (int)(Math.random()*apellidos.length + 0);
			
		      Class.forName("com.mysql.jdbc.Driver");
		      Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/hospitalmex","root" ,"asa181192");
		      System.out.println("conexion realizada");
		      Statement comando=conexion.createStatement();
		      comando.executeUpdate("INSERT INTO paciente (nombre,apellido,edad,peso,diagnostico,doctor,estado,telefono,direccion,visitaproxima) VALUES ('"+nombres[valorNombre]+"','"+apellidos[valorApellido]+"','23','80','GRIPA','PEDRO','NUEVO LEON','818281','JARDINES DE CASA BLANCA','2015-05-30') ");
		     System.out.println("Dato agregado");
		     
		    
		    }catch(Exception ex) {
		      System.out.println("Error al cargar el driver");
		    }
	  
		}
	
}
		
	}
