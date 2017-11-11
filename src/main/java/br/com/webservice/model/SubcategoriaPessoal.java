package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_PESSOAL")
public class SubcategoriaPessoal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "CABELEREIRO")
	private String cabelereiro;
	
	@Column(name= "CUSTURA")
	private String costura;
	
	@Column(name= "MANICURE")
	private String manicure;
	
	@Column(name= "MAQUIADOR")
	private String maquiador;
	
	@Column(name= "PERSONAL")
	private String personal;
	
	@Column(name= "MEDIA_PROFISSIONAL")
	private Integer mediaProfisional;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(String cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

	public String getCostura() {
		return costura;
	}

	public void setCostura(String costura) {
		this.costura = costura;
	}

	public String getManicure() {
		return manicure;
	}

	public void setManicure(String manicure) {
		this.manicure = manicure;
	}

	public String getMaquiador() {
		return maquiador;
	}

	public void setMaquiador(String maquiador) {
		this.maquiador = maquiador;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
