package com.davioooh.gexp;

import com.davioooh.gexp.support.AdvancedStringPrinter;
import com.davioooh.gexp.support.MultiplierStringProcessor;
import com.davioooh.gexp.support.StringPrinter;
import com.davioooh.gexp.support.StringProcessor;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Exp2 extends AbstractModule {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Exp2());
        StringPrinter stringPrinter = injector.getInstance(StringPrinter.class);
        stringPrinter.print("Hello!");
    }

    @Override
    protected void configure() {
        bind(StringProcessor.class).toInstance(new MultiplierStringProcessor(3));
        bind(StringPrinter.class).to(AdvancedStringPrinter.class);
    }
}
