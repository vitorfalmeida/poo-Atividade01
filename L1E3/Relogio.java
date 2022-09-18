package L1E3;

public class Relogio {
  private String horario;
  private int hora;
  private int minuto;
  private int segundo;

  public Relogio(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.horario = this.hora + ":" + this.minuto + ":" + this.segundo;
  }

  public void getHorario() {
    System.out.println("\nA hora é " + this.horario);

  }

}
