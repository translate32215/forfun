package com.startapp;

/* compiled from: Sta */
public class i8 implements Cloneable {
    public String Answer = "";
    public int Index;

    public i8(int i10, String str) {
        this.Index = i10;
        this.Answer = str;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
