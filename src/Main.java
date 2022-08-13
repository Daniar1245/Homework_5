public class Main {
    public static void main(String[] args){
        Boss boss1= new Boss(7000,3000,"Fist Rage");
        System.out.println("Health: "+boss1.getHealth()+"; "+"Damage: "+ boss1.getDamage()+"; "+"Type Of Protection: "+boss1.getRage());
    }
}