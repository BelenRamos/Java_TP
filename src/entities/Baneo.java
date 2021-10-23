package entities;

import java.sql.Date;

public class Baneo extends Usuario  {
	
	int id_baneo; 
	String motivo; 
	Date fecha_hasta; 
	Date fecha_desde; 
	String descargo;
	public int getId_baneo() {
		return id_baneo;
	}
	public void setId_baneo(int id_baneo) {
		this.id_baneo = id_baneo;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getFecha_hasta() {
		return fecha_hasta;
	}
	public void setFecha_hasta(Date fecha_hasta) {
		this.fecha_hasta = fecha_hasta;
	}
	public Date getFecha_desde() {
		return fecha_desde;
	}
	public void setFecha_desde(Date fecha_desde) {
		this.fecha_desde = fecha_desde;
	}
	public String getDescargo() {
		return descargo;
	}
	public void setDescargo(String descargo) {
		this.descargo = descargo;
	} 
	
	

}
