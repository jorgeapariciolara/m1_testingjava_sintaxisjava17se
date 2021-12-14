# Proyecto de sintaxis Java SE

IMPORTANTE: ¡depurar el código siempre!

1. Variables y tipos de datos: reservar espacio en memoria para guardar datos
   1. int, long, double, String
2. Operadores: realizar operaciones con las variables
   1. Aritméticos: + - * / % 
   2. Asignación: = += -= */
   3. Comparación: > < >= <=
   4. Lógicos: && ||
   5. Incremento y decremento: ++ --
3. Estructuras de control:
   1. condicionales: evaluar si una o varias condiciones son ciertas o no (boolean)
      1. if 
      2. else
      3. else if
      4. switch 
   2. iterativas
      1. for 
      2. while 
   3. bifurcación
      1. break
      2. continue
4. estructuras de datos
   1. arrays []: son estáticos, tienen una longitud fija
   2. ArrayList: son dinámicos, tienen una longitud variable porque permiten añadir/borrar elementos
5. funciones:
   1. Sin parámetros
   2. Con parámetros 
   3. Con tipo de retorno (return)
   4. Alcance o scope
6. Excepciones: 
   1. try catch
   2. try catch con múltiples catch
   3. try catch con múltiples excepciones dentro del mismo catch
   4. try catch finally
7. Constantes
8. Enumeraciones: agrupación de constantes 
9. Programación Orientada a Objetos (POO / OOP)
   1. Clases
      1. Atributos
      2. Método constructor
         1. La referencia this
      3. Sobrecarga en el método constructor
      4. Métodos (comportamiento): pueden cambiar el valor de los atributos
      5. Método toString()
   2. Objetos
      1. Crear un objeto a partir de una clase usando el constructor vacío
      2. Crear un objeto a partir de una clase usando el constructor con parámetros
      3. Crear un array de objetos
         1. for normal 
         2. for each
   3. Modificador static: indica que el elemento sobre el que actúa pertenece a la clase
      1. Permite acceder utilizando el nombre de la clase, sin necesidad de crear un objeto
   4. Clases envoltorio: 
      1. Clases de equivalencia para los tipos primitivos: int, long, double, float, char, ... 
      2. Permiten valor null
      3. Integer, Double, Long, Float, Character
   5. Clase String: métodos para realizar operaciones sobre cadenas de texto
      1. startsWith(), endsWith, replaceAll(), split(), ....
   6. Clase Scanner:
      1. Se utiliza para poder leer datos introducidos por el usuario a través de la consola estándar
   7. Asociaciones entre clases
   8. Encapsulación
   9. Herencia
      1. extends
      2. super
      3. Solo se puede heredar de una clase al mismo tiempo
   10. Polimorfismo
   11. Abstracción
       1. Clases abstractas
       2. Interfaces
   12. Subir proyectos a GitHub utilizando Git


## 1/10/2021

* Repaso M1 
* GitHub
* Tecnologías M2

## Ciclo de vida del software

1. Análisis de requisitos (ERS)
2. Diseño 
3. Implementación / Desarrollo (M1 y M2)
4. Testing (M3, M4, M5)
5. Despliegue
6. Mantenimiento


## Ejercicio Módulo 1

Ejercicio individual.

Aplicación Java que permita gestionar objetos referentes a un elemento de la realidad:
Coches, Clientes, Empleados, Casas, Libros...

Opciones para resolverlo:
* Clase java con método main con todas las operaciones en if else if o switch
* Clase java con método main con todas las operaciones separadas en funciones separadas al main 
* Clase java con método main y utilizando objetos de otras clases para llevar a cabo las funcionalidades
* Clases java cada una con un método main con una opción diferente del menú 

La aplicación debe permitir realizar las siguientes operaciones: 

1 - Consultar TODOS los clientes existentes: bucle que imprima a través de consola los clientes existentes en un ArrayList
2 - Crear/Registrar/Insertar un nuevo cliente
3 - Leer/Ver/Recuperar un cliente concreto utilizando su id
4 - Modificar/Editar un cliente que ya exista utilizando su id
5 - Borrar/Eliminar un cliente 
6 - Borrar TODOS los clientes (vaciar la estructura de datos)


Tener en cuenta:
* Gestión de errores con try catch
* Correcto uso de tipos de datos
* Uso de POO: crear una clase y objetos
* Estructuras de datos: ArrayList
* Aplicar encapsulación

Entrega:
* Opción 1: Subir a GitHub y enviar el enlace por correo (Nombre del repositorio m1_testing_nombre_apellido)
* Opción 2: Enviar por correo
  * File > Export > Project to Zip file


Formato entrega:
* Entregar el proyecto java, nombrando el proyecto con el siguiente formato: 
  * m1_testing_nombre_apellido

## Git 

1. Crear perfil en GitHub.com

2. Descargar e instalar git

3. Configurar usuario en git
Abrir git bash 

git config --global user.name "alansastre"
git config --global user.email alan@alansastre.co


4. En IntelliJ IDEA abrir VCS > Share on GitHub