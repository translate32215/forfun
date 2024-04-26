package dev.pankaj.ytvclib.ui.main;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import ce.b;
import ce.d;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.a;
import com.google.android.youtube.player.c;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Stream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ud.k;
import z9.e;
import z9.j;

/* compiled from: YtActivity.kt */
public final class YtActivity extends a implements c.a {

    /* renamed from: e  reason: collision with root package name */
    public String f13465e = "YE7VzlLtp-4";

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r2 != 3) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.android.youtube.player.c.b r10, com.google.android.youtube.player.b r11) {
        /*
            r9 = this;
            if (r11 != 0) goto L_0x0004
            goto L_0x00d9
        L_0x0004:
            r10 = 123(0x7b, float:1.72E-43)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r9)
            int[] r1 = com.google.android.youtube.player.b.a.f9652a
            int r2 = r11.ordinal()
            r2 = r1[r2]
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == r6) goto L_0x0033
            if (r2 == r5) goto L_0x001e
            if (r2 == r4) goto L_0x0033
            goto L_0x005b
        L_0x001e:
            java.lang.String r2 = z9.p.a(r9)
            java.lang.String r7 = "package"
            android.net.Uri r2 = android.net.Uri.fromParts(r7, r2, r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r7 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r3.<init>(r7)
            r3.setData(r2)
            goto L_0x005b
        L_0x0033:
            java.lang.String r2 = z9.p.a(r9)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.VIEW"
            r3.<init>(r7)
            android.net.Uri r7 = z9.p.f28773a
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.String r8 = "id"
            android.net.Uri$Builder r2 = r7.appendQueryParameter(r8, r2)
            android.net.Uri r2 = r2.build()
            r3.setData(r2)
            java.lang.String r2 = "com.android.vending"
            r3.setPackage(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            r3.addFlags(r2)
        L_0x005b:
            com.google.android.youtube.player.b$b r2 = new com.google.android.youtube.player.b$b
            r2.<init>(r9, r3, r10)
            e8.xd r10 = new e8.xd
            r10.<init>(r9)
            int r3 = r11.ordinal()
            r1 = r1[r3]
            if (r1 == r6) goto L_0x00b7
            if (r1 == r5) goto L_0x00a4
            if (r1 == r4) goto L_0x0091
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected errorReason: "
            java.lang.String r11 = r11.name()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r1 = r11.length()
            if (r1 == 0) goto L_0x0088
            java.lang.String r11 = r0.concat(r11)
            goto L_0x008d
        L_0x0088:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
        L_0x008d:
            r10.<init>(r11)
            throw r10
        L_0x0091:
            e8.ab0<e8.pz> r11 = r10.f17478h
            java.lang.String r11 = (java.lang.String) r11
            android.app.AlertDialog$Builder r11 = r0.setTitle(r11)
            e8.ab0<com.google.android.gms.internal.ads.wd> r0 = r10.f17479i
            java.lang.String r0 = (java.lang.String) r0
            android.app.AlertDialog$Builder r11 = r11.setMessage(r0)
            java.lang.Object r10 = r10.f17480j
            goto L_0x00c9
        L_0x00a4:
            e8.ab0<e8.dz> r11 = r10.f17475e
            java.lang.String r11 = (java.lang.String) r11
            android.app.AlertDialog$Builder r11 = r0.setTitle(r11)
            e8.ab0<com.google.android.gms.internal.ads.ud> r0 = r10.f17476f
            java.lang.String r0 = (java.lang.String) r0
            android.app.AlertDialog$Builder r11 = r11.setMessage(r0)
            e8.ab0<e8.yz<e8.tf, com.google.android.gms.internal.ads.u8>> r10 = r10.f17477g
            goto L_0x00c9
        L_0x00b7:
            e8.ab0<java.lang.String> r11 = r10.f17472b
            java.lang.String r11 = (java.lang.String) r11
            android.app.AlertDialog$Builder r11 = r0.setTitle(r11)
            e8.ab0<e8.yz<e8.mf, e8.qf>> r0 = r10.f17473c
            java.lang.String r0 = (java.lang.String) r0
            android.app.AlertDialog$Builder r11 = r11.setMessage(r0)
            e8.ab0<e8.hz> r10 = r10.f17474d
        L_0x00c9:
            java.lang.String r10 = (java.lang.String) r10
            android.app.AlertDialog$Builder r10 = r11.setPositiveButton(r10, r2)
            android.app.AlertDialog r10 = r10.create()
            if (r10 != 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            r10.show()
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.ytvclib.ui.main.YtActivity.a(com.google.android.youtube.player.c$b, com.google.android.youtube.player.b):void");
    }

    public void b(c.b bVar, c cVar, boolean z10) {
        if (cVar != null) {
            try {
                ((e) ((t1.c) cVar).f25351c).H2(this.f13465e, 0);
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
        if (cVar != null) {
            try {
                ((e) ((t1.c) cVar).f25351c).a();
            } catch (RemoteException e11) {
                throw new j(e11);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(6);
        setContentView(R.layout.activity_yt);
        Stream stream = (Stream) getIntent().getParcelableExtra("stream");
        if (stream != null) {
            k.f("(?<=youtu.be/|watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*", "pattern");
            Pattern compile = Pattern.compile("(?<=youtu.be/|watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*");
            k.e(compile, "compile(pattern)");
            k.f(compile, "nativePattern");
            String url = stream.getUrl();
            k.f(url, "input");
            Matcher matcher = compile.matcher(url);
            k.e(matcher, "nativePattern.matcher(input)");
            d dVar = !matcher.find(0) ? null : new d(matcher, url);
            if (dVar != null) {
                String group = dVar.f4395a.group();
                k.e(group, "matchResult.group()");
                this.f13465e = group;
            }
        }
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);
        byte[] decode = Base64.decode(getString(R.string.yt_base64_key), 0);
        k.e(decode, "decode(getString(R.strin…e64_key), Base64.DEFAULT)");
        String str = new String(decode, b.f4384a);
        youTubePlayerView.getClass();
        u.b.c(str, "Developer key cannot be null or empty");
        youTubePlayerView.f9628c.b(youTubePlayerView, str, this);
    }
}
