package DesignPattern.facade.ide;

import java.util.List;

public class IDE implements Builder {

    private String projectName;
    private Preprocessor preprocessor;
    private Compiler compiler;
    private Linker linker;

    public IDE(Preprocessor preprocessor, Compiler compiler, Linker linker) {
        this.preprocessor = preprocessor;
        this.compiler = compiler;
        this.linker = linker;
    }

    @Override
    public void createProject(String projectName) {
        this.projectName = projectName + ".exe";
    }

    @Override
    public void build(SourceCode[] codeFiles) {
        ObjectCode[] objFiles = new ObjectCode[codeFiles.length];
        int i = 0;

        for (SourceCode codeFile : codeFiles) {
            SourceCode preprocess = preprocessor.preprocess(codeFile);
            objFiles[i] = compiler.compile(preprocess);
            i++;
        }

        Executable exe = linker.link(projectName, objFiles);
        exe.execute();
    }

    @Override
    public void build(List<SourceCode> codeFiles) {
        ObjectCode[] objFiles = new ObjectCode[codeFiles.size()];
        int j = 0;

        for (SourceCode codeFile : codeFiles) {
            SourceCode preprocess = preprocessor.preprocess(codeFile);
            objFiles[j] = compiler.compile(preprocess);
            j++;
        }

        Executable exe = linker.link(projectName, objFiles);
        exe.execute();
    }
}
