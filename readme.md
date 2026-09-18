# Ejercicio 1
![Captura 1 del proceso.png](capturas/Captura%201%20del%20proceso.png)
![captura 2 del proceso.png](capturas/captura%202%20del%20proceso.png)
# Ejercicio 2
## A)
![grep sin iniciar programa.png](capturas/grep%20sin%20iniciar%20programa.png)

PID: 9717
PPID: 9436

El proceso padre es el PPID, porque es el numero que identifica el programa creador.

## B)
![inicio de programa desde terminal.png](capturas/inicio%20de%20programa%20desde%20terminal.png)
![grep con programa iniciado.png](capturas/grep%20con%20programa%20iniciado.png)
Desde el terminal

![grep desde el IDE.png](capturas/grep%20desde%20el%20IDE.png)

Desde el IDE

El PPID cambia porque cambia la identidad del programa creador, en al terminal el PPID es el 10271 y en el IDE el PPID es el 6442.

## C)
![Ejecutando programa con -Xmx128m.png](capturas/Ejecutando%20programa%20con%20-Xmx128m.png)
![Grep con Xmx128m.png](capturas/Grep%20con%20Xmx128m.png)
Inice el programa con java -Xmx128m InformeSistema

Cambia que el PID sube y el PPID baja porque cada vez que se crea un proceso nuevo en la máquina, Linux le asigna un número superior al anterior. Como la prueba con -Xmx128m se lanzó más tarde, recibió un PID más alto pero el PPID baja porque estaba usando otra pestaña dentro del CMD entonces tiene un identificador diferente

Lo mas importante que al lanzar el comando -xmx128m lo que le estamos diciendo al programa es que nunca use mas de 128MiB de Ram



## D)

![Ruta.png](capturas/Ruta.png)

En windows esa ruta seria C:\User\dam26\psp\informe.txt


# Ejercicio 3

## a)
Programacion paralela porque una misma maquina ejecuta varias peticiones a la vez, el problema es que puede llegar a colapsar

## b)
Programacion distribuida porque para poder renderizar una pelicula tan grande no se puede hacer con un solo equipo necesita varios, el problema es la alta carga de la red al comunicarse todos los equipos entre ellos para enviarse los datos

## c)
Programacion concurrente porque varias instrucciones estan pasando a la vez, el problema es la complejidad en la asincronía y el control de errores 

## d)
Programacion distribuida porque la tarea se distribuye entre varios equipos, el problema es el riesgo del fallo en un nodo en medio del calculo 