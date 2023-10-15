public class Sorter{
    private Comparable compare;
    private SortAlg sortAlg; //정수 정렬 알고리즘

    public Sorter(Comparable comparable) {
        this.compare=comparable;
    }
    public Sorter(SortAlg sortAlg) {
        this.sortAlg=sortAlg;
    }
    public void setSortAlg(SortAlg sortAlg) {
        this.sortAlg = sortAlg;
    }
    public void setComparable(Comparable comparable) {
        this.compare = comparable;
    }
    public void bubbleSort(Object[] obj) {
        for(int i=0;i<obj.length;i++){
            for(int j=0;j<obj.length-i-1;j++){
                if(compare.compareTo(obj[j],obj[j+1])>0){
                    Object swap=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=swap;
                }
            }
        }
    }
    public void sort(int[]data){
        sortAlg.sort(data);
    }

}
