package bll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class Application {
	
	public static String NOMBRE;
	public static String TELEFONO;
	public static String CORREO;
	public static String DIRECCION;
	public static String FECHA;
	public static String HORA;
	public static String DESCRIPCION;
	

	
static File ArchivoTXT = new File ("Database.txt");

	
	public static void comprobarTXT() {
		try {
			if (ArchivoTXT.exists()) {
				System.out.println("PUEDE PROCEDER A TRABAJAR CON EL ARCHIVO");
				
			}else {
				ArchivoTXT.createNewFile();
				System.out.println("Se ha creado el archivo, puede proceder a trabajar");
			}
			
		} catch(Exception e) {
			System.out.println("ERROR" + e.getMessage());
			System.out.println("Lo siento no se puede trabajar en el archivo\n");
		}
	
	}
	

    public static void buscarRegistroNombre() {

		Scanner sc = new Scanner (System.in);
		String buscar, leer;
		
		boolean encontrado = true;
		
		try {
			
			BufferedReader br = new BufferedReader (new FileReader(ArchivoTXT));
			System.out.println("Ingrese el nombre:");
			buscar = sc.nextLine();
			
			while((leer = br.readLine())!= null) {
				//StringTokenizer st = new StringTokenizer (leer, "_");
				StringTokenizer st = new StringTokenizer (leer,"-");
				
				if(leer.contains(buscar)) {
					String nombre = null;
					
					while(nombre != buscar && encontrado) {
						String sizeRegist = st.nextToken().trim();
						nombre= st.nextToken().trim();
						String telefono =st.nextToken().trim();
						String correo =st.nextToken().trim();
						
						String direccion =st.nextToken().trim();
						String fecha =st.nextToken().trim();
						String hora =st.nextToken().trim();
						String descripcion =st.nextToken().trim();
						
						if(nombre.equals(buscar)) {
							encontrado = false;
							
				System.out.println("\n El resultado de la busqueda "+"\""+ buscar +"\""+" si existe...");
				System.out.println("El nombre es: \t\t" + nombre);
				System.out.println("El telefono es: \t\t"+ telefono );
				System.out.println("El correo es: \t\t" + correo );
				
				System.out.println("La direccion es: \t" + direccion);
				System.out.println("La fecha es: \t\t" + fecha);
				System.out.println("La hora es: \t\t" + hora);
				System.out.println("La descripcion es: \t" + descripcion);
				
	} else { System.out.println("\n El resultado de la busqueda no existe");
							
						}
					}
				}
				
			}
			br.close();
			
		}catch(Exception e ) {
			System.out.println("Error" + e);
		}
	}
    
	public static void buscarRegistroTelefono() {
		Scanner sc = new Scanner (System.in);
		String buscar, leer;
		
		boolean encontrado = true;
		
		try {
			
			BufferedReader br = new BufferedReader (new FileReader(ArchivoTXT));
			System.out.println("Ingrese el telefono:");
			buscar = sc.nextLine();
			
			while((leer = br.readLine())!= null) {
				StringTokenizer st = new StringTokenizer (leer, "-");
				
				if(leer.contains(buscar)) {
					String telefono = null;
					
					while(NOMBRE != buscar && encontrado) {
						String sizeRegist = st.nextToken().trim();
						String nombre =st.nextToken().trim();
						telefono= st.nextToken().trim();
						String correo =st.nextToken().trim();
						
						String direccion =st.nextToken().trim();
						String fecha =st.nextToken().trim();
						String hora =st.nextToken().trim();
						String descripcion =st.nextToken().trim();
						
						if(telefono.equals(buscar)) {
							encontrado = false;
							
				System.out.println("\n El resultado de la busqueda "+"\""+ buscar +"\""+" si existe...");
				System.out.println("El nombre es: \t\t" + nombre);
				System.out.println("El telefono es: \t\t"+ telefono );
				System.out.println("El correo es: \t\t" + correo );
				
				System.out.println("La direccion es: \t" + direccion);
				System.out.println("La fecha es: \t\t" + fecha);
				System.out.println("La hora es: \t\t" + hora);
				System.out.println("La descripcion es: \t" + descripcion);
				
			} else { System.out.println("\n El resultado de la busqueda no existe");
							
						}
					}
				}
				
			}
			br.close();
		}catch(Exception e ) {
			System.out.println("Error" + e);
		}
	}
	
	public static void  buscarRegistroCorreo(){
		Scanner sc = new Scanner (System.in);
		String buscar, leer;
		
		boolean encontrado = true;
		
		try {
			
			BufferedReader br = new BufferedReader (new FileReader(ArchivoTXT));
			System.out.println("Ingrese el correo:");
			buscar = sc.nextLine();
			
			while((leer = br.readLine())!= null) {
				StringTokenizer st = new StringTokenizer (leer, "-");
				
				if(leer.contains(buscar)) {
					String correo = null;
					
					while(NOMBRE != buscar && encontrado) {
						String sizeRegist = st.nextToken().trim();
						String nombre =st.nextToken().trim();
						String telefono =st.nextToken().trim();
						correo= st.nextToken().trim();
						
						String direccion =st.nextToken().trim();
						String fecha =st.nextToken().trim();
						String hora =st.nextToken().trim();
						String descripcion =st.nextToken().trim();
						
						if(correo.equals(buscar)) {
							encontrado = false;
							
				System.out.println("\n El resultado de la busqueda "+"\""+ buscar +"\""+" si existe...");
				System.out.println("El nombre es: \t\t" + nombre);
				System.out.println("El telefono es: \t\t"+ telefono );
				System.out.println("El correo es: \t\t" + correo );
				
				System.out.println("La direccion es: \t" + direccion);
				System.out.println("La fecha es: \t\t" + fecha);
				System.out.println("La hora es: \t\t" + hora);
				System.out.println("La descripcion es: \t" + descripcion);
				
		} else { System.out.println("\n El resultado de la busqueda no existe");
							
						}
					}
				}
				
			}
			br.close();
		}catch(Exception e ) {
			System.out.println("Error" + e);
		}
	}
	
	public static void mostrarRegistros() {
		try {
			
		 String linea = null;
		 BufferedReader leerfichero = new BufferedReader (new FileReader(ArchivoTXT));
		 while ((linea= leerfichero.readLine()) !=null) {
			StringTokenizer mitoken = new StringTokenizer(linea, "-");
			
			while(mitoken.hasMoreTokens()) {
				String sizeRegist = mitoken.nextToken().trim();
				
				 NOMBRE = mitoken.nextToken().trim();
				TELEFONO = mitoken.nextToken().trim();
				 CORREO = mitoken.nextToken().trim();
				 DIRECCION = mitoken.nextToken().trim();
				 FECHA = mitoken.nextToken().trim();
				 HORA = mitoken.nextToken().trim();
				 DESCRIPCION = mitoken.nextToken().trim();
				
				System.out.println("El nombre es: \t\t" + NOMBRE);
				System.out.println("El telefono es: \t\t"+ TELEFONO );
				System.out.println("El correo es: \t\t" + CORREO );
				
				System.out.println("La direccion es: \t" + DIRECCION);
				System.out.println("La fecha es: \t\t" + FECHA);
				System.out.println("La hora es: \t\t" + HORA);
				System.out.println("La descripcion es: \t" + DESCRIPCION);
				System.out.println("\n");
				
			}
		 }
		 leerfichero.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void eliminarRegistroTelefono() {
		
		Scanner sc = new Scanner (System.in);
		String linea = null;
		String buscar = null;
		String sepEspacio = "_";
		
		Vector lineasAcopiar = new Vector();
		System.out.println("Ingrese el telefono que desea eliminar:");
		buscar = sc.nextLine();
		
		try {
			FileReader fr = new FileReader(ArchivoTXT);
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()){
				linea = br.readLine();
				
				StringTokenizer mistokens = new StringTokenizer(linea, "-");
				
				if(linea.contains(buscar)) {
					while(mistokens.hasMoreTokens()) {
						String sizeRegist = mistokens.nextToken().trim();
						String nombre = mistokens.nextToken().trim();
						String telefono = mistokens.nextToken().trim();
						String correo = mistokens.nextToken().trim();
						String direccion = mistokens.nextToken().trim();
						String fecha = mistokens.nextToken().trim();
						String hora = mistokens.nextToken().trim();
						String descripcion = mistokens.nextToken().trim();
						
						String registros = sizeRegist + sepEspacio + nombre  + sepEspacio + telefono + sepEspacio + correo
								 + sepEspacio + direccion + sepEspacio + fecha + sepEspacio + hora + sepEspacio + descripcion;
						
						if (telefono.equals(buscar)) {
							lineasAcopiar.add(registros);
							
							
						} else {
							System.out.println("=========================================");
							System.out.println("      El registro a eliminar es...");
							System.out.println("El nombre es: \t\t" + nombre);
							System.out.println("El telefono es: \t\t"+ telefono );
							System.out.println("El correo es: \t\t" + correo );
							
							System.out.println("La direccion es: \t" + direccion);
							System.out.println("La fecha es: \t\t" + fecha);
							System.out.println("La hora es: \t\t" + hora);
							System.out.println("La descripcion es: \t" + descripcion);
							
						
						}		
					}
					
				}else {
					System.out.println("El telefono" + buscar + "no existe");
				}
				
			}
			br.close();
			
			if(linea.contains(buscar)) {
				FileWriter fw = new FileWriter(ArchivoTXT);
				BufferedWriter bw= new BufferedWriter(fw);
				
				for(int i=0; i<lineasAcopiar.size(); i++) {
					linea = (String)lineasAcopiar.elementAt(i);
					bw.write(linea);
				}
				bw.close();
				System.out.println("El registro con el telefono " + buscar + "ha sido eliminado");
			}
		
		} catch(Exception e){
			System.out.println("Error" + e);

		}	
	}
	
	public static void eliminarRegistroCorreo() {
		Scanner sc = new Scanner (System.in);
		String linea = null;
		String buscar = null;
		String sepEspacio = "_";
		
		Vector lineasAcopiar = new Vector();
		System.out.println("Ingrese el correo que desea eliminar:");
		buscar = sc.nextLine();
		
		try {
			FileReader fr = new FileReader(ArchivoTXT);
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()){
				linea = br.readLine();
				
				StringTokenizer mistokens = new StringTokenizer(linea, "-");
				
				if(linea.contains(buscar)) {
					while(mistokens.hasMoreTokens()) {
						String sizeRegist = mistokens.nextToken().trim();
						String nombre = mistokens.nextToken().trim();
						String telefono = mistokens.nextToken().trim();
						String correo = mistokens.nextToken().trim();
						String direccion = mistokens.nextToken().trim();
						String fecha = mistokens.nextToken().trim();
						String hora = mistokens.nextToken().trim();
						String descripcion = mistokens.nextToken().trim();
						
						String registros = sizeRegist + sepEspacio + nombre  + sepEspacio + telefono + sepEspacio + correo
								 + sepEspacio + direccion + sepEspacio + fecha + sepEspacio + hora + sepEspacio + descripcion;
						
						if (correo.equals(buscar)) {
							lineasAcopiar.add(registros);
							
							
						} else {
							System.out.println("=========================================");
							System.out.println("      El registro a eliminar es...");
							System.out.println("El nombre es: \t\t" + nombre);
							System.out.println("El telefono es: \t\t"+ telefono );
							System.out.println("El correo es: \t\t" + correo );
							
							System.out.println("La direccion es: \t" + direccion);
							System.out.println("La fecha es: \t\t" + fecha);
							System.out.println("La hora es: \t\t" + hora);
							System.out.println("La descripcion es: \t" + descripcion);
							
						
						}		
					}
					
				}else {
					System.out.println("El correo" + buscar + "no existe");
				}
				
			}
			br.close();
			
			if(linea.contains(buscar)) {
				FileWriter fw = new FileWriter(ArchivoTXT);
				BufferedWriter bw= new BufferedWriter(fw);
				
				for(int i=0; i<lineasAcopiar.size(); i++) {
					linea = (String)lineasAcopiar.elementAt(i);
					bw.write(linea);
				}
				bw.close();
				System.out.println("El registro con el correo " + buscar + "ha sido eliminado");
			}
		
		} catch(Exception e){
			System.out.println("Error" + e);

		}	
	}

	public static void modificarRegistroTelefono() {

		
		Scanner sc = new Scanner (System.in);
		String linea = null;
		String buscar = null;
		String sepEspacio = "_";
		
		Vector lineasAcopiar = new Vector();
		System.out.println("Ingrese el telefono que desea modificar:");
		buscar = sc.nextLine();
		
		try {
			FileReader fr = new FileReader(ArchivoTXT);
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()){
				linea = br.readLine();
				
				StringTokenizer mistokens = new StringTokenizer(linea, "-");
				
				if(linea.contains(buscar)) {
					while(mistokens.hasMoreTokens()) {
						String sizeRegist = mistokens.nextToken().trim();
						String nombre = mistokens.nextToken().trim();
						String telefono = mistokens.nextToken().trim();
						String correo = mistokens.nextToken().trim();
						String direccion = mistokens.nextToken().trim();
						String fecha = mistokens.nextToken().trim();
						String hora = mistokens.nextToken().trim();
						String descripcion = mistokens.nextToken().trim();
						
						String registros = sizeRegist + sepEspacio + nombre  + sepEspacio + telefono + sepEspacio + correo
								 + sepEspacio + direccion + sepEspacio + fecha + sepEspacio + hora + sepEspacio + descripcion;
						
						if (telefono.equals(buscar)) {
							lineasAcopiar.add(registros);
							
							
						} else {
							System.out.println("=========================================");
							System.out.println("      El registro a modificar es...");
							System.out.println("El nombre es: \t\t" + nombre);
							System.out.println("El telefono es: \t\t"+ telefono );
							System.out.println("El correo es: \t\t" + correo );
							
							System.out.println("La direccion es: \t" + direccion);
							System.out.println("La fecha es: \t\t" + fecha);
							System.out.println("La hora es: \t\t" + hora);
							System.out.println("La descripcion es: \t" + descripcion);
							
							System.out.println("Ingrese el nuevo numero telefonico:");
							String newtelefono= sc.nextLine();
							
							String newregistros = sizeRegist + sepEspacio + nombre  + sepEspacio + newtelefono + sepEspacio + correo
									 + sepEspacio + direccion + sepEspacio + fecha + sepEspacio + hora + sepEspacio + descripcion;
							lineasAcopiar.add(newregistros);
						}		
					}
					
				}else {
					System.out.println("El telefono" + buscar + "no existe");
				}
				
			}
			br.close();
			
			if(linea.contains(buscar)) {
				FileWriter fw = new FileWriter(ArchivoTXT);
				BufferedWriter bw= new BufferedWriter(fw);
				
				for(int i=0; i<lineasAcopiar.size(); i++) {
					linea = (String)lineasAcopiar.elementAt(i);
					bw.write(linea);
				}
				bw.close();
				System.out.println("El registro con el telefono " + buscar + "ha sido modificado");
			}
		
		} catch(Exception e){
			System.out.println("Error" + e);

		}
		
	}
	
	public static void modificarRegistroCorreo() {
		Scanner sc = new Scanner (System.in);
		String linea = null;
		String buscar = null;
		String sepEspacio = "_";
		
		Vector lineasAcopiar = new Vector();
		System.out.println("Ingrese el correo que desea modificar:");
		buscar = sc.nextLine();
		
		try {
			FileReader fr = new FileReader(ArchivoTXT);
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()){
				linea = br.readLine();
				
				StringTokenizer mistokens = new StringTokenizer(linea, "-");
				
				if(linea.contains(buscar)) {
					while(mistokens.hasMoreTokens()) {
						String sizeRegist = mistokens.nextToken().trim();
						String nombre = mistokens.nextToken().trim();
						String telefono = mistokens.nextToken().trim();
						String correo = mistokens.nextToken().trim();
						String direccion = mistokens.nextToken().trim();
						String fecha = mistokens.nextToken().trim();
						String hora = mistokens.nextToken().trim();
						String descripcion = mistokens.nextToken().trim();
						
						String registros = sizeRegist + sepEspacio + nombre  + sepEspacio + telefono + sepEspacio + correo
								 + sepEspacio + direccion + sepEspacio + fecha + sepEspacio + hora + sepEspacio + descripcion;
						
						if (correo.equals(buscar)) {
							lineasAcopiar.add(registros);
							
							
						} else {
							System.out.println("=========================================");
							System.out.println("      El registro a modificar es...");
							System.out.println("El nombre es: \t\t" + nombre);
							System.out.println("El telefono es: \t\t"+ telefono );
							System.out.println("El correo es: \t\t" + correo );
							
							System.out.println("La direccion es: \t" + direccion);
							System.out.println("La fecha es: \t\t" + fecha);
							System.out.println("La hora es: \t\t" + hora);
							System.out.println("La descripcion es: \t" + descripcion);
							
							System.out.println("Ingrese el nuevo correo electronico:");
							String newcorreo= sc.nextLine();
							
							String newregistros = sizeRegist + sepEspacio + nombre  + sepEspacio + telefono + sepEspacio + newcorreo
									 + sepEspacio + direccion + sepEspacio + fecha + sepEspacio + hora + sepEspacio + descripcion;
							lineasAcopiar.add(newregistros);
						}		
					}
					
				}else {
					System.out.println("El correo" + buscar + "no existe");
				}
				
			}
			br.close();
			
			if(linea.contains(buscar)) {
				FileWriter fw = new FileWriter(ArchivoTXT);
				BufferedWriter bw= new BufferedWriter(fw);
				
				for(int i=0; i<lineasAcopiar.size(); i++) {
					linea = (String)lineasAcopiar.elementAt(i);
					bw.write(linea);
				}
				bw.close();
				System.out.println("El registro con el correo " + buscar + "ha sido modificado");
			}
		
		} catch(Exception e){
			System.out.println("Error" + e);

		}
		
	}




}
