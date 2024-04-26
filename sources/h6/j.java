package h6;

import a5.h;
import java.util.List;

/* compiled from: SubtitleOutputBuffer */
public abstract class j extends h implements e {

    /* renamed from: c  reason: collision with root package name */
    public e f18957c;

    /* renamed from: d  reason: collision with root package name */
    public long f18958d;

    public int a(long j10) {
        e eVar = this.f18957c;
        eVar.getClass();
        return eVar.a(j10 - this.f18958d);
    }

    public long b(int i10) {
        e eVar = this.f18957c;
        eVar.getClass();
        return eVar.b(i10) + this.f18958d;
    }

    public List<b> c(long j10) {
        e eVar = this.f18957c;
        eVar.getClass();
        return eVar.c(j10 - this.f18958d);
    }

    public int f() {
        e eVar = this.f18957c;
        eVar.getClass();
        return eVar.f();
    }

    public void u() {
        this.f61a = 0;
        this.f18957c = null;
    }

    public void v(long j10, e eVar, long j11) {
        this.f97b = j10;
        this.f18957c = eVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f18958d = j10;
    }
}
