#Projeto de gestão financeira
##Este projeto é uma aplicação web desenvolvida com Spring Boot para gestão financeira. O projeto permite registrar entradas e saídas financeiras, visualizar o valor total de entradas e saídas, e calcular o saldo total da gestão.

#Pré-requisitos
Java 8+
Maven
Banco de dados relacional (MySQL, PostgreSQL, etc.)
Instalação e execução
Clone o projeto do GitHub:
git clone https://github.com/seu_usuario/projeto-de-gestao-financeira.git


#2. Navegue para o diretório do projeto:

cd projeto-de-gestao-financeira


#3. Crie o banco de dados e execute as migrações:

mvn spring-boot:run


#4. O projeto estará disponível na seguinte URL:

http://localhost:8080

#Uso
A página inicial da aplicação lista todas as entradas e saídas financeiras registradas. É possível adicionar novas entradas e saídas clicando nos botões "Nova entrada" e "Nova saída", respectivamente.

Para editar ou excluir uma entrada ou saída, clique no ícone correspondente na linha da entrada ou saída.

#API
O projeto também expõe uma API REST que pode ser usada para gerenciar as entradas e saídas financeiras. A API está documentada no seguinte endereço:

http://localhost:8080/swagger-ui/index.html

#Contribuições
São bem-vindas contribuições de todos os tipos, desde correções de bugs até novas funcionalidades. Para contribuir, basta criar um fork do projeto no GitHub e fazer um pull request.

#Licença
Este projeto está licenciado sob a licença MIT.
