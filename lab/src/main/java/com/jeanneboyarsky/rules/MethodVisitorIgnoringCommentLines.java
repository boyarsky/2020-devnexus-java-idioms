package com.jeanneboyarsky.rules;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;
import java.util.stream.Collectors;

public class MethodVisitorIgnoringCommentLines extends VoidVisitorAdapter {

    private String targetMethod;

    private List<String> methodLines;

    public MethodVisitorIgnoringCommentLines(String targetMethod) {
        this.targetMethod = targetMethod;
        methodLines = List.of();
    }

    public void visit(MethodDeclaration method, Object ignored) {
        if (method.getName().toString().equals(targetMethod)) {
            NodeList<Statement> statements = method.getBody()
                    .map(BlockStmt::getStatements)
                    .orElse(new NodeList<>());
            methodLines = statements.stream()
                    .map(Object::toString)
                    .filter(s -> ! s.trim().startsWith("//"))
                    .collect(Collectors.toList());
        }
    }

    public String getMethodText() {
        return methodLines.stream().collect(Collectors.joining(System.lineSeparator()));
    }

    public List<String> getMethodLines() {
        return methodLines;
    }
}
