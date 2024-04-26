package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import j.f;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLException;
import o0.c0;
import o1.p;
import u2.e;
import u2.g;
import u2.i;
import u2.j;
import u2.m;
import u2.n;
import u2.o;
import u2.q;

public class LottieAnimationView extends AppCompatImageView {
    public static final g<Throwable> D = new a();
    public int A;
    public m<u2.d> B;
    public u2.d C;

    /* renamed from: d  reason: collision with root package name */
    public final g<u2.d> f4839d = new b();

    /* renamed from: e  reason: collision with root package name */
    public final g<Throwable> f4840e = new c();

    /* renamed from: f  reason: collision with root package name */
    public g<Throwable> f4841f;

    /* renamed from: g  reason: collision with root package name */
    public int f4842g;

    /* renamed from: h  reason: collision with root package name */
    public final e f4843h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4844i;

    /* renamed from: r  reason: collision with root package name */
    public String f4845r;

    /* renamed from: s  reason: collision with root package name */
    public int f4846s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4847t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4848u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4849v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4850w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4851x;

    /* renamed from: y  reason: collision with root package name */
    public f f4852y;

    /* renamed from: z  reason: collision with root package name */
    public Set<i> f4853z;

    public class a implements g<Throwable> {
        public void a(Object obj) {
            Throwable th = (Throwable) obj;
            PathMeasure pathMeasure = g3.g.f18436a;
            if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
                g3.c.b("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public class b implements g<u2.d> {
        public b() {
        }

        public void a(Object obj) {
            LottieAnimationView.this.setComposition((u2.d) obj);
        }
    }

    public class c implements g<Throwable> {
        public c() {
        }

        public void a(Object obj) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i10 = lottieAnimationView.f4842g;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            g<Throwable> gVar = LottieAnimationView.this.f4841f;
            if (gVar == null) {
                g<Throwable> gVar2 = LottieAnimationView.D;
                gVar = LottieAnimationView.D;
            }
            gVar.a(th);
        }
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f4856a;

        /* renamed from: b  reason: collision with root package name */
        public int f4857b;

        /* renamed from: c  reason: collision with root package name */
        public float f4858c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4859d;

        /* renamed from: e  reason: collision with root package name */
        public String f4860e;

        /* renamed from: f  reason: collision with root package name */
        public int f4861f;

        /* renamed from: g  reason: collision with root package name */
        public int f4862g;

        public class a implements Parcelable.Creator<d> {
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (a) null);
            }

            public Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f4856a);
            parcel.writeFloat(this.f4858c);
            parcel.writeInt(this.f4859d ? 1 : 0);
            parcel.writeString(this.f4860e);
            parcel.writeInt(this.f4861f);
            parcel.writeInt(this.f4862g);
        }

        public d(Parcel parcel, a aVar) {
            super(parcel);
            this.f4856a = parcel.readString();
            this.f4858c = parcel.readFloat();
            this.f4859d = parcel.readInt() != 1 ? false : true;
            this.f4860e = parcel.readString();
            this.f4861f = parcel.readInt();
            this.f4862g = parcel.readInt();
        }
    }

    static {
        Class<LottieAnimationView> cls = LottieAnimationView.class;
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        boolean z10 = false;
        this.f4842g = 0;
        e eVar = new e();
        this.f4843h = eVar;
        this.f4847t = false;
        this.f4848u = false;
        this.f4849v = false;
        this.f4850w = false;
        this.f4851x = true;
        this.f4852y = f.AUTOMATIC;
        this.f4853z = new HashSet();
        this.A = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f26023a);
        if (!isInEditMode()) {
            this.f4851x = obtainStyledAttributes.getBoolean(1, true);
            boolean hasValue = obtainStyledAttributes.hasValue(9);
            boolean hasValue2 = obtainStyledAttributes.hasValue(5);
            boolean hasValue3 = obtainStyledAttributes.hasValue(15);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(5);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f4849v = true;
            this.f4850w = true;
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            eVar.f25936c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(6));
        setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
        boolean z11 = obtainStyledAttributes.getBoolean(3, false);
        if (eVar.f25946u != z11) {
            if (Build.VERSION.SDK_INT < 19) {
                g3.c.a("Merge paths are not supported pre-Kit Kat.");
            } else {
                eVar.f25946u = z11;
                if (eVar.f25935b != null) {
                    eVar.b();
                }
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            eVar.a(new z2.e("**"), j.C, new p((Object) new u2.p(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            eVar.f25937d = obtainStyledAttributes.getFloat(13, 1.0f);
            eVar.v();
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int i10 = obtainStyledAttributes.getInt(10, 0);
            setRenderMode(f.values()[i10 >= f.values().length ? 0 : i10]);
        }
        if (getScaleType() != null) {
            eVar.f25941h = getScaleType();
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        PathMeasure pathMeasure = g3.g.f18436a;
        eVar.f25938e = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z10).booleanValue();
        d();
        this.f4844i = true;
    }

    private void setCompositionTask(m<u2.d> mVar) {
        this.C = null;
        this.f4843h.c();
        c();
        mVar.b(this.f4839d);
        mVar.a(this.f4840e);
        this.B = mVar;
    }

    public void buildDrawingCache(boolean z10) {
        this.A++;
        super.buildDrawingCache(z10);
        if (this.A == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(f.HARDWARE);
        }
        this.A--;
        u2.c.a("buildDrawingCache");
    }

    public final void c() {
        m<u2.d> mVar = this.B;
        if (mVar != null) {
            g<u2.d> gVar = this.f4839d;
            synchronized (mVar) {
                mVar.f26015a.remove(gVar);
            }
            m<u2.d> mVar2 = this.B;
            g<Throwable> gVar2 = this.f4840e;
            synchronized (mVar2) {
                mVar2.f26016b.remove(gVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r0 != 1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r6 = this;
            com.airbnb.lottie.f r0 = r6.f4852y
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x000e
            if (r0 == r2) goto L_0x0030
        L_0x000c:
            r1 = 1
            goto L_0x0030
        L_0x000e:
            u2.d r0 = r6.C
            r3 = 0
            if (r0 == 0) goto L_0x001e
            boolean r4 = r0.f25932n
            if (r4 == 0) goto L_0x001e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            if (r0 == 0) goto L_0x0026
            int r0 = r0.f25933o
            r4 = 4
            if (r0 <= r4) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x000c
        L_0x0030:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L_0x003a
            r0 = 0
            r6.setLayerType(r1, r0)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d():void");
    }

    public void e() {
        if (isShown()) {
            this.f4843h.j();
            d();
            return;
        }
        this.f4847t = true;
    }

    public u2.d getComposition() {
        return this.C;
    }

    public long getDuration() {
        u2.d dVar = this.C;
        if (dVar != null) {
            return (long) dVar.b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f4843h.f25936c.f18427f;
    }

    public String getImageAssetsFolder() {
        return this.f4843h.f25943r;
    }

    public float getMaxFrame() {
        return this.f4843h.e();
    }

    public float getMinFrame() {
        return this.f4843h.f();
    }

    public n getPerformanceTracker() {
        u2.d dVar = this.f4843h.f25935b;
        if (dVar != null) {
            return dVar.f25919a;
        }
        return null;
    }

    public float getProgress() {
        return this.f4843h.g();
    }

    public int getRepeatCount() {
        return this.f4843h.h();
    }

    public int getRepeatMode() {
        return this.f4843h.f25936c.getRepeatMode();
    }

    public float getScale() {
        return this.f4843h.f25937d;
    }

    public float getSpeed() {
        return this.f4843h.f25936c.f18424c;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        e eVar = this.f4843h;
        if (drawable2 == eVar) {
            super.invalidateDrawable(eVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4850w || this.f4849v) {
            e();
            this.f4850w = false;
            this.f4849v = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void onDetachedFromWindow() {
        if (this.f4843h.i()) {
            this.f4849v = false;
            this.f4848u = false;
            this.f4847t = false;
            e eVar = this.f4843h;
            eVar.f25940g.clear();
            eVar.f25936c.cancel();
            d();
            this.f4849v = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        String str = dVar.f4856a;
        this.f4845r = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f4845r);
        }
        int i10 = dVar.f4857b;
        this.f4846s = i10;
        if (i10 != 0) {
            setAnimation(i10);
        }
        setProgress(dVar.f4858c);
        if (dVar.f4859d) {
            e();
        }
        this.f4843h.f25943r = dVar.f4860e;
        setRepeatMode(dVar.f4861f);
        setRepeatCount(dVar.f4862g);
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f4856a = this.f4845r;
        dVar.f4857b = this.f4846s;
        dVar.f4858c = this.f4843h.g();
        dVar.f4859d = this.f4843h.i() || (!c0.q(this) && this.f4849v);
        e eVar = this.f4843h;
        dVar.f4860e = eVar.f25943r;
        dVar.f4861f = eVar.f25936c.getRepeatMode();
        dVar.f4862g = this.f4843h.h();
        return dVar;
    }

    public void onVisibilityChanged(View view, int i10) {
        if (this.f4844i) {
            if (isShown()) {
                if (this.f4848u) {
                    if (isShown()) {
                        this.f4843h.k();
                        d();
                    } else {
                        this.f4847t = false;
                        this.f4848u = true;
                    }
                } else if (this.f4847t) {
                    e();
                }
                this.f4848u = false;
                this.f4847t = false;
            } else if (this.f4843h.i()) {
                this.f4850w = false;
                this.f4849v = false;
                this.f4848u = false;
                this.f4847t = false;
                e eVar = this.f4843h;
                eVar.f25940g.clear();
                eVar.f25936c.j();
                d();
                this.f4848u = true;
            }
        }
    }

    public void setAnimation(int i10) {
        m<u2.d> mVar;
        this.f4846s = i10;
        this.f4845r = null;
        if (this.f4851x) {
            Context context = getContext();
            mVar = a.a(a.f(context, i10), new d(new WeakReference(context), context.getApplicationContext(), i10));
        } else {
            Context context2 = getContext();
            Map<String, m<u2.d>> map = a.f4863a;
            mVar = a.a((String) null, new d(new WeakReference(context2), context2.getApplicationContext(), i10));
        }
        setCompositionTask(mVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(a.a((String) null, new e(new ByteArrayInputStream(str.getBytes()), (String) null)));
    }

    public void setAnimationFromUrl(String str) {
        m<u2.d> mVar;
        if (this.f4851x) {
            Context context = getContext();
            Map<String, m<u2.d>> map = a.f4863a;
            String a10 = f.a("url_", str);
            mVar = a.a(a10, new b(context, str, a10));
        } else {
            mVar = a.a((String) null, new b(getContext(), str, (String) null));
        }
        setCompositionTask(mVar);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f4843h.f25950y = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.f4851x = z10;
    }

    public void setComposition(u2.d dVar) {
        this.f4843h.setCallback(this);
        this.C = dVar;
        e eVar = this.f4843h;
        boolean z10 = false;
        if (eVar.f25935b != dVar) {
            eVar.A = false;
            eVar.c();
            eVar.f25935b = dVar;
            eVar.b();
            g3.d dVar2 = eVar.f25936c;
            if (dVar2.f18431r == null) {
                z10 = true;
            }
            dVar2.f18431r = dVar;
            if (z10) {
                dVar2.l((float) ((int) Math.max(dVar2.f18429h, dVar.f25929k)), (float) ((int) Math.min(dVar2.f18430i, dVar.f25930l)));
            } else {
                dVar2.l((float) ((int) dVar.f25929k), (float) ((int) dVar.f25930l));
            }
            float f10 = dVar2.f18427f;
            dVar2.f18427f = 0.0f;
            dVar2.k((float) ((int) f10));
            dVar2.b();
            eVar.u(eVar.f25936c.getAnimatedFraction());
            eVar.f25937d = eVar.f25937d;
            eVar.v();
            eVar.v();
            Iterator it = new ArrayList(eVar.f25940g).iterator();
            while (it.hasNext()) {
                ((e.o) it.next()).a(dVar);
                it.remove();
            }
            eVar.f25940g.clear();
            dVar.f25919a.f26020a = eVar.f25949x;
            Drawable.Callback callback = eVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(eVar);
            }
            z10 = true;
        }
        d();
        if (getDrawable() != this.f4843h || z10) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (i a10 : this.f4853z) {
                a10.a(dVar);
            }
        }
    }

    public void setFailureListener(g<Throwable> gVar) {
        this.f4841f = gVar;
    }

    public void setFallbackResource(int i10) {
        this.f4842g = i10;
    }

    public void setFontAssetDelegate(u2.a aVar) {
        y2.a aVar2 = this.f4843h.f25945t;
    }

    public void setFrame(int i10) {
        this.f4843h.l(i10);
    }

    public void setImageAssetDelegate(u2.b bVar) {
        e eVar = this.f4843h;
        eVar.f25944s = bVar;
        y2.b bVar2 = eVar.f25942i;
        if (bVar2 != null) {
            bVar2.f27999c = bVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f4843h.f25943r = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        c();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f4843h.m(i10);
    }

    public void setMaxProgress(float f10) {
        this.f4843h.o(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f4843h.q(str);
    }

    public void setMinFrame(int i10) {
        this.f4843h.r(i10);
    }

    public void setMinProgress(float f10) {
        this.f4843h.t(f10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        e eVar = this.f4843h;
        eVar.f25949x = z10;
        u2.d dVar = eVar.f25935b;
        if (dVar != null) {
            dVar.f25919a.f26020a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f4843h.u(f10);
    }

    public void setRenderMode(f fVar) {
        this.f4852y = fVar;
        d();
    }

    public void setRepeatCount(int i10) {
        this.f4843h.f25936c.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f4843h.f25936c.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f4843h.f25939f = z10;
    }

    public void setScale(float f10) {
        e eVar = this.f4843h;
        eVar.f25937d = f10;
        eVar.v();
        if (getDrawable() == this.f4843h) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.f4843h);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        e eVar = this.f4843h;
        if (eVar != null) {
            eVar.f25941h = scaleType;
        }
    }

    public void setSpeed(float f10) {
        this.f4843h.f25936c.f18424c = f10;
    }

    public void setTextDelegate(q qVar) {
        this.f4843h.getClass();
    }

    public void setMaxFrame(String str) {
        this.f4843h.n(str);
    }

    public void setMinFrame(String str) {
        this.f4843h.s(str);
    }

    public void setAnimation(String str) {
        m<u2.d> mVar;
        this.f4845r = str;
        this.f4846s = 0;
        if (this.f4851x) {
            Context context = getContext();
            Map<String, m<u2.d>> map = a.f4863a;
            String a10 = f.a("asset_", str);
            mVar = a.a(a10, new c(context.getApplicationContext(), str, a10));
        } else {
            Context context2 = getContext();
            Map<String, m<u2.d>> map2 = a.f4863a;
            mVar = a.a((String) null, new c(context2.getApplicationContext(), str, (String) null));
        }
        setCompositionTask(mVar);
    }
}
