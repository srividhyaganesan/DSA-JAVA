import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;
public class prioqueue {

    static class heap{
        static ArrayList<Integer>al=new ArrayList<>();         

        public static void addele(int data){
            al.add(data);
            // find position of parent from child
            int paridx=(al.size()-2)/2;
            int childidx=al.size()-1;
            while(paridx>=0 && al.get(childidx)<al.get(paridx) ){
                // just swap
                Collections.swap(al,paridx,childidx);
                childidx=paridx;
                paridx=(childidx-2)/2;
            }
        }

        public static int getpeek(){
            if(al.isEmpty()){
                return -1;
            }
            System.out.println(al);
            return al.get(0);
        }

        public static void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<al.size() && al.get(minidx)>al.get(left)){
                minidx=left;
            }
            if(right<al.size() && al.get(minidx)>al.get(right)){
                minidx=right;
            }
            // swap
            if(minidx!=i){
                Collections.swap(al,minidx,i);
                // recursively call
                heapify(minidx);
            }
        }

        public static int removeele(int data,ArrayList<Integer>al){
            // swap with the last
            int minele=al.get(0);
            Collections.swap(al,0,al.size()-1);

            // remove last ele
            al.remove(al.size()-1);

            // heapify
            heapify(0);

            return minele;
        }

        public static ArrayList heapsort(){
            ArrayList<Integer>sortedarr=new ArrayList<>();
            while(!al.isEmpty()){
                int x=removeele(al.get(0),al);
                sortedarr.add(x);
            }
            return sortedarr;
        }


    }
    public static void main(String[] args) {
        
    /* 
    PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();

        }
    */

        heap hp=new heap();
        hp.addele(2);
        hp.addele(3);
        hp.addele(4);
        hp.addele(5);
        hp.addele(10);
        hp.addele(1);
        System.out.println(hp.getpeek());
        System.out.println(hp.heapsort());


    }
    
}
