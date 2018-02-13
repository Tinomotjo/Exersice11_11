package Exersice11_11;

// Write a method called symmetricSetDifference that accepts two
// Sets as parameters and returns a new Set containing their symmetric set difference
// (that is, the set of elements contained in either of the two sets but not in both).
// For example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].

import java.util.HashSet;
import java.util.Set;

public class Run
{

    public static void main(String[] args)
    {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);


        System.out.println("-- Original Sets:\n" + set1 + "\n" + set2);

        System.out.println("Symmetric set Difference");
        System.out.println(symmetricSetDifference(set1, set2));

    }


    public  static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2)
    {

        Set<Integer> setIntersect = new HashSet<>(set1);

        setIntersect.removeAll(set2);

        set2.removeAll(set1);

        setIntersect.addAll(set2);

        return setIntersect;
    }
}