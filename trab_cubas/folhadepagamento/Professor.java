
public class Professor extends Pessoa implements Funcionario
{
    
    double salario = 4500.0;
    String cpf = "15915915954364";
    
    
    public String nome(){
        return "Cubas";
    }
    public double valorDesconto(){
        return salario * 0.12;
    
    }  
    public String getProfissao(){
        return "professor";
    }
    public double Salario(){
        return salario;
    }
    public int numeroRegistro(){
        return 1;
    }


}
