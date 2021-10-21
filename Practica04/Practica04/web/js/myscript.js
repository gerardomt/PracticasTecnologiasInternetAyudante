/**
Archivo con código JavaScript para Práctica 03 de Tecnologías para
     Desarrolos en Internet

     Gerardo Daniel Martínez Trujillo
     311314348
*/

/**
Esta función se ejecuta al cargar el body de ejemplo_javascript.html
*/
function main()
{
    // Ejemplo de suma con variables
    var sumaOp1 = 3;
    var sumaOp2 = 5;
    document.getElementById("suma_in").innerHTML = "Se sumará " + sumaOp1 + " + " + sumaOp2;
    document.getElementById("suma_res").innerHTML = "Resultado: " + (sumaOp1 + sumaOp2);

    // Ejemplo de multiplicación con variables
    var multOp1 = 4;
    var multOp2 = 7;
    document.getElementById("mult_in").innerHTML = "Se multiplicará " + multOp1 + " * " + multOp2;
    document.getElementById("mult_res").innerHTML = "Resultado: " + (multOp1 * multOp2);

    // Ejemplo de iteración de un arreglo con un bucle for
    const stringArray = ["uno", "dos", "tres", "cuatro", "cinco"];
    document.getElementById("arreglo").innerHTML = "Arreglo: [" + stringArray + "]";
    for (let x in stringArray){
        document.getElementById("iteracion").innerHTML += "Índice: " + x  + ", Valor: " + stringArray[x] + "<br>" ;
    }

    // Ejemplo de ciclos for
    for (let i = 0; i <= 20; i++){
        for (let j = 0; j <= i; j++){
            document.getElementById("ciclofor").innerHTML += "*";
        }
        document.getElementById("ciclofor").innerHTML += "<br>";
    }
        
    //Ejemplo de ciclos while
    var x = 20;
    var y;
    while (x >= 0){
        y = x;
        while (y >= 0){
            document.getElementById("ciclowhile").innerHTML += "*";
            y--;
        }
        document.getElementById("ciclowhile").innerHTML += "<br>";
        x--;
    }

    //Ejemplo de condicional if
    const fecha = new Date();
    const hora = fecha.getHours();
    if (hora >= 8 && hora < 12) {
        document.getElementById("condif").innerHTML = "Hola, buenos días";
    } else if (hora >= 12 && hora < 20) {
        document.getElementById("condif").innerHTML = "Hola, buenas tardes";
    } else {
        document.getElementById("condif").innerHTML = "Hola, buenas noches";
    }
}


// Ejemplo de funciones
// Funcion con variables locales
function clasesPresenciales (){
    const presencialesPath = "../images/clases_presenciales_meme.jpg";
    document.getElementById("func").src = presencialesPath;
}

// Función con variables globales
const virtualesPath = "../images/clases_virtuales_meme.jpg";

function clasesVirtuales (){
    document.getElementById("func").src = virtualesPath;
}
