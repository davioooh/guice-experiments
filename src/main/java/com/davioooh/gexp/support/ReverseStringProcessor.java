package com.davioooh.gexp.support;

import org.apache.commons.lang3.StringUtils;

public class ReverseStringProcessor implements StringProcessor {
    @Override
    public String process(String string) {
        return StringUtils.reverse(string);
    }
}
