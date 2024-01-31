# HDT2-Postfix
# Calculadora Postfix con Stack

## Descripción

Este programa implementa una calculadora que evalúa expresiones en formato postfix leidas desde un archivo txt y para su almacenaje utiliza un stack. También incluye una interfaz con los metodos funcionales de un stack.

## Componentes del Proyecto

### Main

Posee un metodo estatico que lee expresiones desde un archivo utilizando un BufferedReader para leer las líneas del archivo y va armando la expresion y metiendolo en el stack. 

### PostfixCalc

La clase PostfixCal realiza el cálculo de expresiones en formato postfix. Utiliza una pila interna para realizar las operaciones y manejar los operandos y operadores.

### Stack

La clase Stack implementa un stack int y hace uso de la interfaz UVGStack que define las operaciones básicas de un stack.

### UVGStack

La interfaz UVGStack define las operaciones básicas de un stack, incluyendo push (agregar), pop (quitar de la cima), top (ver la cima) y isEmpty (verificar si está vacía).

## PostfixTest

La clase PostfixTest realiza las pruebas de JUnit para comprobar el funcionamiento correcto de los metodos.