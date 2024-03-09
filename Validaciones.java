/*
Clase Validaciones:
Creada para validar nombre, tipo de empleado y ingresar un numero positivo.

*/

public class Validaciones {

  // Validar que el nombre no esté vacío:

  public boolean validarString(String nombre){
    int longitudMinimaNombre = 3;
    boolean valido = nombre.length() > longitudMinimaNombre;
    return valido;
  }
  
  // Validar que se ingrese un número positivo:

  public boolean validarNumero(Float numero){
    // saber si el num es 0 o positivo:
    return numero >= 0;
  }
  
  // Validar que el tipo de empleado sea válido

  public boolean validarTipo(String tipoEmpleado){
    // validar que es uno de los empleados validos
    // Por Horas/Asalariado/Por Comision
    String porHoras = "Horas";
    String asalariado = "Asalariado";
    String porComision = "Commision";

    // true  || false || false = true;
    // true  || true  || true  = true;
    // false || true  || false = true;
    // false || true  || true  = true;
    // false || false || true  = true;
    // false || false || false = false;
    return tipoEmpleado.equals(porHoras) || tipoEmpleado.equals(asalariado) || tipoEmpleado.equals(porComision);
  }


}
