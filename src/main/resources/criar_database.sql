CREATE DATABASE IF NOT EXISTS estoque;

use estoque;

CREATE table produtos(
	id INT PRIMARY KEY not null,
    nome varchar(50),
    quantidade INT,
    preco decimal(10,2));

    