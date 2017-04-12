package br.com.webservice.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.consts.PedidoValidatorMessages;
import br.com.webservice.dao.PedidoDAO;
import br.com.webservice.model.Cliente;
import br.com.webservice.model.Pedido;
import br.com.webservice.validator.PedidoValidator;


/**
 * 
 * @author Caique dos Santos Coelho 
 * data: 10 abril de 2017 
 * Regras para o web service: 
 * 		   O arquivo pode conter 1 ou mais pedidos, limitado a 10. 
 * 		   Não poderá aceitar um número de controle já cadastrado. 
 * 		   Caso a data de  cadastro não seja enviada o sistema deve assumir a data atual. 
 * 		   Caso a quantidade não seja enviada considerar 1. 
 * 		   Caso a quantidade seja maior que 5 aplicar 5% de desconto no valor total, para quantidades a
 *         partir de 10 aplicar 10% de desconto no valor total. O sistema deve
 *         calcular e gravar o valor total do pedido.
 */

@RestController
public class PedidosController {

	private PedidoDAO pedidoDAO;
	private PedidoValidator validator;

	@Autowired
	public PedidosController(PedidoDAO pedidoDAO,PedidoValidator validator) {
		this.pedidoDAO = pedidoDAO;
		this.validator = validator;
	}

	@RequestMapping("/")
	public String welcome() {
		return "Web service Pedido.";
	}
	
	@RequestMapping(value = "/create/",method=RequestMethod.POST)
	public ResponseEntity<String> create(@RequestBody Pedido[] pedidos) {
		PedidoValidatorMessages validate = PedidoValidatorMessages.INVALID_NUMBER_OF_ORDERS;
		if (!(pedidos.length > 10)) {
			for (Pedido pedido : pedidos) {
				validate = validator.validate(pedido);
				if (validate.equals(PedidoValidatorMessages.SUCESS)) {
					pedidoDAO.save(pedido);
				} else {
					return new ResponseEntity<String>(validate.toString() + 
								"[" + pedido.getNumeroDeControle() + "]", 
								HttpStatus.CONFLICT);
				}
			}
		} else {
			return new ResponseEntity<String>(validate.toString(), HttpStatus.FORBIDDEN);
		}
		return new ResponseEntity<String>(validate.toString(), HttpStatus.OK);
	}
	
	@RequestMapping("/listAll") 
	public ResponseEntity<List<Pedido>> listAll() {
		return new ResponseEntity<List<Pedido>>(pedidoDAO.findAll(),HttpStatus.OK); 
	}
	
	@RequestMapping("/listByNumeroDoPedido/{numero}")
	public ResponseEntity<Pedido> listByNumeroDoPedido(@PathVariable Long numero) {
		return new ResponseEntity<Pedido>(pedidoDAO.findOne(numero),HttpStatus.OK);
	}
	
	@RequestMapping("/listByData/{data}") 
	public ResponseEntity<List<Pedido>> listByDate(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate data) {
		return new ResponseEntity<List<Pedido>>(pedidoDAO.findByDataDeCadastro(data),HttpStatus.OK);
	}
	
	@RequestMapping("/listByIdCliente/{idCliente}")
	public ResponseEntity<List<Pedido>> listByIdCliente(@PathVariable Long idCliente) {
		Cliente cliente =  new Cliente();
		cliente.setIdCliente(idCliente);
		return new ResponseEntity<List<Pedido>>(pedidoDAO.findByIdCliente(cliente),HttpStatus.OK);
	}
	
	
}