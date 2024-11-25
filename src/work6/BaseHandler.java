package work6;

/**
 * Абстрактний клас, який реалізує основну логіку передачі запитів по ланцюжку.
 * Наслідується класами конкретних обробників.
 */
public abstract class BaseHandler implements Handler {
    /**
     * Наступний обробник у ланцюжку.
     */
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Запит не може бути оброблений. Рівень: " + request.getLevel());
        }
    }
}
