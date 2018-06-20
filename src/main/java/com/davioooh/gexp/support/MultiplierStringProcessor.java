package com.davioooh.gexp.support;

import org.apache.commons.lang3.StringUtils;

public class MultiplierStringProcessor implements StringProcessor {

    private int multiplyFor;

    public MultiplierStringProcessor(int multiplyFor) {
        this.multiplyFor = multiplyFor;
    }

    @Override
    public String process(String string) {
        return StringUtils.repeat(string, " ", multiplyFor);
    }
}
