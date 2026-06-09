class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length<3){
            return false;
        }
        int a = arr.length-1;
        int c =0;
        int b[] = new int [arr.length];
        for(int i =0;i<=a;i++){
            b[i]=arr[i];
        } 
        Arrays.sort(b);
        for(int i =0;i<=a;i++){
            if (b[b.length-1]==arr[i]){
                c=i;
            }
        }
        for(int i =0;i<=a;i++){
          if(i<c){
           if(arr[i]<arr[i+1]){
           }
           else{
            return false;
           }
        } 
         if(i>c){
           if(arr[i]<arr[i-1]){
           }
           else{
            return false;
        }
    }
}
if((c==arr.length-1)||(c==0)){
return false;
}
return true;
}}