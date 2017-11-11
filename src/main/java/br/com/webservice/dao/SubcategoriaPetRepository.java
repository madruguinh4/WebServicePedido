package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaPet;
import br.com.webservice.model.SubcategoriaVeiculo;

public interface SubcategoriaPetRepository extends JpaRepository<SubcategoriaPet, Long> {
	List<SubcategoriaPet> findByAdestrador(String adestrador);
	List<SubcategoriaPet> findByPasseador(String passeador);
	List<SubcategoriaPet> findByBanho(String banho);
	List<SubcategoriaPet> findByHospedagem(String hospedagem);
	List<SubcategoriaPet> findByTaxi(String taxi);
	List<SubcategoriaPet> findByVeterinario(String veterinario);
}
