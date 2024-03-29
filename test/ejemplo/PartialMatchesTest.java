package ejemplo;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.concordion.integration.junit3.ConcordionTestCase;

public class PartialMatchesTest extends ConcordionTestCase{
    private Set<String> usernamesInSystem = new HashSet<String>();
    
    public PartialMatchesTest() {
        System.setProperty("concordion.output.dir", "target/test-reports/concordion");
    }
    public void setUpUser(String username) {
        usernamesInSystem.add(username);
    }

    public Iterable<String> getSearchResultsFor(String searchString) {
        SortedSet<String> matches = new TreeSet<String>();
        for (String username : usernamesInSystem) {
            if (username.contains(searchString)) {
                matches.add(username);
            }
        }
        return matches;
    } 
}
