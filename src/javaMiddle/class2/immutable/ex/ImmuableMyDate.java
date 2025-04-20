package javaMiddle.class2.immutable.ex;

public class ImmuableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmuableMyDate withYear(int newYear){        // 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환할떄 With를 붙힌다. 원본이 유지되면서 변경사항도 포함할때 씀
        return new ImmuableMyDate(newYear,month,day);
    }
    public ImmuableMyDate withMonth(int newMonth){
        return new ImmuableMyDate(year,newMonth,day);
    }
    public ImmuableMyDate withDay(int newDay){
        return new ImmuableMyDate(year,month,newDay);
    }

    @Override
    public String toString() {
        return "ImmuableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
