package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.youtube.player.a;
import com.google.android.youtube.player.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import z9.e;
import z9.h;
import z9.j;
import z9.n;
import z9.o;

public final class YouTubePlayerView extends ViewGroup implements c.b {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f9625t = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f9626a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<View> f9627b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9628c;

    /* renamed from: d  reason: collision with root package name */
    public z9.c f9629d;

    /* renamed from: e  reason: collision with root package name */
    public t1.c f9630e;

    /* renamed from: f  reason: collision with root package name */
    public View f9631f;

    /* renamed from: g  reason: collision with root package name */
    public h f9632g;

    /* renamed from: h  reason: collision with root package name */
    public c.b f9633h;

    /* renamed from: i  reason: collision with root package name */
    public Bundle f9634i;

    /* renamed from: r  reason: collision with root package name */
    public c.a f9635r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9636s;

    public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {
        public a(byte b10) {
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            YouTubePlayerView youTubePlayerView = YouTubePlayerView.this;
            if (youTubePlayerView.f9630e != null && youTubePlayerView.f9627b.contains(view2) && !YouTubePlayerView.this.f9627b.contains(view)) {
                t1.c cVar = YouTubePlayerView.this.f9630e;
                cVar.getClass();
                try {
                    ((e) cVar.f25351c).l();
                } catch (RemoteException e10) {
                    throw new j(e10);
                }
            }
        }
    }

    public interface b {
        void a(YouTubePlayerView youTubePlayerView);

        void b(YouTubePlayerView youTubePlayerView, String str, c.a aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (context instanceof a) {
            a.C0104a aVar = ((a) context).f9638a;
            u.b.b(context, "context cannot be null");
            u.b.b(aVar, "listener cannot be null");
            this.f9628c = aVar;
            if (getBackground() == null) {
                setBackgroundColor(-16777216);
            }
            setClipToPadding(false);
            h hVar = new h(context);
            this.f9632g = hVar;
            requestTransparentRegion(hVar);
            h hVar2 = this.f9632g;
            b(hVar2);
            super.addView(hVar2);
            this.f9627b = new HashSet();
            this.f9626a = new a((byte) 0);
            return;
        }
        throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
    }

    public static void d(YouTubePlayerView youTubePlayerView, Activity activity) {
        try {
            boolean z10 = false;
            t1.c cVar = new t1.c(youTubePlayerView.f9629d, z9.a.f28739a.b(activity, youTubePlayerView.f9629d, false));
            youTubePlayerView.f9630e = cVar;
            try {
                View view = (View) n.m(((e) cVar.f25351c).y2());
                youTubePlayerView.f9631f = view;
                youTubePlayerView.b(view);
                super.addView(view);
                youTubePlayerView.removeView(youTubePlayerView.f9632g);
                youTubePlayerView.f9628c.a(youTubePlayerView);
                if (youTubePlayerView.f9635r != null) {
                    Bundle bundle = youTubePlayerView.f9634i;
                    if (bundle != null) {
                        t1.c cVar2 = youTubePlayerView.f9630e;
                        cVar2.getClass();
                        try {
                            z10 = ((e) cVar2.f25351c).a(bundle);
                            youTubePlayerView.f9634i = null;
                        } catch (RemoteException e10) {
                            throw new j(e10);
                        }
                    }
                    youTubePlayerView.f9635r.b(youTubePlayerView.f9633h, youTubePlayerView.f9630e, z10);
                    youTubePlayerView.f9635r = null;
                }
            } catch (RemoteException e11) {
                throw new j(e11);
            }
        } catch (o.a e12) {
            Log.e("YouTubeAndroidPlayerAPI", "Error creating YouTubePlayerView", e12);
            youTubePlayerView.c(b.INTERNAL_ERROR);
        }
    }

    public final void a() {
        t1.c cVar = this.f9630e;
        if (cVar != null) {
            cVar.getClass();
            try {
                ((e) cVar.f25351c).m();
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i10);
        arrayList.addAll(arrayList2);
        this.f9627b.clear();
        this.f9627b.addAll(arrayList2);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i10, i11);
        arrayList.addAll(arrayList2);
        this.f9627b.clear();
        this.f9627b.addAll(arrayList2);
    }

    public final void addView(View view) {
        b(view);
        super.addView(view);
    }

    public final void addView(View view, int i10) {
        b(view);
        super.addView(view, i10);
    }

    public final void addView(View view, int i10, int i11) {
        b(view);
        super.addView(view, i10, i11);
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
        super.addView(view, i10, layoutParams);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
        super.addView(view, layoutParams);
    }

    public final void b(View view) {
        if (!(view == this.f9632g || (this.f9630e != null && view == this.f9631f))) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    public final void c(b bVar) {
        this.f9630e = null;
        h hVar = this.f9632g;
        hVar.f28746a.setVisibility(8);
        hVar.f28747b.setVisibility(0);
        c.a aVar = this.f9635r;
        if (aVar != null) {
            aVar.a(this.f9633h, bVar);
            this.f9635r = null;
        }
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f9630e != null) {
            if (keyEvent.getAction() == 0) {
                t1.c cVar = this.f9630e;
                int keyCode = keyEvent.getKeyCode();
                cVar.getClass();
                try {
                    return ((e) cVar.f25351c).c4(keyCode, keyEvent) || super.dispatchKeyEvent(keyEvent);
                } catch (RemoteException e10) {
                    throw new j(e10);
                }
            } else if (keyEvent.getAction() == 1) {
                t1.c cVar2 = this.f9630e;
                int keyCode2 = keyEvent.getKeyCode();
                cVar2.getClass();
                try {
                    return ((e) cVar2.f25351c).h3(keyCode2, keyEvent) || super.dispatchKeyEvent(keyEvent);
                } catch (RemoteException e11) {
                    throw new j(e11);
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        t1.c cVar = this.f9630e;
        if (cVar != null) {
            cVar.getClass();
            try {
                ((e) cVar.f25351c).v1();
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
    }

    public final void f(boolean z10) {
        this.f9636s = true;
        t1.c cVar = this.f9630e;
        if (cVar != null) {
            cVar.getClass();
            try {
                ((e) cVar.f25351c).a(z10);
                ((z9.c) cVar.f25350b).a(z10);
                ((z9.c) cVar.f25350b).d();
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.f9627b.add(view);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f9626a);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t1.c cVar = this.f9630e;
        if (cVar != null) {
            cVar.getClass();
            try {
                ((e) cVar.f25351c).I2(configuration);
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f9626a);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void onMeasure(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i10, i11);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f9627b.add(view2);
    }

    public final void setClipToPadding(boolean z10) {
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
    }
}
