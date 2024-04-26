package x4;

import android.content.Context;
import p5.m;
import p5.n;

/* compiled from: DefaultRenderersFactory */
public class l implements y0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27642a;

    /* renamed from: b  reason: collision with root package name */
    public int f27643b = 0;

    /* renamed from: c  reason: collision with root package name */
    public n f27644c;

    public l(Context context) {
        this.f27642a = context;
        int i10 = n.f23922a;
        this.f27644c = m.f23921b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0196, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019e, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d8, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007d A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0196 A[ExcHandler: Exception (r0v5 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:48:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d0 A[ExcHandler: Exception (r0v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:61:0x01a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x4.v0[] a(android.os.Handler r19, w6.s r20, z4.k r21, h6.k r22, q5.f r23) {
        /*
            r18 = this;
            r1 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r3 = r1.f27642a
            int r11 = r1.f27643b
            p5.n r4 = r1.f27644c
            java.lang.Class<w6.s> r12 = w6.s.class
            w6.h r13 = new w6.h
            r5 = 5000(0x1388, double:2.4703E-320)
            r7 = 0
            r10 = 50
            r2 = r13
            r8 = r19
            r9 = r20
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            r9 = 0
            r13.M0 = r9
            r13.N0 = r9
            r13.O0 = r9
            r0.add(r13)
            r10 = 1
            r13 = 3
            r14 = 2
            java.lang.String r15 = "DefaultRenderersFactory"
            if (r11 != 0) goto L_0x0031
            goto L_0x00cc
        L_0x0031:
            int r2 = r0.size()
            if (r11 != r14) goto L_0x0039
            int r2 = r2 + -1
        L_0x0039:
            r3 = 50
            r4 = 4
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r7 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r9] = r11     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Class<android.os.Handler> r11 = android.os.Handler.class
            r8[r10] = r11     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r14] = r12     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r13] = r11     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r9] = r11     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r10] = r19     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r14] = r20     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            r8[r13] = r11     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            java.lang.Object r7 = r7.newInstance(r8)     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            x4.v0 r7 = (x4.v0) r7     // Catch:{ ClassNotFoundException -> 0x0086, Exception -> 0x007d }
            int r8 = r2 + 1
            r0.add(r2, r7)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x007d }
            java.lang.String r2 = "Loaded LibvpxVideoRenderer."
            android.util.Log.i(r15, r2)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x007d }
            goto L_0x0087
        L_0x007b:
            r2 = r8
            goto L_0x0086
        L_0x007d:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating VP9 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0086:
            r8 = r2
        L_0x0087:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r7[r9] = r11     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Class<android.os.Handler> r11 = android.os.Handler.class
            r7[r10] = r11     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r7[r14] = r12     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r7[r13] = r11     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r4[r9] = r5     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r4[r10] = r19     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r4[r14] = r20     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r4[r13] = r3     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            x4.v0 r2 = (x4.v0) r2     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            r0.add(r8, r2)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            java.lang.String r2 = "Loaded Libgav1VideoRenderer."
            android.util.Log.i(r15, r2)     // Catch:{ ClassNotFoundException -> 0x00cb, Exception -> 0x00c2 }
            goto L_0x00cc
        L_0x00c2:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating AV1 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00cb:
        L_0x00cc:
            android.content.Context r2 = r1.f27642a
            r6 = 0
            r7 = 0
            r8 = 0
            z4.r r11 = new z4.r
            z4.e r3 = z4.e.f28343c
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.media.action.HDMI_AUDIO_PLUG"
            r3.<init>(r4)
            r4 = 0
            android.content.Intent r3 = r2.registerReceiver(r4, r3)
            int r4 = v6.e0.f26436a
            r5 = 17
            if (r4 < r5) goto L_0x00fb
            java.lang.String r4 = v6.e0.f26438c
            java.lang.String r5 = "Amazon"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x00f9
            java.lang.String r5 = "Xiaomi"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00fb
        L_0x00f9:
            r4 = 1
            goto L_0x00fc
        L_0x00fb:
            r4 = 0
        L_0x00fc:
            if (r4 == 0) goto L_0x010d
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "external_surround_sound_enabled"
            int r2 = android.provider.Settings.Global.getInt(r2, r4, r9)
            if (r2 != r10) goto L_0x010d
            z4.e r2 = z4.e.f28344d
            goto L_0x012e
        L_0x010d:
            if (r3 == 0) goto L_0x012c
            java.lang.String r2 = "android.media.extra.AUDIO_PLUG_STATE"
            int r2 = r3.getIntExtra(r2, r9)
            if (r2 != 0) goto L_0x0118
            goto L_0x012c
        L_0x0118:
            z4.e r2 = new z4.e
            java.lang.String r4 = "android.media.extra.ENCODINGS"
            int[] r4 = r3.getIntArrayExtra(r4)
            r5 = 8
            java.lang.String r12 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r3 = r3.getIntExtra(r12, r5)
            r2.<init>(r4, r3)
            goto L_0x012e
        L_0x012c:
            z4.e r2 = z4.e.f28343c
        L_0x012e:
            r4 = r2
            z4.r$d r5 = new z4.r$d
            z4.g[] r2 = new z4.g[r9]
            r5.<init>(r2)
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            android.content.Context r3 = r1.f27642a
            int r12 = r1.f27643b
            p5.n r4 = r1.f27644c
            r5 = 0
            java.lang.Class<z4.l> r16 = z4.l.class
            java.lang.Class<z4.k> r17 = z4.k.class
            z4.v r8 = new z4.v
            r2 = r8
            r6 = r19
            r7 = r21
            r10 = r8
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.M0 = r9
            r10.N0 = r9
            r10.O0 = r9
            r0.add(r10)
            if (r12 != 0) goto L_0x015e
            goto L_0x020f
        L_0x015e:
            int r2 = r0.size()
            if (r12 != r14) goto L_0x0166
            int r2 = r2 + -1
        L_0x0166:
            java.lang.String r3 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            java.lang.Class[] r4 = new java.lang.Class[r13]     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            r4[r9] = r5     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            r5 = 1
            r4[r5] = r17     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            r4[r14] = r16     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            r4[r9] = r19     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            r4[r5] = r21     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            r4[r14] = r11     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            x4.v0 r3 = (x4.v0) r3     // Catch:{ ClassNotFoundException -> 0x019f, Exception -> 0x0196 }
            int r4 = r2 + 1
            r0.add(r2, r3)     // Catch:{ ClassNotFoundException -> 0x0194, Exception -> 0x0196 }
            java.lang.String r2 = "Loaded LibopusAudioRenderer."
            android.util.Log.i(r15, r2)     // Catch:{ ClassNotFoundException -> 0x0194, Exception -> 0x0196 }
            goto L_0x01a0
        L_0x0194:
            r2 = r4
            goto L_0x019f
        L_0x0196:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating Opus extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x019f:
            r4 = r2
        L_0x01a0:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            java.lang.Class[] r3 = new java.lang.Class[r13]     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            r3[r9] = r5     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            r5 = 1
            r3[r5] = r17     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            r3[r14] = r16     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            r3[r9] = r19     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            r3[r5] = r21     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            r3[r14] = r11     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            x4.v0 r2 = (x4.v0) r2     // Catch:{ ClassNotFoundException -> 0x01d9, Exception -> 0x01d0 }
            int r3 = r4 + 1
            r0.add(r4, r2)     // Catch:{ ClassNotFoundException -> 0x01ce, Exception -> 0x01d0 }
            java.lang.String r2 = "Loaded LibflacAudioRenderer."
            android.util.Log.i(r15, r2)     // Catch:{ ClassNotFoundException -> 0x01ce, Exception -> 0x01d0 }
            goto L_0x01da
        L_0x01ce:
            r4 = r3
            goto L_0x01d9
        L_0x01d0:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FLAC extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x01d9:
            r3 = r4
        L_0x01da:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            java.lang.Class[] r4 = new java.lang.Class[r13]     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            java.lang.Class<android.os.Handler> r5 = android.os.Handler.class
            r4[r9] = r5     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            r5 = 1
            r4[r5] = r17     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            r4[r14] = r16     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            r4[r9] = r19     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            r4[r5] = r21     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            r4[r14] = r11     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            x4.v0 r2 = (x4.v0) r2     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            r0.add(r3, r2)     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            java.lang.String r2 = "Loaded FfmpegAudioRenderer."
            android.util.Log.i(r15, r2)     // Catch:{ ClassNotFoundException -> 0x020f, Exception -> 0x0206 }
            goto L_0x020f
        L_0x0206:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FFmpeg extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x020f:
            android.os.Looper r2 = r19.getLooper()
            h6.l r3 = new h6.l
            r4 = r22
            r3.<init>(r4, r2)
            r0.add(r3)
            android.os.Looper r2 = r19.getLooper()
            q5.g r3 = new q5.g
            r4 = r23
            r3.<init>(r4, r2)
            r0.add(r3)
            x6.b r2 = new x6.b
            r2.<init>()
            r0.add(r2)
            x4.v0[] r2 = new x4.v0[r9]
            java.lang.Object[] r0 = r0.toArray(r2)
            x4.v0[] r0 = (x4.v0[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l.a(android.os.Handler, w6.s, z4.k, h6.k, q5.f):x4.v0[]");
    }
}
