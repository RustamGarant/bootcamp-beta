package ru.faang.school.task_1.creatures;

import ru.faang.school.task_1.Creature;

public class Swordman extends Creature {
    private static int level = 5;
    private static int attack = 4;
    private static int defence = 7;
    private static int speed = 5;
    private static int amount = 10;
    public Swordman() {
        super("swordman", level, attack, defence, speed, amount);
    }
}
