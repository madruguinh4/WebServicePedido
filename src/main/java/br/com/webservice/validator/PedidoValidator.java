package br.com.webservice.validator;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webservice.consts.PedidoValidatorMessages;
import br.com.webservice.dao.PedidoDAO;
import br.com.webservice.model.Pedido;

/**
 * 
 * @author Caique dos Santos Coelho 
 * data: 11 abril de 2017 
 * Regras para o web service: 
 * 		   O arquivo pode conter 1 ou mais pedidos, limitado a 10. 
 * 		   Não poderá aceitar um número de controle já cadastrado. 
 * 		   Caso a data de  cadastro não seja enviada o sistema deve assumir a data atual. 
 * 		   Caso a quantidade não seja enviada considerar 1. 
 * 		   Caso a quantidade seja maior que 5 aplicar 5% de desconto no valor total, para quantidades a
 *         partir de 10 aplicar 10% de desconto no valor total. O sistema deve
 *         calcular e gravar o valor total do pedido.
 */

@Service
public class PedidoValidator {
	
	private PedidoDAO pedidoDAO;
	
	@Autowired
	public PedidoValidator(PedidoDAO pedidoDAO) {
		this.pedidoDAO = pedidoDAO;
	}

	public PedidoValidatorMessages validate(Pedido pedido) {
		return checkIdControle(pedido);
	}

	private PedidoValidatorMessages checkIdControle(Pedido pedido) {
		
		if(pedidoDAO.findOne(pedido.getNumeroDeControle()) != null)
			return PedidoValidatorMessages.INVALID_ID;
		else
			return checkDate(pedido);
	}

	private PedidoValidatorMessages checkDate(Pedido pedido) {
		
		if(pedido.getDataDeCadastro() == null)
			pedido.setDataDeCadastro(LocalDate.now());
		
		return checkQuantidade(pedido);
	}

	private PedidoValidatorMessages checkQuantidade(Pedido pedido) {
		if(pedido.getQuantidade() == null)
			pedido.setQuantidade(new Integer(1));
		
		return calculateValorTotal(pedido);
	}
	
	private PedidoValidatorMessages calculateValorTotal(Pedido pedido) {
		
		pedido.setValor(pedido.getValor().
				multiply(new BigDecimal(pedido.getQuantidade()).
				setScale(2, BigDecimal.ROUND_HALF_UP)));
		
		return checkDiscount(pedido);
	}

	private PedidoValidatorMessages checkDiscount(Pedido pedido) {
		
		BigDecimal discount,oldAmount;
		
		if(pedido.getQuantidade() > 5 && pedido.getQuantidade() < 10){
			discount = pedido.getValor().multiply(new BigDecimal("0.05"));
			oldAmount = pedido.getValor();
			pedido.setValor(oldAmount.subtract(discount));
		}else if(pedido.getQuantidade() >= 10){
			discount = pedido.getValor().multiply(new BigDecimal("0.1"));
			oldAmount = pedido.getValor();
			pedido.setValor(oldAmount.subtract(discount));
		}
		return PedidoValidatorMessages.SUCESS;
	}

}
