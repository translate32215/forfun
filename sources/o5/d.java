package o5;

import android.util.Log;
import d5.j;
import java.io.IOException;
import v6.e0;
import v6.v;

/* compiled from: WavHeaderReader */
public final class d {

    /* compiled from: WavHeaderReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f23007a;

        /* renamed from: b  reason: collision with root package name */
        public final long f23008b;

        public a(int i10, long j10) {
            this.f23007a = i10;
            this.f23008b = j10;
        }

        public static a a(j jVar, v vVar) throws IOException {
            jVar.j(vVar.f26518a, 0, 8);
            vVar.D(0);
            return new a(vVar.f(), vVar.j());
        }
    }

    public static c a(j jVar) throws IOException {
        byte[] bArr;
        jVar.getClass();
        v vVar = new v(16);
        if (a.a(jVar, vVar).f23007a != 1380533830) {
            return null;
        }
        jVar.j(vVar.f26518a, 0, 4);
        vVar.D(0);
        int f10 = vVar.f();
        if (f10 != 1463899717) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + f10);
            return null;
        }
        a a10 = a.a(jVar, vVar);
        while (a10.f23007a != 1718449184) {
            jVar.k((int) a10.f23008b);
            a10 = a.a(jVar, vVar);
        }
        v6.a.d(a10.f23008b >= 16);
        jVar.j(vVar.f26518a, 0, 16);
        vVar.D(0);
        int l10 = vVar.l();
        int l11 = vVar.l();
        int k10 = vVar.k();
        int k11 = vVar.k();
        int l12 = vVar.l();
        int l13 = vVar.l();
        int i10 = ((int) a10.f23008b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            jVar.j(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = e0.f26441f;
        }
        return new c(l10, l11, k10, k11, l12, l13, bArr);
    }
}
