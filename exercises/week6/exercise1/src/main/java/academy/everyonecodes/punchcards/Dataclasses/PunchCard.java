package academy.everyonecodes.punchcards.Dataclasses;

import java.util.Objects;

public class PunchCard {
    private String id;
    private String dayOfWeek;
    private String timeOfDay;

    public PunchCard(String dayOfWeek, String timeOfDay) {
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PunchCard punchCard = (PunchCard) o;
        return Objects.equals(id, punchCard.id) &&
                Objects.equals(dayOfWeek, punchCard.dayOfWeek) &&
                Objects.equals(timeOfDay, punchCard.timeOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dayOfWeek, timeOfDay);
    }
}
