package com.jeanneboyarsky.rules;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.SourceRoot;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeRulesForMethods {

    private CompilationUnit compilationUnit;

    public CodeRulesForMethods(Path folder, String packageName, String fileName) {
        SourceRoot sourceRoot = new SourceRoot(folder);
        compilationUnit = sourceRoot.parse(packageName, fileName);
    }

    public int numberNonCommentedOutLines(String methodName) {
        MethodVisitorIgnoringCommentLines visitor = new MethodVisitorIgnoringCommentLines(methodName);
        visitor.visit(compilationUnit, null);
        return visitor.getMethodLines().size();
    }

    public boolean containsLambda(String methodName) {
        String methodText = getMethodText(methodName);
        return methodText.contains("->");
    }

    public boolean containsMethodReference(String methodName) {
        String methodText = getMethodText(methodName);
        return methodText.contains("::");
    }

    public boolean containsStream(String methodName) {
        return containsMethod(methodName, "stream", "line");
    }

    private boolean containsMethod(String methodName, String... targetMethods) {
        String methodText = getMethodText(methodName);
        return Arrays.stream(targetMethods).anyMatch(
                m -> methodText.contains(m + "(")
                  || methodText.contains("m ("));
    }

    public boolean containsNewLine(String methodName) {
        String methodText = getMethodText(methodName);
        return methodText.contains("\\n");
    }

    public boolean containsPrintMethod(String methodName) {
        return containsMethod(methodName, "print", "println");
    }

    public boolean containsLoop(String methodName) {
        String methodText = getMethodText(methodName);
        return methodText.contains("for ")
                || methodText.contains("for(")
                || methodText.contains("while ")
                || methodText.contains("while(");
    }

    public boolean containsIf(String methodName) {
        String methodText = getMethodText(methodName);
        return methodText.contains("if ")
                || methodText.contains("if(");
    }

    public int countLoops(String methodName) {
        String methodText = getMethodText(methodName);
        Pattern pattern = Pattern.compile("(for|while)[ (]");
        Matcher matcher = pattern.matcher(methodText);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public boolean containsOptionalEmpty(String methodName) {
        return containsMethod(methodName, "Optional.empty");
    }

    public boolean containsOptionalOf(String methodName) {
        return containsMethod(methodName, "Optional.of");
    }

    public boolean containsRemoveIf(String methodName) {
        return containsMethod(methodName, "removeIf");
    }

    public boolean containsToMap(String methodName) {
        return containsMethod(methodName, "toMap");
    }

    public boolean containsFlatMap(String methodName) {
        return containsMethod(methodName, "flatMap");
    }

    public boolean containsReduce(String methodName) {
        return containsMethod(methodName, "reduce");
    }

    public boolean containsGroupingBy(String methodName) {
        return containsMethod(methodName, "groupingBy");
    }

    public boolean containsLines(String methodName) {
        return containsMethod(methodName, "lines");
    }

    public boolean containsWalk(String methodName) {
        return containsMethod(methodName, "walk");
    }

    public boolean containsMathMin(String methodName) {
        return containsMethod(methodName, "Math.min");
    }

    private String getMethodText(String methodName) {
        MethodVisitorIgnoringCommentLines visitor = new MethodVisitorIgnoringCommentLines(methodName);
        visitor.visit(compilationUnit, null);
        return visitor.getMethodText();
    }

}