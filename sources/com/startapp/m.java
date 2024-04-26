package com.startapp;

import android.app.Activity;
import com.startapp.o7;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class m {

    /* renamed from: m  reason: collision with root package name */
    public static Pattern f10842m;

    /* renamed from: a  reason: collision with root package name */
    public final String f10843a;

    /* renamed from: b  reason: collision with root package name */
    public final o7.a f10844b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10845c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10846d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10847e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10848f;

    /* renamed from: g  reason: collision with root package name */
    public long f10849g;

    /* renamed from: h  reason: collision with root package name */
    public long f10850h;

    /* renamed from: i  reason: collision with root package name */
    public long f10851i;

    /* renamed from: j  reason: collision with root package name */
    public long f10852j;

    /* renamed from: k  reason: collision with root package name */
    public int f10853k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10854l;

    public m(String str, o7.a aVar, boolean z10, boolean z11) {
        this.f10843a = str;
        this.f10844b = aVar;
        this.f10845c = z10;
        this.f10846d = z11;
    }

    public static void a(StringBuilder sb2, String str, String str2, boolean z10) {
        if (str != null) {
            sb2.append(str);
            sb2.append('=');
        }
        if (z10) {
            sb2.append('(');
            sb2.append(str2);
            sb2.append(')');
        } else {
            sb2.append(str2);
        }
        sb2.append(", ");
    }

    public static void a(StringBuilder sb2) {
        if (sb2.length() >= 2 && sb2.substring(sb2.length() - 2, sb2.length()).equals(", ")) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
    }

    public static String a(long j10) {
        boolean z10 = true;
        String format = String.format(Locale.ENGLISH, "%.3f", new Object[]{Float.valueOf(((float) j10) / 1000000.0f)});
        Map<Activity, Integer> map = wb.f12765a;
        int length = format.length() - 1;
        int i10 = 0;
        while (length >= 0) {
            char charAt = format.charAt(length);
            if (charAt == '0') {
                if (z10) {
                    i10++;
                }
            } else if (charAt == '.') {
                if (!z10) {
                    length = format.length() - i10;
                }
                return format.substring(0, length);
            } else {
                z10 = false;
            }
            length--;
        }
        return format;
    }
}
