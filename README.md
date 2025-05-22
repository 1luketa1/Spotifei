# 📋 Introdução

O projeto consiste de uma aplicação em Java com integração de banco de dados por PostgreSQL e contém as seguintes funcionalidades:
* Cadastrar e logar em contas;
* Criação de playlists com músicas contidas no BD;
* Curtir e descurtir músicas;
* Pesquisar e filtrar músicas por artista, gênero e tempo;
* Histórico de pesquisas, curtidas e descurtidas.

# 🔧 Uso do Programa

Para executar o programa, primeiro é necessário baixar o BD anexado neste Github, o PostgreSQL em seu computador (e por consequência, o pgAdmin) e o driver JDBC contido no link abaixo, além do Java 8 instalado na máquina.

https://jdbc.postgresql.org/download/

Após estes pré-requisitos estarem cumpridos, anexe o arquivo .jar do JDBC na biblioteca do projeto (Projeto_Spotifei/dist/lib) e execute o arquivo "Projeto_Spotifei.jar". 
Para que a funcionalidade com o banco de dados, e por consequência, o restante do arquivo, funcione, restaure o arquivo "bdSpotifei.backup" no pgAdmin. A senha é "projetoSpotifei". Após isso, você será recebido pela tela de login e pode começar a mexer com a aplicação!

* Lucas Rossi Dotzlaw
* RA: 24.124.025-8
