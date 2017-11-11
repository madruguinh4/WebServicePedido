package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaPessoal;
import br.com.webservice.model.SubcategoriaVeiculo;

public interface SubcategoriaPessoalRepository extends JpaRepository<SubcategoriaPessoal, Long> {
	List<SubcategoriaPessoal> findByCabelereiro(String cabelereiro);
	List<SubcategoriaPessoal> findByCostura(String custura);
	List<SubcategoriaPessoal> findByManicure(String manicure);
	List<SubcategoriaPessoal> findByMaquiador(String maquiador);
	List<SubcategoriaPessoal> findByPersonal(String personal);
}
