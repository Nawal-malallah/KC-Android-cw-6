package com.example.cw6;

public class Student {

    private String sn;
    private int sa;
    private int sg;
    private int sp;


    public Student(String sn, int sa, int sg, int sp) {
       this.sn = sn;
       this.sa = sa;
       this.sg = sg;
       this.sp = sp;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getSa() {
        return sa;
    }

    public void setSa(int sa) {
        this.sa = sa;
    }

    public int getSg() {
        return sg;
    }

    public void setSg(int sg) {
        this.sg = sg;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }
}
