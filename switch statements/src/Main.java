//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String role = "admin" ;
    switch (role){
        case "admin":
            System.out.println("you are a admin" );
            break;
            /*en buyuk hatam break unutmak unutursam
            ne olur break durdur donguyu sonlandir anlamina
            gelir eger islemimizi sonlandirmaz isek admin
            yazsak da hem admin hem de moderator yazacaktir
             */
        case "moderator":
            System.out.println("you are a moderator");
            break;
        default:
            System.out.println("you are a guest");
            break;
    }


    /*     ya da integer degiskeni tipinde tanimlariz
    ve case string kelime yerine tam sayi degerleri
    veririz

            int role = 1 ;
    switch (role){
        case 1:
            System.out.println("you are a admin" );
            break;
        case 2:
            System.out.println("you are a moderator");
            break;
        default:
            System.out.println("you are a guest");
            break;
        olarak calistirabiliriz
     */
    }
}