package Datos;

import java.util.Scanner;

import Logica.Metodos;

public class Menus {

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
			Metodos mt = new Metodos();
			mt.buscarRegistroNombre();
			break;
		case 2:
			Metodos mt1 = new Metodos();
			mt1.buscarRegistroTelefono();
			break;
		case 3:
			Metodos mt2 = new Metodos();
			mt2.buscarRegistroCorreo();
			break;
		case 4:
			Menus.menuOpcionesPrincipal();
			break;
		default:
			System.out.println("Opcion Invalida");
			break;
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
		Metodos a1 = new Metodos();
		a1.eliminarRegistroTelefono();
	case 2:
		Metodos a2= new Metodos();
		a2.eliminarRegistroCorreo();
	case 3:
		Menus.menuOpcionesPrincipal();
		default:
			System.out.println("Opcion Invalida");
	}
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
		Metodos a1 = new Metodos();
		a1.modificarRegistroTelefono();
		System.out.println("=====================================================");
		break;
		
	case 2: 
		System.out.println("=====================================================");
		System.out.println("      MODIFICAR CORREO, BUSCANDO POR CORREO");
		System.out.println("=====================================================");
		Metodos a2 = new Metodos();
		a2.modificarRegistroCorreo();
		System.out.println("======================================================");
		break;
		
	case 3:
		Menus.menuOpcionesPrincipal();
		break;
		
		default: 
			System.out.println("Opcion Invalida");
			
	}
	
	
	
	
	
	
	
}

public static void menuOpcionesPrincipal() {
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
			Metodos a1 = new Metodos();
			a1.agregarRegistro();
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
			Metodos a2 = new Metodos();
			a2.mostrarRegistros();
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
}






