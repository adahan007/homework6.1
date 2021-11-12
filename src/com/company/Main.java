package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(ConsoleColors.CYAN + "ADAHAN" + ConsoleColors.RESET);
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.weapon.setWeaponName("Дробовик");
        boss.weapon.setWeaponType("DBS");
        System.out.println(boss.printlninfo());
        System.out.println("-----------------------");
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "Sceleton" + ConsoleColors.RESET);
        Sceleton sceleton = new Sceleton();
        sceleton.setHealth(300);
        sceleton.setDamage(30);
        sceleton.weapon.setWeaponName("Лук");
        sceleton.weapon.setWeaponType("Золотой лук");
        sceleton.setStrely(30);
        System.out.println(sceleton.printlninfo());
        System.out.println("------------------------");
        System.out.println(ConsoleColors.BLUE + "Sceleton2" + ConsoleColors.RESET);
        Sceleton sceleton2 = new Sceleton();
        sceleton2.setHealth(350);
        sceleton2.setDamage(35);
        sceleton2.weapon.setWeaponName("Лук");
        sceleton2.weapon.setWeaponType("Алмазный лук");
        sceleton2.setStrely(20);
        System.out.println(sceleton2.printlninfo());





    }




}
