
//TODO аписать тесты

public class Ants {
    public static int calculateRounds(int n, int left, int right, int antLefMov, int antRigMov) {

        int beforeFallingRight = 0;
        int beforeFallingLeft = 0;
        int maxBeforeFalling = 0;
        int steps = 0;


        if (antLefMov == 1 && antRigMov == -1) {
            steps = right - left;
            if (steps <= 2) {
                beforeFallingLeft = steps + left + 1;
                beforeFallingRight = (n - right) + 1;
                maxBeforeFalling = Math.min(beforeFallingLeft, beforeFallingRight);
                System.out.println("Мало шагов: " + beforeFallingLeft + " " + beforeFallingRight);
            }
            int round = steps / 2;

            if (steps % 2 == 0 && steps > 2) {
                beforeFallingLeft = round + (left + round);
                beforeFallingRight = round + (right - round);
                maxBeforeFalling = Math.min(beforeFallingLeft, beforeFallingRight);
                System.out.println("Четный: " + beforeFallingLeft + " " + beforeFallingRight);

            }
            if (steps % 2 != 0) {
                beforeFallingLeft = (round * 2) + left + 1;
                beforeFallingRight = (round * 2) + (n - right) + 1;
                maxBeforeFalling = Math.min(beforeFallingLeft, beforeFallingRight);
                System.out.println("Не четный: " + beforeFallingLeft + " " + beforeFallingRight);
                System.out.println("На встречу друг другу");

            }
        } else {
            beforeFallingLeft = left + 1;
            beforeFallingRight = (n - right) + 1;
            maxBeforeFalling = Math.min(beforeFallingLeft, beforeFallingRight);
            System.out.println("Не четный: " + beforeFallingLeft + " " + beforeFallingRight);
            System.out.println("В разные стороны");
        }
        return maxBeforeFalling;
    }

    public static void main(String[] args) {
        int n = 12;
        int left = 1 ;
        int right = 10;
        //ожидаеться в результате 2

       /* Стартовое движение муравья по оси X ( +1 или -1).
          Корректно указывайте позицию Ant - левый Ant всегда будет называться
          "левым", даже если его имя "Правый".*/

        int antLefMov = 1;
        int antRigMov = -1;

        System.out.println("Количество раундов: " + calculateRounds(n, left, right, antLefMov, antRigMov));
    }
}
