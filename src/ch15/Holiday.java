package ch15;

public enum Holiday {

    NewYear(1, 1),
    Valentine(2, 14),
    Halloween(10, 31),
    Christmas(12, 25); //end values declar
    private int month;
    private int day;

    private Holiday(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public String getDate() {
        return (month + "/" + day);
    }

    public String toString() {
        switch (this) {
            case NewYear:
                return "New Year\'s Day";
            case Valentine:
                return "Valentine\'s Day";
            case Halloween:
                return "All Saints\' Day";
            case Christmas:
                return "Christmas";
            default:
                return null;
        }
    }
}
