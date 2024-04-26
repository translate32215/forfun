package c2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat */
public class b extends g implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    public C0057b f4050b;

    /* renamed from: c  reason: collision with root package name */
    public Context f4051c;

    /* renamed from: d  reason: collision with root package name */
    public ArgbEvaluator f4052d;

    /* renamed from: e  reason: collision with root package name */
    public final Drawable.Callback f4053e;

    /* compiled from: AnimatedVectorDrawableCompat */
    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: c2.b$b  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    public static class C0057b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f4055a;

        /* renamed from: b  reason: collision with root package name */
        public h f4056b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f4057c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f4058d;

        /* renamed from: e  reason: collision with root package name */
        public s.a<Animator, String> f4059e;

        public C0057b(C0057b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4055a = bVar.f4055a;
                h hVar = bVar.f4056b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f4056b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f4056b = (h) constantState.newDrawable();
                    }
                    h hVar2 = this.f4056b;
                    hVar2.mutate();
                    this.f4056b = hVar2;
                    hVar2.setCallback(callback);
                    this.f4056b.setBounds(bVar.f4056b.getBounds());
                    this.f4056b.f4071f = false;
                }
                ArrayList<Animator> arrayList = bVar.f4058d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4058d = new ArrayList<>(size);
                    this.f4059e = new s.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f4058d.get(i10);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f4059e.getOrDefault(animator, null);
                        clone.setTarget(this.f4056b.f4067b.f4122b.f4120p.getOrDefault(orDefault, null));
                        this.f4058d.add(clone);
                        this.f4059e.put(clone, orDefault);
                    }
                    if (this.f4057c == null) {
                        this.f4057c = new AnimatorSet();
                    }
                    this.f4057c.playTogether(this.f4058d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f4055a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this((Context) null, (C0057b) null, (Resources) null);
    }

    public final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                a(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4052d == null) {
                    this.f4052d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4052d);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4050b.f4056b.draw(canvas);
        if (this.f4050b.f4057c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4050b.f4056b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4050b.f4055a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4065a;
        if (drawable == null) {
            return this.f4050b.f4056b.getColorFilter();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b.c(drawable);
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4065a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4065a.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4050b.f4056b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4050b.f4056b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4050b.f4056b.getOpacity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084 A[Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0089 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r25, org.xmlpull.v1.XmlPullParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.graphics.drawable.Drawable r0 = r1.f4065a
            r6 = 21
            if (r0 == 0) goto L_0x001c
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r6) goto L_0x0018
            androidx.core.graphics.drawable.a.b.d(r0, r2, r3, r4, r5)
            goto L_0x001b
        L_0x0018:
            r0.inflate(r2, r3, r4)
        L_0x001b:
            return
        L_0x001c:
            int r0 = r26.getEventType()
            int r7 = r26.getDepth()
            r8 = 1
            int r7 = r7 + r8
        L_0x0026:
            if (r0 == r8) goto L_0x01a1
            int r9 = r26.getDepth()
            if (r9 >= r7) goto L_0x0031
            r9 = 3
            if (r0 == r9) goto L_0x01a1
        L_0x0031:
            r9 = 2
            if (r0 != r9) goto L_0x0197
            java.lang.String r0 = r26.getName()
            java.lang.String r10 = "animated-vector"
            boolean r10 = r10.equals(r0)
            r11 = 24
            r12 = 0
            r13 = 0
            if (r10 == 0) goto L_0x00b4
            int[] r0 = c2.a.f4042e
            android.content.res.TypedArray r10 = f0.m.d(r2, r5, r4, r0)
            int r0 = r10.getResourceId(r13, r13)
            if (r0 == 0) goto L_0x00af
            android.graphics.PorterDuff$Mode r14 = c2.h.f4066r
            java.lang.String r14 = "parser error"
            java.lang.String r15 = "VectorDrawableCompat"
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r11) goto L_0x0071
            c2.h r6 = new c2.h
            r6.<init>()
            android.graphics.drawable.Drawable r0 = f0.g.a(r2, r0, r5)
            r6.f4065a = r0
            c2.h$i r0 = new c2.h$i
            android.graphics.drawable.Drawable r9 = r6.f4065a
            android.graphics.drawable.Drawable$ConstantState r9 = r9.getConstantState()
            r0.<init>(r9)
            goto L_0x009b
        L_0x0071:
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
        L_0x0079:
            int r11 = r0.next()     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
            if (r11 == r9) goto L_0x0082
            if (r11 == r8) goto L_0x0082
            goto L_0x0079
        L_0x0082:
            if (r11 != r9) goto L_0x0089
            c2.h r6 = c2.h.a(r2, r0, r6, r5)     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
            goto L_0x009b
        L_0x0089:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
            java.lang.String r6 = "No start tag found"
            r0.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0096, IOException -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            android.util.Log.e(r15, r14, r0)
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            android.util.Log.e(r15, r14, r0)
        L_0x009a:
            r6 = r12
        L_0x009b:
            r6.f4071f = r13
            android.graphics.drawable.Drawable$Callback r0 = r1.f4053e
            r6.setCallback(r0)
            c2.b$b r0 = r1.f4050b
            c2.h r0 = r0.f4056b
            if (r0 == 0) goto L_0x00ab
            r0.setCallback(r12)
        L_0x00ab:
            c2.b$b r0 = r1.f4050b
            r0.f4056b = r6
        L_0x00af:
            r10.recycle()
            goto L_0x0197
        L_0x00b4:
            java.lang.String r6 = "target"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0197
            int[] r0 = c2.a.f4043f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r4, r0)
            java.lang.String r6 = r0.getString(r13)
            int r9 = r0.getResourceId(r8, r13)
            if (r9 == 0) goto L_0x0191
            android.content.Context r10 = r1.f4051c
            if (r10 == 0) goto L_0x0186
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r11) goto L_0x00d9
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r10, r9)
            goto L_0x00fe
        L_0x00d9:
            android.content.res.Resources r11 = r10.getResources()
            android.content.res.Resources$Theme r18 = r10.getTheme()
            java.lang.String r14 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r15 = r11.getAnimation(r9)     // Catch:{ XmlPullParserException -> 0x0162, IOException -> 0x0145 }
            android.util.AttributeSet r20 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0140, IOException -> 0x013d, all -> 0x013b }
            r21 = 0
            r22 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r16 = r10
            r17 = r11
            r19 = r15
            android.animation.Animator r9 = c2.d.a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ XmlPullParserException -> 0x0140, IOException -> 0x013d, all -> 0x013b }
            r15.close()
        L_0x00fe:
            c2.b$b r10 = r1.f4050b
            c2.h r10 = r10.f4056b
            c2.h$h r10 = r10.f4067b
            c2.h$g r10 = r10.f4122b
            s.a<java.lang.String, java.lang.Object> r10 = r10.f4120p
            java.lang.Object r10 = r10.getOrDefault(r6, r12)
            r9.setTarget(r10)
            r10 = 21
            if (r13 >= r10) goto L_0x0116
            r1.a(r9)
        L_0x0116:
            c2.b$b r11 = r1.f4050b
            java.util.ArrayList<android.animation.Animator> r12 = r11.f4058d
            if (r12 != 0) goto L_0x012c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f4058d = r12
            c2.b$b r11 = r1.f4050b
            s.a r12 = new s.a
            r12.<init>()
            r11.f4059e = r12
        L_0x012c:
            c2.b$b r11 = r1.f4050b
            java.util.ArrayList<android.animation.Animator> r11 = r11.f4058d
            r11.add(r9)
            c2.b$b r11 = r1.f4050b
            s.a<android.animation.Animator, java.lang.String> r11 = r11.f4059e
            r11.put(r9, r6)
            goto L_0x0193
        L_0x013b:
            r0 = move-exception
            goto L_0x0180
        L_0x013d:
            r0 = move-exception
            r12 = r15
            goto L_0x0146
        L_0x0140:
            r0 = move-exception
            r12 = r15
            goto L_0x0163
        L_0x0143:
            r0 = move-exception
            goto L_0x017f
        L_0x0145:
            r0 = move-exception
        L_0x0146:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            r3.append(r14)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0143 }
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0143 }
            r2.<init>(r3)     // Catch:{ all -> 0x0143 }
            r2.initCause(r0)     // Catch:{ all -> 0x0143 }
            throw r2     // Catch:{ all -> 0x0143 }
        L_0x0162:
            r0 = move-exception
        L_0x0163:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            r3.append(r14)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0143 }
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0143 }
            r2.<init>(r3)     // Catch:{ all -> 0x0143 }
            r2.initCause(r0)     // Catch:{ all -> 0x0143 }
            throw r2     // Catch:{ all -> 0x0143 }
        L_0x017f:
            r15 = r12
        L_0x0180:
            if (r15 == 0) goto L_0x0185
            r15.close()
        L_0x0185:
            throw r0
        L_0x0186:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0191:
            r10 = 21
        L_0x0193:
            r0.recycle()
            goto L_0x0199
        L_0x0197:
            r10 = 21
        L_0x0199:
            int r0 = r26.next()
            r6 = 21
            goto L_0x0026
        L_0x01a1:
            c2.b$b r0 = r1.f4050b
            android.animation.AnimatorSet r2 = r0.f4057c
            if (r2 != 0) goto L_0x01ae
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f4057c = r2
        L_0x01ae:
            android.animation.AnimatorSet r2 = r0.f4057c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f4058d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.f(drawable);
        }
        return this.f4050b.f4056b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4050b.f4057c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4050b.f4056b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4050b.f4056b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f4050b.f4056b.setLevel(i10);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4050b.f4056b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f4050b.f4056b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, z10);
            return;
        }
        h hVar = this.f4050b.f4056b;
        Drawable drawable2 = hVar.f4065a;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.g(drawable2, z10);
        } else {
            hVar.f4067b.f4125e = z10;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        h hVar = this.f4050b.f4056b;
        Drawable drawable2 = hVar.f4065a;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        hVar.f4069d = colorFilter;
        hVar.invalidateSelf();
    }

    public void setTint(int i10) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i10);
        } else {
            this.f4050b.f4056b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, colorStateList);
        } else {
            this.f4050b.f4056b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, mode);
        } else {
            this.f4050b.f4056b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f4050b.f4056b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public void start() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4050b.f4057c.isStarted()) {
            this.f4050b.f4057c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4065a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4050b.f4057c.end();
        }
    }

    public b(Context context, C0057b bVar, Resources resources) {
        this.f4052d = null;
        a aVar = new a();
        this.f4053e = aVar;
        this.f4051c = context;
        this.f4050b = new C0057b((C0057b) null, aVar, (Resources) null);
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f4060a;

        public c(Drawable.ConstantState constantState) {
            this.f4060a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4060a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4060a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b((Context) null, (C0057b) null, (Resources) null);
            Drawable newDrawable = this.f4060a.newDrawable();
            bVar.f4065a = newDrawable;
            newDrawable.setCallback(bVar.f4053e);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b((Context) null, (C0057b) null, (Resources) null);
            Drawable newDrawable = this.f4060a.newDrawable(resources);
            bVar.f4065a = newDrawable;
            newDrawable.setCallback(bVar.f4053e);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b((Context) null, (C0057b) null, (Resources) null);
            Drawable newDrawable = this.f4060a.newDrawable(resources, theme);
            bVar.f4065a = newDrawable;
            newDrawable.setCallback(bVar.f4053e);
            return bVar;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
