import java.time.LocalDate;
import java.time.Period;

public class School extends EducationCenter{

    public School(String name, String locatedCoutry, LocalDate foundationYear) {
        super(name, locatedCoutry, foundationYear);
    }

    @Override
    public void geteducationCenterInfo() {
        System.out.println(toString());


    }

    @Override
    public void getEducationCenterYear() {
        LocalDate curentDate = LocalDate.now();
        LocalDate foundationYear = getFoundationYear();
        Period period = Period.between(curentDate,foundationYear);
        System.out.println(period);


    }

    @Override
    public String toString() {
        return "School{ " + super.toString();
    }
}
