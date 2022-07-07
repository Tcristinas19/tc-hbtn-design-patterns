public class Impressao {
    private int paginasTotais, paginasColoridas, paginasPretoBranco;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    private TamanhoImpressao tamanhoImpressao;

    public Impressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadeColoridas, boolean frenteEVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = quantidadeColoridas;
        this.ehFrenteVerso = frenteEVerso;
        this.paginasPretoBranco = totalPaginas - quantidadeColoridas;
    }


    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public int getPaginasPretoBranco() {
        return paginasPretoBranco;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public double calcularTotal() {
        double valorTotal=0;
        if (tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == false){
            valorPretoBrancoFrenteApenas = 0.22;
            valorColoridasFrenteApenas = 0.32;
            valorTotal =  (paginasPretoBranco*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == false){
            valorPretoBrancoFrenteApenas = 0.20;
            valorColoridasFrenteApenas = 0.30;
            valorTotal =  (paginasPretoBranco*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == true){
            valorPretoBrancoFrenteVerso = 0.15;
            valorColoridasFrenteVerso = 0.25;
            valorTotal = (paginasPretoBranco*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        } else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == true) {
            valorPretoBrancoFrenteVerso = 0.10;
            valorColoridasFrenteVerso = 0.20;
            valorTotal = (paginasPretoBranco * valorPretoBrancoFrenteVerso) + (paginasColoridas * valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == true){
            valorPretoBrancoFrenteVerso = 0.18;
            valorColoridasFrenteVerso = 0.28;
            valorTotal = (paginasPretoBranco*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == false) {
            valorPretoBrancoFrenteApenas = 0.15;
            valorColoridasFrenteApenas = 0.25;
            valorTotal = (paginasPretoBranco * valorPretoBrancoFrenteApenas) + (paginasColoridas * valorColoridasFrenteApenas);
        }
        return valorTotal;
    }

    @Override
    public String toString(){
        String frente;
        if (ehFrenteVerso == true){
            frente = "frente e verso";
        }else {
            frente = "frente apenas";
        }

        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f", getPaginasTotais(), getPaginasColoridas(), getPaginasTotais() - getPaginasColoridas(),frente,calcularTotal());
    }
}