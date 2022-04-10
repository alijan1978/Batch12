package ReviewSohail7;

public class Practice5 {


    String weekDay(String day){
       day = day.toLowerCase();
        switch (day){
            case "Monday":
                return "It is a lazy day";
            case "Tuesday":
                return "It is a productive day";
            case "Wednesday":
                return "It is a gloomy day";
            case "Thursday":
                return "It is a exciting day";
            case "Friday":
                return "No work day";
            default:
                return "No correct option found";

        }
    }

    public static void main(String[] args) {
        Practice5 p = new Practice5();
        String output= p.weekDay("Friday");
        System.out.println(output);

    }


}
