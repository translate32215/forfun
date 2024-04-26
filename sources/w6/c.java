package w6;

import e8.qd0;
import e8.rd0;
import e8.w60;
import ld.e;
import v6.v;

/* compiled from: DolbyVisionConfig */
public class c implements rd0 {

    /* renamed from: a  reason: collision with root package name */
    public int f27028a;

    /* renamed from: b  reason: collision with root package name */
    public int f27029b;

    /* renamed from: c  reason: collision with root package name */
    public Object f27030c;

    public c(qd0 qd0) {
        w60 w60 = qd0.P0;
        this.f27030c = w60;
        w60.h(12);
        this.f27028a = ((w60) this.f27030c).o();
        this.f27029b = ((w60) this.f27030c).o();
    }

    public static c e(v vVar) {
        String str;
        vVar.E(2);
        int s10 = vVar.s();
        int i10 = s10 >> 1;
        int s11 = ((vVar.s() >> 3) & 31) | ((s10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (s11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(s11);
        return new c(i10, s11, sb2.toString());
    }

    public boolean a() {
        return this.f27028a != 0;
    }

    public int b() {
        return this.f27029b;
    }

    public int c() {
        int i10 = this.f27028a;
        return i10 == 0 ? ((w60) this.f27030c).o() : i10;
    }

    public void d() {
        Object obj = this.f27030c;
        int length = ((Object[]) obj).length;
        Object[] objArr = new Object[(length << 1)];
        Object[] objArr2 = objArr;
        e.d((Object[]) obj, objArr2, 0, this.f27028a, 0, 10);
        Object obj2 = this.f27030c;
        int length2 = ((Object[]) obj2).length;
        int i10 = this.f27028a;
        e.d((Object[]) obj2, objArr2, length2 - i10, 0, i10, 4);
        this.f27030c = objArr;
        this.f27028a = 0;
        this.f27029b = length;
    }

    public c() {
        this.f27030c = new Object[16];
    }

    public c(int i10, int i11, String str) {
        this.f27028a = i10;
        this.f27029b = i11;
        this.f27030c = str;
    }
}
