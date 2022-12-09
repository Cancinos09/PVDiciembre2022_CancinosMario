package ar.edu.unju.edm.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="DNI")
	private int dni; //clave primaria
	
	@Column(name="APELLIDO")
	private String apellido;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="FECHA_NACIMIENTO")
	private LocalDate FechaNacimiento;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="TIPO_USUARIO")
	private String tipoUsuario; //Docente - Estudiante
	
//	un usuario puede responder una o mas preguntas y una pregunta puede ser respondida por un o muchos usuarios
	@ManyToMany
	@JoinColumn(name="PREGUNTA_CODIGO")
	private Pregunta pregunta;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int dni, String apellido, String nombre, LocalDate fechaNacimiento, String password,
			String tipoUsuario) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		FechaNacimiento = fechaNacimiento;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", FechaNacimiento="
				+ FechaNacimiento + ", password=" + password + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
}
