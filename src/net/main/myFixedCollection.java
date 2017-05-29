package net.main;

import java.util.*;


public class myFixedCollection {
        private int id;
        private User people;



    public myFixedCollection(int id,User people){
        this.id = id;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getPeople() {
        return people;
    }

    public void setPeople(User people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        myFixedCollection that = (myFixedCollection) o;

        if (id != that.id) return false;
        return people != null ? people.equals(that.people) : that.people == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (people != null ? people.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "myFixedCollection{" +
                "id=" + id +
                ", people=" + people +
                '}';
    }
}
