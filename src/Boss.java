public class Boss {
    private int health;
    private int damage;
    private String rage;

    public Boss(int health, int damage, String rage) {
        this.health = health;
        this.damage = damage;
        this.rage = rage;
    }

    public String getRage() {
        return rage;
    }

    public void setRage(String rage) {
        this.rage = rage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
