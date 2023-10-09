public class Main {
    public static void main(String[] args) {
        int final_score = 93;
        int replenishment = 1500;
        int bonus = 0;
        if (replenishment > 1000){
            bonus = replenishment/100 * 1;
        }
        System.out.print("Итоговый счет = "+(final_score+replenishment) + "руб.");
        System.out.print("\nНачисленные бонусы = "+ bonus + "руб.");
    }
}