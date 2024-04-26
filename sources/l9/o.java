package l9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import l.c;
import p9.d;

/* compiled from: TextDrawableHelper */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f21165a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final c f21166b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f21167c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21168d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f21169e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f21170f;

    /* compiled from: TextDrawableHelper */
    public class a extends c {
        public a() {
            super(2);
        }

        public void c(int i10) {
            o oVar = o.this;
            oVar.f21168d = true;
            b bVar = (b) oVar.f21169e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void d(Typeface typeface, boolean z10) {
            if (!z10) {
                o oVar = o.this;
                oVar.f21168d = true;
                b bVar = (b) oVar.f21169e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public o(b bVar) {
        this.f21169e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        float f10;
        if (!this.f21168d) {
            return this.f21167c;
        }
        if (str == null) {
            f10 = 0.0f;
        } else {
            f10 = this.f21165a.measureText(str, 0, str.length());
        }
        this.f21167c = f10;
        this.f21168d = false;
        return f10;
    }

    public void b(d dVar, Context context) {
        if (this.f21170f != dVar) {
            this.f21170f = dVar;
            if (dVar != null) {
                dVar.f(context, this.f21165a, this.f21166b);
                b bVar = (b) this.f21169e.get();
                if (bVar != null) {
                    this.f21165a.drawableState = bVar.getState();
                }
                dVar.e(context, this.f21165a, this.f21166b);
                this.f21168d = true;
            }
            b bVar2 = (b) this.f21169e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
