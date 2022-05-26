/*package Ternary;
public class MAN {
    private int age;
    public MAN(int age) {
        this.age = age;}
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public static void main(String[] args) {
        MAN man = new MAN(22);
        String securityAnswer = (man.getAge() >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";
        System.out.println(securityAnswer);
    }
}*/
/*Так и выглядит работа этого оператора. Тернарным (тройным) его называют потому, что в его работе принимают участие 3 компонента:
Одно условие (man.getAge() >= 18)
Два возможных результата ("Все в порядке, проходите!" и "Этот фильм не подходит для вашего возраста!")*/
package Ternary;
public class CYCLE {
    static int[] myMassive = {0, 2, 1, 4, 3, 5, 8, 7, 9, 8};
    static void transferMyMassive(int[] myMassive) {
        int a = 0;
        while (a<5){
            a++;
            System.out.println(myMassive[a]+ " " + "While");
            int i = 0;
            do {
                System.out.println(i + " "+ "Do while");
                } while (i>9);}
    }
    public static void main(String[] args) {
        transferMyMassive(myMassive);
        }
    }

