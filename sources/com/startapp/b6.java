package com.startapp;

import java.util.Collection;
import java.util.Locale;

/* compiled from: Sta */
public class b6 {

    /* renamed from: d  reason: collision with root package name */
    public static final b6 f10136d = new b6();

    /* renamed from: a  reason: collision with root package name */
    public final String f10137a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10138b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10139c;

    public b6(Locale locale, Collection<Locale> collection) {
        this.f10137a = locale.toString();
        this.f10138b = a((Locale) null, collection, ';');
        this.f10139c = a(locale, collection, ',');
    }

    public static String a(Locale locale, Iterable<Locale> iterable, char c10) {
        boolean z10;
        StringBuilder sb2;
        if (locale != null) {
            sb2 = new StringBuilder();
            sb2.append(locale);
            z10 = true;
        } else {
            z10 = false;
            sb2 = null;
        }
        if (iterable != null) {
            for (Locale next : iterable) {
                if (next != null) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    if (z10) {
                        sb2.append(c10);
                    }
                    sb2.append(next);
                    z10 = true;
                }
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    public b6() {
        this.f10137a = null;
        this.f10138b = null;
        this.f10139c = null;
    }
}
