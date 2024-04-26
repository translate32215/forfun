package com.google.gson.internal;

import androidx.appcompat.widget.d0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PreJava9DateFormatProvider */
public class u {
    public static DateFormat a(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i10 == 1) {
            str = "MMMM d, yyyy";
        } else if (i10 == 2) {
            str = "MMM d, yyyy";
        } else if (i10 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(d0.a("Unknown DateFormat style: ", i10));
        }
        sb2.append(str);
        sb2.append(" ");
        if (i11 == 0 || i11 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i11 == 2) {
            str2 = "h:mm:ss a";
        } else if (i11 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(d0.a("Unknown DateFormat style: ", i11));
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }
}
