package l0;

import android.content.Context;
import java.util.concurrent.Callable;
import l0.m;

/* compiled from: FontRequestWorker */
public class i implements Callable<m.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f20979b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f20980c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f20981d;

    public i(String str, Context context, h hVar, int i10) {
        this.f20978a = str;
        this.f20979b = context;
        this.f20980c = hVar;
        this.f20981d = i10;
    }

    public Object call() throws Exception {
        return m.a(this.f20978a, this.f20979b, this.f20980c, this.f20981d);
    }
}
