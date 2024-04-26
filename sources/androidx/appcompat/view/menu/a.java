package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.i;

/* compiled from: BaseMenuPresenter */
public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public Context f486a;

    /* renamed from: b  reason: collision with root package name */
    public Context f487b;

    /* renamed from: c  reason: collision with root package name */
    public e f488c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f489d;

    /* renamed from: e  reason: collision with root package name */
    public i.a f490e;

    /* renamed from: f  reason: collision with root package name */
    public int f491f;

    /* renamed from: g  reason: collision with root package name */
    public int f492g;

    /* renamed from: h  reason: collision with root package name */
    public j f493h;

    /* renamed from: i  reason: collision with root package name */
    public int f494i;

    public a(Context context, int i10, int i11) {
        this.f486a = context;
        this.f489d = LayoutInflater.from(context);
        this.f491f = i10;
        this.f492g = i11;
    }

    public int getId() {
        return this.f494i;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public boolean k(e eVar, g gVar) {
        return false;
    }

    public void l(i.a aVar) {
        this.f490e = aVar;
    }
}
