package timeObjects;

public class Time {
    private long hour;
    private long minute;
    private long second;
    private long elapsedTime;

    Time() {
        hour = getCurrentHours(System.currentTimeMillis());
        minute = getCurrentMinutes(System.currentTimeMillis());
        second = getCurrentSeconds(System.currentTimeMillis());
    }

    Time(long time) {
        this.elapsedTime = time;
        hour = getCurrentHours(elapsedTime);
        minute = getCurrentMinutes(elapsedTime);
        second = getCurrentSeconds(elapsedTime);
    }

    Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    long getTotalSeconds(long elapsedTime) {
        long totalMilliSeconds = elapsedTime;
        long totalSeconds = totalMilliSeconds / 1000;

        return totalSeconds;
    }

    long getCurrentSeconds(long elapsedTime) {
        long currentSecond = getTotalSeconds(elapsedTime) % 60;

        return currentSecond;
    }

    long getCurrentMinutes(long elapsedTime) {
        long totalMinutes = getTotalSeconds(elapsedTime) / 60;
        long currentMinute = totalMinutes % 60;

        return currentMinute;
    }

    long getCurrentHours(long elapsedTime) {
        long totalMinutes = getTotalSeconds(elapsedTime) / 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 60;

        return currentHour;
    }

    long getHour() {
        return hour;
    }

    long getMinute() {
        return minute;
    }

    long getSecond() {
        return second;
    }

    void setTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
