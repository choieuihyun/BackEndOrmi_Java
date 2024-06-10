package codingTestDay;

public class Police {

    public static void main(String[] args){

        System.out.println(speedRacer(65, false));

    }

    static int speedRacer(int speed, boolean isHoliday) {

        int fine;

        if(!isHoliday){

            if(speed >= 81)
                fine = 200;
            else if (speed >= 61)
                fine = 100;
            else
                fine = 0;

        } else {

            if(speed >= 86)
                fine = 200;
            else if (speed >= 66)
                fine = 100;
            else
                fine = 0;

        }

        return fine;

    }

}
