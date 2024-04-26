package d5;

import android.util.Log;
import d5.a0;
import v6.v;

/* compiled from: CeaUtil */
public final class c {
    public static void a(long j10, v vVar, a0[] a0VarArr) {
        while (true) {
            boolean z10 = true;
            if (vVar.a() > 1) {
                int c10 = c(vVar);
                int c11 = c(vVar);
                int i10 = vVar.f26519b + c11;
                if (c11 == -1 || c11 > vVar.a()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i10 = vVar.f26520c;
                } else if (c10 == 4 && c11 >= 8) {
                    int s10 = vVar.s();
                    int x10 = vVar.x();
                    int f10 = x10 == 49 ? vVar.f() : 0;
                    int s11 = vVar.s();
                    if (x10 == 47) {
                        vVar.E(1);
                    }
                    boolean z11 = s10 == 181 && (x10 == 49 || x10 == 47) && s11 == 3;
                    if (x10 == 49) {
                        if (f10 != 1195456820) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, vVar, a0VarArr);
                    }
                }
                vVar.D(i10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, v vVar, a0[] a0VarArr) {
        int s10 = vVar.s();
        if ((s10 & 64) != 0) {
            vVar.E(1);
            int i10 = (s10 & 31) * 3;
            int i11 = vVar.f26519b;
            for (a0 a0Var : a0VarArr) {
                vVar.D(i11);
                a0Var.b(vVar, i10);
                a0Var.d(j10, 1, i10, 0, (a0.a) null);
            }
        }
    }

    public static int c(v vVar) {
        int i10 = 0;
        while (vVar.a() != 0) {
            int s10 = vVar.s();
            i10 += s10;
            if (s10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
