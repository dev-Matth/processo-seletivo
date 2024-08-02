
public class Salarios {
    private static int salarioPretendido;

    public void Salarios()
    {

        this.salarioPretendido = salarioPretendido;

    }


    public static int getSalarios() {
        return salarioPretendido;
    }


    public void setSalarioPretendido(int salarioPretendido) {
        this.salarioPretendido=salarioPretendido;
    }

    public String toString(){
        return "\n" + getSalarios();
    }
}
