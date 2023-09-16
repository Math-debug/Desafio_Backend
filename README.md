# Desafio Técnico (Back-end)

Este projeto tem como objetivo, uma API Rest utilizando Spring Boot para cadastro de produtos

### 📋 Pré-requisitos

* Java 17
* Apache Maven 3.6.3

## 🚀 Começando

Após clonar o repositório acesse a pasta app execute o seguinte comando:

**./mvnw spring-boot:run**

### 🔧 Endpoints

* Criar Produto [POST]

url: http://localhost:9000/product

retorno:
	201 CREATED
		{
		  "id": 1,
		  "name": "Product1",
		  "description": "This is the product 1",
		  "amount": 2.5
		}
		
* Busca todos os produtos [GET]

url: http://localhost:9000/product

retorno:
	200 OK
		[
		  {
		  "id": 1,
		  "name": "Product1",
		  "description": "This is the product 1",
		  "amount": 2.5
		  }
		]	
		
* Busca produto especifico [GET]		

url: http://localhost:9000/product/{id}

retorno:
	200 OK
		{
		  "id": 1,
		  "name": "Product1",
		  "description": "This is the product 1",
		  "amount": 2.5
		}
	
* Remove produto especifico [DELETE]		

url: http://localhost:9000/product/{id}

retorno:
	200 OK
		"Product with id 1 has been removed"