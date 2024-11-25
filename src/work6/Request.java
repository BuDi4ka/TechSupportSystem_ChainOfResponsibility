package work6;

/**
 * Клас, що представляє запит на обробку.
 * Містить рівень складності запиту.
 */
public class Request {
    /**
     * Рівень складності запиту.
     */
    private final int level;

    /**
     * Конструктор для створення запиту.
     *
     * @param level рівень складності запиту
     */
    public Request(int level) {
        this.level = level;
    }

    /**
     * Повертає рівень складності запиту.
     *
     * @return рівень складності
     */
    public int getLevel() {
        return level;
    }
}
