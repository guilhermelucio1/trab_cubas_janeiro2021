

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Teste
{
    @Test
    public void Teste()
    {
        Empresa empresa = new Empresa();
        
        Professor professor = new Professor();
        Zelador zelador = new Zelador();
        
        empresa.addFuncionario(professor);
        empresa.addFuncionario(zelador);
        
        assertEquals(6500.0,empresa.totalSalario(),0.1);
    }   
}
