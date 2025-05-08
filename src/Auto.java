public class Auto {


  //Atributos.
  private int id;
  private Marca marca;
  private String modelo;
  private int anio;
  private String color;
  private String dominio;
  private double valor;

  //Constructor, siempre son públicos por defecto.
  public Auto(){
    this.marca=new Marca();
  }

  public Auto(Marca marca, String modelo, String dominio){
    this.marca = marca;
    this.modelo = modelo;
    this.dominio = dominio;
  }

  public Auto(int id, Marca marca, String modelo, int  anio, String color, String dominio, double valor){
    this.id=id;
    this.marca=marca;
    this.modelo=modelo;
    this.anio=anio;
    this.color=color;
    this.dominio=dominio;
    this.valor=valor;
  }

  public void setId(int id){
    this.id=id;
  }
  public int getId() {
    return this.id;
  }

  public void setMarca(Marca marca){
    this.marca=marca;
  }
  public Marca getMarca(){
    return  this.marca;
  }

   //Métodos.
  public String mostrarDatos(){

    String datos = "ID " + id + "\n"+
        "Marca " +  marca + "\n"+
        "Modelo " +  modelo+ "\n"+
        "Año " +  anio + "\n"+
        "Color " +  color + "\n"+
        "Modelo " +  dominio + "\n"+
        "Valor $  " +  valor;
    return datos;
  }




}
