package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(650);
        boss.setBossDamage(68);
        boss.setDefenceType("kinetic");
        System.out.println("Boss health: " + boss.getBossHealth() + " Boss Damage : " + boss.getBossDamage()
                + "  Boss Defence Type: " + boss.getDefenceType());
        // System.out.println(createHeroes());
        for (Hero hero: createHeroes()) {
            System.out.println(hero.getHeroHealth() + " [" + hero.getHeroDamage() +"] " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero knight = new Hero(400,45,"Rapidity");

        Hero warrior = new Hero(380, 38, "Heavy duty weapon");

        Hero alchemist = new Hero(250, 55, "Magic book");

        return new Hero[]{knight, warrior, alchemist};
    }
}
