package collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while(true){
            String s = bf.readLine();
            int num = Integer.parseInt(s);
            if(num == 0) break;

            list.add(num);
        }


        System.out.println("출력");
        for(int i=0; i<list.size(); i++){
            if(i != list.size() - 1){
                sb.append(list.get(i)).append(", ");
            }else{
                sb.append(list.get(i));
            }
        }

        System.out.println(sb);
    }
}
