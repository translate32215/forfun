package com.startapp;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: Sta */
public class z9 {
    public static String a(List<String> list) {
        h1 h1Var = new h1();
        long currentTimeMillis = System.currentTimeMillis();
        BloomVersion bloomVersion = BloomVersion.FOUR;
        c1 c1Var = h1Var.f10488b.f10736a.get(bloomVersion).f10560b;
        c1Var.getClass();
        OpenBitSet openBitSet = new OpenBitSet((long) (c1Var.f10225a * c1Var.f10226b));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ByteBuffer wrap = ByteBuffer.wrap(it.next().getBytes());
            long c10 = openBitSet.c();
            int i10 = c1Var.f10225a;
            long[] jArr = new long[i10];
            long j10 = c10 / ((long) i10);
            long j11 = currentTimeMillis;
            long a10 = z6.a(wrap, wrap.position(), wrap.remaining(), 0);
            long a11 = z6.a(wrap, wrap.position(), wrap.remaining(), a10);
            Iterator<String> it2 = it;
            int i11 = 0;
            while (i11 < c1Var.f10225a) {
                BloomVersion bloomVersion2 = bloomVersion;
                long j12 = (long) i11;
                jArr[i11] = Math.abs(((j12 * a11) + a10) % j10) + (j12 * j10);
                i11++;
                bloomVersion = bloomVersion2;
                c1Var = c1Var;
            }
            BloomVersion bloomVersion3 = bloomVersion;
            c1 c1Var2 = c1Var;
            for (int i12 = 0; i12 < i10; i12++) {
                openBitSet.b(jArr[i12]);
            }
            bloomVersion = bloomVersion3;
            currentTimeMillis = j11;
            it = it2;
            c1Var = c1Var2;
        }
        long j13 = currentTimeMillis;
        BloomVersion bloomVersion4 = bloomVersion;
        wa waVar = h1Var.f10487a;
        waVar.getClass();
        try {
            String a12 = waVar.f12763a.a(openBitSet);
            xa xaVar = waVar.f12764b.f10736a.get(bloomVersion4).f10559a;
            return j13 + "-" + bloomVersion4.c() + "-" + xaVar.a(a12);
        } catch (Throwable unused) {
            return null;
        }
    }
}
