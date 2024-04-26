package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.o;
import e8.j40;
import j4.e;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class qg {
    public static String a(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(o.a(hexString, name.length() + 1));
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf2 = String.valueOf(sb3);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf2.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf2) : new String("Exception during lenientFormat for "), e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder a10 = e.a(name2.length() + o.a(sb3, 9), "<", sb3, " threw ", name2);
                    a10.append(">");
                    str2 = a10.toString();
                }
            }
            objArr[i11] = str2;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb4.append(valueOf, i12, indexOf);
            sb4.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb4.append(valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb4.append(", ");
                sb4.append(objArr[i13]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static String b(@NullableDecl String str) {
        int i10 = j40.f15091a;
        return str == null ? "" : str;
    }
}
