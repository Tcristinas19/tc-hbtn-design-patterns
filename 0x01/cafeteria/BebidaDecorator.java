import java.util.*;

public class BebidaDecorator extends Bebida {

    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada){
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public List<String> obterIngredientes(){
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    public double obterPreco(){
        return bebidaDecorada.obterPreco();
    }
}