package com.davioooh.gexp.support;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.apache.commons.lang3.StringUtils;

public class BetterAdvancedStringPrinter implements StringPrinter {

    private StringProcessor processor;
    private String defaultMessage;

    @Inject
    public BetterAdvancedStringPrinter(
            @Named("reverse") StringProcessor processor,
            @Named("defaultHello") String defaultMessage) {
        this.processor = processor;
        this.defaultMessage = defaultMessage;
    }

    @Override
    public void print(String string) {
        System.out.println(
                processor.process(
                        StringUtils.isNoneEmpty(string) ? string : defaultMessage));
    }
}
