package com.company;

public class Interval {

    private int start, end;
    private boolean isInclude_right;
    private boolean isInclude_left;

    public Interval(int start, int end, boolean isInclude_right, boolean isInclude_left) {
        this.start = start;
        this.end = end;
        this.isInclude_right = isInclude_right;
        this.isInclude_left = isInclude_left;
    }

    public Interval(){
        System.out.println("New Interval");
    }
    private int getStart() {
        return start;
    }
    private int getEnd() {
        return end;
    }
    @Override
    public String toString() {
        String s1, s2;
        if (isInclude_right) {
            s1 = "(";
            s2 = "]"; }
        else  {
            s1 = "[";
            s2 = ")";
        }
        return s1 + start + "; " + end + s2;
    }


    public void combine(Interval inter) {
        System.out.println(this + "\t" + inter);
        if (end < inter.getStart() && start < inter.getStart()) {
            System.out.println("Интервалы не пересекаются");
        }
        else {
            System.out.println("Интервалы пересекаются");
            int x = Math.max(start, inter.getStart());
            int y = Math.min(end, inter.getEnd());
            if (x < y) System.out.println("Пересечение интервалов " + x + "..." + y);
            else if (y < x) System.out.println("Пересечение интервалов " + y + "..." + x);
        }
    }

}

