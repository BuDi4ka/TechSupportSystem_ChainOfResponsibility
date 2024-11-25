package work6;

/**
 * Клас для обробника другого рівня (інженер підтримки).
 * Обробляє запити середнього рівня складності (рівень 2).
 */
public class SupportEngineer extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 2) {
            System.out.println("Інженер підтримки обробив запит рівня 2 (середній).");
        } else {
            System.out.println("Інженер підтримки передає запит наступному обробнику.");
            super.handleRequest(request);
        }
    }
}
