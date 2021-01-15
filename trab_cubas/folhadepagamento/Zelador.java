

public class Zelador extends Pessoa implements Funcionario
{
    
    double salario=2000.0;
    String cpf = "15478965325874";
    public String nome(){
        return "Zé da limpeza";
    }
    
    public double valorDesconto(){
        return salario * 0.15;
    
    }
    
    public String getProfissao(){
        return "zelador";
    }
    public double Salario(){
        return salario;
    }
    public int numeroRegistro(){
        return 2;
    }
}
