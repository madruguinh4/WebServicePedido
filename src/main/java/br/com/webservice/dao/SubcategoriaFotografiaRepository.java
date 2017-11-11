package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaFotografia;
import br.com.webservice.model.SubcategoriaVeiculo;

public interface SubcategoriaFotografiaRepository extends JpaRepository<SubcategoriaFotografia, Long> {
	List<SubcategoriaFotografia> findByAniversario(String aniversario);
	List<SubcategoriaFotografia> findByCorporativos(String corporativos);
	List<SubcategoriaFotografia> findByInfantis(String infantis);
	List<SubcategoriaFotografia> findByCasamento(String casamento);
	List<SubcategoriaFotografia> findByBatizado(String batizado);
}
