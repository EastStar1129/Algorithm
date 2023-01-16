package eaststar1129.programers.lv2.y2023.m01.date20230116;

public class 타겟넘버 {

     int answer = 0;
     public int solution(int[] numbers, int target) {
          caculation(numbers, target, 0, 0);
          return answer;
     }

     public void caculation(int[] numbers, int target, int index, int sum) {
          if (index == numbers.length) {
               if (sum == target) {
                    ++answer;
               }
               return;
          }
          caculation(numbers, target, index + 1, sum + numbers[index]);
          caculation(numbers, target, index + 1, sum - numbers[index]);
     }

     public static void main(String[] args) {
          int[] arr = {1,1,1,1,1};
          System.out.println(new 타겟넘버().solution(arr, 3));
     }
}
