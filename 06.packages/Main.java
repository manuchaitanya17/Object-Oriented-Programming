//CHAPTER-6 PACKAGES

//A. PACKAGES-INTRODUCTION-RN


//III. Accessing Classes inside a Package:

//1. Import the Vector class from util package:
import java.util.vector; 
//Note: Only mentioned class of this package will be accessible.


//2. Import all the classes from util package:
import java.util.*;
/* Note: All the classes and interfaces of this package will be accessible
   but not subpackages. */


//3. Import Same named Class of Different Package:
import java.util.Date;
import java.sql.Date;
/* Note: Class name is generally used when two packages have the same class name.
   For example in above code both packages have date class so using a fully
   qualified name to avoid conflict. */


//B. TYPES OF PACKAGES 

//I. BUILTIN PACKAGES-RN

//II. USER-DEFINED PACKAGES-REFER myPackage and yourPackage Packages.


//C. STATIC IMPORT
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        out.println("Kritika Ranjan");
    }
}
