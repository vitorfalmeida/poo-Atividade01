package L1E3;

public class Relogiov2 {
  private int hora;
  private int minuto;
  private int segundo;

  public Relogiov2(int hora, int minuto, int segundo) {
    if (segundo < 60 && minuto < 60 && hora < 24) {
      this.hora = hora;
      this.minuto = minuto;
      this.segundo = segundo;
    } else {
      System.out.println("Dados inválidos");
    }
  }

  public String getHorario() {
    return this.hora + ":" + this.minuto + ":" + this.segundo;
  }

  public void setHorario() {
    System.out.println(getHorario());
  }

  public void avanca() {

    this.segundo++;

    if (this.segundo > 59) {
      this.segundo = 0;
      this.minuto++;
    }
    if (this.minuto > 59) {
      this.minuto = 0;
      this.hora++;

    }
    if (this.hora > 23) {
      hora = 0;
    }

  }
}
