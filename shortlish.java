// import java.util.Comparator;
// import java.util.List;
// import java.util.PriorityQueue;

// public class shortlish {
//     public ListNode mergeKLists(List[] lists) {
        
//         if(lists==null||lists.length==0)
//             return null;
     
//         PriorityQueue<List> queue = new PriorityQueue<List>(new Comparator<List>(){
//             public int compare(List l1, List l2){
//                 return l1.val - l2.val;
//             }
//         });
     
//         List head = new List(0);
//         List p = head;
     
//         for(List list: lists){
//             if(list!=null)
//                 queue.offer(list);
//         }    
     
//         while(!queue.isEmpty()){
//             List n = queue.poll();
//             p.next = n;
//             p=p.next;
     
//             if(n.next!=null)
//                 queue.offer(n.next);
//         }    
     
//         return head.next;
     
//     }


    
// }
