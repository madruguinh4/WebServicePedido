package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaCurso;

public interface SubcategoriaCursoRepository extends JpaRepository<SubcategoriaCurso, Long> {
	List<SubcategoriaCurso> findByCulinaria(String culinaria);
	List<SubcategoriaCurso> findByIdiomas(String idiomas);
	List<SubcategoriaCurso> findByDanca(String danca);
	List<SubcategoriaCurso> findByJudo(String judo);
	List<SubcategoriaCurso> findByMusica(String musica);
	List<SubcategoriaCurso> findByArtesanato(String artesanto);
}
