import java.util.*;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes(){

        List<String> listaIngredientes = new ArrayList<>();
        listaIngredientes.add("cafe");
        return listaIngredientes;
    }

    @Override
    public double obterPreco(){
        return 5.35;
    }
}