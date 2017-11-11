package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaVeiculo;

public interface SubcategoriaVeiculoRepository extends JpaRepository<SubcategoriaVeiculo, Long> {
	List<SubcategoriaVeiculo> findByMecanico(String mecanico);
	List<SubcategoriaVeiculo> findByAutoEletrico(String eletrica);
	List<SubcategoriaVeiculo> findByInstaladorDeSom(String instalador);
	List<SubcategoriaVeiculo> findByGuincho(String guincho);
	List<SubcategoriaVeiculo> findByFunilaria(String funilaria);
	List<SubcategoriaVeiculo> findByMartelinhoDeOuro(String martelinho);
	List<SubcategoriaVeiculo> findByBorracharia(String borracheiro);
}
