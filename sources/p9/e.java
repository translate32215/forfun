package p9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import l.c;

/* compiled from: TextAppearance */
public class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextPaint f23968b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f23969c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f23970d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Context context, TextPaint textPaint, c cVar) {
        super(2);
        this.f23970d = dVar;
        this.f23967a = context;
        this.f23968b = textPaint;
        this.f23969c = cVar;
    }

    public void c(int i10) {
        this.f23969c.c(i10);
    }

    public void d(Typeface typeface, boolean z10) {
        this.f23970d.g(this.f23967a, this.f23968b, typeface);
        this.f23969c.d(typeface, z10);
    }
}
