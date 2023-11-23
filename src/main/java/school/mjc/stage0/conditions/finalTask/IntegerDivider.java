package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        if(divider!=0){
            int dev = dividend/divider;
            int mul = dev*divider;
    if(mul==dividend){System.out.println("can be divided completely");}
    else{System.out.println("cannot be divided completely");}
    }
        else{System.out.println("division by zero");}
    }

}
