# Gestión de empleados y nominas

## Parte 1: Alta de Empleados y Registro en Array

### Objetivo:

Desarrollar un programa en Java que permita al usuario dar de alta empleados de cuatro tipos diferentes:

- Empleado
- EmpleadoPorHora
- EmpleadoAsalariado
- EmpleadoPorComisión

### Requisitos:

1. Usar como base y modificar, si es necesario, las clases Empleado, EmpleadoPorHora, EmpleadoAsalariado y EmpleadoPorComisión vistas en el módulo, con los atributos y métodos apropiados.
2. Crear una interfaz de usuario en la consola para capturar los datos de los empleados.
3. Escribir los datos de los empleados en un fichero de texto, añadiendo cada nuevo empleado al final del fichero.
4. Proporcionar una opción para finalizar el proceso de alta de empleados.
5. Mostrar listado por pantalla.

## Parte 2: Cálculo de Salarios y Registro en Array de Nóminas

### Objetivo:

Añadir al programa en Java la funcionalidad que partiendo de una lista de Empleados, calcule el salario de cada uno según su tipo y guarde la informacion en un Array de Nominas.

Crear una nueva clase Nónima:

Atributos:

- empleado: El empleado al que pertenece la nómina horasTrabajadas : entero de las horas trabajadas
- horasExtra: entero de las horas extra trabajadas ventasTotales : flotante que representa las ventas totales

Métodos:

- salarioTotal(): Método que en funcion del tipo de Empleado calculará el valor de la nómina. Devuelve un flotante.

### Requisitos:

1. Leer el array de empleados y procesar cada entrada para determinar el tipo de empleado.
2. Crear la instancia de la nomina con el empleado.
3. Solicitar y capturar los datos necesarios para el cálculo del salario desde la consola, según el tipo de empleado.

## Parte 3: Visualización de Nóminas

### Objetivo:

Añadir al programa en Java una funcionalidad que partiendo del Array de nóminas de la parte anterior muestre por consola los detalles de las nóminas de todos los empleados, simulando una impresión.

- El programa leerá el Array de nóminas.
- Para cada nomina, el programa mostrará los detalles de la nómina por consola, incluyendo el nombre del empleado y su salario.
- Para cada registro, el programa mostrará el detalle de la nomina segun el tipo de empleado.

### Requisitos:

1. Leer el Array de nóminas generado en la Parte 2.
2. Mostrar por consola el nombre del empleado y su salario correspondiente a cada entrada del array.
3. Formatear la salida para facilitar la lectura, simulando un documento de nómina.