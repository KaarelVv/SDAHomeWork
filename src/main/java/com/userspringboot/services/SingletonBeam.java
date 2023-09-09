package com.userspringboot.services;


import org.springframework.stereotype.Service;

@Service
public class SingletonBeam {
    @Override
    public String toString() {
        return "SingletonBeam{}" + super.hashCode();
    }
}
