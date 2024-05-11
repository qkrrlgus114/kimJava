package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        Set<Integer> set3 = new HashSet<>();
        for(Integer num : set1){
            set3.add(num);
        }
        for(Integer num : set2){
            set3.add(num);
        }

        System.out.println("합집합: " + set3);
        // 교집합
        Set<Integer> set4 = new HashSet<>();
        for(Integer num : set1){
            if(set2.contains(num)){
                set4.add(num);
            }
        }

        System.out.println("교집합: " + set4);


        // 차집합
        for(Integer num : set2){
            if(set1.contains(num)) set1.remove(num);
        }

        System.out.println("차집합: " + set1);
    }

}
