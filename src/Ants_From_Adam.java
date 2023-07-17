
//TODO класс не мой но нужно найти ошибку и так же протестировать
public class Ants_From_Adam {
    public static void main(String[] args) {
        System.out.println(getLastMoment(12, 1, 10));

    }
    public static int getLastMoment(int n, int left, int right) {
        int left_coef = 1;
        int right_coef = -1;
        int rounds = 0;
        while((left >= 0 && left <= n) && (right >= 0 && right <= n)) {

            if(right == left - 1) {
                left_coef = 1;
                right_coef = -1;
            }

            left = left + left_coef;

            if(right == left - 1) {
                left_coef = 1;
                right_coef = -1;
            }

            right = right + right_coef;

            rounds++;

        }

        return rounds;
    }

}
