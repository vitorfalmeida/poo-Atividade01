package L1E6;

public class Condicionador {
  private double temperaturaExterna;
  private int potencia;
  private double decaimento;
  private double temperaturaFinal;

  public Condicionador(double temperaturaExterna, int potencia) {
    this.temperaturaExterna = temperaturaExterna;
    this.potencia = potencia;
    switch (potencia) {
      case 1:
        this.decaimento = 1.8;
        break;
      case 2:
        this.decaimento = 3.6;
        break;
      case 3:
        this.decaimento = 5.4;
        break;
      case 4:
        this.decaimento = 7.2;
        break;
      case 5:
        this.decaimento = 9;
        break;
      case 6:
        this.decaimento = 10.8;
        break;
      case 7:
        this.decaimento = 12.6;
        break;
      case 8:
        this.decaimento = 14.4;
      case 9:
        this.decaimento = 16.2;
        break;
      case 10:
        this.decaimento = 18;
        break;
      default:
        System.out.println("Potencia não existente");
        break;
    }
  }

  public void liga() {

    temperaturaFinal = temperaturaExterna - decaimento;

    System.out.println("A temperatura final é " + temperaturaFinal + "Cº");

  }

  public double getTemperaturaExterna() {
    return temperaturaExterna;
  }

  public void setTemperaturaExterna(double temperaturaExterna) {
    this.temperaturaExterna = temperaturaExterna;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public double getDecaimento() {
    return decaimento;
  }

  public void setDecaimento(double decaimento) {
    this.decaimento = decaimento;
  }

  public double getTemperaturaFinal() {
    return temperaturaFinal;
  }

  public void setTemperaturaFinal(double temperaturaFinal) {
    this.temperaturaFinal = temperaturaFinal;
  }

}
