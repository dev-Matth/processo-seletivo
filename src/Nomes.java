
public class Nomes {
    private static String nome;

    public void Nomes()
    {

        this.nome = nome;

    }


    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String toString(){
        return getNome();
    }
}
