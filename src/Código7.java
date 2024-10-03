import java.util.HashMap;
import java.util.Scanner;

public class Código7 {

	public static void main(String[] args) {//Se agrega el método main para que el código pueda funcionar
    Scanner s = new Scanner(System.in);//Importo scanner de java.util y agrego system.in

    HashMap<String, String> capitales = new HashMap<>();//Se importa el hashmap de java.util, y a ca pongo la palabra completa capitales para poder hacer agregar elementos 
//También le cambié los nombres de los datos primitivos de mi hashmap porque solo estoy utilizando cadenas de texto tanto en los paises como en las capitales
    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador");
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = "";//Se corrige la palabra String 
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");//Se corrige la palabra in con out in es para scanner
      c = s.nextLine();//Se cambia double por line porque estoy utilizando solo cadenas de texto
      
      if (!c.equals("salir")) {//Se añade s a la palabra equal
        if (capitales.containsKey(c)) {//Se pone el nombre del hashmap y cambio a llave 
          System.out.print("La capital de " + c);//Agrego out al sysout
          System.out.println(" es " + capitales.get(c));//Añado palabra capitales y le agrego un get para agregar el pais que da el usuario y de esta manera me responde con el valor
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String newCapital = s.nextLine();//En caso de que el usuario agregue un país que no está en mi hashmap lo guardo como una nueva variable newCapital
          capitales.put(c, newCapital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir"));//Cierro paréntesis de while
    s.close();//Cierro Escaner
  }

}