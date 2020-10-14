public class Pais {
    String nombrePais;
    char[] aNombreMiPais = nombrePais.toCharArray();

    public Pais(String nombre){
        this.nombrePais = nombre;
    }

    public String getNombrePais(){
        return this.nombrePais;
    }

    public Pais devolverMenorPais(Pais otroPais){
        String nombreOtroPais = otroPais.getNombrePais();
        char[] aNombreOtroPais = nombrePais.toCharArray();
        if(nombrePais.equals(nombreOtroPais)){
            return this;
        }
        for(int i = 0; i < 20; i++){
            if(aNombreMiPais[i] < aNombreOtroPais[i]){
                return this;
            }
            else if(aNombreMiPais[i] > aNombreOtroPais[i]){
                return otroPais;
            }
        }
        return null;
    }
}
