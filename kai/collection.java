import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class collection {
    void array_list(){
        ArrayList <Integer> data = new ArrayList<Integer>();
        data.add(78);
        data.add(78);
        data.add(78);
        data.add(0,2);
        data.size();
        data.isEmpty();
        data.contains(78);
        data.remove(3);
        System.out.print( data.set(data.indexOf(78),56));
        System.out.println(data);
    }
    void set(){
        HashSet data = new HashSet();
        data.add("kai");
        data.add("hai");
        data.add("cai");

        data.add("tai");
        data.add("mai");
        Iterator test = data.iterator();
       
        for(int i=0;i<data.size();i++){
            String x  = test.next().toString();
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        String name[] = {"Night", "Sun", "Mon", "Tue", "Wed", "Thu"};
        HashMap <String,HashMap>data = new HashMap<String,HashMap>();
        HashMap <String,String>data_1 = new HashMap<String,String>();
        data_1.put("name", "Phanuwat");
        data_1.put("age", "19");
        data_1.put("study", "P4");
        data.put("Night",data_1);
        data.put("Night_1",data_1);
        data.put("Night_3",data_1);
        Set<String> st_1 = data.keySet();
        Set<String> st = data_1.keySet();
        Iterator it = st.iterator();
        Iterator t = st_1.iterator();
        System.out.print("Name\tAge\tStudy\n");
       

        for(int i=0;i<st_1.size();i++){
            
            String key_1 = t.next().toString();
            for(int j=0;j<st.size();j++){
                String key_2= it.next().toString();
                System.out.print(data.get(key_1).get(key_2)+"\t");
            }
        }
       
        
    }

}