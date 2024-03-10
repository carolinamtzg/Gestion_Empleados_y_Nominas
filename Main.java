import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    String agregarOtroEmpleado = "Y";

    while (agregarOtroEmpleado.equals("Y")) {
      System.out.print("Ingrese los datos del empleado: \n");
      System.out.print("\n");

      String nombreEmpleado = GestionarValidaciones.pedirString(
          "Nombre: ",
          "El nombre es obligatorio. Por favor, ingréselo nuevamente.");

      String apellidoEmpleado = GestionarValidaciones.pedirString(
          "Apellido: ",
          "El apellido es obligatorio. Por favor, ingréselo nuevamente.");

      String tipoEmpleado = GestionarValidaciones.pedirTipoEmpleado(
          "Tipo de Empleado (Normal/Horas/Asalariado/Comision): ",
          "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

      String normal = Validaciones.getNormal();
      String porHoras = Validaciones.getPorHoras();
      String asalariado = Validaciones.getAsalariado();
      String porComision = Validaciones.getPorComision();

      if (tipoEmpleado.equals(normal)) {
        Float tarifaPorHora = GestionarValidaciones.pedirNumero("Tarifa por Hora: ",
            "El valor tiene que ser positivo.");

            // agregando empleado normal a la lista de empleados:
            listaEmpleados.add(new Empleado(nombreEmpleado, apellidoEmpleado, tarifaPorHora);
        
      }

      if (tipoEmpleado.equals(porHoras)) {
        Float tarifaPorHora = GestionarValidaciones.pedirNumero("Tarifa por Hora: ",
            "El valor tiene que ser positivo.");

        float tarifaHrExtra = GestionarValidaciones.pedirNumero("Tarifa Hr Extra: ",
            "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

            // agregando empleadoPorHora a la lista de empleados:
            listaEmpleados.add(new EmpleadoPorHora(nombreEmpleado, apellidoEmpleado, tarifaPorHora, tarifaHrExtra));
      }

      if (tipoEmpleado.equals(asalariado)) {
        float salarioMensualFijo = GestionarValidaciones.pedirNumero("Salario Mensual: ",
            "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

            // agregando cada empleado asalariado a la lista de empleados:
            listaEmpleados.add(new EmpleadoAsalariado(nombreEmpleado, apellidoEmpleado, 0, salarioMensualFijo)); 
      }
      if (tipoEmpleado.equals(porComision)) {
        float porcentajeComision = GestionarValidaciones.pedirNumero("Porcentaje Comisión: ",
            "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

            // agregando cada empleado por comision a la lista de empleados:
            listaEmpleados.add(new EmpleadoPorComision(nombreEmpleado, apellidoEmpleado, 0, porcentajeComision));
      }

      System.out.print("¿Desea agregar otro empleado? (Y/N): ");
      agregarOtroEmpleado = scanner.next().toUpperCase();
    }

  }

  // imprimir el listado de empleador para comprobar que el sistema funciona

}
