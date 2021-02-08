package cl.security.proyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pago {

	
	@Id
	private int idPago;
	
	private String mesPago;
	private String añoPago;
	private String rutCliente;
	private String nombreCliente;
	
	public Pago() {
		
	}

	public Pago(int idPago, String mesPago, String añoPago, String rutCliente, String nombreCliente) {
		super();
		this.idPago = idPago;
		this.mesPago = mesPago;
		this.añoPago = añoPago;
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
	}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public String getMesPago() {
		return mesPago;
	}

	public void setMesPago(String mesPago) {
		this.mesPago = mesPago;
	}

	public String getañoPago() {
		return añoPago;
	}

	public void setañoPago(String añoPago) {
		this.añoPago = añoPago;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	
		
}
