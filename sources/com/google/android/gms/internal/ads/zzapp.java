package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import g7.c;
import g7.f;
import l0.e;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zzapp implements MediationInterstitialAdapter {

    /* renamed from: a  reason: collision with root package name */
    public Activity f8770a;

    /* renamed from: b  reason: collision with root package name */
    public f f8771b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f8772c;

    public final void onDestroy() {
        e.E("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        e.E("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        e.E("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, f fVar, Bundle bundle, c cVar, Bundle bundle2) {
        this.f8771b = fVar;
        if (fVar == null) {
            e.K("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            e.K("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((g) this.f8771b).p(this, 0);
        } else {
            if (!(p.c(context))) {
                e.K("Default browser does not support custom tabs. Bailing out.");
                ((g) this.f8771b).p(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                e.K("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                ((g) this.f8771b).p(this, 0);
                return;
            }
            this.f8770a = (Activity) context;
            this.f8772c = Uri.parse(string);
            ((g) this.f8771b).q(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showInterstitial() {
        /*
            r10 = this;
            p.d$a r0 = new p.d$a
            r1 = 0
            r0.<init>(r1)
            p.d r0 = r0.a()
            android.content.Intent r1 = r0.f23737a
            android.net.Uri r2 = r10.f8772c
            r1.setData(r2)
            e7.c r4 = new e7.c
            android.content.Intent r0 = r0.f23737a
            r4.<init>(r0)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            e8.y5 r6 = new e8.y5
            r6.<init>(r10)
            e8.f9 r8 = new e8.f9
            r1 = 0
            r8.<init>(r1, r1, r1)
            r5 = 0
            r7 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            e8.d40 r1 = com.google.android.gms.ads.internal.util.p.f5702i
            e7.i r2 = new e7.i
            r2.<init>((com.google.android.gms.internal.ads.zzapp) r10, (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) r0)
            r1.post(r2)
            d7.l r0 = d7.l.B
            com.google.android.gms.internal.ads.y6 r0 = r0.f13190g
            e8.v8 r0 = r0.f8589j
            r0.getClass()
            d7.l r1 = d7.l.B
            z7.b r1 = r1.f13193j
            long r1 = r1.b()
            java.lang.Object r3 = r0.f17031a
            monitor-enter(r3)
            int r4 = r0.f17032b     // Catch:{ all -> 0x0088 }
            r5 = 3
            if (r4 != r5) goto L_0x0068
            long r6 = r0.f17033c     // Catch:{ all -> 0x0088 }
            e8.l<java.lang.Long> r4 = e8.t.f16618m3     // Catch:{ all -> 0x0088 }
            e8.ti0 r8 = e8.ti0.f16763j     // Catch:{ all -> 0x0088 }
            com.google.android.gms.internal.ads.e r8 = r8.f16769f     // Catch:{ all -> 0x0088 }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ all -> 0x0088 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0088 }
            long r8 = r4.longValue()     // Catch:{ all -> 0x0088 }
            long r6 = r6 + r8
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x0068
            r1 = 1
            r0.f17032b = r1     // Catch:{ all -> 0x0088 }
        L_0x0068:
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            d7.l r1 = d7.l.B
            z7.b r1 = r1.f13193j
            long r1 = r1.b()
            java.lang.Object r4 = r0.f17031a
            monitor-enter(r4)
            int r3 = r0.f17032b     // Catch:{ all -> 0x0085 }
            r6 = 2
            if (r3 == r6) goto L_0x007b
            monitor-exit(r4)     // Catch:{ all -> 0x0085 }
            goto L_0x0084
        L_0x007b:
            r0.f17032b = r5     // Catch:{ all -> 0x0085 }
            int r3 = r0.f17032b     // Catch:{ all -> 0x0085 }
            if (r3 != r5) goto L_0x0083
            r0.f17033c = r1     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r4)     // Catch:{ all -> 0x0085 }
        L_0x0084:
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0085 }
            throw r0
        L_0x0088:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0088 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapp.showInterstitial():void");
    }
}
