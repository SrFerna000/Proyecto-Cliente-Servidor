create database fideMotorBussiness;
use fideMotorBussiness;
create table clientes(

Cuenta_Cliente Text primary key,
Nombre Text,
Primer_Apellido Text,
Segundo_Apellido Text
);
create table usuarios
(
 id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    identificacion VARCHAR(20),
    telefono VARCHAR(20),
    contrasena VARCHAR(100),
    direccion VARCHAR(200),
    sexo ENUM('Masculino', 'Femenino', 'Otro'),
    fecha_nacimiento DATE,
    estado VARCHAR(20),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO usuarios (nombre, apellidos, identificacion, telefono, contrasena, direccion, sexo, fecha_nacimiento, estado) 
VALUES ('Ricardo', 'Milos', '123456', '1234567890', 'contrasena', 'Calle 123', 'Masculino', '1990-01-01', 'Activo');
select * from usuarios;
select identificacion, contrasena from usuarios where identificacion= "123456" and contrasena = "contrasena";
create table Compra
(
id INT AUTO_INCREMENT PRIMARY KEY,
    vehiculo VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    metodo_pago VARCHAR(50) NOT NULL,
    tipo_tarjeta VARCHAR(50)
);
INSERT INTO Compra (vehiculo, precio, metodo_pago, tipo_tarjeta) 
VALUES ('Automóvil', '2300', 'tarjeta','Visa'),
 ('motocicleta', '55000', 'tarjeta','Mastercard');
select * from Compra;
CREATE TABLE vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50),
    marca VARCHAR(50),
    modelo VARCHAR(50),
    año INT
);

INSERT INTO vehiculos (tipo, marca, modelo, año) 
VALUES ('Automóvil', 'Toyota', 'Corolla', 2022);
      
select * from vehiculos;
select tipo, marca, modelo, año from vehiculos
