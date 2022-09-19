package L1E7;

public class Carro {
  private String placaCarro;
  private String marcaCarro;
  private String modeloCarro;
  private int anoCarro;
  private double quilometragem;
  private double quantidadeCombustivel;
  private double percurso;

  public Carro(String placaCarro, String marcaCarro, String modeloCarro, int anoCarro, double quilometragem) {
    this.placaCarro = placaCarro;
    this.marcaCarro = marcaCarro;
    this.modeloCarro = modeloCarro;
    this.anoCarro = anoCarro;
    this.quilometragem = quilometragem;
  }

  public void abastecer(double quantidadeCombustivel) {
    this.quantidadeCombustivel += quantidadeCombustivel;
    System.out.println("A quantidade de combustivél que está no tanque é " + getQuantidadeCombustivel() + "L");
  }

  public void percurso(double percurso) {
    this.percurso += percurso;
  }

  public void statusDeViagem() {
    // considerando o consumo do carro de 15km/l
    double consumo = getpercurso() / 15;
    if (consumo >= getQuantidadeCombustivel()) {
      System.out.println("\nCombustivel insuficiente para trajeto");
    } else {
      System.out.println(
          "\nTrajeto percorrido: " + getpercurso() + "Km" + "\nA quantidade de combustivel restante no tanque: "
              + (getQuantidadeCombustivel() - consumo) + "L");
    }
  }

  public String getPlacaCarro() {
    return placaCarro;
  }

  public void setPlacaCarro(String placaCarro) {
    this.placaCarro = placaCarro;
  }

  public String getMarcaCarro() {
    return marcaCarro;
  }

  public void setMarcaCarro(String marcaCarro) {
    this.marcaCarro = marcaCarro;
  }

  public String getModeloCarro() {
    return modeloCarro;
  }

  public void setModeloCarro(String modeloCarro) {
    this.modeloCarro = modeloCarro;
  }

  public int getAnoCarro() {
    return anoCarro;
  }

  public void setAnoCarro(int anoCarro) {
    this.anoCarro = anoCarro;
  }

  public double getQuilometragem() {
    return quilometragem;
  }

  public void setQuilometragem(double quilometragem) {
    this.quilometragem = quilometragem;
  }

  public double getQuantidadeCombustivel() {
    return quantidadeCombustivel;
  }

  public void setQuantidadeCombustivel(double quantidadeCombustivel) {
    this.quantidadeCombustivel = quantidadeCombustivel;
  }

  public double getpercurso() {
    return percurso;
  }

  public void setpercurso(double percurso) {
    this.percurso = percurso;
  }

}
