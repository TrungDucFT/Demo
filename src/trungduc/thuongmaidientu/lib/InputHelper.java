package trungduc.thuongmaidientu.lib;

import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;
    public InputHelper(){
        this.scanner = new Scanner(System.in);
    }

    public int readInt(String prompt, String error){
        while (true){
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println(error);
            }
        }
    }
    public float readFloat(String prompt){
        while (true){
            try {
                System.out.println(prompt);
                return Float.parseFloat(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Nhập lại là số thực!");
            }
        }
    }
    public String readString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
