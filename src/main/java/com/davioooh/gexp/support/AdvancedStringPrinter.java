package com.davioooh.gexp.support;

import com.google.inject.Inject;

public class AdvancedStringPrinter implements StringPrinter {

    private StringProcessor processor;

    @Inject
    public AdvancedStringPrinter(StringProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void print(String string) {
        System.out.println(processor.process(string));
    }
}
