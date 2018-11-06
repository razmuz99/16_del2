package DTU.SWT_grp16.Model;

import java.lang.Math;

public class Die {

    private int value;

    Die(){
        random();
    }

    int getValue(){
        return this.value;
    }

    void random(){
        this.value = (int)(Math.random()*6+1);
    }

}

