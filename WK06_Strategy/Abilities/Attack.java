package Abilities;
import Monster.Monster;

public interface Attack extends Ability {
    abstract Integer attack(Monster m);
}
