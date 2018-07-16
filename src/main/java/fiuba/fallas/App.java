package fiuba.fallas;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        KieContainer kc =
                KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("HivTestKS");
        ksession.fireAllRules();
        ksession.dispose(); // Stateful rule session must always be disposed when finished

    }
}
