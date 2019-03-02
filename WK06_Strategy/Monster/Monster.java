package Monster;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {
    Integer hp;
    Integer xp;
    Integer maxHP;
    Integer agi;
    Integer str;
    Integer def;
    Attack attack;
    HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer attackTarget(Monster m){
        return this.attack.attack(m);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getStr() {
        return str;
    }

    public Integer getDef() {
        return def;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer tmp = min;
            min = max;
            max = tmp;
        }
        return rand.nextInt(max-min) + min;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}