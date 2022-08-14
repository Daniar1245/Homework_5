public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(100);
        boss1.setDamage(50);
        boss1.setRage("rage");
            System.out.println("Health: " + boss1.getHealth() + "; " + "Damage: " +
                    boss1.getDamage() + "; " + "Type Of Protection: " + boss1.getRage());

    }
}