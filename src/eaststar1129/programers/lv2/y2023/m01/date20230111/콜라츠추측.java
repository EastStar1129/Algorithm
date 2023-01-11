package eaststar1129.programers.lv2.y2023.m01.date20230111;

public class 콜라츠추측 {
    public int solution(int num) {

        long longNumber = num;
        for (int i=0;i<=500;i++) {
            if (longNumber == 1) {
                return i;
            }
            longNumber = longNumber % 2 == 0 ? longNumber/2 : longNumber * 3 + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println( new 콜라츠추측().solution(626331));
    }
}
