package turtleProgramming.util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundHelper extends Thread{
    public static void playWavFile(String name){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/turtleprogramming/Song/" + name + ".wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }catch (Exception ex){
            System.out.println("Exception während playWavFile");
            ex.printStackTrace();
        }
    }
    public static void playWavFileLoop(String name){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/turtleprogramming/Song/" + name + ".wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }catch (Exception ex){
            System.out.println("Exception während playWavFile");
            ex.printStackTrace();
        }
    }
}
