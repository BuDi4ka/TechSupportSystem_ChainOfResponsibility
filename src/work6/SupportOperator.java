package work6;

/**
 * Клас для обробника першого рівня (оператор підтримки).
 * Обробляє прості запити (рівень 1).
 */
public class SupportOperator extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == 1) {
            System.out.println("Оператор підтримки обробив запит рівня 1 (простий).");
        } else {
            System.out.println("Оператор підтримки передає запит наступному обробнику.");
            super.handleRequest(request);
        }
    }
}
