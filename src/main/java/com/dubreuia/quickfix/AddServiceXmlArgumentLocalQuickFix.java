package com.dubreuia.quickfix;

import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
public class AddServiceXmlArgumentLocalQuickFix implements LocalQuickFix {

    private final List<String> args;

    public AddServiceXmlArgumentLocalQuickFix(List<String> args) {
        this.args = args;
    }

    @NotNull
    @Override
    public String getName() {
        return "Symfony: missing argument";
    }

    @NotNull
    @Override
    public String getFamilyName() {
        return "Symfony";
    }

    @Override
    public void applyFix(final @NotNull Project project, @NotNull ProblemDescriptor problemDescriptor) {

    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }
}
