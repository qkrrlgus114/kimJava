package collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성

        Set<Integer> set = new LinkedHashSet<>();

        for(Integer num : inputArr){
            set.add(num);
        }

        System.out.println(set);
    }
}
