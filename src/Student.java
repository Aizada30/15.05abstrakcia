import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String name;
    private String surname;
    private String gender;
    private LocalDate dateofStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateofStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateofStart = dateofStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateofStart() {
        return dateofStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void studentInfo(){
        System.out.println(getName()+" "+getSurname()+" "+getGender()+" "+getEducationCenter().getName());
    }

    public void studentPeriod(){
        LocalDate current = LocalDate.now();
        LocalDate dateOfstart = getDateofStart();
        Period period1 = Period.between(current,dateOfstart);

        System.out.println(getName()+" study from "+period1);    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", education Center = '"+educationCenter.getName()+
                '}';
    }
}
