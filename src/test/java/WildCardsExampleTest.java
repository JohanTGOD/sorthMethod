import generics.wildcards.LowerBoundedWildCard;
import generics.wildcards.UnboundedWildcardExample;
import generics.wildcards.UpperBoundedWildcard;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WildCardsExampleTest {

    @Test
    public void unboundedWildcards() {
        UnboundedWildcardExample unboundedWildcardExample = new UnboundedWildcardExample();
        List<Integer> li = Arrays.asList(1, 2, 3);
        unboundedWildcardExample.printListWildCard(li);
//        unboundedWildcardExample.printListObject(li);
    }

    @Test
    public void upperBoundedWildcards() {
        Number number = 12;
        Double doublee = 12.2;
        Integer integer = 12;
        UpperBoundedWildcard withInteger = new UpperBoundedWildcard(doublee);
//        UpperBoundedWildcard withBoolean = new UpperBoundedWildcard(true);
//        UpperBoundedWildcard withString = new UpperBoundedWildcard("Hi");
//        UpperBoundedWildcard withDoctor = new UpperBoundedWildcard(new Doctor("Juan", "Ramirez", 28));
    }


    @Test
    public void lowerBoundedWildcards() {
        LowerBoundedWildCard genericClassProblemSolvedPart2 = new LowerBoundedWildCard();
        List<Integer> myList = Arrays.asList(1,2,3);
        List<Double> myList2 = Arrays.asList(789.5,2.0,3.0);
        List<Number> myList3 = Arrays.asList(5,6,7);
        genericClassProblemSolvedPart2.example4(myList);
    }
}