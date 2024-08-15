package org.collections;

import java.util.Comparator;
import java.util.Objects;

public final class Studentt implements Comparable<Studentt> {
    final String name;
    final String surname;
    final int course;

    public Studentt(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentt studentt = (Studentt) o;
        return course == studentt.course && Objects.equals(name, studentt.name) && Objects.equals(surname, studentt.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Studentt o) {
        return this.name.compareTo(o.name);
    }
}
