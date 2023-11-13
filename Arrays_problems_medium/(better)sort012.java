//better approach (not dnf algo)
import java.util.* ;
public class sort012 {

    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.

        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0; i<n; i++ ){
            if(arr.get(i)==0){
                count0++;
            }
            else if((arr.get(i)==1)){
                count1++;
            }

            else{
                count2++;
            }
        }

        for(int i=0; i<count0; i++){
            arr.set(i,0);
        }

         for(int i=count0; i<count0+count1; i++){
            arr.set(i,1);
        }

         for(int i=count0+count1; i<n; i++){
            arr.set(i,2);
        }
        
    }

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);

      
        sortArray(list,list.size());
        System.out.println(list);


        
    }
    
}





