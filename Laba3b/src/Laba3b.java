import com.company.Interval;

    /*    5.Определить класс Интервал с учетом включения/невключения концов.
        Создать методы по определению пересечения и объединения интервалов, причем интервалы,
        не имеющие общих точек, пересекаться/объединятся не могут.
        Объявить массив/список/множество и п интервалов и определить расстояние между самыми удаленными концами. */

public class Laba3b {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[3];


        intervals[0] = new Interval(4, 8, true, false);
        intervals[1] = new Interval(-5, 5, false, false);
        intervals[2] = new Interval(7, 12, true, true);
        intervals[0].combine(intervals[1]);
        intervals[1].combine(intervals[2]);
        intervals[2].combine(intervals[0]);
    }
}