package com.davioooh.gexp;

import com.davioooh.gexp.support.SimpleStringPrinter;
import com.davioooh.gexp.support.StringPrinter;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Exp1 extends AbstractModule {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Exp1());
        StringPrinter stringPrinter = injector.getInstance(StringPrinter.class);
        stringPrinter.print("Hello!");
    }

    @Override
    protected void configure() {
        bind(StringPrinter.class).to(SimpleStringPrinter.class);
    }
}
