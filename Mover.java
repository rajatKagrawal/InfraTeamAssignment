
import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rajat on 4/3/18.
 */
public class Mover {
    public static void main(String args[]){
        // Path to home directory of current user
        String user=System.getProperty("user.home");
        //path to desktop of user
        String desktopPath = user+"/Desktop";
        // Getting file tree of desktop
        File maindir = new File(desktopPath);
        //checking for correctness of location
        if(maindir.exists() && maindir.isDirectory())
        {
            // array for files and sub-directories
            // of directory pointed by maindir
            File arr[] = maindir.listFiles();

            System.out.println("**********************************************");
            System.out.println("Files moved from main directory : " + maindir);
            System.out.println("**********************************************");
            //path to documents of user
            String documentsPath=user+"/Documents/";
            //storing directory names in set according to extension
           Set<String> setA = new HashSet<String>();
            for (File f : arr) {
                if (f.isFile()) {
                    String s[]=f.getName().split("\\.");
                    int l=s.length;
                    if(!s[l-1].equals("lnk"))
                    setA.add(s[l-1]);
                }
            }
            //crating directories based on extension if one doesn't exists;
            for(String a:setA){
                String temp=documentsPath+a;
                File dir=new File(temp);
                if(!dir.exists()){
                    dir.mkdir();
                }
            }
            //moving files to given directories
            for(File f:arr){
                if (f.isFile()) {
                    String s[]=f.getName().split("\\.");
                    int l=s.length;
                    if(s[l-1].equals("lnk"))
                        continue;
                    File temp=new File(documentsPath+s[l-1]+"/"+f.getName());
                    f.renameTo(temp);
                }

            }
        }

        System.out.println("**********************************************");
        System.out.println("Files moved to directory : " + desktopPath);
        System.out.println("**********************************************");

    }
}
