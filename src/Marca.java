public class Marca {
  private int id;
  private String nomMarca;

  Marca(){}

  public Marca(int id, String nomMarca){
    this.id= id;
    this.nomMarca=nomMarca;
  }

  //Por cada atributo 2 métodos, get -> obtener dato.
  //set-> darle valor al atributo.
  public void setNomMarca(String nomMarca){
    this.nomMarca=nomMarca;
  }
  public String getNomMarca(){
    return  this.nomMarca;
  }

  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return  this.id;
  }



  //Mostar datos.
  public String toString(){
    return "Id " + this.id + "Marca " + this.nomMarca;
  }
}
