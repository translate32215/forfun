package com.startapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public final class e2 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10317a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10318b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f10319c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10320d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10321e = true;

    public e2(Context context, e eVar) {
        this.f10317a = context;
        this.f10318b = eVar;
    }

    public void a(Integer num, Long l10, Boolean bool, boolean z10, boolean z11) {
        if (d()) {
            long j10 = this.f10318b.getLong("consentTimestamp", 0);
            int i10 = this.f10318b.getInt("consentType", -1);
            boolean contains = this.f10318b.contains("consentApc");
            boolean z12 = true;
            boolean z13 = (num == null || i10 == num.intValue()) ? false : true;
            boolean z14 = bool != null && (!contains || this.f10318b.getBoolean("consentApc", false) != bool.booleanValue());
            if (l10 == null || l10.longValue() <= j10) {
                z12 = false;
            }
            if (!z10 && !z12) {
                return;
            }
            if (z13 || z14) {
                e.a a10 = this.f10318b.edit();
                if (z13) {
                    int intValue = num.intValue();
                    a10.a("consentType", Integer.valueOf(intValue));
                    a10.f12335a.putInt("consentType", intValue);
                }
                if (z14) {
                    boolean booleanValue = bool.booleanValue();
                    a10.a("consentApc", Boolean.valueOf(booleanValue));
                    a10.f12335a.putBoolean("consentApc", booleanValue);
                }
                if (z12) {
                    long longValue = l10.longValue();
                    a10.a("consentTimestamp", Long.valueOf(longValue));
                    a10.f12335a.putLong("consentTimestamp", longValue);
                }
                a10.apply();
                if (z11) {
                    MetaData.f12393k.a(this.f10317a, new AdPreferences(), MetaDataRequest.RequestReason.CONSENT, false, (c) null, true);
                }
            }
        }
    }

    public Integer b() {
        if (d()) {
            int hashCode = ComponentLocator.a(this.f10317a).a().a().f12591a.hashCode();
            if (!this.f10318b.contains("advIdHash") || this.f10318b.getInt("advIdHash", 0) != hashCode) {
                e.a a10 = this.f10318b.edit().remove("consentType").remove("consentTimestamp");
                a10.a("advIdHash", Integer.valueOf(hashCode));
                a10.f12335a.putInt("advIdHash", hashCode);
                a10.apply();
            }
        }
        if (!d() || !this.f10318b.contains("consentType")) {
            return null;
        }
        return Integer.valueOf(this.f10318b.getInt("consentType", -1));
    }

    public boolean c() {
        Boolean a10 = a();
        return a10 != null && a10.booleanValue();
    }

    public final boolean d() {
        ConsentConfig m10 = MetaData.f12393k.m();
        return this.f10321e && m10 != null && m10.k();
    }

    public Boolean a() {
        if (!d() || !this.f10318b.contains("consentApc")) {
            return null;
        }
        return Boolean.valueOf(this.f10318b.getBoolean("consentApc", false));
    }

    public final void a(boolean z10, String str, String str2, String str3) {
        ConsentConfig m10;
        String str4;
        int i10;
        int i11;
        Integer b10;
        if ((!z10 && !StartAppSDKInternal.c()) || (m10 = MetaData.f12393k.m()) == null) {
            return;
        }
        if ((!d() && !z10) || this.f10320d || !wb.g(this.f10317a) || !wb.e(this.f10317a)) {
            return;
        }
        if (z10 || !(m10.h() == null || m10.g() == null || this.f10318b.contains("consentApc"))) {
            if (z10) {
                str4 = AdInformationMetaData.f12183a.a().c();
            } else {
                str4 = m10.f();
            }
            if (str4 != null) {
                Intent intent = new Intent(this.f10317a, ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(str4));
                intent.putExtra("allowCT", m10.k());
                intent.putExtra("timestamp", m10.i());
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = m10.h().intValue();
                }
                Integer valueOf = Integer.valueOf(i10);
                if (valueOf != null) {
                    intent.putExtra("templateName", valueOf);
                }
                if (z10) {
                    i11 = 7;
                } else {
                    i11 = m10.g().intValue();
                }
                Integer valueOf2 = Integer.valueOf(i11);
                if (valueOf2 != null) {
                    intent.putExtra("templateId", valueOf2);
                }
                if (!z10) {
                    str = m10.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z10) {
                    str2 = m10.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z10) {
                    str3 = m10.a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z10) {
                    intent.putExtra("advertisingId", ComponentLocator.a(this.f10317a).a().a().f12591a);
                    if (this.f10318b.contains("consentType")) {
                        intent.putExtra("consentType", this.f10318b.getInt("consentType", -1));
                    }
                }
                ConsentTypeInfoConfig c10 = m10.c();
                if (c10 != null) {
                    if (c10.b() != null) {
                        intent.putExtra("impression", c10.b());
                    }
                    if (c10.a() != null) {
                        intent.putExtra("falseClick", c10.a());
                    }
                    if (c10.c() != null) {
                        intent.putExtra("trueClick", c10.c());
                    }
                }
                if (z10 && (b10 = AdInformationMetaData.f12183a.a().b()) != null) {
                    intent.putExtra("trueClick", b10);
                }
                try {
                    this.f10317a.startActivity(intent);
                    this.f10320d = true;
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
        }
    }

    public void a(MetaDataRequest.RequestReason requestReason) {
        MetaData.f12393k.a((c) this);
    }

    public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
        MetaData.f12393k.a((c) this);
        ConsentConfig m10 = MetaData.f12393k.m();
        if (m10 != null && d()) {
            Integer b10 = m10.b();
            if (b10 != null) {
                a(b10, Long.valueOf(m10.i()), (Boolean) null, false, false);
            }
            if (requestReason == MetaDataRequest.RequestReason.CONSENT) {
                e.a a10 = this.f10318b.edit();
                long i10 = m10.i();
                a10.a("consentTimestamp", Long.valueOf(i10));
                a10.f12335a.putLong("consentTimestamp", i10);
                a10.apply();
            } else if (requestReason == MetaDataRequest.RequestReason.LAUNCH) {
                a(false, (String) null, (String) null, (String) null);
            }
        }
    }
}
