public class Marca {
  private int id;
  private String nomMarca;

  Marca(){}

  public Marca(int id, String nomMarca){
    this.id= id;
    this.nomMarca=nomMarca;
  }

  public String toString(){
    return "Id " + this.id + "Marca " + this.nomMarca;
  }
}
