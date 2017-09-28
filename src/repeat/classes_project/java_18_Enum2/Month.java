package repeat.classes_project.java_18_Enum2;

/**
 * Created by Mykhailo on 28/09/2017.
 */
public enum Month {
    JANUARY(Season.WINTER, 31), FEBRUARY(Season.WINTER, 28), MARCH(Season.SPRING, 31), APRIL(Season.SPRING, 30), MAY(Season.SPRING, 31),
    JUNE(Season.SUMMER, 30), JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER, 31), SEPTEMBER(Season.AUTUMN, 30), OCTOVBER(Season.AUTUMN, 31),
    NOVEMBER(Season.AUTUMN, 30), DESEMBER(Season.AUTUMN, 31);

    private Season season;
    private int days;

    Month(Season season, int days) {
        this.season = season;
        this.days = days;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
