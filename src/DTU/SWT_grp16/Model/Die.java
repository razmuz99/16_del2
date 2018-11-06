package DTU.SWT_grp16.Model;

import java.lang.Math;

public class Die {

    private int value = 0;
    private int dieFaces = 6;

    Die(){
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value){
        this.value = value;
    }

    public void rollDie(){
        this.setValue((int)(Math.random()*6+1)); // (int)(0.99 to 5.99)+1
    }

    public void setDiefaces(int faceAmount){dieFaces=faceAmount;}

}

