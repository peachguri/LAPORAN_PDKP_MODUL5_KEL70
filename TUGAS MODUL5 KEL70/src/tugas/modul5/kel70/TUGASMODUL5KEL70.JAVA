/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.modul5.kel70;

import java.util.Scanner;
public class TUGASMODUL5KEL70 {

    
    public static void main(String[] args) {
        
        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Email : ");
        email = input.nextLine();
        System.out.println("Password : ");
        password = input.nextLine();
        
        userService satu = new userService( email, password );
        satu.login();
    }
    
}
