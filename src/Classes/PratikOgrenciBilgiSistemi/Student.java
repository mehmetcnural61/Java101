package Classes.PratikOgrenciBilgiSistemi;

public class Student {

    Course c1;
    Course c2;
    Course c3;


    String name;
    String stuNo;
    String classes;

    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int tarih, int fizik, int biyoloji) {
        if (tarih >= 0 && tarih <= 100) {
            this.c1.note = tarih;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.c2.note = fizik;
        }
        if (biyoloji >= 0 && biyoloji <= 100) {
            this.c3.note = biyoloji;
        }
    }

    public void addBulkVerbalNote(int c1, int c2, int c3) {
        if(c1>=0 && c1<=100)
            this.c1.szluNotTarih=c1*this.c1.szluNotTarih;
        if(c2>=0 && c2<=100)
            this.c2.szluNotKimya=c2*this.c2.szluNotKimya;
        if(c3>=0 && c3<=100)
            this.c3.szluNotBiyoloji=c3*this.c3.szluNotBiyoloji;
    }



    public void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage=((c1.note+c1.szluNotTarih)
                +(c2.note+c2.szluNotKimya)
                +(c3.note+c3.szluNotBiyoloji))/3.0;
        if (avarage > 100){
            this.avarage=100;
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Notu : " + this.c1.note);
        System.out.println("Fizik Notu : " + this.c2.note);
        System.out.println("Biyoloji Notu : " + this.c3.note);

    }


}

