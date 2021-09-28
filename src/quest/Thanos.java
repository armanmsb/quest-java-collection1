package quest;

import java.util.*;


public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        List<Hero> theAvengers = new ArrayList<>();


        // TODO 2 : Add those heroes to the list

        Hero blackWidow = new Hero("Black Widow", 34);
        Hero cap = new Hero("Captain America", 108);
        Hero vision = new Hero("Vision", 3);
        Hero tony = new Hero("Iron Man", 48);
        Hero wanda = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero bruce = new Hero("Hulk", 49);
        Hero steven = new Hero("Doctor Strange", 42);

        theAvengers.add(blackWidow);
        theAvengers.add(cap);
        theAvengers.add(vision);
        theAvengers.add(tony);
        theAvengers.add(wanda);
        theAvengers.add(thor);
        theAvengers.add(bruce);
        theAvengers.add(steven);

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501

        for (Hero h:theAvengers) {
            if(h.getName().equals("Thor")){
                h.setAge(1501);
                break;
            }
        }
        System.out.println(thor.getAge());

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(theAvengers);

        // TODO 5 : Keep only the half of the list

        theAvengers.subList(0, (theAvengers.size()/2)).clear();

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero h:theAvengers) {
            System.out.println(h.getName());
        }

    }
}
