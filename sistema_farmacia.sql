-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-06-2022 a las 00:11:38
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_farmacia`
--
CREATE DATABASE IF NOT EXISTS `sistema_farmacia` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `sistema_farmacia`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `dui_cliente` varchar(8) NOT NULL,
  `nombre_cliente` varchar(255) NOT NULL,
  `celular_cliente` varchar(9) NOT NULL,
  `estado_cliente` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `id_detalle_venta` int(11) NOT NULL,
  `cantidad_venta` int(11) NOT NULL,
  `subtotal_venta` double NOT NULL,
  `venta_id_venta` int(11) NOT NULL,
  `producto_id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre_producto` varchar(255) NOT NULL,
  `precio_producto` double NOT NULL,
  `stock_producto` int(11) NOT NULL,
  `estado_producto` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `id_vendedor` int(11) NOT NULL,
  `dui_vendedor` varchar(9) NOT NULL,
  `nombre_vendedor` varchar(255) NOT NULL,
  `celular_vendedor` varchar(8) NOT NULL,
  `estado_vendedor` varchar(1) NOT NULL,
  `user_vendedor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`id_vendedor`, `dui_vendedor`, `nombre_vendedor`, `celular_vendedor`, `estado_vendedor`, `user_vendedor`) VALUES
(1, '345999360', 'Carlos Rodrigo', '70143613', '1', 'CarlosRodrigo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id_venta` int(11) NOT NULL,
  `fecha_venta` date NOT NULL,
  `total_venta` double NOT NULL,
  `estado_venta` varchar(1) NOT NULL,
  `cliente_id_cliente` int(11) NOT NULL,
  `vendedor_id_vendedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `dui_cliente_UNIQUE` (`dui_cliente`);

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`id_detalle_venta`),
  ADD KEY `fk_detalle_venta_venta1_idx` (`venta_id_venta`),
  ADD KEY `fk_detalle_venta_producto1_idx` (`producto_id_producto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `nombre_producto_UNIQUE` (`nombre_producto`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id_vendedor`),
  ADD UNIQUE KEY `dui_vendedor_UNIQUE` (`dui_vendedor`),
  ADD UNIQUE KEY `user_vendedor_UNIQUE` (`user_vendedor`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `fk_ventas_cliente_idx` (`cliente_id_cliente`),
  ADD KEY `fk_ventas_vendedor1_idx` (`vendedor_id_vendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `id_detalle_venta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id_vendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `fk_detalle_venta_producto1` FOREIGN KEY (`producto_id_producto`) REFERENCES `producto` (`id_producto`),
  ADD CONSTRAINT `fk_detalle_venta_venta1` FOREIGN KEY (`venta_id_venta`) REFERENCES `venta` (`id_venta`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_ventas_cliente` FOREIGN KEY (`cliente_id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `fk_ventas_vendedor1` FOREIGN KEY (`vendedor_id_vendedor`) REFERENCES `vendedor` (`id_vendedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
