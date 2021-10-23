package entities;

public class Tema {
	int id_tema; 
	String nombre_tema; 
	int id_usuario; //depende de usuario-- no tiene los setters
	Boolean eliminado;
	
	
	public int getId_tema() {
		return id_tema;
	}
	public void setId_tema(int id_tema) {
		this.id_tema = id_tema;
	}
	public String getNombre_tema() {
		return nombre_tema;
	}
	public void setNombre_tema(String nombre_tema) {
		this.nombre_tema = nombre_tema;
	}
	public Boolean getEliminado() {
		return eliminado;
	}
	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	} 
	
	
}
