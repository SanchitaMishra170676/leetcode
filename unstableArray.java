import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class unstableArray {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Boolean> hm = new HashMap<>();

    int i1=Integer.parseInt(br.readLine());
    for(int i=0;i<i1;++i) {
      String str[]=br.readLine().trim().split(" ");
      long l=Long.parseLong(str[0]);
      long r=Long.parseLong(str[1]);
      if (l == 1) {
        System.out.println(0);
        continue;
      }
      if (l == 2) {
        System.out.println(r);
        continue;
      }
      System.out.println(2*r);


    }

  }
}