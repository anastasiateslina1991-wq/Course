public enum Command {
    ENCRYPT("Зашифровать файл"),
    DECRYPT("Расшифровать файл"),
    EXIT("Выйти из программы"),
    UNKNOWN("Неизвестная команда");

    private final String description;

    Command(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}