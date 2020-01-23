package com.thoughtworks.rule;

import com.thoughtworks.Rule;
import lombok.Data;

@Data
public abstract class BaseRule implements Rule {
    private Rule nextRule;
}
