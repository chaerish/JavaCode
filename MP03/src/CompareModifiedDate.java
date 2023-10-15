public class CompareModifiedDate implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) { //=obj[i],obj[j]
        return ((FileInfo)(o1)).getModifiedDate().compareTo((((FileInfo)(o2)).getModifiedDate()));
    }
}
