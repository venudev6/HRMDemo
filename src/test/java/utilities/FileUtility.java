package utilities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import static org.apache.commons.io.FileUtils.listFiles;

public class FileUtility {

    public FileUtility() {
    }

    /**
     * @param srcFolder the source folder location
     * @param destFolder the destination folder locatio
     */
    public void archiveScreenShots(File srcFolder,File destFolder) {

        try {
            Collection<File> allFiles = FileUtils.listFiles(srcFolder,null,false);
            for(File fileName:allFiles){
                System.out.println(fileName);
                FileUtils.moveFileToDirectory(fileName,destFolder,true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();

        }
    }
}
