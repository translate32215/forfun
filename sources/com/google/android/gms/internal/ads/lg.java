package com.google.android.gms.internal.ads;

import e8.f80;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class lg {
    public lg(int i10) {
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException(pg.d(i10, length, "index"));
        }
        while (i10 < length) {
            if (d(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract int b(int i10, byte[] bArr, int i11, int i12);

    public abstract int c(CharSequence charSequence, byte[] bArr, int i10, int i11);

    public abstract boolean d(char c10);

    public abstract String e(byte[] bArr, int i10, int i11) throws f80;
}
