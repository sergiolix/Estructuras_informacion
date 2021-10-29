
package co.edu.ucundinamarca.Parcial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sergio
 */
public class Josephus {
   public static void main(String[] args0){
 
        int N = 8;
        int M = 3;
 
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<= N ; i ++){
            list.add(i);
        }
 
        int count = 0;
        Iterator<Integer> iterator = list.iterator();
        while(list.size() > 1){
            if (!iterator.hasNext()){
                iterator = list.iterator();
            }
 
            int temp = -1;
            while(iterator.hasNext() && count <= M){
                temp = iterator.next();
                count ++;
            }
 
            if (count > M){
                count = 0;
                 iterator.remove();
                 System.out.println("remove : " + temp);
            }
        }
 
        // the last person
        System.out.println("winner is : " + list.get(0));
    }

}