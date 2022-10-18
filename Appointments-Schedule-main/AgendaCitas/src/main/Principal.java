package main;


import bll.Application;
import ui.CitaMenu;
public class Principal {

	public static void main(String[] args) {
		Application ap = new Application();
		ap.comprobarTXT();
		
	
	CitaMenu cm = new CitaMenu();
		cm.menuOpcionesprincipal();

	}

}
