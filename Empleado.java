import java.util.ArrayList;
import java.util.List;

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

  private List<Empleado> listaEmpleados; 
  
  // constructor:

  public Empleado(String nombre, String apellidos, float tarifaPorHora){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.tarifaPorHora = tarifaPorHora;
    this.listaEmpleados = new ArrayList<Empleado>();
  }

  // metodos de clase base Empleado:

  public String nombreCompleto(){
    return nombre + " " + apellidos;
  }

  public String tipo(){
    return "Empleado normal";
  }

  public float tarifaPorHora(){
    return tarifaPorHora;
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

  // metodos:

  // metodo para el tipo de empleado:
  

  // metodo para formatear el listado de empleados:
  public String mostrarEmpleados(){

    StringBuilder sb = new StringBuilder();

    sb.append("\t 1\t   2\t     3\t       4\t 5\t   6\t     7\t\n");
    sb.append("1234567890123456789012345678901234567890123456789012345678901234567890\n");
    sb.append("\n");
    sb.append("Nombre\t" + "Tipo\t" + "\tTarifa Hora\t" + "\tTarifa H.Extra\t" + "\tSalario\t" + "\tPorcentaje\t\n");
    sb.append("---------------------------------------------------------------\n");

    // iterar sobre la lista de empleados:
    //for(Empleado empleado : listaEmpleados){
      
    //}
    // agregar la línea para cada empleado:
    //  sb.append(String.format("%s\t\t%d\t\t%.1f\t\t%.1f\n",
    //                          Empleado.nombreCompleto(),
    //                          Empleado.tipo(),
    //                          Empleado.tarifaPorHora(),
    //                          Empleado.tarifaHrExtra(),
    //                          Empleado.salarioMensualFijo(),
    //                          Empleado.EmpleadoPorComision()
    //                          ));

    return sb.toString();
  }

}