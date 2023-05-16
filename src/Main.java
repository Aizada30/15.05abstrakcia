import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EducationCenter school = new School("Bokonbaev","France",LocalDate.of(2003,9,1));
        EducationCenter university = new University("Bethoven","Japan",LocalDate.of(2007,5,10));
        EducationCenter collage = new Collage("ISITO","Kyrgyzystan",LocalDate.of(2009,4,20));

        EducationCenter[] educationCenters = {school,university,collage};

        for (int i = 0; i < educationCenters.length; i++) {
            System.out.println(educationCenters[i].toString());
            educationCenters[i].getEducationCenterYear();

        }
        System.out.println("-----------------------------------------------------------------------------");

        Student[] students = {new Student("Akmaral","Akmarova","famale", LocalDate.of(2010,4,10),
               school),
                        new Student("Niko","Nikolaevich","male",LocalDate.of(2023,1,10),
               university),
        new Student("Jony","Jonatelli","male",LocalDate.of(2023,4,20),
                university),
        new Student("Tita","Vailetov","male",LocalDate.of(2023,5,16),
                collage)};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
            students[i].studentPeriod();
            System.out.println("-----------------------------------------------------------");
        }





//        Car buga = new Bugatti("new model","perlamutovy black",963852);//
//        Car bugaty = new Bugatti("S45","ko7",4521633);
//        Car bmw2 = new BMW("qw9562","iuekbas",846514561);
//        Car bmw= new BMW ("model from future","Unreal color",654789);
//
//        System.out.println(bugaty+"\n");
//        bugaty.gas();
//        bugaty.brake();
//        System.out.println(bmw2+"\n");
//        bmw2.gas();
//        bmw2.brake();
//        System.out.println(buga+"\n");
//        buga.gas();
//        buga.brake();
//        System.out.println(bmw+"\n");
//        bmw.gas();
//        bmw.brake();





//        Animal dog = new Dog("Doberman ",1,"black");
//
//        dog.standartMethod();
//        dog.abstractMethod();
    }
}