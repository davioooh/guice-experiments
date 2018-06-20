package com.davioooh.gexp.support;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class AnotherAdvancedStringPrinter implements StringPrinter {

    private StringProcessor processor;

    @Inject
    public AnotherAdvancedStringPrinter(@Named("reverse") StringProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void print(String string) {
        System.out.println(processor.process(string));
    }
}
