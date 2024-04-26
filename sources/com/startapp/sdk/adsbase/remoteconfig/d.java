package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Bundle;
import com.startapp.i4;
import com.startapp.k3;
import com.startapp.o7;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;
import com.startapp.wb;

/* compiled from: Sta */
public class d extends b {
    public static final String LOG_TAG = "d";

    static {
        Class<d> cls = d.class;
    }

    public d(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        a aVar = new a(context, adPreferences, MetaDataRequest.RequestReason.PERIODIC, context, adPreferences);
        ComponentLocator a10 = ComponentLocator.a(context);
        a10.p().execute(new k3(aVar, a10));
    }

    public void run() {
        try {
            ComponentLocator.a(this.context).u().b();
            MetaData.c(this.context);
            if (MetaData.f12393k.V()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a(this, false);
            }
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    /* compiled from: Sta */
    public class a extends a {

        /* renamed from: l  reason: collision with root package name */
        public MetaData f12444l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Context f12445m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f12446n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason, Context context2, AdPreferences adPreferences2) {
            super(context, adPreferences, requestReason);
            this.f12445m = context2;
            this.f12446n = adPreferences2;
        }

        public Boolean a() {
            try {
                SimpleTokenUtils.e(this.f12445m);
                MetaDataRequest metaDataRequest = new MetaDataRequest(this.f12445m, ComponentLocator.a(this.f12445m).d(), MetaDataRequest.RequestReason.PERIODIC);
                metaDataRequest.a(this.f12445m, this.f12446n);
                o7.a a10 = a.a(this.f12445m, metaDataRequest);
                if (a10 != null) {
                    this.f12444l = (MetaData) wb.a(a10.f11522a, MetaData.class);
                }
                return Boolean.TRUE;
            } catch (Throwable th) {
                i4.a(th);
                return Boolean.FALSE;
            }
        }

        public void a(Boolean bool) {
            MetaData metaData;
            Context context;
            try {
                if (!(!bool.booleanValue() || (metaData = this.f12444l) == null || (context = this.f12445m) == null)) {
                    MetaData.a(context, metaData, MetaDataRequest.RequestReason.PERIODIC, this.f12440k);
                }
                d.this.callback.a(d.this, false);
            } catch (Throwable th) {
                i4.a(th);
            }
        }
    }
}
