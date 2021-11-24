
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joser
 */
public class BuscadorTest {
    
    public BuscadorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    @org.junit.jupiter.api.Test
    public void testaBusca(){
        try {
            Buscador buscador = new Buscador();
            Endereco endereco = buscador.buscar("99999-999");
            System.out.println(endereco.getLocalidade());
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getBairro());
            
//            assertEquals(endereco.getLogradouro(), "Rua Prado Kely"); 
        } catch (Exception ex) {
            System.out.println("Erro: -----> " + ex.getMessage());
        }
    }
    
}
