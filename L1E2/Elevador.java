package L1E2;

/**
 * Elevador
 */
public class Elevador {

  private int andarAtual;
  private int totalDeAndares;
  private int capacidadeElevador;
  private int quantidadePessoa;

  public void inicializa(int capacidadeElevador, int totalDeAndares) {
    this.capacidadeElevador = capacidadeElevador;
    this.totalDeAndares = totalDeAndares;
    this.quantidadePessoa = 0;
    this.andarAtual = 0;

  }

  public void status() {
    System.out.println("Andar atual:" + getAndarAtual());
    System.out.println("Quantidade de Pessoas:" + getQuantidadePessoa());
    ;
  }

  public void entra() {
    if (quantidadePessoa < capacidadeElevador) {
      quantidadePessoa++;
    } else {
      System.out.println("Elevador Cheio");
    }
  }

  public void sai() {
    if (quantidadePessoa > 0) {
      quantidadePessoa--;
    } else {
      System.out.println("Não tem mais nigúem para sair");
    }
  }

  public void sobe() {
    if (andarAtual < totalDeAndares) {
      andarAtual++;

    } else {
      System.out.println("Andar máximo atingido");
    }
  }

  public void desce() {
    if (andarAtual > 0) {
      andarAtual--;

    } else {
      System.out.println("Andar minimo atingido");
    }
  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getTotalDeAndares() {
    return totalDeAndares;
  }

  public void setTotalDeAndares(int totalDeAndares) {
    this.totalDeAndares = totalDeAndares;
  }

  public int getCapacidadeElevador() {
    return capacidadeElevador;
  }

  public void setCapacidadeElevador(int capacidadeElevador) {
    this.capacidadeElevador = capacidadeElevador;
  }

  public int getQuantidadePessoa() {
    return quantidadePessoa;
  }

  public void setQuantidadePessoa(int quantidadePessoa) {
    this.quantidadePessoa = quantidadePessoa;
  }

}
