package ui;

import java.util.Scanner;



import bll.Application;

public class CitaMenu implements IMenu{

	@Override
	public  void menuOpcionesprincipal() {
		Scanner entrada = new Scanner (System.in);
		int opcion;
		
		do {
				System.out.println("==================================================");
				System.out.println("                 AGENDA DE CITAS");
				System.out.println("==================================================");
				
				System.out.println("Por favor ingrese una opción");
				System.out.println("1. Agregar nueva cita");
				System.out.println("2. Buscar cita");
				System.out.println("3. Actualizar cita");
				System.out.println("4. Eliminar cita");
				System.out.println("5. Mostrar todas las citas");
				System.out.println("6. Salir del programa");
				opcion = entrada.nextInt();
				System.out.println("===================================================");
				
			switch(opcion) {
			
			case 1:
				System.out.println("===================================================");
				System.out.println("             AGREGAR NUEVO REGISTRO");
				System.out.println("===================================================");
				CitaForm cf = new CitaForm();
				cf.AddRegist();
				System.out.println("===================================================");
				break;
				
			case 2:
				System.out.println("====================================================");
				System.out.println("                     BUSCANDO...");
				System.out.println("====================================================");
				menuBuscarRegistro();
				System.out.println("====================================================");
				System.out.println("                   FIN DE LA BUSQUEDA");
				System.out.println("====================================================");
			break;
			
			case 3:
				System.out.println("");
				menuModificarRegistro();
				break;
				
			case 4:
				System.out.println("Eliminar Datos");
				MenueliminarRegistro();
				break;
				
			case 5:
				System.out.println("=======================================================");
				System.out.println("                       REGISTRO");
				System.out.println("=======================================================");
				Application ap = new Application();
				ap.mostrarRegistros();
				System.out.println("========================================================");
				
				break;
				
			case 6:
				System.out.println("SALIR DEL PROGRAMA");
				break;
				
				default: 
					System.out.println("Opción inválida");
					break;
			}
		}while(opcion!=6);
	}
		
	
	
public static void menuModificarRegistro() {

	Scanner sc = new Scanner (System.in);
	int opcion =0;
	
	System.out.println("Seleccione una de las siguientes opciones");
	System.out.println("1. Modificar numero telefonico realizando busqueda");
	System.out.println("2. Modificar correo electronico realizando busqueda");
	System.out.println("3. Regresar al menu principal");
	opcion= sc.nextInt();
	
	switch (opcion) {
	case 1:
		System.out.println("=====================================================");
		System.out.println("    MODIFICAR TEFEFONO, BUSCANDO POR TELEFONO");
		System.out.println("=====================================================");
		Application ap1 = new Application();
		ap1.modificarRegistroTelefono();
		System.out.println("=====================================================");
		break;
		
	case 2: 
		System.out.println("=====================================================");
		System.out.println("      MODIFICAR CORREO, BUSCANDO POR CORREO");
		System.out.println("=====================================================");
		Application ap2 = new Application();
		ap2.modificarRegistroCorreo();
		System.out.println("======================================================");
		break;
		
	case 3:
	CitaMenu cm = new CitaMenu();
	cm.menuOpcionesprincipal();
		break;
		
		default: 
			System.out.println("Opcion Invalida");
			
	}
	
}



public static void MenueliminarRegistro() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Seleccione una de las siguientes opciones");
	System.out.println("1. Eliminar cita buscando por telefono");
	System.out.println("2. Eliminar cita buscando por correo");
	System.out.println("3.Regresar al menu principal");
	int opcion = sc.nextInt();
	
	switch (opcion) {
	case 1:
		Application ap1 = new Application();
		ap1.eliminarRegistroTelefono();
	case 2:
		Application ap2 = new Application();
		ap2.eliminarRegistroCorreo();
	case 3:
		CitaMenu cm = new CitaMenu();
		cm.menuOpcionesprincipal();
		default:
			System.out.println("Opcion Invalida");
	}
}


public static void menuBuscarRegistro() {
	Scanner entrada = new Scanner (System.in);
	int opcion=0;
	
	System.out.println("Ingrese una opcion\n");
	System.out.println("1. Buscar por nombre");
	System.out.println("2. Buscar por telefono");
	System.out.println("3. Buscar por correo");
	System.out.println("4. Regresar al menu principal");
	opcion = entrada.nextInt();
	
	switch (opcion) {
	case 1:
		Application ap = new Application();
		ap.buscarRegistroNombre();
		break;
	case 2:
		Application ap1 = new Application();
		ap1.buscarRegistroTelefono();
		break;
	case 3:
		Application ap2 = new Application();
		ap2.buscarRegistroCorreo();
		break;
	case 4:
		CitaMenu cm = new CitaMenu();
		cm.menuOpcionesprincipal();
		break;
	default:
		System.out.println("Opcion Invalida");
		break;
	}
}







}