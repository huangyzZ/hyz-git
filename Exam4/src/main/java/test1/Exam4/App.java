package test1.Exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 第四题
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list = new ArrayList<Integer>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	System.out.print("随机生成的50个整数，分别为：");
    	for (int i = 0; i < 50; i++) {
    		int x=(int)(Math.random()*100);
    		System.out.print(x+",");
    		list.add(x);
		}
    	for (Integer integer : list) {
			int result = integer/10;
			map.put(result,integer);
		}
    	Set<Integer> keySet = map.keySet();
        Iterator<Integer> iter = keySet.iterator();
        System.out.println();
        System.out.print("Map中的数据为：");
        while (iter.hasNext()) {
            int key = iter.next();
            System.out.print(map.get(key)+" ");
            
        }
    }
}
