package Classes.PratikOgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    double szluNotTarih=0.20;
    double szluNotKimya=0.20;
    double szluNotBiyoloji=0.20;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else
        {
            System.out.println("Öğretmen ve Ders branşları uyuşmuyor");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }

}
