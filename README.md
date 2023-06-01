# Ejercicio_Prodcuto_Pedido
_productos_
_codigoProducto int(11) Primary key, Not null,_
_producto_            _varchar(45)_
_precioUnitario_  _double_
_stock_                  _int(11)_

_pedidos_
_idPedido_		int(11)_
_codigoProducto_	_int(11)_
_unidades_		_int(11)_
_total_		_double_
_fechaPedido_	datetime_

_Microservicio productos:_
_1- Mostrar todos los productos_
_2- Actualizar el stock de un producto ( en la url se pasa el código del producto y las unidades)_
_3-Obtener el precio de un producto_

_Microservicio pedidos:__
_1- Dar de alta un pedido_
_2-Mostrar los pedidos_

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Deployment** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

_Tener una base de datos con los siguientes campos y registros_

```
_productos_
_codigoProducto int(11) Primary key, Not null,_
_producto_            _varchar(45)_
_precioUnitario_  _double_
_stock_                  _int(11)_


_pedidos_
_idPedido_		int(11)_
_codigoProducto_	_int(11)_
_unidades_		_int(11)_
_total_		_double_
_fechaPedido_	datetime_
```

### Instalación 🔧

_Requeire de la ejecucion de los 2 microservicios para su correctofuncuionamiento_

## Ejecutando las pruebas ⚙️

_Explica como ejecutar las pruebas automatizadas para este sistema_


## Despliegue 📦

_Importate tener los puertos 7000 y 8000 libres para la ejecucion de los 2 microservicios o  modificarlo en el archivo applicatio properties._

## Construido con 🛠️

* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Spring Boot]([https://rometools.github.io/rome/](https://spring.io/projects/spring-boot)) - FrameWork


## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Carlos Luo** - *Trabajo Inicial* - [CarlosLS](https://github.com/CarlosLS1)


También puedes mirar la lista de todos los [contribuyentes](https://github.com/your/project/contributors) quíenes han participado en este proyecto. 

## Licencia 📄

Este proyecto está bajo la Licencia (Tu Licencia) - mira el archivo [LICENSE.md](LICENSE.md) para detalles

