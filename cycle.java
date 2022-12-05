// import java.util.LinkedList;
// import java.util.List;

// public class cycle {

//     public LinkedList detectCycle(LinkedList head){

//         if (head == null) return null;

//         LinkedList slower = head;
//         LinkedList faster = head;

//         while (slower != null && faster !=null){
//             slower = slower.nextList;
//             faster = faster.next;
//             if (faster != null)
//                 faster = faster.next;
//             if (slower == faster)
//                 break;
//         }

//         if (faster == null) return null;
//            slower = head;
//         while (slower != faster){
//             slower = slower.next;
//             faster = faster.next;
//         }
//         return slower;

//     }
    
// }
