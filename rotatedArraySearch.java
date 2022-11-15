
public class divideConqur {

    public static int search(int arr[], int tar, int si, int ei){

        //kaam
        int mid = si +(ei-si/2);

        if(ei < si){
            return -1;
        }

        if(arr[mid] == tar){
            return mid;
        }

        // mid of L1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                // case a: left
                return search(arr,tar,si,mid);
            }
            else{
                // case b: right
                search(arr,tar,mid+1,ei);
            }
        }

        // mid on L2
        else{
            // case: c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr,tar,mid+1,ei);
            } else{
                // case d: left
                return search(arr,tar,si,mid-1);
            }
        }
        return 0;

    }

    public static void println(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
            int arr[] = {4,5,6,7,0,1,2,3};
        System.out.println(search(arr,0,0,7));
    }
}
