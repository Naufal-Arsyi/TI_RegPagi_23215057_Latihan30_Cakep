package pertemuan6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arsyi
 
 * 
 */
import java.util.Scanner;

public class TI_RegPagi_23215057_Latihan30_Cakep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini? \nJawab (Yoi/Enggak) : ");
        String jawaban = input.nextLine().trim().toLowerCase();

        System.out.println(); // Spasi baris baru untuk output yang rapi
        switch (jawaban) {
            case "yoi":
                System.out.println("Cakep Bener. Good Job");
                break;
            case "enggak":
                System.out.println("Tetep cakep sih.");
                System.out.println("Sing penting paham konsep nya yee.");
                System.out.println("Keep the code works dude");
                break;
            default:
                System.out.println("Jawaban tidak valid. Harap masukkan 'Yoi' atau 'Enggak'.");
                break;
        }
    }
}
