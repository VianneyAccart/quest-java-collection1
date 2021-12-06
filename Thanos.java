import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	List<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
    	Hero blackWidow = new Hero("Black Widow", 34);
        // name: Captain America, age: 100
    	Hero captainAmerica = new Hero("Captain America", 100);
        // name: Vision, age: 3
    	Hero vision = new Hero("Vision", 3);
        // name: Iron Man, age: 48
    	Hero ironMan = new Hero("Iron Man", 48);
        // name: Scarlet Witch, age: 29
    	Hero scarletWitch = new Hero("Scarlet Witch", 29);
        // name: Thor, age: 1500
    	Hero thor = new Hero("Thor", 1500);
        // name: Hulk, age: 49
    	Hero hulk = new Hero("Hulk", 49);
        // name: Doctor Strange, age: 42
    	Hero doctorStrange = new Hero("Doctor Strange", 42);
    	
    	heroes.add(blackWidow);
    	heroes.add(captainAmerica);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(scarletWitch);
    	heroes.add(thor);
    	heroes.add(hulk);
    	heroes.add(doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
    	thor.setAge(1501);
    	System.out.println("Before Thanos decides to kill heroes...");
    	for (Hero hero : heroes) {
    		System.out.println("- " + hero.getName());
    	}
    	System.out.println();
    	
        // TODO 4 : Shuffle the heroes list
    	Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
    	List<Hero> aliveHeroes = heroes.subList(0, heroes.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    	System.out.println("They survived Thanos : ");
    	for (Hero hero : aliveHeroes) {
    		System.out.println("- " + hero.getName());
    	}
    }
}
