# InnovaccerAssignment
## Program in JAVA(OS Independent/Every OS Compatible)
### Problem Description
1. Find the information of top 10 biggest files from a Directory/whole system.
2. Move the files from a source directory to folders according to their extensions in to destination directory.

### Problem 1
``` SizeSorter.java ``` will walk through all the driectories in the specified path and store the name and size of top 10 files according to their size in a list. It also prints the file name and size.  
#### Modules used
###### main:
used as a driver module for SizeSorter class also initializes the ``` maindirpath ``` specifying path to directory from where searching/walkithrough has to begun.
###### RecursivePrint:
used to recursively walkthrough directories
###### sizer:
used to print 10 files largest size files according to their size.
###### root:
extra function not used in given problem statement can be used to know various root directories present in the system of any OS.

#### Compiling SizeSorter.java
``` Java jdk 1.7``` or greater are preffered.
(In Terminal/Command Prompt) move to the directory were SizeSorter.java is placed and type the following commands.
###### step 1:- generating class files
``` javac SizeSorter.java ```
###### step2:- running class files
``` java SizeSorter```
###### Remarks:
1. ``` root ``` function can be used to check all the root directories present in the system independent of OS, it is an extra implementation not required in the given problem staement.
2. currently the directory specified for walk through is home of user irrespective of os used due to inbuilt java command
 ``` String maindirpath = System.getProperty("user.home"); ```
 one can change ``` maindirpath ``` as required.
 
 ### Problem 2
``` Mover.java ``` will sort the files on Desktop on the basis of file extension and move them in separate folders in Documents folder.
#### Modules used
###### main:
used as a driver module for Mover also the path to user's desktop and user's doument is assigned here using ``` String desktopPath = user+"/Desktop/"; ``` and ``` String documentsPath=user+"/Documents/"; ``` were user is ``` String user=System.getProperty("user.home"); ``` i.e. path to home directory to current user.
In main function only the directories are created in Documents based on extensions of file's present in the Desktop and move the file's to their respective folder's based on extension.

#### Compiling Mover.java
``` Java jdk 1.7``` or greater are preffered.
(In Terminal/Command Prompt) move to the directory were Mover.java is placed and type the following commands.
###### step 1:- generating class files
``` javac Mover.java ```
###### step2:- running class files
``` java Mover ```

#### Remarks:
Both Programs are OS Independent and can be used by user of any name one doesn't need to alter path the path to users home is automatically detected by builtin java function ``` System.property() ```.
