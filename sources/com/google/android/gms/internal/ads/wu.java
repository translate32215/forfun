package com.google.android.gms.internal.ads;

import e8.ch0;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wu {
    public static long a(long j10, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return j10;
        }
        if (i10 % 2 == 0) {
            return a((j10 * j10) % 1073807359, i10 / 2) % 1073807359;
        }
        return ((a((j10 * j10) % 1073807359, i10 / 2) % 1073807359) * j10) % 1073807359;
    }

    public static String b(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            e.I("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb2.append(strArr[i10]);
                sb2.append(' ');
                i10++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static void c(int i10, long j10, String str, int i11, PriorityQueue<ch0> priorityQueue) {
        ch0 ch0 = new ch0(j10, str, i11);
        if ((priorityQueue.size() != i10 || (priorityQueue.peek().f14142c <= i11 && priorityQueue.peek().f14140a <= j10)) && !priorityQueue.contains(ch0)) {
            priorityQueue.add(ch0);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    public static long d(String[] strArr, int i10) {
        long a10 = (((long) vu.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            a10 = (((((long) vu.a(strArr[i11])) + 2147483647L) % 1073807359) + ((a10 * 16785407) % 1073807359)) % 1073807359;
        }
        return a10;
    }
}
