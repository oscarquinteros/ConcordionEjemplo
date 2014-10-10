
package ejemplo;

import org.concordion.integration.junit3.ConcordionTestCase;

public class SplittingNamesTest  extends ConcordionTestCase {
    
    public SplittingNamesTest() {
        System.setProperty("concordion.output.dir", "target/test-reports/concordion");        
    }
    public Result split(String fullName) {
        Result result = new Result();
        String[] words = fullName.split(" ");
        result.firstName = words[0];
        result.lastName = words[1];
        return result;
    }

    class Result {
        public String firstName;
        public String lastName;
    }    
}
