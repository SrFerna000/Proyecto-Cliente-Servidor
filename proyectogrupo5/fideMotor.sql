create database fideMotorBussiness;
use fideMotorBussiness;
create table clientes
(
Cuenta_Cliente Text primary key,
Nombre Text,
Primer_Apellido Text,
Segundo_Apellido Text
);
create table usuario
(
Nombre_Usuario Text primary key,
Nombre Text,
Primer_Apellido Text, 
Segundo_Apellido Text,
Identificacion Text,
Telefono integer,
Contraseña Text,
Direccion Text,
Sexo Text,
FechaNacimiento Date,
Estado Text,
FechaRegistro Date
);
create table compras
(
NumeroCompra integer primary key,
Cuenta_Cliente text,
TipoVehiculo text,
Puntuacion integer,
TipoPago text,
NumeroTipoPago text,
Estado text 
);
create table inventario
(
TipoVehiculo Text primary key,
Marca Text,
Anno Integer,
Modelo Text,
Saldo integer,
Precio double
);