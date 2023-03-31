package com.company;

public class Bus {
    private int busno;
    private boolean Ac;
    private int cab;

    public int getNo() {
        return busno;
    }

    public void setNo(int no) {
        this.busno = no;
    }

    public boolean isAc() {
        return Ac;
    }

    public void setAc(boolean ac) {
        Ac = ac;
    }

    public int getCab() {
        return cab;
    }

    public void setCab(int cab) {
        this.cab = cab;
    }



    public Bus(int busno, boolean ac, int cab) {
        this.busno = busno;
        this.Ac = ac;
        this.cab = cab;
    }
    public void businfo(){
        System.out.println("busno ->"+busno+" AC ->"+Ac+" capacity ->"+cab);
    }

}
