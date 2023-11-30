package Olexandr;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class FileMain{
    public static void main(String[] args) {
        try{
            Optional<String> result = Files.lines(Path.of("/home/andrei/IdeaProjects/LambdaExpressions/src/Olexandr/catName")).max((a, b) -> a.length() - b.length());
            System.out.println(result.get());
        } catch (IOException e) {e.printStackTrace();}
    }
}
