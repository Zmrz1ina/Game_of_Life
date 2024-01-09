package org.example;

// enum для констант игры
public enum Status {

    NONE, // Пусто    - 1
    BORN, // Рождение - 2
    LIVE, // Живая    - 1
    DIED; // Умерла   - 2

    public Status step1(int around) {

//        if (around == 3) {
//            return BORN;
//        } else {                             или такой вариант
//            return NONE;
//        }

        switch (this) {
            case NONE: return (around == 3) ? BORN : NONE; // переход от NONE -> BORN
            case LIVE: return (around <= 1 || around >= 4) ? DIED : LIVE; // переход от LIVE -> DIED
            default: return this; // Если условие не срабатывает
        }

    }

    public Status step2() {

        switch (this) {
            case BORN: return LIVE; //  переход от BORN -> LIVE
            case DIED: return NONE; // переход от DIED -> NONE
            default: return this; // Если условие не срабатывает
        }

    }
}
