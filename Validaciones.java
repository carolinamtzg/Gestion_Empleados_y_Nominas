/*
Clase Validaciones:
Creada para validar nombre, tipo de empleado y ingresar un numero positivo.

*/

public class Validaciones {

  private static String normal = "normal";
  private static String porHoras = "horas";
  private static String asalariado = "asalariado";
  private static String porComision = "comision";

  // Validar que el nombre no esté vacío:
  public static String getNormal() {
    return Validaciones.normal;
  }

  public static String getPorHoras() {
    return Validaciones.porHoras;
  }

  public static String getAsalariado() {
    return Validaciones.asalariado;
  }

  public static String getPorComision() {
    return Validaciones.porComision;
  }

  public boolean validarString(String nombre) {
    int longitudMinimaNombre = 3;
    boolean valido = nombre.length() > longitudMinimaNombre;
    return valido;
  }

  // Validar que se ingrese un número positivo:

  public boolean validarNumero(Float numero) {
    // saber si el num es 0 o positivo:
    return numero >= 0;
  }

  // Validar que el tipo de empleado sea válido

  public boolean validarTipo(String tipoEmpleado) {
    // validar que es uno de los empleados validos
    // Normal/Horas/Asalariado/Comision

    // true || false || false = true;
    // true || true || true = true;
    // false || true || false = true;
    // false || true || true = true;
    // false || false || true = true;
    // false || false || false = false;
    String lowerCaseTipoEmpleado = tipoEmpleado.toLowerCase();
    return lowerCaseTipoEmpleado.equals(normal) || lowerCaseTipoEmpleado.equals(porHoras)
        || lowerCaseTipoEmpleado.equals(asalariado) || lowerCaseTipoEmpleado.equals(porComision);
  }

}
