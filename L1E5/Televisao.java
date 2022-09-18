package L1E5;

public class Televisao {
  private int volume;
  private int canal;

  public Televisao(int volume, int canal) {
    this.volume = volume;
    this.canal = canal;
  }

  public void status() {
    System.out.println("O Canal Atual: " + getCanal());
    System.out.println("O Volume: " + getVolume() + "\n");
  }

  public void aumentarVolume() {
    this.volume++;
  }

  public void diminuirVolume() {
    this.volume--;
  }

  public void trocaCanal(int canal) {
    if (canal > 0 && canal != getCanal()) {
      setCanal(canal);
    } else {
      this.canal++;
    }
  }

  public void diminuirCanal() {
    canal--;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

}
