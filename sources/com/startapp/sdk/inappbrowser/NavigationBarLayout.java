package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.f7;
import com.startapp.qb;
import java.util.Map;

/* compiled from: Sta */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final int f12538j = Color.rgb(78, 86, 101);

    /* renamed from: k  reason: collision with root package name */
    public static final int f12539k = Color.rgb(148, 155, 166);

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f12540a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f12541b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f12542c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f12543d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f12544e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f12545f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f12546g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f12547h = Boolean.FALSE;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, f7> f12548i;

    public NavigationBarLayout(Context context) {
        super(context);
    }

    public void a(WebView webView) {
        if (this.f12547h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f12544e.setImageBitmap(this.f12548i.get("BACK_DARK").f10378a);
                this.f12544e.setEnabled(true);
            } else {
                this.f12544e.setImageBitmap(this.f12548i.get("BACK").f10378a);
                this.f12544e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f12542c.setImageBitmap(this.f12548i.get("FORWARD_DARK").f10378a);
                this.f12542c.setEnabled(true);
            } else {
                this.f12542c.setImageBitmap(this.f12548i.get("FORWARD").f10378a);
                this.f12542c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f12545f.setText(webView.getTitle());
            }
        } else if (webView.canGoBack()) {
            this.f12544e.setImageBitmap(this.f12548i.get("BACK_DARK").f10378a);
            addView(this.f12544e, qb.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            ImageView imageView = this.f12542c;
            RelativeLayout.LayoutParams a10 = qb.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a10.addRule(1, 2105);
            addView(imageView, a10);
            removeView(this.f12540a);
            this.f12540a.removeView(this.f12546g);
            this.f12540a.removeView(this.f12545f);
            this.f12540a.addView(this.f12545f, qb.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f12540a;
            TextView textView = this.f12546g;
            RelativeLayout.LayoutParams a11 = qb.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a11.addRule(3, 2102);
            relativeLayout.addView(textView, a11);
            RelativeLayout.LayoutParams a12 = qb.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a12.addRule(1, 2106);
            a12.addRule(0, 2104);
            addView(this.f12540a, a12);
            this.f12547h = Boolean.TRUE;
        }
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f12541b.setOnClickListener(onClickListener);
        this.f12544e.setOnClickListener(onClickListener);
        this.f12542c.setOnClickListener(onClickListener);
        this.f12543d.setOnClickListener(onClickListener);
    }

    public void a() {
        this.f12548i = null;
    }
}
