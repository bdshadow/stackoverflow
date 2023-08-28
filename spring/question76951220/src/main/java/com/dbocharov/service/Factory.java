package com.dbocharov.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Factory {

    private final ParentClass parentClass;
    private final ChildClass childClass;

    Factory(@Qualifier("ParentClass") ParentClass parentClass, @Qualifier("ChildClass") ChildClass childClass) {
        this.parentClass = parentClass;
        this.childClass = childClass;
    }

    public Interface getObject(boolean isParent){
        if(isParent)
            return parentClass;
        else
            return childClass;
    }
}