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
        calcAvarage();
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

    public void addBulkVerbalNote(int verb_mat, int verb_fizik, int verb_kimya) {
        if (verb_mat >= 0 && verb_mat <= 100) {
            this.c1.verbalNote = verb_mat;
        }

        if (verb_fizik >= 0 && verb_fizik <= 100) {
            this.c2.verbalNote = verb_fizik;
        }

        if (verb_kimya >= 0 && verb_kimya <= 100) {
            this.c3.verbalNote = verb_kimya;
        }
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
        double tarihAvg = this.c1.note * 0.8 + this.c1.verbalNote * 0.2;
        double kimyaAvg = this.c2.note * 0.8 + this.c2.verbalNote * 0.2;
        double biyolojiAvg = this.c3.note * 0.8 + this.c3.verbalNote * 0.2;
        double _average = (tarihAvg + kimyaAvg + biyolojiAvg) / 3;
        this.avarage = Math.round(_average * 100) / 100d;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Notu : " + this.c1.note + " Sözlü Notu :" + this.c1.verbalNote + " Oran ==> sınav %80  sözlü %20 ");
        System.out.println("Fizik Notu : " + this.c2.note + " Sözlü Notu :" + this.c2.verbalNote + " Oran ==> sınav %80  sözlü %20");
        System.out.println("Biyoloji Notu : " + this.c3.note + " Sözlü Notu :" + this.c3.verbalNote + " Oran ==> sınav %80  sözlü %20");
    }


}

