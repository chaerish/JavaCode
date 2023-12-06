import java.util.List;

public class CLinker implements Linker{
    String objFileName="";
    @Override
    public Executable link(String exeFileName, ObjectCode[] objFiles) {
        System.out.println("Linking");
        for(ObjectCode objectCode: objFiles){
            String objFileName = "\n"+ objectCode.getFileName();
            this.objFileName += objFileName+"\n";
        }
        System.out.println(objFileName);
        return new Executable(exeFileName,objFileName);
    }

    @Override
    public Executable link(String exeFileName, List<ObjectCode> objFiles) {
        System.out.println("Linking");
        for(ObjectCode objectCode: objFiles){
            String objFileName = objectCode.getFileName();
            this.objFileName += objFileName+"\n";
        }
        System.out.println(objFileName);
        return new Executable(exeFileName,objFileName);
    }
}
