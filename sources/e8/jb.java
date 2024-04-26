package e8;

import com.google.android.gms.internal.ads.q7;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jb extends q7 {

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f15118f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g  reason: collision with root package name */
    public static final DecimalFormat f15119g = new DecimalFormat("#,###");

    /* renamed from: d  reason: collision with root package name */
    public File f15120d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15121e;

    public jb(ia iaVar) {
        super(iaVar);
        File cacheDir = this.f7919a.getCacheDir();
        if (cacheDir == null) {
            e.K("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f15120d = file;
        if (!file.isDirectory() && !this.f15120d.mkdirs()) {
            String valueOf = String.valueOf(this.f15120d.getAbsolutePath());
            e.K(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f15120d = null;
        } else if (!this.f15120d.setReadable(true, false) || !this.f15120d.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.f15120d.getAbsolutePath());
            e.K(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f15120d = null;
        }
    }

    public final void h() {
        this.f15121e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e7, code lost:
        if (r3 < 400) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e9, code lost:
        r11 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f9, code lost:
        if (r2.length() == 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fb, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0201, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r33).length() + 32);
        r5.append("HTTP status code ");
        r5.append(r3);
        r5.append(" at ");
        r5.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022e, code lost:
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x022f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r14 = r13.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0239, code lost:
        if (r14 >= 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r3 = java.lang.String.valueOf(r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0245, code lost:
        if (r3.length() == 0) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0247, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024c, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0252, code lost:
        l0.e.K(r0);
        l(r8, r9.getAbsolutePath(), "contentLengthMissing", (java.lang.String) null);
        f15118f.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0263, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r3 = f15119g.format((long) r14);
        r15 = ((java.lang.Integer) e8.ti0.a().a(e8.t.f16614m)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027b, code lost:
        if (r14 <= r15) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r3).length() + 33) + java.lang.String.valueOf(r33).length());
        r4.append("Content length ");
        r4.append(r3);
        r4.append(" exceeds limit at ");
        r4.append(r8);
        l0.e.K(r4.toString());
        r3 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b6, code lost:
        if (r3.length() == 0) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02b8, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02bd, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c3, code lost:
        l(r8, r9.getAbsolutePath(), "sizeExceeded", r0);
        f15118f.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d2, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r3).length() + 20) + java.lang.String.valueOf(r33).length());
        r2.append("Caching ");
        r2.append(r3);
        r2.append(" bytes from ");
        r2.append(r8);
        l0.e.E(r2.toString());
        r12 = java.nio.channels.Channels.newChannel(r13.getInputStream());
        r13 = new java.io.FileOutputStream(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r6 = r13.getChannel();
        r5 = java.nio.ByteBuffer.allocate(1048576);
        r16 = d7.l.b();
        r17 = r16.b();
        r19 = ((java.lang.Long) e8.ti0.a().a(e8.t.f16632p)).longValue();
        r1 = Long.MIN_VALUE;
        r21 = new java.lang.Object();
        r22 = ((java.lang.Long) e8.ti0.a().a(e8.t.f16626o)).longValue();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x034a, code lost:
        r4 = r12.read(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034e, code lost:
        if (r4 < 0) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0350, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0351, code lost:
        if (r4 <= r15) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0353, code lost:
        r11 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0363, code lost:
        if (r1.length() == 0) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0365, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036b, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0377, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0378, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r5.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x038b, code lost:
        if (r6.write(r5) > 0) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038d, code lost:
        r5.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x039c, code lost:
        if ((r16.b() - r17) > (1000 * r22)) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a0, code lost:
        if (r7.f15121e != false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a2, code lost:
        monitor-enter(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r24 = d7.l.B.f13193j.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03af, code lost:
        if ((r1 + r19) <= r24) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b1, code lost:
        monitor-exit(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b2, code lost:
        r3 = false;
        r24 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b6, code lost:
        monitor-exit(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03b7, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b8, code lost:
        if (r3 == false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r26 = r9.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c2, code lost:
        r1 = r1;
        r27 = r11;
        r11 = r1;
        r2 = r32;
        r28 = r12;
        r12 = e8.y8.f17578b;
        r29 = r4;
        r4 = r26;
        r26 = r5;
        r30 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r1 = new e8.cb(r2, r33, r4, r29, r14);
        r12.post(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e0, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e6, code lost:
        r29 = r4;
        r26 = r5;
        r30 = r6;
        r27 = r11;
        r28 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f0, code lost:
        r1 = r24;
        r5 = r26;
        r11 = r27;
        r12 = r28;
        r3 = r29;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03fe, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ff, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0403, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0405, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0410, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0411, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0414, code lost:
        r11 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0417, code lost:
        r27 = r11;
        r11 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        r0 = java.lang.Long.toString(r22);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r1 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0446, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0447, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0451, code lost:
        if (l0.e.h(3) == false) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0453, code lost:
        r1 = f15119g.format((long) r3);
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r33).length());
        r4.append("Preloaded ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r8);
        l0.e.E(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0489, code lost:
        r9.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0492, code lost:
        if (r0.isFile() == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0494, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        k(r8, r9.getAbsolutePath(), r3);
        f15118f.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ab, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04ad, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04af, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04b0, code lost:
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04b2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04b3, code lost:
        r2 = r1;
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04b6, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04bf, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04c0, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04c9, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04ca, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04cf, code lost:
        r27 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04d4, code lost:
        r11 = r27;
        r2 = null;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04df, code lost:
        if ((r0 instanceof java.lang.RuntimeException) != false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04e1, code lost:
        d7.l.a().b(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04f1, code lost:
        if (r7.f15121e == false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04f3, code lost:
        r1 = new java.lang.StringBuilder(androidx.appcompat.widget.o.a(r8, 26));
        r1.append("Preload aborted for URL \"");
        r1.append(r8);
        r1.append("\"");
        l0.e.J(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0513, code lost:
        r3 = new java.lang.StringBuilder(androidx.appcompat.widget.o.a(r8, 25));
        r3.append("Preload failed for URL \"");
        r3.append(r8);
        r3.append("\"");
        l0.e.D(r3.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x053e, code lost:
        r1 = java.lang.String.valueOf(r9.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x054c, code lost:
        if (r1.length() == 0) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x054e, code lost:
        r0 = "Could not delete partial cache file at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0553, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0559, code lost:
        l0.e.K(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x055c, code lost:
        l(r8, r9.getAbsolutePath(), r11, r2);
        f15118f.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0569, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012c, code lost:
        r11 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        d7.l.c();
        r3 = ((java.lang.Integer) e8.ti0.a().a(e8.t.f16638q)).intValue();
        r5 = new java.net.URL(r8);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0147, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014a, code lost:
        if (r6 > 20) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014c, code lost:
        r13 = r5.openConnection();
        r13.setConnectTimeout(r3);
        r13.setReadTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0158, code lost:
        if ((r13 instanceof java.net.HttpURLConnection) == false) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015a, code lost:
        r13 = (java.net.HttpURLConnection) r13;
        r14 = new com.google.android.gms.internal.ads.b7();
        r14.e(r13, (byte[]) null);
        r13.setInstanceFollowRedirects(false);
        r15 = r13.getResponseCode();
        r14.d(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0171, code lost:
        if ((r15 / 100) != 3) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r12 = r13.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0179, code lost:
        if (r12 == null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017b, code lost:
        r14 = new java.net.URL(r5, r12);
        r5 = r14.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0184, code lost:
        if (r5 == null) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018c, code lost:
        if (r5.equals("http") != false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        if (r5.equals("https") != false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019e, code lost:
        if (r5.length() == 0) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a0, code lost:
        r2 = "Unsupported scheme: ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        r2 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ae, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b5, code lost:
        if (r12.length() == 0) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b7, code lost:
        r5 = "Redirecting to ".concat(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bc, code lost:
        r5 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c2, code lost:
        l0.e.E(r5);
        r13.disconnect();
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d2, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01da, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01db, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r3 = r13.getResponseCode();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:209:0x049f */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04ad A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r27 
      PHI: (r27v8 java.lang.String) = (r27v6 java.lang.String), (r27v6 java.lang.String), (r27v6 java.lang.String), (r27v6 java.lang.String), (r27v6 java.lang.String), (r27v11 java.lang.String), (r27v11 java.lang.String), (r27v14 java.lang.String), (r27v14 java.lang.String) binds: [B:200:0x044a, B:209:0x049f, B:210:?, B:207:0x049c, B:208:?, B:181:0x0401, B:183:0x0402, B:173:0x03d8, B:174:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:173:0x03d8] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0553  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:181:0x0401=Splitter:B:181:0x0401, B:209:0x049f=Splitter:B:209:0x049f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(java.lang.String r33) {
        /*
            r32 = this;
            r7 = r32
            r8 = r33
            java.io.File r0 = r7.f15120d
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
            r7.l(r8, r1, r0, r1)
            return r2
        L_0x0010:
            java.io.File r0 = r7.f15120d
            if (r0 != 0) goto L_0x0016
            r0 = 0
            goto L_0x0033
        L_0x0016:
            java.io.File[] r0 = r0.listFiles()
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L_0x001d:
            if (r4 >= r3) goto L_0x0032
            r6 = r0[r4]
            java.lang.String r6 = r6.getName()
            java.lang.String r9 = ".done"
            boolean r6 = r6.endsWith(r9)
            if (r6 != 0) goto L_0x002f
            int r5 = r5 + 1
        L_0x002f:
            int r4 = r4 + 1
            goto L_0x001d
        L_0x0032:
            r0 = r5
        L_0x0033:
            e8.l<java.lang.Integer> r3 = e8.t.f16608l
            com.google.android.gms.internal.ads.e r4 = e8.ti0.a()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 <= r3) goto L_0x0097
            java.io.File r0 = r7.f15120d
            if (r0 != 0) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File[] r0 = r0.listFiles()
            int r5 = r0.length
            r6 = 0
            r9 = r1
        L_0x0056:
            if (r6 >= r5) goto L_0x0073
            r10 = r0[r6]
            java.lang.String r11 = r10.getName()
            java.lang.String r12 = ".done"
            boolean r11 = r11.endsWith(r12)
            if (r11 != 0) goto L_0x0070
            long r11 = r10.lastModified()
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0070
            r9 = r10
            r3 = r11
        L_0x0070:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x0073:
            if (r9 == 0) goto L_0x0089
            boolean r0 = r9.delete()
            java.io.File r3 = r7.t(r9)
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L_0x008a
            boolean r3 = r3.delete()
            r0 = r0 & r3
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            l0.e.K(r0)
            java.lang.String r0 = "expireFailed"
            r7.l(r8, r1, r0, r1)
            return r2
        L_0x0097:
            java.lang.String r0 = r32.s(r33)
            java.io.File r9 = new java.io.File
            java.io.File r3 = r7.f15120d
            r9.<init>(r3, r0)
            java.io.File r0 = r7.t(r9)
            boolean r3 = r9.isFile()
            r4 = 1
            if (r3 == 0) goto L_0x00da
            boolean r3 = r0.isFile()
            if (r3 == 0) goto L_0x00da
            long r0 = r9.length()
            int r1 = (int) r0
            java.lang.String r0 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r33)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00c9
            java.lang.String r0 = r0.concat(r2)
            goto L_0x00cf
        L_0x00c9:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x00cf:
            l0.e.E(r0)
            java.lang.String r0 = r9.getAbsolutePath()
            r7.k(r8, r0, r1)
            return r4
        L_0x00da:
            java.io.File r3 = r7.f15120d
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r33)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x00f4
            java.lang.String r3 = r3.concat(r5)
            r10 = r3
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r10 = r5
        L_0x00fa:
            java.util.Set<java.lang.String> r3 = f15118f
            monitor-enter(r3)
            boolean r5 = r3.contains(r10)     // Catch:{ all -> 0x056a }
            if (r5 == 0) goto L_0x0128
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r4 = java.lang.String.valueOf(r33)     // Catch:{ all -> 0x056a }
            int r5 = r4.length()     // Catch:{ all -> 0x056a }
            if (r5 == 0) goto L_0x0114
            java.lang.String r0 = r0.concat(r4)     // Catch:{ all -> 0x056a }
            goto L_0x011a
        L_0x0114:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x056a }
            r4.<init>(r0)     // Catch:{ all -> 0x056a }
            r0 = r4
        L_0x011a:
            l0.e.K(r0)     // Catch:{ all -> 0x056a }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x056a }
            java.lang.String r4 = "inProgress"
            r7.l(r8, r0, r4, r1)     // Catch:{ all -> 0x056a }
            monitor-exit(r3)     // Catch:{ all -> 0x056a }
            return r2
        L_0x0128:
            r3.add(r10)     // Catch:{ all -> 0x056a }
            monitor-exit(r3)     // Catch:{ all -> 0x056a }
            java.lang.String r11 = "error"
            d7.l.c()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            e8.l<java.lang.Integer> r3 = e8.t.f16638q     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            com.google.android.gms.internal.ads.e r5 = e8.ti0.a()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.Object r3 = r5.a(r3)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r5.<init>(r8)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r6 = 0
        L_0x0147:
            int r6 = r6 + r4
            r12 = 20
            if (r6 > r12) goto L_0x04c0
            java.net.URLConnection r13 = r5.openConnection()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r13.setConnectTimeout(r3)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r13.setReadTimeout(r3)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            boolean r14 = r13 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            if (r14 == 0) goto L_0x04b6
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            com.google.android.gms.internal.ads.b7 r14 = new com.google.android.gms.internal.ads.b7     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r14.<init>()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r14.e(r13, r1)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r13.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r15 = r13.getResponseCode()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r14.d(r13, r15)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r15 = r15 / 100
            r14 = 3
            if (r15 != r14) goto L_0x01e1
            java.lang.String r12 = "Location"
            java.lang.String r12 = r13.getHeaderField(r12)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r12 == 0) goto L_0x01d3
            java.net.URL r14 = new java.net.URL     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r14.<init>(r5, r12)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r5 = r14.getProtocol()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r5 == 0) goto L_0x01cb
            java.lang.String r15 = "http"
            boolean r15 = r5.equals(r15)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r15 != 0) goto L_0x01af
            java.lang.String r15 = "https"
            boolean r15 = r5.equals(r15)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r15 != 0) goto L_0x01af
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r2 = "Unsupported scheme: "
            int r3 = r5.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r3 == 0) goto L_0x01a5
            java.lang.String r2 = r2.concat(r5)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            goto L_0x01ab
        L_0x01a5:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r3.<init>(r2)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r2 = r3
        L_0x01ab:
            r0.<init>(r2)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            throw r0     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
        L_0x01af:
            java.lang.String r5 = "Redirecting to "
            int r15 = r12.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r15 == 0) goto L_0x01bc
            java.lang.String r5 = r5.concat(r12)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            goto L_0x01c2
        L_0x01bc:
            java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r12.<init>(r5)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r5 = r12
        L_0x01c2:
            l0.e.E(r5)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r13.disconnect()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r5 = r14
            goto L_0x0147
        L_0x01cb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r2 = "Protocol is null"
            r0.<init>(r2)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            throw r0     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
        L_0x01d3:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r2 = "Missing Location header in redirect"
            r0.<init>(r2)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            throw r0     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
        L_0x01db:
            r0 = move-exception
            goto L_0x02d2
        L_0x01de:
            r0 = move-exception
            goto L_0x02d2
        L_0x01e1:
            int r3 = r13.getResponseCode()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x0235
            java.lang.String r11 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r2 = java.lang.Integer.toString(r3)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r4 = r2.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r4 == 0) goto L_0x0201
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r2 = r0
            goto L_0x0206
        L_0x0201:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
        L_0x0206:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            java.lang.String r4 = java.lang.String.valueOf(r33)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            int r4 = r4.length()     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            int r4 = r4 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            java.lang.String r4 = "HTTP status code "
            r5.append(r4)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            r5.append(r3)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            java.lang.String r3 = " at "
            r5.append(r3)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            r5.append(r8)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
            throw r0     // Catch:{ IOException -> 0x0232, RuntimeException -> 0x022f }
        L_0x022f:
            r0 = move-exception
            goto L_0x04dd
        L_0x0232:
            r0 = move-exception
            goto L_0x04dd
        L_0x0235:
            int r14 = r13.getContentLength()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            if (r14 >= 0) goto L_0x0264
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r3 = java.lang.String.valueOf(r33)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r4 = r3.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r4 == 0) goto L_0x024c
            java.lang.String r0 = r0.concat(r3)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            goto L_0x0252
        L_0x024c:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r3.<init>(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r0 = r3
        L_0x0252:
            l0.e.K(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r3 = "contentLengthMissing"
            r7.l(r8, r0, r3, r1)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.util.Set<java.lang.String> r0 = f15118f     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r0.remove(r10)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            return r2
        L_0x0264:
            java.text.DecimalFormat r3 = f15119g     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            long r4 = (long) r14     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.String r3 = r3.format(r4)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            e8.l<java.lang.Integer> r4 = e8.t.f16614m     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            com.google.android.gms.internal.ads.e r5 = e8.ti0.a()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r15 = r4.intValue()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            if (r14 <= r15) goto L_0x02d5
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r0 = r0.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r0 = r0 + 33
            java.lang.String r4 = java.lang.String.valueOf(r33)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r4 = r4.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r0 = r0 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r4.<init>(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r0 = "Content length "
            r4.append(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r4.append(r3)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r0 = " exceeds limit at "
            r4.append(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r4.append(r8)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            l0.e.K(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            int r4 = r3.length()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            if (r4 == 0) goto L_0x02bd
            java.lang.String r0 = r0.concat(r3)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            goto L_0x02c3
        L_0x02bd:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r3.<init>(r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r0 = r3
        L_0x02c3:
            java.lang.String r3 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.lang.String r4 = "sizeExceeded"
            r7.l(r8, r3, r4, r0)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            java.util.Set<java.lang.String> r0 = f15118f     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            r0.remove(r10)     // Catch:{ IOException -> 0x01de, RuntimeException -> 0x01db }
            return r2
        L_0x02d2:
            r2 = r1
            goto L_0x04dd
        L_0x02d5:
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r1 = r1.length()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r1 = r1 + r12
            java.lang.String r2 = java.lang.String.valueOf(r33)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r2 = r2.length()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r2.<init>(r1)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.String r1 = "Caching "
            r2.append(r1)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r2.append(r3)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.String r1 = " bytes from "
            r2.append(r1)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r2.append(r8)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            l0.e.E(r1)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.io.InputStream r1 = r13.getInputStream()     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.nio.channels.ReadableByteChannel r12 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            r13.<init>(r9)     // Catch:{ IOException -> 0x04d2, RuntimeException -> 0x04ce }
            java.nio.channels.FileChannel r6 = r13.getChannel()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            z7.b r16 = d7.l.b()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            long r17 = r16.b()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            e8.l<java.lang.Long> r1 = e8.t.f16632p     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            com.google.android.gms.internal.ads.e r2 = e8.ti0.a()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            long r19 = r1.longValue()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            r1 = -9223372036854775808
            java.lang.Object r21 = new java.lang.Object     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            r21.<init>()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            e8.l<java.lang.Long> r3 = e8.t.f16626o     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            com.google.android.gms.internal.ads.e r4 = e8.ti0.a()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            java.lang.Object r3 = r4.a(r3)     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            long r22 = r3.longValue()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            r3 = 0
        L_0x034a:
            int r4 = r12.read(r5)     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            if (r4 < 0) goto L_0x0447
            int r4 = r4 + r3
            if (r4 <= r15) goto L_0x0384
            java.lang.String r11 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            int r2 = r1.length()     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            if (r2 == 0) goto L_0x036b
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            r1 = r0
            goto L_0x0370
        L_0x036b:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
        L_0x0370:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0378 }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0378 }
            throw r0     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0378 }
        L_0x0378:
            r0 = move-exception
            goto L_0x04b3
        L_0x037b:
            r0 = move-exception
            goto L_0x04b3
        L_0x037e:
            r0 = move-exception
            goto L_0x04b2
        L_0x0381:
            r0 = move-exception
            goto L_0x04b2
        L_0x0384:
            r5.flip()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
        L_0x0387:
            int r3 = r6.write(r5)     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            if (r3 > 0) goto L_0x0387
            r5.clear()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            long r24 = r16.b()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            long r24 = r24 - r17
            r26 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r22
            int r3 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r3 > 0) goto L_0x0417
            boolean r3 = r7.f15121e     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            if (r3 != 0) goto L_0x0405
            monitor-enter(r21)     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            d7.l r3 = d7.l.B     // Catch:{ all -> 0x03fe }
            z7.b r3 = r3.f13193j     // Catch:{ all -> 0x03fe }
            long r24 = r3.a()     // Catch:{ all -> 0x03fe }
            long r26 = r1 + r19
            int r3 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r3 <= 0) goto L_0x03b6
            monitor-exit(r21)     // Catch:{ all -> 0x03fe }
            r3 = 0
            r24 = r1
            goto L_0x03b8
        L_0x03b6:
            monitor-exit(r21)     // Catch:{ all -> 0x03fe }
            r3 = 1
        L_0x03b8:
            if (r3 == 0) goto L_0x03e6
            java.lang.String r26 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            android.os.Handler r3 = e8.y8.f17578b     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            e8.cb r2 = new e8.cb     // Catch:{ IOException -> 0x03e4, RuntimeException -> 0x03df }
            r1 = r2
            r27 = r11
            r11 = r2
            r2 = r32
            r28 = r12
            r12 = r3
            r3 = r33
            r29 = r4
            r4 = r26
            r26 = r5
            r5 = r29
            r30 = r6
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r12.post(r11)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            goto L_0x03f0
        L_0x03df:
            r0 = move-exception
        L_0x03e0:
            r27 = r11
            goto L_0x04b0
        L_0x03e4:
            r0 = move-exception
            goto L_0x03e0
        L_0x03e6:
            r29 = r4
            r26 = r5
            r30 = r6
            r27 = r11
            r28 = r12
        L_0x03f0:
            r1 = r24
            r5 = r26
            r11 = r27
            r12 = r28
            r3 = r29
            r6 = r30
            goto L_0x034a
        L_0x03fe:
            r0 = move-exception
            r27 = r11
        L_0x0401:
            monitor-exit(r21)     // Catch:{ all -> 0x0403 }
            throw r0     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
        L_0x0403:
            r0 = move-exception
            goto L_0x0401
        L_0x0405:
            r27 = r11
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0413, RuntimeException -> 0x0411 }
            java.lang.String r2 = "abort requested"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0413, RuntimeException -> 0x0411 }
            throw r0     // Catch:{ IOException -> 0x0413, RuntimeException -> 0x0411 }
        L_0x0411:
            r0 = move-exception
            goto L_0x0414
        L_0x0413:
            r0 = move-exception
        L_0x0414:
            r11 = r1
            goto L_0x04b2
        L_0x0417:
            r27 = r11
            java.lang.String r11 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r22)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            int r1 = r1.length()     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            r2.append(r0)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0381, RuntimeException -> 0x037e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0378 }
            java.lang.String r2 = "stream cache time limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0378 }
            throw r0     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0378 }
        L_0x0447:
            r27 = r11
            r1 = 3
            r13.close()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            boolean r1 = l0.e.h(r1)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            if (r1 == 0) goto L_0x0489
            java.text.DecimalFormat r1 = f15119g     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            long r4 = (long) r3     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            java.lang.String r1 = r1.format(r4)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            int r2 = r2.length()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            int r2 = r2 + 22
            java.lang.String r4 = java.lang.String.valueOf(r33)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            int r4 = r4.length()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r4.<init>(r2)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            java.lang.String r2 = "Preloaded "
            r4.append(r2)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r4.append(r1)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r4.append(r8)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            l0.e.E(r1)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
        L_0x0489:
            r1 = 1
            r2 = 0
            r9.setReadable(r1, r2)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            if (r1 == 0) goto L_0x049c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r0.setLastModified(r1)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            goto L_0x049f
        L_0x049c:
            r0.createNewFile()     // Catch:{ IOException -> 0x049f, RuntimeException -> 0x04ad }
        L_0x049f:
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r7.k(r8, r0, r3)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            java.util.Set<java.lang.String> r0 = f15118f     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r0.remove(r10)     // Catch:{ IOException -> 0x04af, RuntimeException -> 0x04ad }
            r0 = 1
            return r0
        L_0x04ad:
            r0 = move-exception
            goto L_0x04b0
        L_0x04af:
            r0 = move-exception
        L_0x04b0:
            r11 = r27
        L_0x04b2:
            r1 = 0
        L_0x04b3:
            r2 = r1
            r1 = r13
            goto L_0x04dd
        L_0x04b6:
            r27 = r11
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x04cc, RuntimeException -> 0x04ca }
            java.lang.String r1 = "Invalid protocol."
            r0.<init>(r1)     // Catch:{ IOException -> 0x04cc, RuntimeException -> 0x04ca }
            throw r0     // Catch:{ IOException -> 0x04cc, RuntimeException -> 0x04ca }
        L_0x04c0:
            r27 = r11
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x04cc, RuntimeException -> 0x04ca }
            java.lang.String r1 = "Too many redirects (20)"
            r0.<init>(r1)     // Catch:{ IOException -> 0x04cc, RuntimeException -> 0x04ca }
            throw r0     // Catch:{ IOException -> 0x04cc, RuntimeException -> 0x04ca }
        L_0x04ca:
            r0 = move-exception
            goto L_0x04d4
        L_0x04cc:
            r0 = move-exception
            goto L_0x04d4
        L_0x04ce:
            r0 = move-exception
        L_0x04cf:
            r27 = r11
            goto L_0x04d4
        L_0x04d2:
            r0 = move-exception
            goto L_0x04cf
        L_0x04d4:
            r1 = 0
            r2 = 0
            r11 = r27
            r31 = r2
            r2 = r1
            r1 = r31
        L_0x04dd:
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L_0x04ea
            com.google.android.gms.internal.ads.y6 r3 = d7.l.a()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r3.b(r0, r4)
        L_0x04ea:
            r1.close()     // Catch:{ IOException | NullPointerException -> 0x04ee }
            goto L_0x04ef
        L_0x04ee:
        L_0x04ef:
            boolean r1 = r7.f15121e
            if (r1 == 0) goto L_0x0513
            r0 = 26
            int r0 = androidx.appcompat.widget.o.a(r8, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "\""
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            l0.e.J(r0)
            goto L_0x0532
        L_0x0513:
            r1 = 25
            int r1 = androidx.appcompat.widget.o.a(r8, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Preload failed for URL \""
            r3.append(r1)
            r3.append(r8)
            java.lang.String r1 = "\""
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            l0.e.D(r1, r0)
        L_0x0532:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x055c
            boolean r0 = r9.delete()
            if (r0 != 0) goto L_0x055c
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r1 = r9.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0553
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0559
        L_0x0553:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x0559:
            l0.e.K(r0)
        L_0x055c:
            java.lang.String r0 = r9.getAbsolutePath()
            r7.l(r8, r0, r11, r2)
            java.util.Set<java.lang.String> r0 = f15118f
            r0.remove(r10)
            r0 = 0
            return r0
        L_0x056a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x056a }
            goto L_0x056e
        L_0x056d:
            throw r0
        L_0x056e:
            goto L_0x056d
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.jb.r(java.lang.String):boolean");
    }

    public final File t(File file) {
        return new File(this.f15120d, String.valueOf(file.getName()).concat(".done"));
    }
}
