CREATE DATABASE BDFORMS;
USE bdforms;

DROP DATABASE BDFORMS;
CREATE TABLE USUARIOS (
   idUsuario INT NOT NULL AUTO_INCREMENT,
   usuario VARCHAR(45) NOT NULL,
   nombre VARCHAR(45) NOT NULL,
   apellido VARCHAR(45) NOT NULL,
   telefono VARCHAR(45) NOT NULL,
   correo VARCHAR(45) NOT NULL,
   contraseña VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`));
  
  

INSERT INTO usuarios (usuario, nombre, apellido, telefono, correo, contraseña)
VALUES('prisci', 'Priscila', 'Polanco', 809-555-9696, 'prisciprisci@hotmail.com', '123456');

INSERT INTO usuarios (usuario, nombre, apellido, telefono, correo, contraseña)
VALUES('usuario2', 'Afedo', 'Camate', 0000000, 'afedo@hotmail.com', '123456');

SELECT * FROM usuarios;