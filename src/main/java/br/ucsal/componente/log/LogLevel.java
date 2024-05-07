package br.ucsal.componente.log;

public enum LogLevel {
    INFO(1),
    WARNING(2),
    ERROR(3);

    private final int value;

    LogLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
