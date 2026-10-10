# Tipos de Datos Abstractos 

La idea central es que no se memorice TDA como una definición.

La secuencia para entenderlo:

**Problema** => **datos** => **operanciones** => **reglas** => **abtracción** => **TDA** => **Implementación** => **Clase Java** => **Estructura de Datos**

para despues entrar a lo que es una *Pila*, *cola*, *lista*, *arboles*

1. Problema: 
>Supongamos que tenemos un sistema escolar y queremos manejar estudintes 

Cada estudiante:
- matricula, 
- nombre, 
- carrera, 
- promedio

Hata ahora estamos de **datos**

Pero el programa no solamente necesita almacenar esos datos. También necesita hacer cosas con ellos: 

- Registrar un cliente
- Consultar sus datos
- Cambiar su promedio 
- Verificar si está aprobado
- Mostrar información 

Entonces aparece una idea importante: 

En programación no solamente importa **que datos tenemos**, sino tambien **que operaciones podemos realizar sobre esos datos**

NOTA: Este es el primer paso hacia un TDA 

2. Dato simple vs algo más complejo: 

Ya conocemos: 

```java
int edad;
double promedio;
String nombre; 
```

Estos tipos de datos ya lo conoce Java. 

por ejemplo: 

`int edad =20;`

Java sabe:

- Que tipo de valor puede almacenar
- Cuanto espacio requiere 
- Que operaciones se puede realizar

con un int: 

```java
edad + 1
edad - 1
edad >18
edad++
++edad
```

Pero si pensamos en:

``Estudiante``

Java originamente no tiene un tipo llamado **Estudiante**

Necesitamos construirlo

Aquí comienza a aparecer la idea de **crear nuestros propios tipos de datos**

3. ¿Qué sería un tipo de dato?
Se puede definir inicialmente así:

>Un tipo de dato, define que valores pueden existir y que operaciones puede realizarse con esos valores

Por ejemplo: 

*int*
Valores posibles: 

```java
-10
0
100
2500
```

Operaciones: Aritmeticas y Relaciones 

*boolean*
Valores:

```java
true 
false 
```
Operaciones: 




