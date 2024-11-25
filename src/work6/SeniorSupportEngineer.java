package work6;

/**
 * Клас для обробника третього рівня (старший інженер підтримки).
 * Обробляє складні запити (рівень 3).
 */
public class SeniorSupportEngineer extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 3) {
            System.out.println("Старший інженер підтримки обробив запит рівня 3 (складний).");
        } else {
            System.out.println("Старший інженер підтримки передає запит наступному обробнику.");
            super.handleRequest(request);
        }
    }
}
