package problems.annotations.createarraylist;

import java.util.ArrayList;

public class CreateArrayList {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Pankaj");
        arr.add(0);
        System.out.println(arr);
    }
}