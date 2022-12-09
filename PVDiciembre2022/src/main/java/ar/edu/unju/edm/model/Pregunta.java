package ar.edu.unju.edm.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pregunta")
public class Pregunta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private int codigo; //clave primaria
	
	@Column(name="ENUNCIADO")
	private String enunciado;
	
	@Column(name="NIVEL")
	private int nivel;
	
	@Column(name="OPCION1")
	private String opcion1;
	
	@Column(name="OPCION2")
	private String opcion2;
	
	@Column(name="OPCION3")
	private String opcion3;
	
	@Column(name="OPCION4")
	private String opcion4;
	
	@Column(name="OPCION_CORRECTA")
	private int opcionCorrecta;
	
	@Column(name="PUNTAJE")
	private double puntaje;
	
	public Pregunta() {
		// TODO Auto-generated constructor stub
	}

	public Pregunta(int codigo, String enunciado, int nivel, String opcion1, String opcion2, String opcion3,
			String opcion4, int opcionCorrecta, double puntaje) {
		super();
		this.codigo = codigo;
		this.enunciado = enunciado;
		this.nivel = nivel;
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
		this.opcion4 = opcion4;
		this.opcionCorrecta = opcionCorrecta;
		this.puntaje = puntaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getOpcion1() {
		return opcion1;
	}

	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}

	public String getOpcion2() {
		return opcion2;
	}

	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}

	public String getOpcion3() {
		return opcion3;
	}

	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}

	public String getOpcion4() {
		return opcion4;
	}

	public void setOpcion4(String opcion4) {
		this.opcion4 = opcion4;
	}

	public int getOpcionCorrecta() {
		return opcionCorrecta;
	}

	public void setOpcionCorrecta(int opcionCorrecta) {
		this.opcionCorrecta = opcionCorrecta;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Pregunta [codigo=" + codigo + ", enunciado=" + enunciado + ", nivel=" + nivel + ", opcion1=" + opcion1
				+ ", opcion2=" + opcion2 + ", opcion3=" + opcion3 + ", opcion4=" + opcion4 + ", opcionCorrecta="
				+ opcionCorrecta + ", puntaje=" + puntaje + "]";
	}

	

	
	
	
}
