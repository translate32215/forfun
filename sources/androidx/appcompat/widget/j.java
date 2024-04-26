package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import s0.c;

/* compiled from: AppCompatCompoundButtonHelper */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f960a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f961b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f962c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f963d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f964e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f965f;

    public j(CompoundButton compoundButton) {
        this.f960a = compoundButton;
    }

    public void a() {
        Drawable a10 = c.a(this.f960a);
        if (a10 == null) {
            return;
        }
        if (this.f963d || this.f964e) {
            Drawable mutate = a.n(a10).mutate();
            if (this.f963d) {
                a.l(mutate, this.f961b);
            }
            if (this.f964e) {
                a.m(mutate, this.f962c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f960a.getDrawableState());
            }
            this.f960a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[Catch:{ all -> 0x0089 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f960a
            android.content.Context r0 = r0.getContext()
            int[] r3 = e.l.f13513m
            r8 = 0
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.g1.r(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f960a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f924b
            r7 = 0
            r4 = r10
            r6 = r11
            o0.c0.B(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.p(r10)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x0036
            int r11 = r0.m(r10, r8)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x0036
            android.widget.CompoundButton r1 = r9.f960a     // Catch:{ NotFoundException -> 0x0036 }
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x0036 }
            android.graphics.drawable.Drawable r11 = g.a.b(r2, r11)     // Catch:{ NotFoundException -> 0x0036 }
            r1.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 != 0) goto L_0x0052
            boolean r10 = r0.p(r8)     // Catch:{ all -> 0x0089 }
            if (r10 == 0) goto L_0x0052
            int r10 = r0.m(r8, r8)     // Catch:{ all -> 0x0089 }
            if (r10 == 0) goto L_0x0052
            android.widget.CompoundButton r11 = r9.f960a     // Catch:{ all -> 0x0089 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0089 }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ all -> 0x0089 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0089 }
        L_0x0052:
            r10 = 2
            boolean r11 = r0.p(r10)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x0062
            android.widget.CompoundButton r11 = r9.f960a     // Catch:{ all -> 0x0089 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0089 }
            s0.c.c(r11, r10)     // Catch:{ all -> 0x0089 }
        L_0x0062:
            r10 = 3
            boolean r11 = r0.p(r10)     // Catch:{ all -> 0x0089 }
            if (r11 == 0) goto L_0x008b
            android.widget.CompoundButton r11 = r9.f960a     // Catch:{ all -> 0x0089 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0089 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.k0.c(r10, r1)     // Catch:{ all -> 0x0089 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0089 }
            r2 = 21
            if (r1 < r2) goto L_0x007f
            s0.c.a.d(r11, r10)     // Catch:{ all -> 0x0089 }
            goto L_0x008b
        L_0x007f:
            boolean r1 = r11 instanceof s0.l     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x008b
            s0.l r11 = (s0.l) r11     // Catch:{ all -> 0x0089 }
            r11.setSupportButtonTintMode(r10)     // Catch:{ all -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            r10 = move-exception
            goto L_0x0091
        L_0x008b:
            android.content.res.TypedArray r10 = r0.f924b
            r10.recycle()
            return
        L_0x0091:
            android.content.res.TypedArray r11 = r0.f924b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.b(android.util.AttributeSet, int):void");
    }
}
