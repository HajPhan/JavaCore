package mta.edu.vn.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DevLog {
    public static final String LOG_FILE="c:/APT/log.txt";

    public static void log(Object message){
        if(message == null){
            return;
        }

        // Make sure the path exists.
        new File(LOG_FILE).getParentFile().mkdirs();

        // File
        FileWriter writer = null;

        try {
            writer = new FileWriter(LOG_FILE,true);
            writer.append(message.toString());
            writer.append("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            try {
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
