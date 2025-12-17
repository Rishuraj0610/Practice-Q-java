/*public class Recrustion3 {
    public static void printperm(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            //"abc"-> "ab"
            String newStr = str.substring(0,i)+str.substring(i+1);
            printperm(newStr, permutation+currChar);
        }
    }
    public static void main(String args[]){
        String str ="abc";
        printperm(str, "");
    }
}
 public class Recrustion3{
    public static int countPaths(int i,int j,int n ,int m){
        if(i == n || j ==m){
            return 1 ;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1,j,n,m);
        //move right
        int rightPaths = countPaths(i, j+1, n, m);
        
        return downPaths +rightPaths;
    }
    public static void main(String[] args) {
        int n = 3,m = 3;
        int totalPaths = countPaths(0,0,n,m);
        System.err.println(totalPaths);
    }
 }

//Place Tiles of size 1xm in a floor of size nm

public class Recrustion3{
    public static int placeTiles(int n,int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }        
        return placeTiles(n-1, m) + placeTiles(n-m,m);
    }
    public static void main(String[] args) {
        int n = 4,m =3;

        //int totalPaths = countpaths(0,0,n,m);
        System.out.println(placeTiles(n,m));
    }
}
    

// Find the number of ways in which you can invite n people to your party,single or in pairs


 public class Recrustion3{
    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }
        int ways1 = callGuests(n-1);
        int ways2 = (n-1) * callGuests(n-2);
        return ways1 + ways2;
    }
    public static void main(String ags[]){
        int n =4;
        System.out.println(callGuests(n));
    }
 }*/


 //  -> Print all the subsets of a set of first n natural numbers



import java.util.ArrayList;
public class Recrustion3 {


   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }


   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }


       findSubsets(n-1, subset);
       subset.add(n);
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }


   public static void main(String args[]) {
       int n = 3;
       findSubsets(n, new ArrayList<Integer> ());
   }
}



