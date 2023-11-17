import java.util.Scanner;
public class verse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the letter: ");
        char letter=input.next().charAt(0);
        int count=0;
        String line,vowels="aeiou";
        String verse="Let us fix our eyes on Jesus, the author and perfecter of our faith, who for the joy set before him endured the cross, scorning its shame, and sat down at the right hand of the throne of God";
      for(int i=0;i<verse.length();i++){
        if((verse.charAt(i)==' ')&& (verse.charAt(i+1)==(letter))){
            count++;
            while(verse.charAt(i+1)!=' '){
                System.out.print(verse.charAt(i));
                i++;
            }
              System.out.println("  ");

        }
      }
        System.out.println("counted value = " + count);
    }
}
