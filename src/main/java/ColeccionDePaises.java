import java.util.List;
import java.util.ArrayList;

public class ColeccionDePaises {
    List<Pais> listaDePaises = new ArrayList();

    public ColeccionDePaises(){

    }

    public void agregar(Pais pais){
        listaDePaises.add(pais);
    }
}