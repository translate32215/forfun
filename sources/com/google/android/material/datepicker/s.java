package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker */
public final class s<S> extends y<S> {

    /* renamed from: o0  reason: collision with root package name */
    public int f9198o0;

    /* renamed from: p0  reason: collision with root package name */
    public d<S> f9199p0;

    /* renamed from: q0  reason: collision with root package name */
    public a f9200q0;

    /* compiled from: MaterialTextInputPicker */
    public class a extends x<S> {
        public a() {
        }

        public void a(S s10) {
            Iterator it = s.this.f9223n0.iterator();
            while (it.hasNext()) {
                ((x) it.next()).a(s10);
            }
        }
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        if (bundle == null) {
            bundle = this.f1796g;
        }
        this.f9198o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9199p0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9200q0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f9199p0.L(layoutInflater.cloneInContext(new ContextThemeWrapper(q(), this.f9198o0)), viewGroup, bundle, this.f9200q0, new a());
    }

    public void a0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f9198o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9199p0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9200q0);
    }
}
