import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    //ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    String agregarOtroEmpleado = "Y";

    while(agregarOtroEmpleado.equals("Y")){
      System.out.print("Ingrese los datos del empleado: \n");
      System.out.print("\n");

      String nombreEmpleado = GestionarValidaciones.pedirString(
        "Nombre: ",
        "El nombre es obligatorio. Por favor, ingréselo nuevamente.");

      String apellidoEmpleado = GestionarValidaciones.pedirString(
        "Apellido: ",
        "El apellido es obligatorio. Por favor, ingréselo nuevamente.");

      Float tarifaPorHora = GestionarValidaciones.pedirNumero(
        "Tarifa por Hora: ",
        "El valor tiene que ser positivo.");

      Empleado empleado = new Empleado(nombreEmpleado, apellidoEmpleado, tarifaPorHora);

      String tipoEmpleado = GestionarValidaciones.pedirTipoEmpleado(
        "Tipo de Empleado (Horas/Asalariado/Comision): ",
        "Tipo de empleado no válido. Por favor, ingrese un tipo válido.");

    }

    System.out.print("¿Desea agregar otro empleado? (Y/N): ");
    agregarOtroEmpleado = scanner.next().toUpperCase();
    scanner.nextLine();
    }
    
  }

