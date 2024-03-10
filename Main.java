import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    // empleados
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<Nomina> listaNominas = new ArrayList<>();

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

        Empleado empleadoNormal = new Empleado(nombreEmpleado, apellidoEmpleado, tarifaPorHora);
        // agregando empleado normal a la lista de empleados:
        listaEmpleados.add(empleadoNormal);
        // nomina con numero de horasTrabajadas
        float horasTrabajadas = GestionarValidaciones.pedirNumero("Horas trabajadas: ",
            "El valor tiene que ser positivo.");
        Nomina nominaNormal = new Nomina(empleadoNormal, horasTrabajadas, 0, 0);
        listaNominas.add(nominaNormal);
      }

      if (tipoEmpleado.equals(porHoras)) {
        Float tarifaPorHora = GestionarValidaciones.pedirNumero("Tarifa por Hora: ",
            "El valor tiene que ser positivo.");

        float tarifaHrExtra = GestionarValidaciones.pedirNumero("Tarifa Hr Extra: ",
            "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

        Empleado empleadoPorHoras = new EmpleadoPorHora(nombreEmpleado, apellidoEmpleado, tarifaPorHora, tarifaHrExtra);
        // agregando empleadoPorHora a la lista de empleados:
        listaEmpleados.add(empleadoPorHoras);
        // nomina con numero de horasTrabajadas y horasExtra
        float horasTrabajadas = GestionarValidaciones.pedirNumero("Horas trabajadas: ",
            "El valor tiene que ser positivo.");
        float horasExtra = GestionarValidaciones.pedirNumero("Horas extra trabajadas: ",
            "El valor tiene que ser positivo.");
        Nomina nominaPorHoras = new Nomina(empleadoPorHoras, horasTrabajadas, horasExtra, 0);
        listaNominas.add(nominaPorHoras);

      }

      if (tipoEmpleado.equals(asalariado)) {
        float salarioMensualFijo = GestionarValidaciones.pedirNumero("Salario Mensual: ",
            "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

        // agregando cada empleado asalariado a la lista de empleados:
        Empleado empleadoAsalariado = new EmpleadoAsalariado(nombreEmpleado, apellidoEmpleado, 0, salarioMensualFijo);
        listaEmpleados.add(empleadoAsalariado);
        // nomina con salario:
        Nomina nominaAsalariado = new Nomina(empleadoAsalariado, 0, 0, 0);
        listaNominas.add(nominaAsalariado);
      }
      if (tipoEmpleado.equals(porComision)) {
        float porcentajeComision = GestionarValidaciones.pedirNumero("Porcentaje Comisión: ",
            "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

        // agregando cada empleado por comision a la lista de empleados:
        Empleado empleadoComision = new EmpleadoPorComision(nombreEmpleado, apellidoEmpleado, 0, porcentajeComision);
        listaEmpleados.add(empleadoComision);
        // preguntar y validar ventasTotales:
        float ventasTotales = GestionarValidaciones.pedirNumero("Ventas Totales: ",
            "El valor tiene que ser positivo.");
        // nomina con ventasTotales:
        Nomina nominaComision = new Nomina(empleadoComision, 0, 0, ventasTotales);
        listaNominas.add(nominaComision);
      }

      System.out.print("¿Desea agregar otro empleado? (Y/N): ");
      agregarOtroEmpleado = scanner.next().toUpperCase();
    }

    // Imprimir lo comun o las cabezeras
    StringBuilder sb = new StringBuilder();
    sb.append("\t 1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10\t 10\t 11\t 12\t 13\t 14\t 15\t\n");
    sb.append(
        "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890\n");
    sb.append("\n");
    sb.append("Nombre\t" + "\t\tTipo\t" + "\t\tTarifa Hora\t" + "\tTarifa H.Extra\t" +
        "\tSalario\t" + "\tPorcentaje\t\n");
    sb.append(
        "-------------------------------------------------------------------------------------------------------------------------------\n");

    for (Empleado empleado : listaEmpleados) {
      sb.append(empleado.lineaEmpleado());
      sb.append(" \n");
    }

    String datosEmpleados = sb.toString();

    System.out.println(datosEmpleados);

  }

  // imprimir el listado de empleador para comprobar que el sistema funciona

}
