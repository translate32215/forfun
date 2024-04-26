package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import e8.by;
import e8.t;
import e8.ti0;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class td implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8179a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8180b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8181c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8182d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8183e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8184f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8185g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<String> f8186h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8187i;

    /* renamed from: j  reason: collision with root package name */
    public final String f8188j;

    /* renamed from: k  reason: collision with root package name */
    public final String f8189k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8190l;

    /* renamed from: m  reason: collision with root package name */
    public final String f8191m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8192n;

    public td(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z15, String str6, long j10) {
        this.f8179a = z10;
        this.f8180b = z11;
        this.f8181c = str;
        this.f8182d = z12;
        this.f8183e = z13;
        this.f8184f = z14;
        this.f8185g = str2;
        this.f8186h = arrayList;
        this.f8187i = str3;
        this.f8188j = str4;
        this.f8189k = str5;
        this.f8190l = z15;
        this.f8191m = str6;
        this.f8192n = j10;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f8179a);
        bundle.putBoolean("coh", this.f8180b);
        bundle.putString("gl", this.f8181c);
        bundle.putBoolean("simulator", this.f8182d);
        bundle.putBoolean("is_latchsky", this.f8183e);
        bundle.putBoolean("is_sidewinder", this.f8184f);
        bundle.putString("hl", this.f8185g);
        if (!this.f8186h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f8186h);
        }
        bundle.putString("mv", this.f8187i);
        bundle.putString("submodel", this.f8191m);
        Bundle bundle2 = bundle.getBundle("device");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle.putBundle("device", bundle2);
        bundle2.putString("build", this.f8189k);
        if (((Boolean) ti0.f16763j.f16769f.a(t.E1)).booleanValue()) {
            bundle2.putLong("remaining_data_partition_space", this.f8192n);
        }
        Bundle bundle3 = bundle2.getBundle("browser");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundle2.putBundle("browser", bundle3);
        bundle3.putBoolean("is_browser_custom_tabs_capable", this.f8190l);
        if (!TextUtils.isEmpty(this.f8188j)) {
            Bundle bundle4 = bundle2.getBundle("play_store");
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            bundle2.putBundle("play_store", bundle4);
            bundle4.putString("package_version", this.f8188j);
        }
    }
}
