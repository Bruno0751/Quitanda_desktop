CREATE DATABASE bdjava;

USE bdjava;

CREATE TABLE cliente(
	id_cliente BIGINT(5) ZEROFILL NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	cpf VARCHAR(15) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI UNIQUE NOT NULL,
	idade INT NOT NULL,
	CONSTRAINT pkid_cliente PRIMARY KEY(id_cliente));

CREATE TABLE fruta(
	id_fruta BIGINT(5) ZEROFILL NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	valor FLOAT NOT NULL,
	quantidade FLOAT NOT NULL,
	CONSTRAINT pkid_fruta PRIMARY KEY(id_fruta));

CREATE TABLE quitanda(
	id_quitanda BIGINT(5) ZEROFILL NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	cliente VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
    funcionario VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	CONSTRAINT pkid_quitanda PRIMARY KEY(id_quitanda));

CREATE TABLE usuario(
	id_user BIGINT(5) ZEROFILL NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	login VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI UNIQUE NOT NULL,
	senha VARCHAR(50) CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	tipo ENUM('adm','visitante') CHARACTER SET UTF8 COLLATE UTF8_UNICODE_CI NOT NULL,
	CONSTRAINT pkid_user PRIMARY KEY(id_user));

INSERT INTO cliente
	VALUES(NULL,"Bruno",123456789112345,23),
	(NULL,"Lidia",897654321,10),
	(NULL,"Eduarda",1230984756,15);

INSERT INTO fruta
	VALUES(NULL,"Abacaxi",3.00,30),
    	(NULL,"Laranja",2.50,60),
    	(NULL,"Bergamota",1.00,100);

INSERT INTO quitanda
	VALUES(NULL,"Quitanda do Jorge","Pablo Ricardo","Jo�o da Silva"),
    	(NULL,"Quitanda da Joyce","Fernando Arag�o","Gabriel Langner"),
    	(NULL,"Quitanda Furac�o","Kiko","Seu Madruga");