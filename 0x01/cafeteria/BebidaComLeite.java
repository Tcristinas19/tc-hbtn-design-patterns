import java.util.*;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaDecorada){
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes(){
        List<String> listaIngredientes = super.obterIngredientes();
        listaIngredientes.add("leite");
        return listaIngredientes;
    }

    @Override
    public double obterPreco(){
        return super.obterPreco() + 3.2;
    }
}