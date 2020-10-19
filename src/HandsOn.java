import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandsOn {
    public static void main(String[] args) {
        String songs[] = {"Rock With You", "Smooth Criminal",
                "Wanna Be Startin' Something", "Thriller", "Beat It"};
        StringBuilder sb = new StringBuilder();
        for (String song: songs) {
            sb.append(song);
            sb.append(", ");
        }
        //System.out.println(sb);
        try{
            FileWriter writer = new FileWriter("/Users/user/IdeaProjects/Project6/songs.txt");
            writer.write(sb.toString());
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Error when writing songs.txt");
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/user/IdeaProjects/Project6/songs.txt"));
            String songName;
            while ((songName = reader.readLine()) != null){
                System.out.println(songName);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println(" reading error in file");
        }
    }
}
