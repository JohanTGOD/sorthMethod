package generics.wildcards;

import java.util.List;

public class UnboundedWildcardExample {

    public void printListObject(List<Object> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }

    }

    public void printListWildCard(List<?> list) {
        for (Object element: list) {
            System.out.print(element + " ");
        }
    }
}
