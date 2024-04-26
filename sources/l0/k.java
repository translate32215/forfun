package l0;

import android.content.Context;
import java.util.concurrent.Callable;
import l0.m;

/* compiled from: FontRequestWorker */
public class k implements Callable<m.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f20984b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f20985c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f20986d;

    public k(String str, Context context, h hVar, int i10) {
        this.f20983a = str;
        this.f20984b = context;
        this.f20985c = hVar;
        this.f20986d = i10;
    }

    public Object call() throws Exception {
        try {
            return m.a(this.f20983a, this.f20984b, this.f20985c, this.f20986d);
        } catch (Throwable unused) {
            return new m.a(-3);
        }
    }
}
