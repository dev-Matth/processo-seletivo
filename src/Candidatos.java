public class Candidatos {

    private static String nome;
    private static int salarioPretendido;

    public Candidatos()
    {

        this.nome = nome;
        this.salarioPretendido = salarioPretendido;

    }


    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public static int getSalarioPretendido() {
        return salarioPretendido;
    }

    public void setSalarioPretendido(int salarioPretendido) {
        this.salarioPretendido=salarioPretendido;
    }

    public String toString(){
        return nome + " " + salarioPretendido;
    }

}