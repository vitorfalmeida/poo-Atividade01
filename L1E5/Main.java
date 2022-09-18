package L1E5;

public class Main {
  public static void main(String[] args) {
    Televisao tv = new Televisao(10, 2);
    tv.status();
    tv.aumentarVolume();
    tv.trocaCanal(0);
    tv.status();
    tv.aumentarVolume();
    tv.trocaCanal(8);
    tv.aumentarVolume();
    tv.trocaCanal(8);
    tv.status();

  }

}
