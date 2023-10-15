public class BubbleSortAlg implements SortAlg {
    @Override
    public void sort(int[] data) {
        for(int i=0;i< data.length;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j]>data[j+1]){
                    int swap=data[j];
                    data[j]=data[j+1];
                    data[j+1]=swap;
                }
            }
        }
    }
}
