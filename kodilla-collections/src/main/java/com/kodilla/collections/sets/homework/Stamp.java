package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampSize;
    private int stampYear;
    private boolean stampStamped;

    public Stamp(String stampName, double stampSize, int stampYear, boolean stampStamped){
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampYear = stampYear;
        this.stampStamped = stampStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize;
    }

    public int getStampYear() {
        return stampYear;
    }

    public boolean isStampStamped() {
        return stampStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stampYear=" + stampYear +
                ", stampStamped=" + stampStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 &&
                stampYear == stamp.stampYear &&
                stampStamped == stamp.stampStamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampYear, stampStamped);
    }
}
