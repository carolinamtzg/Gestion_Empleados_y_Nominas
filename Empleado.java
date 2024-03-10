/* 
Clase Base Empleado:

Atributos:

- nombre: Cadena que almacena el nombre del empleado.
- apellidos: Cadena que almacena los apellidos del empleado.
- tarifaPorHora: Flotante que representa la tarifa de pago por hora para el empleado

Métodos:

- nombreCompleto(): Devuelve cadena nombre apellidos
- tipo(): Devuelve cadena Empleado normal

*/

public class Empleado {
  // atributos:
  private String nombre;
  private String apellidos;
  private float tarifaPorHora;

  // constructor:

  public Empleado(String nombre, String apellidos, float tarifaPorHora) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.tarifaPorHora = tarifaPorHora;
  }

  // metodos de clase base Empleado:

  public String nombreCompleto() {
    return nombre + " " + apellidos;
  }

  public String tipo() {
    return "Normal";
  }

  // metodo getter para tarifa por hora:

  public float getTarifaPorHora() {
    return tarifaPorHora;
  }

  public String lineaEmpleado() {
    // Crear la linea con los datos
    return String.format("%s\t\t%s\t\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\t\t %.2f", nombreFormateado(), tipo(),
        getTarifaPorHora(), 0.0, 0.0, 0.0) + "%";

  }

  public String nombreFormateado() {
    String nombre = nombreCompleto();

    if (nombre.length() > 10) {
      nombre = nombre.substring(0, 10);
    }

    if (nombre.length() < 10) {
      nombre = String.format("%-10.10s", nombre);
    }
    // Format the string to ensure it's exactly 3 characters long, padding with
    // spaces if necessary
    return nombre;
  }
}

// Sub-clase EmpleadoPorHora:
class EmpleadoPorHora extends Empleado {
  // atributo:
  private float tarifaHrExtra;

  // constructor:

  public EmpleadoPorHora(String nombre, String apellidos, float tarifaPorHora, float tarifaHrExtra) {
    super(nombre, apellidos, tarifaPorHora);
    this.tarifaHrExtra = tarifaHrExtra;
  }

  @Override
  public String tipo() {
    return "Por horas";
  }

  // getter tarifa por hr extra:
  public float getTarifaPorHoraExtra() {
    return tarifaHrExtra;
  }

  @Override
  public String lineaEmpleado() {
    // Crear la linea con los datos
    return String.format("%s\t\t%s\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\t\t %.2f", nombreFormateado(), tipo(),
        getTarifaPorHora(), tarifaHrExtra, 0.0, 0.0) + "%";
  }
}

// Sub-clase EmpleadoAsalariado:
class EmpleadoAsalariado extends Empleado {
  // atributo:
  private float salarioMensualFijo;

  // constructor:
  public EmpleadoAsalariado(String nombre, String apellidos, float tarifaPorHora, float salarioMensualFijo) {
    super(nombre, apellidos, tarifaPorHora);
    this.salarioMensualFijo = salarioMensualFijo;
  }

  @Override
  public String tipo() {
    return "Asalariado";
  }

  // getter salarioMensualFijo:
  public float getSalarioMensualFijo() {
    return salarioMensualFijo;
  }

  @Override
  public String lineaEmpleado() {
    // Crear la linea con los datos
    return String.format("%s\t\t%s\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\t\t %.2f", nombreFormateado(), tipo(),
        0.0, 0.0, salarioMensualFijo, 0.0) + "%";
  }
}

// Sub-clase EmpleadoPorComision:
class EmpleadoPorComision extends Empleado {
  // atributo:
  private float porcentajeComision;

  // constructor:
  public EmpleadoPorComision(String nombre, String apellidos, float tarifaPorHora, float porcentajeComision) {
    super(nombre, apellidos, tarifaPorHora);
    this.porcentajeComision = porcentajeComision;
  }

  @Override
  public String tipo() {
    return "A Comisión";
  }

  // getter porcentajeComision:
  public float getPorcentajeComision() {
    return porcentajeComision;
  }

  @Override
  public String lineaEmpleado() {
    // Crear la linea con los datos
    return String.format("%s\t\t%s\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\t\t %.2f", nombreFormateado(), tipo(),
        0.0, 0.0, 0.0, porcentajeComision) + "%";
  }
}
