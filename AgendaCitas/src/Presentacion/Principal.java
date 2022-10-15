package Presentacion;
import Datos.Menus;
import Logica.Metodos;
public class Principal {

	public static void main(String[] args) {
		Metodos mt = new Metodos();
		mt.comprobarBD();
		
		Menus mn = new Menus();
		mn.menuOpcionesPrincipal();

	}

}
