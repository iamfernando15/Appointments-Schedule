package ui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import dol.Cita;
public class CitaForm {

	
	public static void AddRegist() {
		
		File ArchivoTXT = new File ("Database.txt");
		
		Scanner entrada = new Scanner (System.in);
		String sepEspacio = "-";
		int sizeRegist = 0;
		 
		try {
			BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ArchivoTXT, true)));
			 Cita c = new Cita ();
			
			System.out.println("Ingrese el nombre completo:");
		     c.setNOMBRE(entrada.nextLine());
			
			System.out.println("Ingrese el telefono:");
			c.setTELEFONO(entrada.nextLine());
			
			System.out.println("Ingrese el correo electronico");
			c.setCORREO(entrada.nextLine());
			
			System.out.println("Ingrese la direccion de la cita");
			c.setDIRECCION(entrada.nextLine());
			
			System.out.println("Ingrese la fecha de la cita");
			c.setFECHA(entrada.nextLine());
			
			System.out.println("Ingrese la hora de la cita");
			c.setHORA(entrada.nextLine());
			
			System.out.println("Ingrese una descripcion acerca de la cita");
			c.setDESCRIPCION(entrada.nextLine());
			
			sizeRegist = c.getNOMBRE().length()+sepEspacio.length()+
					     c.getTELEFONO().length()+sepEspacio.length()+
					     c.getCORREO().length()+sepEspacio.length()+
					     c.getDIRECCION().length()+sepEspacio.length()+
					     c.getFECHA().length()+sepEspacio.length()+
					     c.getHORA().length()+sepEspacio.length()+
					     c.getDESCRIPCION().length()+sepEspacio.length();
			
		
			
			bf.write("\n["+sizeRegist+"-"+
					""+c.getNOMBRE()+"-"+
					""+c.getTELEFONO()+"-"+
					""+c.getCORREO()+"-"+
					""+c.getDIRECCION()+"-"+
					""+c.getFECHA()+"-"+
					""+c.getHORA()+"-"+
					""+c.getDESCRIPCION()+"]");
			
			bf.close();
			
			System.out.println("El registro se guardo correctamente.\n");
					
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
