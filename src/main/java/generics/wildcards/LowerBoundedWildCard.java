package generics.wildcards;

import java.util.List;

public class LowerBoundedWildCard {

//Wrong ways to define them
//    public <R super Integer> void example(R soe) {
//
//    }
//
//    public void example2(<? super Integer> currentValue) {
//
//    }
//
//    public <R> void  example3(List<R super Integer> currentValue) {
//
//    }

// Correct way to define it
    public void  example4(List<? super Integer> currentValue) {
        currentValue.forEach(System.out::println);
    }
}
