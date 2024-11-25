package work6;

/**
 * Інтерфейс для обробників запитів.
 * Визначає методи для встановлення наступного обробника та обробки запиту.
 */
public interface Handler {
    /**
     * Встановлює наступного обробника у ланцюжку.
     *
     * @param nextHandler наступний обробник
     */
    void setNextHandler(Handler nextHandler);

    /**
     * Обробляє запит або передає його наступному обробнику.
     *
     * @param request запит, який необхідно обробити
     */
    void handleRequest(Request request);
}
