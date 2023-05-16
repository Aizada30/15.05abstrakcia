import java.time.LocalDate;

public abstract class EducationCenter {

    private String name;
    private String locatedCoutry;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locatedCoutry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCoutry = locatedCoutry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getLocatedCoutry() {
        return locatedCoutry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public abstract void geteducationCenterInfo();

    public abstract void getEducationCenterYear();

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedCoutry='" + locatedCoutry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
