import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Optional;
import java.util.Properties;
import service.PersonServiceLocal;

/**
 * Created by simon on 20/12/16.
 */

public class PersonServiceTest {

    private static Context context;
    private static PersonServiceLocal personService;
    private static final String REMOTE_JNDI_NAME = "service/PersonService";

    @BeforeClass
    public static void obtainProxyReferences() throws NamingException {
        Properties jndiProperties = new Properties();
        jndiProperties.put("jboss.naming.client.ejb.context", true);
        jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
        context = new InitialContext(jndiProperties);
    }

    @Test
    public void test() throws NamingException {
        personService = (PersonServiceLocal) context.lookup(REMOTE_JNDI_NAME);
        TestCase.assertTrue(personService.getPersonByCod(Optional.of("CLBSMN94L05H793R")).getPersonK().equals(1));
    }

    @AfterClass
    public static void tearDownClass() throws NamingException {
        context.close();
    }
}
