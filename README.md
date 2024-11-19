# Proyecto: Reparto de Gastos de Viaje

Este proyecto es una aplicación Java que permite a un grupo de viajeros registrar y repartir los gastos de un viaje de manera equitativa. A continuación, se detalla cómo se desarrolló el software y la funcionalidad de cada parte del código.

## Descripción del Desarrollo del Código
El código principal se encuentra en la clase Main y utiliza la clase Scanner para recibir la entrada de datos por parte del usuario. El programa está diseñado en un bucle do-while para gestionar un menú interactivo que ofrece cuatro opciones:

1. *Introducir gastos de envío.*
2. *Calcular reparto de gastos.*
3. *Mostrar el reparto entre los viajeros.*
4. *Salir.*

### Variables Principales
- *int menu*: Guarda la opción seleccionada en el menú.
- *float reparto*: Representa el monto que cada viajero debe pagar equitativamente.
- *int viajeros*: Número de participantes en el viaje.
- *float viajero1, viajero2, viajero3, viajero4, viajero5*: Montos pagados por cada viajero.
- *float vuelta1, vuelta2, vuelta3, vuelta4, vuelta5*: Diferencias entre el monto pagado y el reparto calculado.
- *String viajeroXDebes*: Almacena mensajes de cuánto debe o cuánto le deben a cada viajero.
- *boolean viajeroXParticipa*: Bandera para indicar si un viajero está participando.

### Explicación de los Bucles y Funciones

#### Menú Principal (do-while)
````
do {
    // Presenta las opciones del menú
    System.out.println("1. Introducir gastos de envío.");
    System.out.println("2. Calcular reparto de gastos.");
    System.out.println("3. Mostrar el reparto entre los viajeros.");
    System.out.println("4. Salir.");
    menu = Integer.parseInt(s.nextLine());
}
`````

El bucle do-while se utiliza para mantener el programa en funcionamiento hasta que el usuario elija salir (opción 4). Dentro de este bucle, se presenta el menú y se llama a la opción correspondiente según la entrada del usuario.

#### Opción 1: Introducir Gastos
````
case 1:
    // Solicita el número de viajeros
    System.out.println("Introduce el número de viajeros (mínimo 2 y máximo 5)");
    viajeros = Integer.parseInt(s.nextLine());

    // Validación del número de viajeros
    if (viajeros < 2 || viajeros > 5) {
        do {
            System.out.println("El número de viajeros debe de estar comprendido entre 2 y 5");
            viajeros = Integer.parseInt(s.nextLine());
        } while (viajeros < 2 || viajeros > 5);
    }
````
Este segmento garantiza que el número de viajeros esté entre 2 y 5, validando la entrada con un bucle do-while.

#### Introducción de Cuanto Paga Cada Viajero
````
 do {
     System.out.println("¿Cuánto paga el viajero 1?");
     viajero1 = Float.parseFloat(s.nextLine());
     viajero1Participa = true;
     
     System.out.println("¿Cuánto paga el viajero 2?");
     viajero2 = Float.parseFloat(s.nextLine());
     viajero2Participa = true;
     
     // Verifica si hay más viajeros y solicita los pagos correspondientes
     if (viajeros >= 3) {
         System.out.println("¿Cuánto paga el viajero 3?");
         viajero3 = Float.parseFloat(s.nextLine());
         viajero3Participa = true;
     }
     // Repite el proceso para el viajero 4 y 5 si es necesario

     // Verifica que no haya montos negativos
     if (viajero1 < 0 || viajero2 < 0 || viajero3 < 0 || viajero4 < 0 || viajero5 < 0) {
         System.out.println("El pago de todos los viajeros debe de ser mayor que 0");
     }
 } while (viajero1 < 0 || viajero2 < 0 || viajero3 < 0 || viajero4 < 0 || viajero5 < 0);
````
Este bucle asegura que los montos ingresados sean válidos y positivos.

#### Opción 2: Calcular Reparto
````
case 2:
    // Verifica si se han ingresado datos
    if (viajeros == 0) {
        System.out.println("Tienes que hacer 1. Introducir gastos de envio.");
        break;
    } else {
        // Calcula el reparto equitativo
        reparto = (viajero1 + viajero2 + viajero3 + viajero4 + viajero5) / viajeros;
        // Calcula lo que debe o le deben a cada viajero
        if (viajero1 < reparto) {
            vuelta1 = reparto - viajero1;
            viajero1Debes = "Debes: " + vuelta1 + " €";
        } else if (viajero1 > reparto) {
            vuelta1 = viajero1 - reparto;
            viajero1Debes = "Te deben: " + vuelta1 + " €";
        }
        // Repite el proceso para los demás viajeros
    }
````
Aquí se calcula cuánto debe pagar cada viajero, comparando el monto pagado con el promedio y generando mensajes correspondientes.

#### Opción 3: Mostrar el Reparto
````
case 3:
    
    if (viajeros == 0 || reparto <= 0) {
        System.out.println("Tienes que hacer 1. Introducir gastos de envio y 2. Calcular reparto de gastos.");
        break;
    } else {
        // Imprime los resultados para cada viajero
        if (viajero1Participa) {
            if (vuelta1 != 0) {
                System.out.println("Viajero 1 " + viajero1Debes);
            } else {
                System.out.println("Viajero 1 no debes nada");
            }
        }
        // Repite el proceso para los demás viajeros
    }
````
Esta sección verifica que se hayan calculado los gastos antes de mostrarlos e imprime cuánto debe o cuánto le deben a cada viajero.

### Cierre del Programa
El programa termina al seleccionar la opción 4, imprimiendo un mensaje de despedida.

        System.out.println("-------------------------------------------------------");
        System.out.println("Te has salido de EladiVentura.");
        System.out.println("-------------------------------------------------------");
