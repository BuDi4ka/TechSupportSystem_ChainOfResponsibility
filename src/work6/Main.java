package work6;

/**
 * Головний клас для демонстрації роботи системи обробки запитів.
 */
public class Main {
    /**
     * Головний метод для запуску програми.
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Створення обробників
        Handler operator = new SupportOperator();
        Handler engineer = new SupportEngineer();
        Handler seniorEngineer = new SeniorSupportEngineer();

        // Побудова ланцюжка обробників
        operator.setNextHandler(engineer);
        engineer.setNextHandler(seniorEngineer);

        // Створення та обробка запитів
        Request simpleRequest = new Request(1);
        Request mediumRequest = new Request(2);
        Request complexRequest = new Request(3);
        Request unknownRequest = new Request(4);

        System.out.println("Обробка простого запиту:");
        operator.handleRequest(simpleRequest);

        System.out.println("\nОбробка середнього запиту:");
        operator.handleRequest(mediumRequest);

        System.out.println("\nОбробка складного запиту:");
        operator.handleRequest(complexRequest);

        System.out.println("\nОбробка невідомого запиту:");
        operator.handleRequest(unknownRequest);
    }
}
