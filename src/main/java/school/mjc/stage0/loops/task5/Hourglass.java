package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = height % 2 == 0 ? height / 2 : height / 2 + 1;
        int left = 1;
        int right = height;
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= height; j++){
                if (j >= left && j <= right) {
                    System.out.print(8);
                }
                else
                    System.out.print(' ');
            }
            if (i < middle ){
                left++;
                right--;
            }
            else if(i > middle){
                left--;
                right++;
            } else if (i == middle && height % 2 != 0) {
                left--;
                right++;
            }
            System.out.println();
        }
    }
}
