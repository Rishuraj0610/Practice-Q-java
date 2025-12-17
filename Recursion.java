/*class Recursion { 
public static void printSum(int n, int sum) {
    if(n == 0) {
    System.out.println(sum);
    return;
    }
    sum += n;
    printSum(n-1, sum);
    }
    public static void main(String args[]) {
    printSum(8, 0);
    }
    } 

    public class Recursion{
        public static int calfact(int n) {
            if(n == 1 ||n == 0) {
                return 1;
            }
            int fact_n1 = calfact(n-1);
            int fact_n = n*fact_n1;
            return fact_n;
        }
        public static void main(String args[]) {
            //int n = 5;
            int n =7;
            int ans;
            ans = calfact(n);
            System.out.println("Enter a number to factories : "+ans);
            
        }
    }

    public class Recursion{
        public static void  printfib(int a,int b,int n) {
            if(n == 0) {
                return ;
            }
            int c = a+b;
            System.out.println(c);
            printfib(b,c,n-1);
        }
        public static void main(String[] args) {
            int a =0,b=1;
            System.out.println(a);
            System.err.println(b);
            int n = 7;
            printfib(a,b,n-2);
        }
    }

public class Recursion{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx,char elm) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == elm){
            if(first == -1){
                first = idx;
            } else{
                last = idx;
            }
        }

        findOccurance(str,idx+1,elm);
    }
        public static void main(String args[]){
            String str = "abaacdaefaah";
            findOccurance(str,1,'e');

    }
}


  //Cheak if an array is Sorted(Strictly Increasing(1,2,3,4,5)) 
  // 1,2,3,4 - true; 1,2,3,3 - false; 


public class Recursion{
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,7};
        System.out.println(isSorted(arr,0));
    }
}
*/


//Move all 'x' to the end of the string. (axbcxxd)-"abcdxxx"with new string.

public class Recursion{
    public static void moveAllx(String str,int idx,int count ,String newString){
        if(idx == str.length()){
            for(int i = 0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllx(str,idx+1,count,newString);
        }else{
            newString += currChar;
            moveAllx(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str ="axbcxxd";
        moveAllx(str,0,0,"");
    }
}

 