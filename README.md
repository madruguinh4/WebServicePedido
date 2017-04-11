# Web Service Pedido

	Mapeia a criação e consulta de pedidos enviados pelo cliente.
	A criação ou consulta pode ser feita via XMl e/ou Json.
	
	
	A Aplicação está mapeada para subir na porta 8888 da localHost.
	Isso pode ser configurável pelo arquivo src/main/resources/application.properties
	
	URLs: 
		criação de pedido:
		-- http://localhost:8888/create/
		
		Consulta por código do cliente:
		-- http://localhost:8888/listByIdCliente/'id'
		
		Consulta por número do pedido ou número de registro:
		-- http://localhost:8888/listByNumeroDoPedido/'numero'
		
		Consulta por data de cadastro:
		-- http://localhost:8888/listByData/'data'
		--formato da data : 11-04-2017
		
		Consultar todos: 
		-- http://localhost:8888/listAll
		
		OBS: não incluir '' nos parâmetros, as aspas simples são apenas para 
		indicação.
		
		Para consultar no qual a resposta deve ser um arquivo json , utilizar o
		sufixo .json no final, para XML usar o sufixo .xml
		
		Retorna Json:
		Exemplo: http://localhost:8888/listAll.json
		
		Retorna XML:
		Exemplo: http://localhost:8888/listAll.xml
		
		Os arquivos de exemplo(XML/JSON) se encontram na pasta src/webapp/examples
		
#Componentes da Aplicação
	
		A aplicação foi construida em Spring MVC, SpringBoot,JPA/Hibernate
		
		Foram usados todos os requisitos citados no teste.
		
		--Injeção de dependência: usado com a anotação do Spring AutoWired
		--Banco de dados mysql
		--Utilizar framework ORM: Framework utilizado JPA/Hibernate
		--Utilizado a linguagem java 1.8
		--Maven : para gerenciamento da aplicação
		
		Para construir os serviços, foi usada a Annotation @RestController do Spring
		junto com a bliboteca jackson-library , na qual permite a manipulação da 
		API REST com mais facilidade.

#Subindo a Aplicação
		
		Primeiramente é preciso instalar o Maven caso não esteja instalado.
		Mais detalhes em: https://maven.apache.org/install.html
		
		Após isso ,abrir o projeto na IDE.   
		
		No arquivo src/main/resources/application.properties estão as configurações de 
		banco como senha e usuário, caso preciso, favor alterá-lo.
		
		Depois disso, executar o script os comandos abaixo no seu banco de dados.
		
		------------------------------
			create database pedido_db;
			use pedido_db;
		------------------------------
		
		Depois disso , executar a aplicação pela classe :
		
		-----------------------------------------------------	
			br.com.webservice.web.WebServiceApplication.java
		-----------------------------------------------------
		
		O SpringBoot irá cuidar da inicialização da aplicação e o Hibernate irá criar as
		tabelas no banco de dados automaticamente.
		
		Após isso basta inserir os pedidos no banco , como solicitado, pelo script:
		
		-----------------------------
		 src/webapp/script/script.sql
		-----------------------------
		
		Após isso, a aplicação está pronta para as consultas e criações de pedidos.
		
		Como dica, pode ser usado o PostMan para testar os serviços
	
		
			
	
	