package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if(monthNumber<1||monthNumber>12){
            System.out.println("Wrong month number");
        }
        else{
            if(monthNumber==12||monthNumber<3)
            {System.out.println("Winter");}
            if(monthNumber>2&&monthNumber<6)
            {System.out.println("Spring");}
            if(monthNumber>5&&monthNumber<9)
            {System.out.println("Summer");}
            if(monthNumber>8&&monthNumber<12)
            {System.out.println("Autumn");}


        }
    }
}
