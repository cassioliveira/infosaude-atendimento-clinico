package unidade.test.br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo;

import static br.edu.ifpb.monteiro.ads.infosaude.atendimento.enumeracoes.Estados.PB;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Medico;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author elisangela
 */
public class MedicoTest {
    
    private Medico medico;
    
    @Before
    public void setUp() {
        medico = new Medico();
        medico.setNome("João");
        medico.setCrm("4654543568");
        medico.setCpf("035.982.856-63");
        medico.setRg("26475828");
        medico.setCartaoSus("65745437543");
        medico.setCorOuRaca("Branca");
        medico.setTelefone1("(83)33512678");
        medico.setTelefone2("(83)98474782");
        medico.setEmail("usuario@dominio.com");
        medico.setEnderecoRua("Avenida Brasil");
        medico.setEnderecoNumero("10");
        medico.setEnderecoBairro("Centro");
        medico.setEnderecoCep("58500-000");
        medico.setEnderecoCidade("Monteiro");
        
    }
    
    @Test
    public void testCreateObjetc() {
        System.out.println(medico.getNome());
        System.out.println(medico.getCrm());
        System.out.println(medico.getCpf());
        System.out.println(medico.getRg());
        System.out.println(medico.getCartaoSus());
        System.out.println(medico.getCorOuRaca());
        System.out.println(medico.getTelefone1());
        System.out.println(medico.getTelefone2());
        System.out.println(medico.getEmail());
        System.out.println(medico.getEnderecoRua());
        System.out.println(medico.getEnderecoNumero());
        System.out.println(medico.getEnderecoBairro());
        System.out.println(medico.getEnderecoCep());
        System.out.println(medico.getEnderecoCidade());
        
        assertEquals("O nome esperado deve ser João", "João", medico.getNome());
        assertEquals("O crm esperado deve ser 4654543568", "4654543568", medico.getCrm());
        assertEquals("O cpf esperado deve ser 035.982.856-63", "035.982.856-63", medico.getCpf());
        assertEquals("O rg esperado deve ser 26475828", "26475828", medico.getRg());
        assertEquals("O cartão sus deve ser 65745437543", "65745437543", medico.getCartaoSus());
        assertEquals("A cor ou raça deve ser Branca", "Branca", medico.getCorOuRaca());
        assertEquals("O telefone deve ser (83)33512678", "(83)33512678", medico.getTelefone1());
        assertEquals("O telefone deve ser (83)98474782", "(83)98474782", medico.getTelefone2());
        assertEquals("O email deve ser usuario@dominio.com", "usuario@dominio.com", medico.getEmail());
        assertEquals("A rua deve ser Avenida Brasil", "Avenida Brasil", medico.getEnderecoRua());
        assertEquals("O número deve ser 10", "10", medico.getEnderecoNumero());
        assertEquals("O bairro deve ser Centro", "Centro", medico.getEnderecoBairro());
        assertEquals("O cep esperado deve ser 58500-000", "58500-000", medico.getEnderecoCep());
        assertEquals("A cidade esperada deve ser Monteiro", "Monteiro", medico.getEnderecoCidade());
    }
}