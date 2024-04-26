package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import h6.b;
import h6.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v6.e0;

public final class SubtitleView extends FrameLayout implements k {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f5363a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    public h6.a f5364b = h6.a.f18914g;

    /* renamed from: c  reason: collision with root package name */
    public int f5365c = 0;

    /* renamed from: d  reason: collision with root package name */
    public float f5366d = 0.0533f;

    /* renamed from: e  reason: collision with root package name */
    public float f5367e = 0.08f;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5368f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5369g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f5370h;

    /* renamed from: i  reason: collision with root package name */
    public a f5371i;

    /* renamed from: r  reason: collision with root package name */
    public View f5372r;

    public interface a {
        void a(List<b> list, h6.a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(context, attributeSet);
        this.f5371i = aVar;
        this.f5372r = aVar;
        addView(aVar);
        this.f5370h = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f5368f && this.f5369g) {
            return this.f5363a;
        }
        ArrayList arrayList = new ArrayList(this.f5363a.size());
        for (int i10 = 0; i10 < this.f5363a.size(); i10++) {
            b bVar = this.f5363a.get(i10);
            CharSequence charSequence = bVar.f18922a;
            if (!this.f5368f) {
                b.C0156b a10 = bVar.a();
                a10.f18947j = -3.4028235E38f;
                a10.f18946i = Integer.MIN_VALUE;
                a10.f18950m = false;
                if (charSequence != null) {
                    a10.f18938a = charSequence.toString();
                }
                bVar = a10.a();
            } else if (!this.f5369g && charSequence != null) {
                b.C0156b a11 = bVar.a();
                a11.f18947j = -3.4028235E38f;
                a11.f18946i = Integer.MIN_VALUE;
                if (charSequence instanceof Spanned) {
                    SpannableString valueOf = SpannableString.valueOf(charSequence);
                    for (AbsoluteSizeSpan removeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                        valueOf.removeSpan(removeSpan);
                    }
                    for (RelativeSizeSpan removeSpan2 : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                        valueOf.removeSpan(removeSpan2);
                    }
                    a11.f18938a = valueOf;
                }
                bVar = a11.a();
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (e0.f26436a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private h6.a getUserCaptionStyle() {
        int i10 = e0.f26436a;
        if (i10 < 19 || isInEditMode()) {
            return h6.a.f18914g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return h6.a.f18914g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i10 < 21) {
            return new h6.a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return new h6.a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f5372r);
        View view = this.f5372r;
        if (view instanceof e) {
            ((e) view).f5446b.destroy();
        }
        this.f5372r = t10;
        this.f5371i = (a) t10;
        addView(t10);
    }

    public void a() {
        setStyle(getUserCaptionStyle());
    }

    public void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f5371i.a(getCuesWithStylingPreferencesApplied(), this.f5364b, this.f5366d, this.f5365c, this.f5367e);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f5369g = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f5368f = z10;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f5367e = f10;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f5363a = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f5365c = 0;
        this.f5366d = f10;
        c();
    }

    public void setStyle(h6.a aVar) {
        this.f5364b = aVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f5370h != i10) {
            if (i10 == 1) {
                setView(new a(getContext(), (AttributeSet) null));
            } else if (i10 == 2) {
                setView(new e(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f5370h = i10;
        }
    }

    public void t(List<b> list) {
        setCues(list);
    }
}
