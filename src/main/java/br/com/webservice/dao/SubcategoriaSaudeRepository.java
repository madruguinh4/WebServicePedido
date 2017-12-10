package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaSaude;

public interface SubcategoriaSaudeRepository extends JpaRepository<SubcategoriaSaude, Long> {
	List<SubcategoriaSaude> findByEnfermeira(String enfermeira);
	List<SubcategoriaSaude> findByAcompanhante(String acompanhante);
	List<SubcategoriaSaude> findByFisioterapeuta(String fisioterapeuta);
	List<SubcategoriaSaude> findByNutricionista(String nutricionista);
	List<SubcategoriaSaude> findByPsicologo(String psicologo);
	List<SubcategoriaSaude> findByCuidador(String cuidador);
	
}
