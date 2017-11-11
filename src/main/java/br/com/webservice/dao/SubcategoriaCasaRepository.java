package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;

public interface SubcategoriaCasaRepository extends JpaRepository<SubcategoriaCasa, Long> {
	List<SubcategoriaCasa> findByEletricista(String eletricista);
	List<SubcategoriaCasa> findByPintor(String pintor);
	List<SubcategoriaCasa> findByDiarista(String diarista);
	List<SubcategoriaCasa> findByCozinheira(String cozinheira);
	List<SubcategoriaCasa> findByJardineiro(String jardineiro);
	List<SubcategoriaCasa> findByMotorista(String motorista);
}

