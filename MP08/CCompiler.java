public class CCompiler implements Compiler{
    private final String SUFFIX = ".obj";
    @Override
    public ObjectCode compile(SourceCode sourceCode) {
        String fileName = sourceCode.getFileName();
        System.out.println("Compiling code: "+fileName);
        ObjectCode objectCode = new ObjectCode(fileName.replace(".c",SUFFIX));
        System.out.println("Generating object code: "+objectCode.getFileName());
        return objectCode;
    }
}
