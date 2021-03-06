package schoolclass;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person{
    Set<String> subjects;

    Teacher () {
        subjects = new HashSet<String>();
    }

    Teacher (String firstName, String lastName){
        super(firstName, lastName);
        subjects = new HashSet<String>();
    }

    Teacher (Set<String> subjects) {
        this.subjects = subjects;
    }

//    public void setSubjects(Set<String> subjects) {
//        this.subjects = subjects;
//    }

    public void addSubject(String subjectName){
        subjects.add(subjectName);
    }


    /**
     * Dodanie przedmiotow do listy przedmiotow uczonych przez nauczyciela
     * @param subjects
     */
    public void addSubjects(String ... subjects) {
        for(String s : subjects)
            this.subjects.add(s);
    }

    /**
     * Pobranie listy przedmiotow uczonych przez nauczyciela
     * @return
     */
    public Set<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}