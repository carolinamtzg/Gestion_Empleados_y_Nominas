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

  public Empleado(String nombre, String apellidos, float tarifaPorHora){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.tarifaPorHora = tarifaPorHora;
  }

  // metodos de clase base Empleado:

  public String nombreCompleto(){
    return nombre + " " + apellidos;
  }

  public String tipo(){
    return "Empleado normal";
  }

  // Sub-clase EmpleadoPorHora:
  class EmpleadoPorHora extends Empleado{
    // atributo:
    private float tarifaHrExtra;

    // constructor:

    public EmpleadoPorHora(String nombre, String apellidos, float tarifaPorHora, float tarifaHrExtra){
      super(nombre, apellidos, tarifaPorHora);
      this.tarifaHrExtra = tarifaHrExtra;
    }

    @Override
    public String tipo(){
      return "Empleado por horas";
    }

  }

  // Sub-clase EmpleadoAsalariado:
  class EmpleadoAsalariado extends Empleado{
    // atributo:
    private float salarioMensualFijo;

    // constructor:
    public EmpleadoAsalariado(String nombre, String apellidos, float tarifaPorHora, float salarioMensualFijo){
      super(nombre, apellidos, tarifaPorHora);
      this.salarioMensualFijo = salarioMensualFijo;
  }

  @Override
    public String tipo(){
      return "Empleado Asalariado";
    }

  // Sub-clase EmpleadoPorComision:
  class EmpleadoPorComision extends Empleado{
    // atributo:
    private float porcentajeComision;

    // constructor:
    public EmpleadoPorComision(String nombre, String apellidos, float tarifaPorHora, float porcentajeComision) {
      super(nombre, apellidos, tarifaPorHora);
      this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String tipo(){
      return "Empleado A Comisión";
    }
  }
}
}