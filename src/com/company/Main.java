package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
  Boss myBoss = new Boss();
myBoss.setHp(500);
myBoss.setDamage(100);
myBoss.setDefense("defense magic");
        System.out.println(  " Boss hp " +myBoss.getHp() + " "+ "  damage " +myBoss.getDamage()+
                " " +" Defense " + myBoss.getDefense());


    }
}
