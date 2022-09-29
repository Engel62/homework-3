public class Main {
    public static void main(String[] args) {

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + "кг!");

        var weightDifferent = (firstBoxer - secondBoxer) % totalWeight;
        System.out.println("Разница веса бойцов" + weightDifferent + "кг");

    }
}