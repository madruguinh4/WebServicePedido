package br.com.webservice.consts;

/**
 * 
 * @author Caique dos Santos Coelho
 *
 */

public enum PedidoValidatorMessages {
	
	SUCESS("Pedidos processados com sucesso! "),
	INVALID_ID("Número de controle já existente! "),
	INVALID_NUMBER_OF_ORDERS("Quantidade de Pedidos maior do que a esperada! Máximo[10]");
	
	private final String name;       

    private PedidoValidatorMessages(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
