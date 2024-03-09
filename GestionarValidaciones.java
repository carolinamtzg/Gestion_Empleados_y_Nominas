import java.util.Scanner;

public class GestionarValidaciones {
  static Scanner scanner = new Scanner(System.in);
  Scanner otroScanner;

    // gestionar validacion de strings (nombre y apellidos):
    // mensaje = "Ingrese los datos del empleado: "
    // nombreValor = "Nombre: "
    // mensajeNoValido = "El nombre es obligatorio. Por favor, ingréselo nuevamente."
    public static String pedirString(String nombreValor, String mensajeNoValido) {
      Validaciones validaciones = new Validaciones();
      String valor = "";
      boolean pedirValor = true;
      while (pedirValor) {
        System.out.print(nombreValor);
        valor = scanner.nextLine().trim();
        //" a a ".trim() == "a a"
        //"  ".trim() == ""

        boolean valido = validaciones.validarString(valor);
        if (valido) {
          pedirValor = false;
        } else {
          System.out.print(mensajeNoValido);
          System.out.println();
        }
      }
      return valor;
    }

    // gestionar validacion de enteros positivos (tarifas):
    // nombreValor = "Tarifa por Hora: "
    // mensajeNoValido = "El valor tiene que ser positivo.\n"
    public static Float pedirNumero(String nombreValor, String mensajeNoValido) {
      Validaciones validaciones = new Validaciones();
      float valor = -1;
      boolean pedirValor = true;
      while (pedirValor) {
        System.out.print(nombreValor);
        valor = scanner.nextFloat();

      boolean valido = validaciones.validarNumero(valor);
      if (valido) {
        pedirValor = false;
      } else {
        System.out.print(mensajeNoValido);
        System.out.println();
      }
      }
      return valor;
    }

    public static String pedirTipoEmpleado(String nombreValor, String mensajeNoValido) {
      Validaciones validaciones = new Validaciones();
      String valor = "";
      boolean pedirValor = true;
      while (pedirValor) {
        System.out.print(nombreValor);
        valor = scanner.next();

      boolean valido = validaciones.validarTipo(valor);
      if (valido) {
        pedirValor = false;
      } else {
        System.out.print(mensajeNoValido);
        System.out.println();
      }
      }
      return valor;
    }
}
