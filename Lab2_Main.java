package com.company;


import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class  Time
{

     public String getTime()
    {

        return OffsetDateTime.now( ZoneOffset.UTC )
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }

}
class Day extends Time
{
    String timeOfDay;

    Day( String timeDay) {
        timeOfDay =timeDay;
    }


    public String decision() {
        timeOfDay = new String();
        String tmp = "0";
        tmp = getTime();
        tmp = tmp.substring(0,2);

        //char[] ch =tmp.toCharArray();
        /*if (ch[0] != 1 && ch[1] < 6 )
        {
         timeOfDay = "night";
        }
        else if (ch[0] != 2 && ch[1]!= 3 && ch[1]!= 4 && ch[1] != 5)
        {
            timeOfDay = "morning";
        }
        else if (ch[0]== 1 && ch[1]>1 && ch[1]<6)
        {
            timeOfDay ="lunch";
        }
        else
        {
            timeOfDay = new String("evening");
        }*/

        int hours = Integer.parseInt(tmp);
        if (hours >= 22 &&  hours <= 5){
            timeOfDay = "night";
        }
        else if (hours >= 6 &&  hours <= 12){
            timeOfDay = "morning";
        }
        else if (hours >= 13 && hours <= 15){
            timeOfDay = "afternoon";
        }
        else
        {
            timeOfDay ="evening";
        }


        return timeOfDay;
    }
    public void print()
    {
        String tmp ="";
        System.out.println("\nNow is: " +getTime());
        System.out.println("\nSo, good " +decision());
    }
}





public class Main {

    public static void main(String[] args) {

    Day day1 = new Day("");
    day1.print();

    }
}
