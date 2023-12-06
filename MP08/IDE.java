import java.util.ArrayList;
import java.util.List;

public class IDE implements Builder {
    Preprocessor preprocessor;
    Compiler compiler;
    Linker linker;
    List <ObjectCode> objectCodes;
    String fileName;
    public IDE(){
        preprocessor = new CPreProcessor();
        compiler = new CCompiler();
        linker = new CLinker();
        objectCodes = new ArrayList<>();
    }
    @Override
    public void createProject(String word) {
        this.fileName = word;
    }
    @Override
    public Executable build(List<SourceCode> sourceCodes) {
        for(SourceCode sourceCode : sourceCodes){
            SourceCode newSourceCode = preprocessor.preProcess(sourceCode);
            ObjectCode newObjectCode = compiler.compile(newSourceCode);
            objectCodes.add(newObjectCode);
        }
        return linker.link(fileName,objectCodes);
    }

    @Override
    public Executable build(SourceCode[] sourceCodes) {
        for(SourceCode sourceCode : sourceCodes){
            SourceCode newSourceCode = preprocessor.preProcess(sourceCode);
            ObjectCode newObjectCode = compiler.compile(newSourceCode);
            objectCodes.add(newObjectCode);
        }
        return linker.link(fileName,objectCodes);
    }

    public String getFileName() {
        return this.fileName;
    }
}
