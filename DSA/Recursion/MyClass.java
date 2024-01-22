public class MyClass {
    
    public static void printBoardPaths(int curr, int dest, String ans) {
        
        if(curr > dest) {
            return;
        }
        
        if(curr == dest) {
            System.out.println(ans);
            return;
        }
        printBoardPaths(curr + 1, dest, ans + 1);
        printBoardPaths(curr + 2, dest, ans + 2);
        printBoardPaths(curr + 3, dest, ans + 3);
        printBoardPaths(curr + 4, dest, ans + 4);
        printBoardPaths(curr + 5, dest, ans + 5);
        printBoardPaths(curr + 6, dest, ans + 6);
    }
    
    public static void printMazePathTwo(int cr, int cc, int dr, int dc, String ans) {
        
        if(cr > dr || cc > dc) {
            return;
        }
        
        if(cr == dr && cc == dc) {
            System.out.println(ans);
            return;
        }
        printMazePathTwo(cr, cc + 1, dr, dc, ans + 'H');
        printMazePathTwo(cr + 1, cc, dr, dc, ans + 'V');
    }
    
    public static void balParenthPrint(int n, int oc, int cc, String ans) {
        
        if(oc == n && cc == n) {
            System.out.println(ans);
            return;
        }
        if(oc < n) {
            balParenthPrint(n, oc + 1, cc, ans + '(');
        }
        
        if(oc > cc) {
            balParenthPrint(n, oc, cc + 1, ans + ')');
        }
    }
    public static void main(String args[]) {
     // printBoardPaths(0, 8, "");
     // printMazePathTwo(0, 0, 2, 2, "");
      balParenthPrint(3, 0, 0, "");
    }
}
