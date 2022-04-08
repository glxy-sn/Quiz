/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class Quiz {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double writing, coding, interview;
        double writingW, codingW, interviewW;
        String name, nim;
        int choose;
        boolean loop=true;
        // TODO code application logic here
        System.out.println("======================\nRegistration Form PT Tiara\n======================");
        System.out.println("1. Web Development\n2. Android Development\n");
        System.out.print("Choose form type: ");
        choose = input.nextInt();
        
        if (choose == 1){
            System.out.println("======================\n");
            System.out.println("Registration Form\n");
            System.out.print("Input Name : ");
            name = input.next();
            System.out.print("Input NIM : ");
            nim = input.next();
            
            System.out.print("Input Writing Exam Score   : ");
            writingW = input.nextDouble();
            System.out.print("Input Coding Exam Score    : ");
            codingW = input.nextDouble();
            System.out.print("Input Interview Exam Score : ");
            interview = input.nextDouble();
            
            System.out.println("======================\n");
            System.out.println("          Menu        \n");
            System.out.println("======================\n");
            System.out.println("1. Edit\n2. Output\n3. Exit");
            System.out.print("Choose");
            choose = input.nextInt();
                if(choose == 1){
                    Scanner EditData = new Scanner (System.in);
                    System.out.println("Edit Form\n");
                    
            interview = input.nextDouble();
                }else if (choose == 2){
                    NilaiWeb NilaiWeb = new NilaiWeb (writingW, codingW, interviewW);
                    System.out.println("Final Score : " + NilaiWeb.result);
                    if (NilaiWeb.result >= 85){
                        System.out.print("INFORMATION : SUCCSESS");
                        System.out.print("Congratulations to " + name + "NIM " + nim + " has been accepted as Web");
                    }else if (NilaiWeb.result < 85){
                        System.out.print("INFORMATION : FAILED");
                        System.out.print("Sorry to " + name + "NIM " + nim + " you are not accepted as Web");
                    }
                }else if(choose == 3){
                    
                }else{
                    System.out.println("Please input the correct number");
                }
        }else if (choose == 2){
            System.out.println("======================\n");
            System.out.print("Input Name : ");
            name = input.next();
            System.out.print("Input NIM : ");
            nim = input.next();
            
            System.out.print("Input Writing Exam Score   : ");
            writing = input.nextDouble();
            System.out.print("Input Coding Exam Score    : ");
            coding = input.nextDouble();
            System.out.print("Input Interview Exam Score : ");
            interview = input.nextDouble();
            
            System.out.println("======================\n");
            System.out.println("          Menu        \n");
            System.out.println("======================\n");
            System.out.println("1. Edit\n2. Output\n3. Exit");
            System.out.print("Choose: ");
            choose = input.nextInt();
                if(choose == 1){
                    System.out.println("Edit Form\n");
                    
                }else if (choose == 2){
                    NilaiAndro NilaiAndro = new NilaiAndro (writing, coding, interview);
                    System.out.print("Final Score : " + NilaiAndro.result);
                    if (NilaiAndro.result >= 85){
                        System.out.println("INFORMATION : SUCCSESS");
                        System.out.println("Congratulations to " + name + " NIM " + nim + " has been accepted as Android");
                    }else if (NilaiAndro.result < 85){
                        System.out.println("INFORMATION : FAILED");
                        System.out.println("Sorry to " + name + " NIM " + nim + " you are not accepted as Android");
                    }
                }else if(choose == 3){
                    
                }
        }
    }
}
