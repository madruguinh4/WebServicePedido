package br.com.webservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.dao.PedidoDAO;
import br.com.webservice.model.Pedido;

@RestController
public class PedidosController {

	private PedidoDAO pedidoDAO;

	@Autowired
	public PedidosController(PedidoDAO pedidoDAO) {
		this.pedidoDAO = pedidoDAO;
	}

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}
	
	/*
	 * O arquivo pode conter 1 ou mais pedidos, limitado a 10.
		Não poderá aceitar um número de controle já cadastrado.
		Caso a data de cadastro não seja enviada o sistema deve assumir a data atual.
		Caso a quantidade não seja enviada considerar 1.
		Caso a quantidade seja maior que 5 aplicar 5% de desconto no valor total, para quantidades a partir de 10 aplicar 10% de desconto no valor total.
		O sistema deve calcular e gravar o valor total do pedido.
	 * 
	 * 
	 */

	@RequestMapping("/create/{pedido}")
	public ResponseEntity<Pedido> create(@RequestBody List<Pedido> pedidos) {// REST Endpoint.
		
		for (Pedido pedido : pedidos) {
			
		}
		return null;
	}
	
	@RequestMapping("/listAll")
	public ResponseEntity<List<Pedido>> listAll() {
		return new ResponseEntity<List<Pedido>>(pedidoDAO.findAll(),HttpStatus.OK); 
	}
	@RequestMapping("/listByNumeroDoPedido/{numero}")
	public ResponseEntity<Pedido> listByNumeroDoPedido(@RequestBody Integer numero) {// REST Endpoint.
		
		return null;
	}
	
}