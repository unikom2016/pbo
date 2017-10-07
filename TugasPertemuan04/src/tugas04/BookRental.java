package tugas04;

public class BookRental {
    private String id;
    private String name;
    private String dateBorrow;
    private String dateReturn;
    private int duration;
    private int late;
    private int penalty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(String dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public int getDuration() {
        return duration;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }
}
