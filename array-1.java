import java.util.*;
public class sales {
    public static void main(String[] args){
    int[] sales={15000,32000,28000,40000,35000,30000,45000,28000,38000,890000};
    int max=sales[0];
    int min=sales[0];
    for (int i=1;i<sales.length; i++) {
        if(sales[i]>max) {
            max=sales[i];
        }
        if (sales[i]<min) {
            min=sales[i];
        }
    }
        System.out.println("highest Sales="+max);
        System.out.println("lowest Sales ="+min);
    }
    
}
