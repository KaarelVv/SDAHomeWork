package com.userspringboot.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeBean {
    @Override
    public String toString() {
        return "PrototypeBean{}" + super.hashCode();
    }
}
