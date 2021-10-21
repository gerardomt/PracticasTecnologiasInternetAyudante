/**
Función que valida los datos en el formulario nombre_form de la página
etiquetas.html. Si alguno de los datos no es válido, muestra un
mensaje de alerta y regresa 0. Si todos los datos son válidos muestra
una alerta indicando que todo es correcto
*/
function validateNombreForm () {
    // Revisa que se haya ingresado un nomber nombre
    let nombre = document.forms["nombre_form"]["nombre"].value;
    if (nombre == ""){
        alert("Debes de proveer un nombre.");
        return 0;
    }

    // Revisa que se haya ingresado un apellido
    let apellido = document.forms["nombre_form"]["apellido"].value;
    if (apellido == ""){
        alert("Debes de proveer un apellido.");
        return 0;
    }

    // Revisa que la edad sea mayor o igual a 12
    let edad = document.forms["nombre_form"]["edad"].value;
    if (edad <= 12){
        alert("Debes tener 12 años o más para enviar el formulario.");
        return 0;
    }

    // Revisa que el correo tenga un formato válido
    let correo = document.forms["nombre_form"]["correo"].value;
    let patt = /.+@\w+/g;
    if (!patt.test(correo)){
        alert("Debes ingresar un correo válido");
        return 0;
    }

    // Revisa que la contrasena tenga un formato válido. Debe ser de
    // longitud al menos 8 y tener una mayúscula, una minúscula y un
    // carater especial.
    let contrasena = document.forms["nombre_form"]["contrasena"].value;
    let patt2 = /.*(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!#$%&?_"]).*/g;
    if (!patt2.test(contrasena)){
        alert("Debes ingresar una contrasena válida");
        return 0;
    }

    alert("Todos tus datos han sido validados correctamente.");

}
