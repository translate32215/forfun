package com.startapp;

import java.lang.Comparable;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class cc<T extends Comparable<T>> implements Comparable<cc<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static Pattern f10251c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: d  reason: collision with root package name */
    public static Pattern f10252d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a  reason: collision with root package name */
    public final String f10253a;

    /* renamed from: b  reason: collision with root package name */
    public final T f10254b;

    public cc(String str, T t10) {
        this.f10253a = str;
        this.f10254b = t10;
    }

    public static boolean a(String str) {
        return f10251c.matcher(str).matches();
    }

    public static Integer b(String str) {
        String[] split = str.split(":");
        if (split.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(split[1]) * 60 * 1000) + (Integer.parseInt(split[0]) * 60 * 60 * 1000) + ((int) (Float.parseFloat(split[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int compareTo(Object obj) {
        return this.f10254b.compareTo(((cc) obj).f10254b);
    }
}
