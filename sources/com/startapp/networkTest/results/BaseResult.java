package com.startapp.networkTest.results;

import com.startapp.a5;

/* compiled from: Sta */
public class BaseResult implements Cloneable {
    public String GUID = "";
    public String ProjectId = "";
    public String Version = a5.f10036i;

    public BaseResult(String str, String str2) {
        this.ProjectId = str;
        this.GUID = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
