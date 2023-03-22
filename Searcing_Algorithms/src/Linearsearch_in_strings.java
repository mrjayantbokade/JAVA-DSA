public class Linearsearch_in_strings {
    public static void main(String []args){


        //This program will show linear search in the menu of the todays special

        String[] items = {"biryani", "salad", "kulche", "veg pav", "paneer"};

        //This item will be the users choice
        String fitem = "paneer";
        System.out.println(menuitems(items, fitem));
    }

    public static boolean menuitems(String[] menuitems, String item){

        //using enhached for loop


        for(String i: menuitems){

            if (i == item){
                return true;
            }
        }

        return false;

    }
}
