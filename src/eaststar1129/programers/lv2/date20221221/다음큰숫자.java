package eaststar1129.programers.lv2.date20221221;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;

        int nCount = countOwn(n);

        answer = n;
        while(nCount != countOwn(++answer)){

        };
        return answer;
    }

    // 1. BitCount 다른사람풀이
    public int bitCount(int n)
    {
        int a = Integer.bitCount(n);
        int compare = n+1;

        while(true) {
            if(Integer.bitCount(compare)==a)
                break;
            compare++;
        }

        return compare;
    }

    // 2. Bit연산 다른사람풀이
    public int bitCalculation(int n) {
        int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
        return n + postPattern | smallPattern;
    }

    public int countOwn(int n) {
        final char CHAR_OWN = '1';
        int count = 0;
        for(char c: Integer.toBinaryString(n).toCharArray()) {
            if (c == CHAR_OWN) ++count;
        }
        return count;
    }
}
