package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.appcompat.widget.o;
import e.g;
import e8.af0;
import e8.eg0;
import e8.fd0;
import e8.id0;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class au {

    /* renamed from: a  reason: collision with root package name */
    public final ht[] f5983a;

    /* renamed from: b  reason: collision with root package name */
    public final id0 f5984b;

    /* renamed from: c  reason: collision with root package name */
    public ht f5985c;

    public au(ht[] htVarArr, id0 id0) {
        this.f5983a = htVarArr;
        this.f5984b = id0;
    }

    public final ht a(fd0 fd0, Uri uri) throws IOException, InterruptedException {
        gt gtVar;
        ht htVar = this.f5985c;
        if (htVar != null) {
            return htVar;
        }
        ht[] htVarArr = this.f5983a;
        int length = htVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            ht htVar2 = htVarArr[i11];
            try {
                if (htVar2.g(fd0)) {
                    this.f5985c = htVar2;
                    ((gt) fd0).f6690e = i10;
                    break;
                }
                fd0 = fd0;
                i11++;
            } catch (EOFException unused) {
                fd0 = fd0;
            } finally {
                ((gt) fd0).f6690e = i10;
            }
        }
        ht htVar3 = this.f5985c;
        if (htVar3 == null) {
            ht[] htVarArr2 = this.f5983a;
            int i12 = eg0.f14479a;
            StringBuilder sb2 = new StringBuilder();
            while (i10 < htVarArr2.length) {
                sb2.append(htVarArr2[i10].getClass().getSimpleName());
                if (i10 < htVarArr2.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            String sb3 = sb2.toString();
            throw new af0(g.a(o.a(sb3, 58), "None of the available extractors (", sb3, ") could read the stream."), uri);
        }
        htVar3.f(this.f5984b);
        return this.f5985c;
    }
}
