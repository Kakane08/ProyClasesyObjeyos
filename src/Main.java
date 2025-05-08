import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {

    //Crear obj instancia auto.
    //Uso el operado new para crear la instancia de ese objeto.
    //Cada vez que se usa el operador nwe, llamamos a un método constructor.
    //Son los que tienen el mismo nombre de la clase y se ejecutan cada vez que ejecuta.


    Auto auto1 = new Auto();

    System.out.println(auto1.mostrarDatos());

    Auto auto2 = new Auto("Citroen", "C4", "AG654MM");
    System.out.println(auto2.mostrarDatos());

    Auto auto3= new Auto(1, "Reanult", "Master", 2020, "Blanco", "AC654ME", 300000000);
    System.out.println(auto3.mostrarDatos());
  }
}