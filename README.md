# Instruções de instalação

Para que o projeto funcione adequadamente é necessário seguir as seguintes etapas para que funcione

1- é necessário ter o MySql instalado, já que o projeto apresentado vai utilizar banco de dados
2- Se estiver com o MySql instalado, dentro da pasta Resources, vai estar um arquivo sql chamado de criar_database.sql, execute esse arquivo com o seguinte commando dentro do bash:

mysql -u <seu_usuario> -p < (caminho_do_projeto)/(nome_projeto)/src/main/resources/criar_Database.sql

onde: 
<seu_usuario> : usuário que você está utilizando no database;
(caminho_do_projeto) : caminho onde está localizado o projeto
(nome_projeto) : nome do projeto

3- após criar a database, também na pasta resources tem um arquivo JSON, com o seu seguinte contéudo:

{
    "exclude": [
      "**/bin",
      "**/bower_components",
      "**/jspm_packages",
      "**/node_modules",
      "**/obj",
      "**/platforms"
    ],
  
    "Server": "localhost:3306",
    "Database": "estoque",
    "Uid": "<Coloque seu usuário aqui>",
    "Password": "<Coloque sua senha aqui>"
  }

  altere o Uid e Password para as informações do banco de dados adequadamente
