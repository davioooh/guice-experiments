package com.davioooh.gexp;

import com.davioooh.gexp.support.AnotherAdvancedStringPrinter;
import com.davioooh.gexp.support.ReverseStringProcessor;
import com.davioooh.gexp.support.StringPrinter;
import com.davioooh.gexp.support.StringProcessor;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;

public class Exp3 extends AbstractModule {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Exp3());
        StringPrinter stringPrinter = injector.getInstance(StringPrinter.class);
        stringPrinter.print("Hello!");
    }

    @Override
    protected void configure() {
        bind(StringProcessor.class)
                .annotatedWith(Names.named("reverse"))
                .to(ReverseStringProcessor.class);
        bind(StringPrinter.class).to(AnotherAdvancedStringPrinter.class);
    }
}
