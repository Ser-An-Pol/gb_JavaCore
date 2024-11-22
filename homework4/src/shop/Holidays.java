package shop;

import java.time.Month;

public enum Holidays {
    NEY_YEAR("c Новым годом!!!", Month.JANUARY, 1),
    March8("c 8 марта!!!", Month.MARCH, 8),
    FEBRUARY23("c 23 февраля!!!", Month.FEBRUARY, 23);

    private final String name;
    private final Month month;
    private final int day;

    Holidays(String name, Month month, int day) {
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Holidays{" +
                "day=" + day +
                ", name='" + name + '\'' +
                ", month=" + month +
                '}';
    }
}
