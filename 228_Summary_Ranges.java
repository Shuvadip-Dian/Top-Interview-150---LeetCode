import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            
            if(start!=nums[i]){
                al.add(""+start+"->"+nums[i]);
            }
            else{
                al.add(""+start);
            }
        }
        return al;
    }
}

// class Solution {
//     public List<String> summaryRanges(int[] nums) {
//         List<String> lists=new ArrayList<>();
//         if(nums.length==0) return lists;
//         String first=""+nums[0],last=""+nums[0];
//         if(nums.length==1) lists.add(first);
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]+1){
//                 last=""+nums[i];
//                 if(i==nums.length-1){
//                     String temp=""+first+"->"+last;
//                     lists.add(temp);
//                 }
//             }else{
//                 if(first.equals(last)){
//                     lists.add(last);
//                 }else{
//                     String temp=""+first+"->"+last;
//                     lists.add(temp);
//                 }
//                 first=""+nums[i];
//                 last=""+nums[i];
//                 if(i==nums.length-1){
//                     lists.add(first);
//                 }
//             }
//         }
//         return lists;
//     }
// }