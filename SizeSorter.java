/**
 * Created by rajat on 3/3/18.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SizeSorter
{
    static List<File> array=new ArrayList<File>();
    public static void RecursivePrint(File[] arr, int level)
    {
        // for-each loop for main directory files
      try {

            for (File f : arr) {
                if (f.isFile()) {
                    array.add(f);
                }

                else if (f.isDirectory()) {
                   RecursivePrint(f.listFiles(), level + 1);
                }
            }
        }
        catch(NullPointerException e){
        }
    }


    // Driver Method
    public static void main(String args[])
    {
        // Provide full path for directory(change accordingly)
        String maindirpath = System.getProperty("user.home");

        // File object
        File maindir = new File(maindirpath);

        if(maindir.exists() && maindir.isDirectory())
        {
            // array for files and sub-directories
            // of directory pointed by maindir
            File arr[] = maindir.listFiles();
            // Calling recursive method
            RecursivePrint(arr, 0);
            sizer();
        }
    }

    //method to check for existing directories not used in given problem statement 
    private static void root(){
        File[] roots = File.listRoots();
        System.out.println("Root directories in your system are:");

        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }

    // function used to sort the files based on size andprint first 10 largest size files
    private static void sizer(){
        Collections.sort(array, new Comparator<File>() {
            @Override
            public int compare(File file, File t1) {
                if(file.length()<t1.length())
                    return 1;
                else if(file.length()==t1.length())
                    return 0;
                return -1;
            }
        });
        for(int i=0;i<array.size()&&i<10;i++){
            System.out.println(array.get(i).getName()+" "+(array.get(i).length()/1024)+"kb");
        }
    }
}
