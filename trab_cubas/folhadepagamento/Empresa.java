import java.util.*;

public class Empresa
{
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    
    public List funcionario(){
        return null;
    }
    
    public double totalSalario(){
        
        double totalSalario2 =0.0;
        for(Funcionario funcionarioo: funcionarios){
            totalSalario2+= funcionarioo.Salario();
        }
        return totalSalario2;
    }
}
