public class Main {
    public static void main(String[] args) {
        int finalScore = 93;
        int replenishment = 1500;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100 * 1;
        }
        System.out.print("Итоговый счет = " + (finalScore + replenishment) + "руб.");
        System.out.print("\nНачисленные бонусы = " + bonus + "руб.");
    }
}