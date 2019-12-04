package operationrene.mapframework;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LevelSerializer {

    public static LevelMap loadLevel(String path) {
        
        LevelMap lm = null;
        try {
            FileInputStream fi = new FileInputStream(path);
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            lm = (LevelMap) oi.readObject();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } 
        
        return lm;
    }

    public static void saveLevel(LevelMap level, String path) {
        try {
            FileOutputStream fo = new FileOutputStream(path);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            
            oo.writeObject(level);
            oo.close();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    

}