package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double l, m, s;
        if (firstSide<=0||secondSide<=0||thirdSide<=0){
            System.out.println("it's not a triangle");
        }   else {

            if(firstSide>=secondSide&&firstSide>=thirdSide){l=firstSide;}
            else{
                if(secondSide>=firstSide&&secondSide>=thirdSide){l=secondSide;}
                else{l=thirdSide;}
            }

        if((firstSide>=secondSide&&firstSide<=thirdSide)||(firstSide<=secondSide&&firstSide>=thirdSide)){m=firstSide;}
        else{
            if((secondSide>=firstSide&&secondSide<=thirdSide)||(secondSide<=firstSide&&secondSide>=thirdSide)){m=secondSide;}
            else{m=thirdSide;}
        }

        if(firstSide<=secondSide&&firstSide<=thirdSide){s=firstSide;}
        else{
            if(secondSide<=firstSide&&secondSide<=thirdSide){s=secondSide;}
            else{s=thirdSide;}
        }

        if ((s+m)<l){
            System.out.println("it's not a triangle");
        } else{System.out.println("this is a valid triangle");}
    }}
}
