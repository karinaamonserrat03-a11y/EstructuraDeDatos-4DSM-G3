# Ejercicios Matrices 
1. Objetivos: Aplicar la lógica de arreglos Bidimensionales (matrices) en Java utilizando el paradigma de Programación Orienta a Objetos, implementando validaciones de dimensiones, recorridos de índices y encapsulación. 

## Ejercicio 1. Sistema de reserva de asientos  (m * n)
Diseña un método que se llame ```reservaAsiento(int fila, int columa)``` que controle el mapa de ocupación de un teatro, sala o autobus. 
- La matriz iniciará con 0 (libre)
- Si el asiento solicitado contiene 0 cambialo a 1 (**ocupado**) y muestre un mensaje de exito.
- Sí el asiento notifica 1 significa ocupado. 
- Validar que las coordenadas ingresadas no excedan los limites de la matriz. 

## Ejercicio 2. Acomulado de ventas por sucursal al mes  (m*n)
-- dos metodos distintos 
Una empresa registra las ventas enteras (int) de m sucursales en n meses. 
- Implementar un metodo que calcule la suma por cada fila (total por Sucursal) 
- Calcular la suma por cada la columna (total por mes)
- Genera un reporte formateado que muestre ambos totales en un solo panel de texto 

## Ejercicio 3. Diagnostico de matriz de identidad y diagonal principal (n*n)
Implementa un modulo para analisis algebraico: 
- **Validación previa**: Con prueba si la matriz es cuadrada si no lo es, cancela la operación y muestra un mensaje de advertencia. 
- Sí es cuadrada, evalua si es una **matriz de identidad** (1 en la diagonal principal y 0 en el resto de la matriz)
- Calcula e imprime la suma de los elementos de la diagonal principal 

## Ejercicio 4. Transposición dinamica de matriz (m*n -> n*m)
return new Matriz(3,2)

Crea un método ```obtenerTranspuesta()``` que invierta la orientación de los datos. 
- La fuención debe de retornar una nueva instancia de la clase matriz, con dimensiones invertidas n*m. 
- Copia cada elemento, siguiendo la regla de trasnposición transpuesta [J] [i]= Original [i] [j]. 

## Ejercicio 5. Rotación de la matriz a 90° en sentido horaraio (n*n)
Simula el giro de una matriz cuadrada de pixeles o mapa: 
- Validación previa: Verifica la matriz sea cuadrada 
- Retorna una nueva instancia de Matriz rotación a 90° a la derecha. 