import java.time.LocalDate;
import java.time.Month;

public class Nomina {
  // atributos:
  private Empleado empleado;
  private float horasTrabajadas;
  private float horasExtra;
  private float ventasTotales;

  // contructor:
  public Nomina(Empleado empleado, float horasTrabajadas, float horasExtra, float ventasTotales) {
    this.empleado = empleado;
    this.horasTrabajadas = horasTrabajadas;
    this.horasExtra = horasExtra;
    this.ventasTotales = ventasTotales;
  }

  // metodos getters:

  public float getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public float getHorasExtra() {
    return horasExtra;
  }

  public float getVentasTotales() {
    return ventasTotales;
  }

  // metodo de salario total empleado base:
  public float salarioTotal() {
    if (empleado instanceof EmpleadoPorHora) {
      EmpleadoPorHora empleadoPorHora = (EmpleadoPorHora) empleado;
      return empleadoPorHora.getTarifaPorHora() * getHorasTrabajadas()
          + empleadoPorHora.getTarifaPorHoraExtra() * getHorasExtra();
    }

    if (empleado instanceof EmpleadoAsalariado) {
      EmpleadoAsalariado empleadoAsalariado = (EmpleadoAsalariado) empleado;
      return empleadoAsalariado.getSalarioMensualFijo();
    }

    if (empleado instanceof EmpleadoPorComision) {
      EmpleadoPorComision empleadoPorComision = (EmpleadoPorComision) empleado;
      return empleadoPorComision.getPorcentajeComision() / 100 * getVentasTotales();
    }

    return empleado.getTarifaPorHora() * horasTrabajadas;
  }

  public String mostrarNomina() {
    // crear builder
    StringBuilder sb = new StringBuilder();
    // anadir lineas comunes
    LocalDate currentDate = LocalDate.now();
    Month currentMonth = currentDate.getMonth();
    int currentYear = currentDate.getYear();

    sb.append(String.format("Nomina del Mes %s / %s\n", currentMonth, currentYear));
    sb.append(String.format("Empleado.........: %s \n", empleado.nombreCompleto()));
    sb.append(String.format("Tipo.............: %s \n", empleado.tipo()));

    if (empleado instanceof EmpleadoPorHora) {
      EmpleadoPorHora empleadoPorHora = (EmpleadoPorHora) empleado;
      // anadir lineas de empleado por hora
      sb.append(String.format("Num. Horas.......: %s \n", horasTrabajadas));
      sb.append(String.format("Tarifa Hora......: %s \n", empleado.getTarifaPorHora()));
      sb.append(String.format("Num. Horas Extra.: %s \n", horasExtra));
      sb.append(String.format("Tarifa Hora extra: %s \n", empleadoPorHora.getTarifaPorHoraExtra()));
      sb.append(String.format("Total a percibir.: %s \n", salarioTotal()));
      return sb.toString(); // devolver el string
    }

    if (empleado instanceof EmpleadoAsalariado) {
      // anadir lineas de empleado asalariado
      sb.append(String.format("Total a percibir.: %s \n", salarioTotal()));
      return sb.toString();
    }

    if (empleado instanceof EmpleadoPorComision) {
      EmpleadoPorComision empleadoPorComision = (EmpleadoPorComision) empleado;
      // anadir lineas de empleado por comision
      sb.append(String.format("Ventas...........: %s \n", ventasTotales));
      sb.append(String.format("Porcentaje.......: %s \n", empleadoPorComision.getPorcentajeComision()));
      sb.append(String.format("Total a percibir.: %s \n", salarioTotal()));
      return sb.toString();
    }

    // anadir lineas de empleado normal
    sb.append(String.format("Num. Horas.......: %s \n", horasTrabajadas));
    sb.append(String.format("Tarifa Hora......: %s \n", empleado.getTarifaPorHora()));
    sb.append(String.format("Total a percibir.: %s \n", salarioTotal()));
    return sb.toString();
  }
}