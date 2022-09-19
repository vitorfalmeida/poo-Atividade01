package L1E7;

public class Main {
  public static void main(String[] args) {

    Carro carro01 = new Carro("PQG-1030", "Fiat", "Punto", 2017, 82500);
    Carro carro02 = new Carro("APN-2250", "Honda", "City", 2022, 12000);

    
    carro01.abastecer(20);
    carro02.abastecer(30);
    carro01.percurso(200);
    carro02.percurso(400);
    carro01.statusDeViagem();
    carro02.statusDeViagem();
    
    

  }

}
