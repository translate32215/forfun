package b3;

import a3.b;
import android.support.v4.media.a;
import u2.e;
import w2.r;

/* compiled from: ShapeTrimPath */
public class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3543a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3544b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3545c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3546d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3547e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3548f;

    public o(String str, int i10, b bVar, b bVar2, b bVar3, boolean z10) {
        this.f3543a = str;
        this.f3544b = i10;
        this.f3545c = bVar;
        this.f3546d = bVar2;
        this.f3547e = bVar3;
        this.f3548f = z10;
    }

    public w2.b a(e eVar, c3.b bVar) {
        return new r(bVar, this);
    }

    public String toString() {
        StringBuilder a10 = a.a("Trim Path: {start: ");
        a10.append(this.f3545c);
        a10.append(", end: ");
        a10.append(this.f3546d);
        a10.append(", offset: ");
        a10.append(this.f3547e);
        a10.append("}");
        return a10.toString();
    }
}
