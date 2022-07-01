USE `sistema_farmacia`;
insert into vendedor(dui_vendedor, nombre_vendedor, celular_vendedor, estado_vendedor, user_vendedor) values ('732024843', 'Carlos', '63640756', '1', 'Carlos007');
insert into vendedor(dui_vendedor, nombre_vendedor, celular_vendedor, estado_vendedor, user_vendedor) values ('713141323', 'David', '23654543', '1', 'XxDavidxX');
select * from vendedor;

insert into cliente (dui_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('735621357', 'Roberto', '24654356', '1');
insert into cliente (dui_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('705351263', 'Karmen', '26563215', '1');
insert into cliente (dui_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('706746894', 'Abraham', '25326452', '1');
insert into cliente (dui_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('726697636', 'Moises', '26466213', '1');
select * from cliente;

insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Paracetamol 500mg', 1.50, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Ibuprufeno 400mg', 1.45, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Cardiospirina 81mg', 11.96, 25, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Neuroferrical B12 ', 18.90, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Acetaminofen 500mg', 4.50, 25, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Asepxia Jabin 100g', 5.10, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Medicasp 130ml', 6.95, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Foskrol x15', 14.17, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Ferroprim x20', 15.60, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Vitamina C 50ml', 11.13, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Alka seltzer x60 ', 13.80, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Cerebrofos x9', 12.35, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Pepto bismol 236ml', 8.69, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Dolofin x100', 8.51, 100, 1);
select * from producto;

insert into venta (fecha_venta, total_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('2022-02-03', 43, 1, 1, 1);
insert into venta (fecha_venta, total_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('2022-02-05', 40, 1, 2, 2);
insert into venta (fecha_venta, total_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('2022-02-05', 50, 1, 3, 1);
select * from venta;

insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 7, 1, 2);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 10, 1, 14);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 24, 1, 6);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 2, 1, 11);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 17, 2, 1);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 10, 2, 14);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 6, 2, 8);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 5, 2, 7);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 2, 2, 11);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 11, 3, 5);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 30, 3, 3);
insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (2, 9, 3, 4);
select * from detalle_venta;