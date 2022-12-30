package eaststar1129.programers.lv2.y2022.m12.date20221219;

public class eJadenCase문자열만들기 {
    static class Solution {
        public static String solution(String s) {
            final char CHAR_SPACE = ' ';
            boolean flag  = true;
            StringBuffer sb = new StringBuffer(s);
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i) == CHAR_SPACE) {
                    flag = true;
                    continue;
                }

                if(flag) {
                    if(Character.isLowerCase(s.charAt(i))) {
                        sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                    }
                    flag = false;
                    continue;
                }

                if(Character.isUpperCase(s.charAt(i))) {
                    sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String value = "3people unFollowed me";
        System.out.println(new Solution().solution(value));
    }

}
