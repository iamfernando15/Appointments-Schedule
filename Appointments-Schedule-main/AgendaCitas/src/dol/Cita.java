package dol;

public class Cita {

	 String NOMBRE;
	 String TELEFONO;
	 String CORREO;
	 String DIRECCION;
	 String FECHA;
	 String HORA;
     String DESCRIPCION;
     
     
	public Cita(String nOMBRE, String tELEFONO, String cORREO, String dIRECCION, String fECHA, String hORA,
			String dESCRIPCION) {
		super();
		NOMBRE = nOMBRE;
		TELEFONO = tELEFONO;
		CORREO = cORREO;
		DIRECCION = dIRECCION;
		FECHA = fECHA;
		HORA = hORA;
		DESCRIPCION = dESCRIPCION;
	}


	public Cita() {
		super();
	}


	public String getNOMBRE() {
		return NOMBRE;
	}


	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}


	public String getTELEFONO() {
		return TELEFONO;
	}


	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}


	public String getCORREO() {
		return CORREO;
	}


	public void setCORREO(String cORREO) {
		CORREO = cORREO;
	}


	public String getDIRECCION() {
		return DIRECCION;
	}


	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}


	public String getFECHA() {
		return FECHA;
	}


	public void setFECHA(String fECHA) {
		FECHA = fECHA;
	}


	public String getHORA() {
		return HORA;
	}


	public void setHORA(String hORA) {
		HORA = hORA;
	}


	public String getDESCRIPCION() {
		return DESCRIPCION;
	}


	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}
	
	
	
}
