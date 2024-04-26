package com.startapp;

import java.util.regex.Pattern;

/* compiled from: Sta */
public class va {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f12702a = Pattern.compile("\\+");

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f12703b = Pattern.compile("/");

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f12704c = Pattern.compile("=");

    public va() {
        Pattern.compile("_");
        Pattern.compile("\\*");
        Pattern.compile("#");
    }

    public String a(String str) {
        return this.f12704c.matcher(this.f12703b.matcher(this.f12702a.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll("#");
    }
}
