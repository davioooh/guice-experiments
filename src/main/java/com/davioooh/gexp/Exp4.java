package com.davioooh.gexp;

import com.davioooh.gexp.support.BetterAdvancedStringPrinter;
import com.davioooh.gexp.support.ReverseStringProcessor;
import com.davioooh.gexp.support.StringPrinter;
import com.davioooh.gexp.support.StringProcessor;
import com.google.inject.*;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class Exp4 extends AbstractModule {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Exp4());
        StringPrinter stringPrinter = injector.getInstance(StringPrinter.class);
        stringPrinter.print("Hello!");
        stringPrinter.print(null);
    }

    @Override
    protected void configure() {
        bind(StringProcessor.class)
                .annotatedWith(Names.named("reverse"))
                .to(ReverseStringProcessor.class)
                .in(Scopes.SINGLETON);
        bind(StringPrinter.class).to(BetterAdvancedStringPrinter.class);
    }

    @Provides
    @Named("defaultHello")
    String defaultString() {
        return "Default Hello!";
    }
}
