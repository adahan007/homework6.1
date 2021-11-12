package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapen() {
        return weapon;
    }

    public void setWeapen(Weapon weapon) {
        this.weapon = weapon;
    }


    public String printlninfo() {
        return super.printlninfo() + "Тип оружия:" + weapon.getWeaponName() + "\nНазвание оружия:" + weapon.getWeaponType();
    }

}
