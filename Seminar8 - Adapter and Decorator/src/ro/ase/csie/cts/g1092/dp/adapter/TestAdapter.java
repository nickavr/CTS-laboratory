package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.g1092.dp.adapter.disney.DonaldDuck;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        //simulate the game by using the exiting character framework
        SuperHeroCharacter fantasyHero = new FantasySuperHero("Blue dragon", 1000, true);

        fantasyHero.move();
        fantasyHero.takeHit(500);
        fantasyHero.takeHit(200);

        //use a disney character as a SuperHeroCharacter (Adapt Disney(source class) -> to our framework(destination))
        DisneyActions donald = new DonaldDuck(500);
        donald.changeLocation(100, 200);
        donald.isWounded(100);
        donald.isHealing(90);

        ArrayList<SuperHeroCharacter> gameHeroes = new ArrayList<>();
        gameHeroes.add(fantasyHero);
//        gameHeroes.add(donald);

        Disney2SuperHeroAdapter donaldAdapter = new Disney2SuperHeroAdapter(donald);
        gameHeroes.add(donaldAdapter);

        for(SuperHeroCharacter hero : gameHeroes){
            hero.crouch();
            hero.takeHit(50);
            hero.heal(50);
        }


    }
}
