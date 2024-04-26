package e8;

import android.content.Context;
import android.content.res.Resources;
import androidx.activity.k;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.wd;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xd {

    /* renamed from: a  reason: collision with root package name */
    public ab0<Context> f17471a;

    /* renamed from: b  reason: collision with root package name */
    public ab0<String> f17472b;

    /* renamed from: c  reason: collision with root package name */
    public ab0<yz<mf, qf>> f17473c;

    /* renamed from: d  reason: collision with root package name */
    public ab0<hz> f17474d;

    /* renamed from: e  reason: collision with root package name */
    public ab0<dz> f17475e;

    /* renamed from: f  reason: collision with root package name */
    public ab0<ud> f17476f;

    /* renamed from: g  reason: collision with root package name */
    public ab0<yz<tf, u8>> f17477g;

    /* renamed from: h  reason: collision with root package name */
    public ab0<pz> f17478h;

    /* renamed from: i  reason: collision with root package name */
    public ab0<wd> f17479i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f17480j;

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.String, e8.ab0<android.content.Context>] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.String, e8.ab0<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.String, e8.ab0<e8.yz<e8.mf, e8.qf>>] */
    /* JADX WARNING: type inference failed for: r1v12, types: [e8.ab0<e8.hz>, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.String, e8.ab0<e8.dz>] */
    /* JADX WARNING: type inference failed for: r1v16, types: [e8.ab0<com.google.android.gms.internal.ads.ud>, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v18, types: [e8.ab0<e8.yz<e8.tf, com.google.android.gms.internal.ads.u8>>, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v20, types: [e8.ab0<e8.pz>, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v22, types: [java.lang.String, e8.ab0<com.google.android.gms.internal.ads.wd>] */
    public xd(Context context) {
        Resources resources = context.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        HashMap hashMap = new HashMap();
        hashMap.put("error_initializing_player", "An error occurred while initializing the YouTube player.");
        hashMap.put("get_youtube_app_title", "Get YouTube App");
        hashMap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
        hashMap.put("get_youtube_app_action", "Get YouTube App");
        hashMap.put("enable_youtube_app_title", "Enable YouTube App");
        hashMap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
        hashMap.put("enable_youtube_app_action", "Enable YouTube App");
        hashMap.put("update_youtube_app_title", "Update YouTube App");
        hashMap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
        hashMap.put("update_youtube_app_action", "Update YouTube App");
        k.a(hashMap, locale.getLanguage());
        String valueOf = String.valueOf(locale.getLanguage());
        String valueOf2 = String.valueOf(locale.getCountry());
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb2.append(valueOf);
        sb2.append("_");
        sb2.append(valueOf2);
        k.a(hashMap, sb2.toString());
        this.f17471a = (String) hashMap.get("error_initializing_player");
        this.f17472b = (String) hashMap.get("get_youtube_app_title");
        this.f17473c = (String) hashMap.get("get_youtube_app_text");
        this.f17474d = (String) hashMap.get("get_youtube_app_action");
        this.f17475e = (String) hashMap.get("enable_youtube_app_title");
        this.f17476f = (String) hashMap.get("enable_youtube_app_text");
        this.f17477g = (String) hashMap.get("enable_youtube_app_action");
        this.f17478h = (String) hashMap.get("update_youtube_app_title");
        this.f17479i = (String) hashMap.get("update_youtube_app_text");
        this.f17480j = (String) hashMap.get("update_youtube_app_action");
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [e8.ua0] */
    /* JADX WARNING: type inference failed for: r3v8, types: [e8.ua0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xd(e8.nd r19, android.content.Context r20, java.lang.String r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r0.f17480j = r1
            r18.<init>()
            e8.ta0 r2 = e8.wa0.a(r20)
            r0.f17471a = r2
            e8.ta0 r2 = e8.wa0.a(r21)
            r0.f17472b = r2
            e8.ab0<android.content.Context> r2 = r0.f17471a
            e8.ab0 r2 = (e8.ab0) r2
            e8.ab0<e8.i10> r3 = r1.f15631l0
            e8.ab0<e8.w10> r4 = r1.f15633m0
            e8.qq r5 = new e8.qq
            r6 = 15
            r5.<init>(r2, r3, r4, r6)
            r0.f17473c = r5
            e8.je r2 = new e8.je
            r4 = 28
            r2.<init>(r3, r4)
            java.lang.Object r3 = e8.ua0.f16865c
            boolean r3 = r2 instanceof e8.ua0
            if (r3 == 0) goto L_0x0035
            r9 = r2
            goto L_0x003b
        L_0x0035:
            e8.ua0 r3 = new e8.ua0
            r3.<init>(r2)
            r9 = r3
        L_0x003b:
            r0.f17474d = r9
            e8.ab0<android.content.Context> r2 = r0.f17471a
            r5 = r2
            e8.ab0 r5 = (e8.ab0) r5
            e8.ab0<java.util.concurrent.Executor> r6 = r1.f15636o
            e8.ab0<com.google.android.gms.internal.ads.b8> r7 = r1.H
            e8.ab0<e8.yz<e8.mf, e8.qf>> r2 = r0.f17473c
            r8 = r2
            e8.ab0 r8 = (e8.ab0) r8
            e8.a10 r16 = e8.z00.f17679a
            e8.kq r2 = new e8.kq
            r11 = 8
            r4 = r2
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = r2 instanceof e8.ua0
            if (r3 == 0) goto L_0x005d
            r8 = r2
            goto L_0x0063
        L_0x005d:
            e8.ua0 r3 = new e8.ua0
            r3.<init>(r2)
            r8 = r3
        L_0x0063:
            r0.f17475e = r8
            e8.ab0<com.google.android.gms.internal.ads.b8> r5 = r1.H
            e8.ab0<android.content.Context> r2 = r0.f17471a
            r6 = r2
            e8.ab0 r6 = (e8.ab0) r6
            e8.ab0<java.lang.String> r2 = r0.f17472b
            r7 = r2
            e8.ab0 r7 = (e8.ab0) r7
            e8.ab0<e8.hz> r2 = r0.f17474d
            r9 = r2
            e8.ab0 r9 = (e8.ab0) r9
            e8.ab0<e8.f9> r10 = r1.f15622h
            e8.kq r2 = new e8.kq
            r11 = 9
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = r2 instanceof e8.ua0
            if (r3 == 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            e8.ua0 r3 = new e8.ua0
            r3.<init>(r2)
            r2 = r3
        L_0x008b:
            r0.f17476f = r2
            e8.ab0<android.content.Context> r2 = r0.f17471a
            r11 = r2
            e8.ab0 r11 = (e8.ab0) r11
            e8.ab0<e8.i10> r2 = r1.f15631l0
            e8.ab0<e8.w10> r3 = r1.f15633m0
            e8.qq r14 = new e8.qq
            r4 = 16
            r14.<init>(r11, r2, r3, r4)
            r0.f17477g = r14
            e8.ab0<java.util.concurrent.Executor> r12 = r1.f15636o
            e8.ab0<com.google.android.gms.internal.ads.b8> r13 = r1.H
            e8.ab0<e8.hz> r2 = r0.f17474d
            r15 = r2
            e8.ab0 r15 = (e8.ab0) r15
            e8.kq r2 = new e8.kq
            r17 = 10
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = r2 instanceof e8.ua0
            if (r3 == 0) goto L_0x00b6
            r8 = r2
            goto L_0x00bc
        L_0x00b6:
            e8.ua0 r3 = new e8.ua0
            r3.<init>(r2)
            r8 = r3
        L_0x00bc:
            r0.f17478h = r8
            e8.ab0<com.google.android.gms.internal.ads.b8> r5 = r1.H
            e8.ab0<android.content.Context> r1 = r0.f17471a
            r6 = r1
            e8.ab0 r6 = (e8.ab0) r6
            e8.ab0<java.lang.String> r1 = r0.f17472b
            r7 = r1
            e8.ab0 r7 = (e8.ab0) r7
            e8.ab0<e8.hz> r1 = r0.f17474d
            r9 = r1
            e8.ab0 r9 = (e8.ab0) r9
            e8.df r1 = new e8.df
            r10 = 9
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            boolean r2 = r1 instanceof e8.ua0
            if (r2 == 0) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            e8.ua0 r2 = new e8.ua0
            r2.<init>(r1)
            r1 = r2
        L_0x00e2:
            r0.f17479i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.xd.<init>(e8.nd, android.content.Context, java.lang.String):void");
    }
}
