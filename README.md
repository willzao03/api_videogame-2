🎮 Videogame API 2

API REST desenvolvida com Spring Boot para gerenciamento de videogames.
Esta versão possui uma estrutura semelhante à primeira, sendo ideal para estudos de API REST, Spring Boot e organização de projetos Java.

📌 Funcionalidades

📋 Listar todos os videogames cadastrados

🔍 Buscar videogame por ID

📂 Leitura de dados a partir de arquivo JSON

⚡ API leve e fácil de executar

🛠️ Tecnologias Utilizadas

Java

Spring Boot

Maven

REST API

JSON


📁 Estrutura do Projeto

api2_videogame
src
main
java
br.com.fecaf
controller
model
Application.java
resources
data
videogames.json
pom.xml
README.md



▶️ Como Executar o Projeto
Pré-requisitos

Java JDK instalado

Maven

IDE (IntelliJ, Eclipse ou VS Code)

Passos para execução

Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git


Entre na pasta do projeto:

cd api2_videogame


Execute a aplicação:

mvn spring-boot:run


A API estará disponível em:

http://localhost:8080

🔗 Endpoints Disponíveis
📋 Listar todos os videogames

GET

/api/v1/games


📌 Exemplo:

curl http://localhost:8080/api/v1/games

🔍 Buscar videogame por ID

GET

/api/v1/games/{id}


📌 Exemplo:

curl http://localhost:8080/api/v1/games/2

🗂️ Origem dos Dados

Os dados são carregados do arquivo:

src/main/resources/data/videogames.json


📌 Observações:

Os dados ficam apenas em memória

Não há persistência em banco de dados

Reiniciar a aplicação restaura os dados originais

🎯 Objetivo do Projeto

Projeto desenvolvido para aprendizado acadêmico, com foco em:

Desenvolvimento de APIs REST

Uso do Spring Boot

Estruturação de projetos Java

Manipulação de arquivos JSON

👨‍💻 Autores

Willian Gabriel

Vinícius Gerônimo

📄 Licença

Projeto de uso educacional, livre para estudos e modificações.
