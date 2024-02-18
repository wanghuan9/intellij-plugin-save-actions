package com.dubreuia.qiuckfix;


import com.dubreuia.quickfix.AddServiceXmlArgumentLocalQuickFix;
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;

import java.util.ArrayList;

public class AddServiceXmlArgumentLocalQuickFixTest extends LightJavaCodeInsightFixtureTestCase {

    public void testStartInWriteAction() {
        var quickfix = new AddServiceXmlArgumentLocalQuickFix(new ArrayList<>());

        // Prevents "AWT events are not allowed inside write action" exception
        // while creating dialog window for resolving arguments ambiguity
        assertFalse(quickfix.startInWriteAction());
    }
}
