package entities;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;

public class Comentario {

	int id_comentario; 
	Blob imagen ; 
	Date fecha; 
	Time hora; 
	int cantidad_mg; 
	int cantidad_nmg; 
	Boolean eliminado; 
	int id_tema; 
	int id_usuario;
	
	
	public int getId_comentario() {
		return id_comentario;
	}
	public void setId_comentario(int id_comentario) {
		this.id_comentario = id_comentario;
	}
	public Blob getImagen() {
		return imagen;
	}
	public void setImagen(Blob imagen) {
		this.imagen = imagen;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public int getCantidad_mg() {
		return cantidad_mg;
	}
	public void setCantidad_mg(int cantidad_mg) {
		this.cantidad_mg = cantidad_mg;
	}
	public int getCantidad_nmg() {
		return cantidad_nmg;
	}
	public void setCantidad_nmg(int cantidad_nmg) {
		this.cantidad_nmg = cantidad_nmg;
	}
	public Boolean getEliminado() {
		return eliminado;
	}
	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	
}
