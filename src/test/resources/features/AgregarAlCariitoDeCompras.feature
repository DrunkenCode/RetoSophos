#language: es

Característica: Agregar al carrito de compras en Linio.com
  yo como Usuario
  Quiero buscar articulos
  Para agregar un producto al carrito de compras

  Esquema del escenario: Agregar al carrito
  Dado que el usuario desea buscar un <articulo>
  Cuando el usuario agregue al carrito el <producto> especifico deseado
  Cuando confirme la adquisicion del producto
  Entonces validara que el producto fue agregado exitosamente
  
	Ejemplos:
  |	articulo	|	producto	|
  |						|						|