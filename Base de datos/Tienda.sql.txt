

SHOW DATABASES

USE TIENDA;

CREATE TABLE Fabricante(
    Clave_fabricante Int PRIMARY KEY,
    Nombre VARCHAR(30)
);

CREATE TABLE Articulos(
    Clave_artículos Int PRIMARY KEY,
    Nombre VARCHAR(30),
    Precio Int,
    Clave_fabricante Int,
    FOREIGN KEY (Clave_fabricante) REFERENCES fabricante(Clave_fabricante)
);

SHOW DATABASE tienda;
SHOW COLUMNS articulos;

INSERT INTO fabricante (Clave_fabricante, Nombre)
VALUES (1 'Kingston')

INSERT INTO fabricantes (Clave_fabricante, Nombre)
VALUES (1, 'Kingston');

INSERT INTO fabricantes (Clave_fabricante, Nombre)
VALUES (2, 'Adata');


INSERT INTO fabricantes (Clave_fabricante, Nombre)
VALUES (3, 'Logitech');


INSERT INTO fabricantes (Clave_fabricante, Nombre)
VALUES (4, 'Lexar');


INSERT INTO fabricantes (Clave_fabricante, Nombre)
VALUES (5, 'Seagate')

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (1, 'Teclado', 100, 3);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (2, 'Disco duro 300 Gb', 500, 5);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (3, 'Mouse', 80, 3);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (4, 'Memoria USB', 140, 4);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (5, 'Memoria RAM', 290, 4);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (6, 'Disco duro extraible 250 Gb', 650, 5);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (7, 'Memoria USB', 279, 1);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (8, 'DVD Rom', 450, 2);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (9, 'CD Rom', 200, 2);

INSERT INTO articulos (Clave_articulos, Nombre, Precio, Clave_Fabricante)
VALUES (10, 'Tarjeta de Red', 180, 3)

SELECT * FROM articulos;
SELECT Nombre FROM articulos;
SELECT Nombre, Precio FROM articulos;
SELECT DISTINCT Nombre FROM articulos;
SELECT * FROM articulos WHERE Clave_Articulos = 5;
SELECT * FROM articulos WHERE Nombre = 'Teclado';
SELECT * FROM articulos WHERE Nombre = 'Memoria RAM' AND 'Memoria USB';
SELECT * FROM articulos WHERE Nombre = 'M%';
SELECT Nombre FROM articulos WHERE Precio = 100;
SELECT Nombre FROM articulos WHERE Precio > 200;
SELECT Nombre FROM articulos WHERE Precio BETWEEN 100 AND 350;
SELECT Nombre, Precio FROM articulos ORDER BY Nombre ASC;
SELECT * FROM articulos ORDER BY Precio DESC;
SELECT Nombre, Precio FROM articulos WHERE Precio > 250 ORDER BY Precio DESC, Nombre ASC;