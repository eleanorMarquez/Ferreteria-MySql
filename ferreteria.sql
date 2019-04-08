-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-10-2018 a las 03:45:01
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ferreteria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `cliente` varchar(150) DEFAULT NULL,
  `rut` varchar(8) DEFAULT NULL,
  `codigoproducto` varchar(10) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `preciototal` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo` varchar(10) NOT NULL,
  `precio` int(11) DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `imagen` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo`, `precio`, `descripcion`, `nombre`, `imagen`) VALUES
('01', 2500, 'Martillo de mano que se usa para atrincherar o enchazcar clavos y otras cosas.', 'Martillo', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\martillo.png'),
('02', 500, 'Set de 5 a 8 clavos para clavar en superficies.', 'Clavos', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\Clavos.png'),
('03', 3000, 'Herramienta util para tomar mediciones entre espacios grandes y chicos.', 'Metro', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\metro.png'),
('04', 60000, 'Sirve para taladrar tornillos y tuercas de manera mas efectiva y precisa.', 'Taladro', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\Taladro.png'),
('05', 23000, 'Herramienta perfecta para hacer cortes especialmente sobre la madera y otros.', 'Sierra', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\Sierra.png'),
('06', 250000, 'En lo personal, mi favorita.', 'Motosierra', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\Motosierra.png'),
('07', 50000, 'Perfecto para aplastar y machacar cosas.', 'Mazo', 'C:\\Users\\Familia S Q\\Documents\\NetBeansProjects\\Ferreteria el herrero Asesino\\src\\Productos\\Mazo.png');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fkproducto` (`codigoproducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `fkproducto` FOREIGN KEY (`codigoproducto`) REFERENCES `producto` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
