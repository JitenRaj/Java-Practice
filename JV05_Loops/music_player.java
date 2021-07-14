// While loop example : Music player 

import java.util.Scanner;

public class music_player {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true ;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("would you like to take this song on repeat? If so, answer yes");
            String userinput = input.next();
            

            if (userinput.equals("yes")) {
                isOnRepeat = true;
            } else {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
        input.close();
    }
}