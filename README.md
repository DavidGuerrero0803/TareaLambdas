Tarea de Lambdas y Clases de Colección
Hecho por Mario David Guerrero Márquez el 17 de abril de 2026.

Este trabajo contiene un total de 10 métodos estáticos realizados en Java y que demuestran de manera simple el manejo de clases de colección, lambdas y flujos.
Las clases de colección que se utilizaron principalmente aquí fueron: ArrayList, HashMaps y HashSets, además de las ya mencionadas Lambdas y Streams.

El objetivo propuesto en la tarea se basó en resolver los 10 problemas que se nos presentaron mediante métodos estáticos, pero además había que
manipular datos de cierta manera, como lo pueden ser por filtrado, transformación, mapeo o deduplicación, se requirió usar una sintaxis clara
y que fuese comprensible para todos.

A continuación se mencionarán los 10 métodos y una breve descripción sobre lo que consistían:

1. El Multiplicador: Modifica un ArrayList<Integer> multiplicando cada elemento por un factor dado, se tuvo que usar replaceAll para realizar el ejercicio.
2. El Filtro Selectivo: Limpia una lista de palabras, eliminando aquellas que empiezan por un caracter específico o con una longitud menor a N, para este caso se usó removeIf.
3. Conversor de Mayúsculas: Crea una nueva lista con las cadenas originales transformadas a mayúsculas, manejado a través de un .map.
4. Cuadrados Únicos: Filtra números pares de una lista, calcula su cuadrado y los almacena en un HashSet para evitar duplicados.
5. Mapa de Longitudes: Transforma una lista de palabras en un mapa donde la clave es la palabra y el valor es su longitud, para esto hizo falta usar .toMap.
6. Modificador de Inventario: Recorre un mapa de productos y precios para mostrar por consola su versión con descuento del 10%.
7. Contador de Frecuencias: Calcula cuántas veces aparece cada palabra en una lista utilizando una lógica de acumulación con lambdas, se tuvo que hacer uso de .merge.
8. Clasificador de Palabras: Filtra un mapa de frecuencias para extraer solo las palabras que superan un umbral determinado, como se usó un mapa, se usó entrySet() para obtener la clave y valor.
9. Deduplicación de Palabras: Procesa una frase larga para extraer palabras únicas de longitud mínima, para luego pasarlas a minúsculas, para dividir la frase se utilizó .split.
10. El Tope de Frecuencias: Ajusta los valores de un mapa de frecuencias para que ninguno supere un límite máximo N (el tope), al igual que el primero, se utilizó replaceAll.

Para compilar y ejecutar los códigos, hace falta realizar lo siguiente:
1. Clonar el repositorio: https://github.com/DavidGuerrero0803/TareaLambdas.git
2. Compilar los archivos (mostraré a continuación una alternativa desde terminal): javac EjerciciosStaticNumeros.java EjerciciosStaticCadenas.java Main.java
3. Ejecuta la clase Main. Para ver la demostración de los 10 métodos estáticos, debes ejecutar la clase Main así: java Main

Las indicaciones sugirieron el uso de 2 clases, las cuales son las que recién se acaban de indicar..
EjerciciosStaticLNumeros.java > Esta es la clase que contiene 4 métodos estáticos que están más relacionados a los números.
EjerciciosStaticCadenas.java > En esta clase hay los otros 6 métodos estáticos, pero que estos están más ligados a cadenas.
Main.java > La clase principal de ejecución que inicializa todo y realiza las pruebas para mostrarlas en consola.

Ejemplos de salida.

Si se ejecutó la clase Main con éxito, deberían poder mirarse los próximos resultados:

=== #1 MULTIPLICADOR ===

Enteros: [10, 20, 0, null]
Enteros afectados por un factor de 3: [30, 60, 0, 0]

=== #2 FILTRO SELECTIVO ===

Lista de sabores: [Dulce, Salado, Amargo, Agrio, ]
Sabores que no empiezan con S y no tienen longitud <4: [Dulce, Amargo, Agrio]

=== #3 CONVERSOR DE MAYÚSCULAS ===

Listado de frutas: [Manzana, Banana, Limón, null]
Listado en mayúsculas: [MANZANA, BANANA, LIMÓN, null]
Listado en mayúsculas VACÍO: []

=== #4 CUADRADOS ÚNICOS ===

Números repetidos: [-2, 0, 1, 1, 2, 2, 3, 4, 4, 5]
Números pares al cuadrado y sin repetidos: [0, 16, 4]
Números VACÍOS: []

=== #5 MAPA DE LONGITUDES ===

Palabras usadas en programación (con repetidos): [Java, Java, Método, Stream, Lambda, Lambda]
Palabras con su longitud (sin repetidos): {Java=4, Stream=6, Método=6, Lambda=6}
Palabras VACÍAS: {}

=== #6 MODIFICADOR DE INVENTARIO ===

Producto: Headset, Precio: 40.80, Precio con descuento: 36.72
Producto: Monitor, Precio: 300.10, Precio con descuento: 270.09
Producto: Mouse, Precio: 25.50, Precio con descuento: 22.95
Producto: Nada, Precio: 0.00, Precio con descuento: 0.00
Producto: Teclado, Precio: 45.00, Precio con descuento: 40.50

=== #7 CONTADOR DE FRECUENCIAS ===

Colores: [Rosa, Naranja, Amarillo, Amarillo, Amarillo, Amarillo, Verde]
Existencia de colores (sin repetidos): {Amarillo=4, Naranja=1, Rosa=1, Verde=1}
Lista de colores VACÍA: {}

=== #8 CLASIFICADOR DE PALABRAS ===

Mapa con números y frecuencias: {Cero=0, Siete=5, Cinco=5, Uno=3, Dieciocho=9, Diez=4, Diecisiete=10, Cien=100}
Números que son de una frecuencia >=6: [Dieciocho, Diecisiete, Cien]

=== #9 DEDUPLICACIÓN DE PALABRAS ===

Ejemplo de frase: Esta es una prueba de escritura de una frase relativamente larga más una extensión
Palabras guardadas sin duplicados:[esta, frase, extensión, larga, prueba, escritura, relativamente]
Ejemplo de frase VACÍA: []

=== #10 TOPE DE FRECUENCIAS ===
Palabras populares: {Todo=100, Nada=0, Adiós=20, Ok=50, Hola=25, Taco=8}
Palabras ajustadas a un tope de 20: {Todo=20, Nada=0, Adiós=20, Ok=20, Hola=20, Taco=8}
