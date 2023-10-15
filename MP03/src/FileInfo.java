import java.util.Date;
public class FileInfo {
    private final String name;
    private final String type;
    private final int size;
    private final Date modifiedDate;
    public FileInfo(String name,String type,int size,Date modifiedDate){
        this.name=name;
        this.type=type;
        this.size=size;
        this.modifiedDate=modifiedDate;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }
    public String toString() { //객체->문자열
        return "Name: " + name + "\n"
                + "Type: " + type + "\n"
                + "Size: " + size + "\n"
                + "ModifiedDate: " + modifiedDate.toString();
    }

}
