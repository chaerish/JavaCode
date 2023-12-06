public class CPreProcessor implements Preprocessor{
    private final String PREFIX = "preprocessed_";

    @Override
    public SourceCode preProcess(SourceCode sourceCode) {
        String fileName = sourceCode.getFileName();
        SourceCode newSourceCode = new SourceCode(PREFIX+fileName);
        System.out.println("Preprocessing code: "+fileName);
        System.out.println("Generating a new code: "+newSourceCode.getFileName());
        return newSourceCode;
    }
}
