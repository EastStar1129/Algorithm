package eaststar1129.programers.lv2.y2023.m01.date20230115;

import java.util.*;
import java.util.stream.Collectors;

public class 전번호목록 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));


        for (int i=0;i<phone_book.length;i++) {
            String phone_number = phone_book[i];
            int len = phone_number.length();
            for (int j=0;j<len;++j) {
                if (set.contains(phone_number.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
    //시간초과
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//
//        Arrays.sort(phone_book, Comparator.comparing(String::length));
//        for (int i=0;i<phone_book.length-1;i++) {
//            String str = phone_book[i];
//            for (int j=i+1;j<phone_book.length;j++) {
//                if (phone_book[j].startsWith(str)) {
//                    return false;
//                }
//            }
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {

        String [] arr = { "123","456","789" };
        System.out.println( new 전번호목록().solution(arr));
    }
}
