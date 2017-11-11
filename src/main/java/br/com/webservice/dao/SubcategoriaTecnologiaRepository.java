package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaSaude;
import br.com.webservice.model.SubcategoriaTecnologia;

public interface SubcategoriaTecnologiaRepository extends JpaRepository<SubcategoriaTecnologia, Long> {
	List<SubcategoriaTecnologia> findByAnimacao(String animacao);
	List<SubcategoriaTecnologia> findByDesenvolvimento(String desenvolvimento);
	List<SubcategoriaTecnologia> findByAudio(String audio);
	List<SubcategoriaTecnologia> findByIlustracao(String ilustracao);
	List<SubcategoriaTecnologia> findByMarketing(String marketing);
	List<SubcategoriaTecnologia> findByModelagem(String modelagem);
}
