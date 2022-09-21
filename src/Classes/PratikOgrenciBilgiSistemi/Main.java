package Classes.PratikOgrenciBilgiSistemi;

public class Main {

    public static void main(String[] args) {

        Teacher t1=new Teacher("Mehmet","TRH","90555");
        Teacher t2=new Teacher("Marcus","FZK","0000");
        Teacher t3=new Teacher("Brian","BIO","1111");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo=new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(50,50,50);
        s1.addBulkVerbalNote(50,50,50);
        s1.isPass();

        Student s2=new Student("Düdük Necmi","456","4",tarih,fizik,biyo);
        s2.addBulkExamNote(55,60,55);
        s2.addBulkVerbalNote(70,100,90);
        s2.isPass();

    }
}
