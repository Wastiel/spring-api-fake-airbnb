# Spring-api-fake-airbnb
## Fake Airbnb API

A Fake Airbnb API é uma aplicação Spring Boot Java que simula um Airbnb, oferecendo endpoints para manipulação de endereços, lugares e reservas.

## Objetos:
Existem os seguintes objetos presentes na API:

* Endereco
* Lugar
* Reserva

## EndPoints Disponiveis:

### Endereco

* GET /endereco: retorna uma lista com todos os endereços cadastrados
* GET /endereco/{id}: retorna o endereço com o id especificado
* POST /endereco: cria um novo endereço
* PUT /endereco/{id}: atualiza o endereço com o id especificado
* DELETE /endereco/{id}: exclui o endereço com o id especificado

### Lugar

* GET /lugar: retorna uma lista com todos os lugares cadastrados
* GET /lugar/{id}: retorna o lugar com o id especificado
* POST /lugar: cria um novo lugar
* PUT /lugar/{id}: atualiza o lugar com o id especificado
* DELETE /lugar/{id}: exclui o lugar com o id especificado
* GET /lugar/findUnreservedPlaces?dataInicial=YYYY-MM-DD&dataFinal=YYYY-MM-DD: retorna uma lista de lugares disponíveis no período especificado

### Reserva

* GET /reserva: retorna uma lista com todas as reservas cadastradas
* GET /reserva/{id}: retorna a reserva com o id especificado
* POST /reserva: cria uma nova reserva
* PUT /reserva/{id}: atualiza a reserva com o id especificado
* DELETE /reserva/{id}: exclui a reserva com o id especificado


## Relacionamento entre as entidades

A API possui o seguinte relacionamento: 

![Modelo ER da API](dir/entidade_relacionamento_fakeAIRBNB.PNG?raw=true)


## Camada Entity
Na camada Entity, estão presentes os objetos Endereco, Lugar e Reserva, além das exceções, do repository e da service.

## Camada API
Na camada API, estão presentes as controllers, os DTOs (Data Transfer Objects), as exceções, os forms (formulários de entrada) e os mappers de cada objeto. Utilizamos a validação de entrada pelo formulário através do @Valid do Spring.

# Arquivo de Importação JSON
No projeto temos o arquivo fakeAIRBNB.json disponivel com os endpoints disponiveis e configurados. Basta importar na ferramenta desejada (Insomnia ou Postmann)

[JSON's das API's](dir/fakeAIRBNB.json).

## swagger-ui
Foi adicionado a dependencia do gradle para geração do swagger (Dentro do build.gradle):
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.0'

Acesso ao Spring: http://localhost:8080/swagger-ui/index.html#/

## Executando o projeto
Para executar a aplicação, é necessário ter o Java 17 ou superior e o Gradle instalados e pode ser inicialisado por qualquer IDE. O projeto está disponível no repositório https://github.com/Wastiel/spring-api-fake-airbnb.

## Conclusão:
A Fake Airbnb API foi desenvolvida com o objetivo de fornecer um projeto de exemplo para aprendizado na criação de APIs que simulam o funcionamento de um Airbnb. Caso tenha alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato

-----------------------------------------------------------
# Spring-api-fake-airbnb English Version README.md

## Fake Airbnb API

The Fake Airbnb API is a Java Spring Boot application that simulates an Airbnb, offering endpoints for manipulation of addresses, places, and reservations.

## Objects:
The following objects are present in the API:

* Address
* Place
* Reservation

## Available Endpoints:

### Endereco (Address)
* GET /endereco: returns a list with all registered addresses
* GET /endereco/{id}: returns the address with the specified id
* POST /endereco: creates a new address
* PUT /endereco/{id}: updates the address with the specified id
* DELETE /endereco/{id}: deletes the address with the specified id

###  Lugar (Place)
* GET /lugar: returns a list with all registered places
* GET /lugar/{id}: returns the place with the specified id
* POST /lugar: creates a new place
* PUT /lugar/{id}: updates the place with the specified id
* DELETE /lugar/{id}: deletes the place with the specified id
* GET /lugar/findUnreservedPlaces?startDate=YYYY-MM-DD&endDate=YYYY-MM-DD: returns a list of available places in the specified period

### Reserva (Reservation)
* GET /reserva: returns a list with all registered reservations
* GET /reserva/{id}: returns the reservation with the specified id
* POST /reserva: creates a new reservation
* PUT /reserva/{id}: updates the reservation with the specified id
* DELETE /reserva/{id}: deletes the reservation with the specified id

## Relationship between entities
The API has the following relationship:

![Modelo ER da API](dir/entidade_relacionamento_fakeAIRBNB.PNG?raw=true)

## Entity layer
In the Entity layer, the objects Address, Place, and Reservation are present, in addition to the exceptions, repository and service.

## API layer
In the API layer, the controllers, DTOs (Data Transfer Objects), exceptions, forms (input forms), and mappers for each object are present. We use input validation through Spring's @Valid.

## JSON Import File
In the project, we have the fakeAIRBNB.json file available with the available and configured endpoints. Simply import it into the desired tool (Insomnia or Postman)

[JSON's das API's](dir/fakeAIRBNB.json).

## swagger-ui
The gradle dependency was added for the generation of swagger (Inside build.gradle):
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.0'

Access to Spring: http://localhost:8080/swagger-ui/index.html#/

## Running the project
To run the application, it is necessary to have Java 17 or higher and Gradle installed and can be started by any IDE. The project is available in the repository https://github.com/Wastiel/spring-api-fake-airbnb.

## Conclusion:
The Fake Airbnb API was developed with the aim of providing a sample project for learning in creating APIs that simulate the functioning of an Airbnb. If you have any questions or suggestions, feel free to contact us.