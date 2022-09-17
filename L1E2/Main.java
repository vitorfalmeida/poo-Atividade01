package L1E2;

public class Main {
  public static void main(String[] args) {
    Elevador elevador01 = new Elevador();

    elevador01.inicializa(10, 7);
    elevador01.status();
    elevador01.entra();
    elevador01.sobe();
    elevador01.status();
    elevador01.sobe();
    elevador01.sobe();
    elevador01.sobe();
    elevador01.sobe();
    elevador01.entra();
    elevador01.entra();
    elevador01.entra();
    elevador01.entra();
    elevador01.sobe();
    elevador01.sobe();
    elevador01.status();
    elevador01.sobe();
    elevador01.status();

  }

}
