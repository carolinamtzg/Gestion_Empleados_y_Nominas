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

}