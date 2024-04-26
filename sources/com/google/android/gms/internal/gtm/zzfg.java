package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import n7.v;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfg extends zzbu {
    public static final byte[] zza = "\n".getBytes();
    public final String zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", zzbv.zza, Build.VERSION.RELEASE, zzfu.zzd(Locale.getDefault()), Build.MODEL, Build.ID});
    public final zzfq zzc;

    public zzfg(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzfq(zzbx.zzr());
    }

    public static final void zzl(StringBuilder sb2, String str, String str2) throws UnsupportedEncodingException {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final String zza(zzez zzez, boolean z10) {
        String str;
        if (zzez != null) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (Map.Entry entry : zzez.zzg().entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                        zzl(sb2, str2, (String) entry.getValue());
                    }
                }
                zzl(sb2, "ht", String.valueOf(zzez.zzd()));
                zzl(sb2, "qt", String.valueOf(zzC().b() - zzez.zzd()));
                zzw();
                if (z10) {
                    long zzc2 = zzez.zzc();
                    if (zzc2 != 0) {
                        str = String.valueOf(zzc2);
                    } else {
                        str = String.valueOf(zzez.zzb());
                    }
                    zzl(sb2, "z", str);
                }
                return sb2.toString();
            } catch (UnsupportedEncodingException e10) {
                zzJ("Failed to encode name or value", e10);
                return null;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
            zzw();
            httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0320 A[EDGE_INSN: B:162:0x0320->B:153:0x0320 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ba A[SYNTHETIC, Splitter:B:77:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d4 A[SYNTHETIC, Splitter:B:87:0x01d4] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzc(java.util.List r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "Error closing http compressed post connection output stream"
            n7.v.b()
            r19.zzV()
            if (r20 == 0) goto L_0x0321
            com.google.android.gms.internal.gtm.zzcv r0 = r19.zzw()
            java.util.Set r0 = r0.zza()
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0088
            com.google.android.gms.internal.gtm.zzfq r0 = r1.zzc
            r19.zzw()
            com.google.android.gms.internal.gtm.zzev r5 = com.google.android.gms.internal.gtm.zzew.zzC
            java.lang.Object r5 = r5.zzb()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r5 = (long) r5
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            boolean r0 = r0.zzc(r5)
            if (r0 != 0) goto L_0x0038
            goto L_0x0088
        L_0x0038:
            r19.zzw()
            com.google.android.gms.internal.gtm.zzev r0 = com.google.android.gms.internal.gtm.zzew.zzv
            java.lang.Object r0 = r0.zzb()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "BATCH_BY_SESSION"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x004d
        L_0x004b:
            r0 = 1
            goto L_0x0072
        L_0x004d:
            java.lang.String r5 = "BATCH_BY_TIME"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0056
            goto L_0x004b
        L_0x0056:
            java.lang.String r5 = "BATCH_BY_BRUTE_FORCE"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x005f
            goto L_0x004b
        L_0x005f:
            java.lang.String r5 = "BATCH_BY_COUNT"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0068
            goto L_0x004b
        L_0x0068:
            java.lang.String r5 = "BATCH_BY_SIZE"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0071
            goto L_0x004b
        L_0x0071:
            r0 = 0
        L_0x0072:
            r19.zzw()
            com.google.android.gms.internal.gtm.zzev r5 = com.google.android.gms.internal.gtm.zzew.zzw
            java.lang.Object r5 = r5.zzb()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "GZIP"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r3 == r5) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r5 = 1
            goto L_0x008a
        L_0x0088:
            r0 = 0
        L_0x0089:
            r5 = 0
        L_0x008a:
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0221
            boolean r0 = r20.isEmpty()
            r0 = r0 ^ r3
            com.google.android.gms.common.internal.i.a(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            int r8 = r20.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Uploading batched hits. compression, count"
            r1.zzP(r9, r0, r8)
            com.google.android.gms.internal.gtm.zzff r8 = new com.google.android.gms.internal.gtm.zzff
            r8.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r20.iterator()
            r10 = 0
        L_0x00b6:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00db
            java.lang.Object r11 = r0.next()
            com.google.android.gms.internal.gtm.zzez r11 = (com.google.android.gms.internal.gtm.zzez) r11
            boolean r12 = r8.zzb(r11)
            if (r12 != 0) goto L_0x00c9
            goto L_0x00db
        L_0x00c9:
            long r12 = r11.zzb()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.add(r12)
            if (r10 > 0) goto L_0x00b6
            int r10 = r11.zza()
            goto L_0x00b6
        L_0x00db:
            int r0 = r8.zza()
            if (r0 != 0) goto L_0x00e3
            goto L_0x0220
        L_0x00e3:
            java.net.URL r0 = r19.zzh()
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = "Failed to build batching endpoint url"
            r1.zzI(r0)
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x0220
        L_0x00f4:
            if (r5 == 0) goto L_0x01e3
            byte[] r5 = r8.zzc()
            com.google.android.gms.common.internal.i.h(r5)
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r10.<init>()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r11.write(r5)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r11.close()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r10.close()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            byte[] r10 = r10.toByteArray()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            java.lang.String r11 = "POST compressed size, ratio %, url"
            int r12 = r10.length     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            long r14 = (long) r12     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r16 = 100
            long r14 = r14 * r16
            int r7 = r5.length     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            long r3 = (long) r7     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            long r14 = r14 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r1.zzH(r11, r13, r3, r0)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            if (r12 <= r7) goto L_0x0135
            java.lang.String r3 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r1.zzS(r3, r13, r4)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
        L_0x0135:
            boolean r3 = com.google.android.gms.internal.gtm.zzbt.zzU()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            if (r3 == 0) goto L_0x0156
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r4.<init>()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            java.lang.String r5 = "\n"
            r4.append(r5)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r4.append(r3)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            java.lang.String r3 = "Post payload"
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r1.zzO(r3, r4)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
        L_0x0156:
            java.net.HttpURLConnection r3 = r1.zzb(r0)     // Catch:{ IOException -> 0x01af, all -> 0x01a9 }
            r0 = 1
            r3.setDoOutput(r0)     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r3.addRequestProperty(r0, r4)     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r3.setFixedLengthStreamingMode(r12)     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r3.connect()     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r4.write(r10)     // Catch:{ IOException -> 0x019b, all -> 0x0196 }
            r4.close()     // Catch:{ IOException -> 0x019b, all -> 0x0196 }
            r1.zzk(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            if (r0 != r6) goto L_0x0187
            com.google.android.gms.internal.gtm.zzbs r0 = r19.zzs()     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r0.zzi()     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r0 = 200(0xc8, float:2.8E-43)
        L_0x0187:
            java.lang.String r4 = "POST status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r1.zzF(r4, r5)     // Catch:{ IOException -> 0x01a6, all -> 0x01a0 }
            r3.disconnect()
            r4 = r0
            goto L_0x01eb
        L_0x0196:
            r0 = move-exception
            r16 = r3
            r7 = r4
            goto L_0x01a4
        L_0x019b:
            r0 = move-exception
            r7 = r3
            r16 = r4
            goto L_0x01b3
        L_0x01a0:
            r0 = move-exception
            r16 = r3
            r7 = 0
        L_0x01a4:
            r3 = r0
            goto L_0x01d2
        L_0x01a6:
            r0 = move-exception
            r7 = r3
            goto L_0x01b1
        L_0x01a9:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r16 = 0
            goto L_0x01d2
        L_0x01af:
            r0 = move-exception
            r7 = 0
        L_0x01b1:
            r16 = 0
        L_0x01b3:
            java.lang.String r3 = "Network compressed POST connection error"
            r1.zzR(r3, r0)     // Catch:{ all -> 0x01ca }
            if (r16 == 0) goto L_0x01c3
            r16.close()     // Catch:{ IOException -> 0x01be }
            goto L_0x01c3
        L_0x01be:
            r0 = move-exception
            r3 = r0
            r1.zzJ(r2, r3)
        L_0x01c3:
            if (r7 == 0) goto L_0x01c8
            r7.disconnect()
        L_0x01c8:
            r4 = 0
            goto L_0x01eb
        L_0x01ca:
            r0 = move-exception
            r3 = r0
            r18 = r16
            r16 = r7
            r7 = r18
        L_0x01d2:
            if (r7 == 0) goto L_0x01dd
            r7.close()     // Catch:{ IOException -> 0x01d8 }
            goto L_0x01dd
        L_0x01d8:
            r0 = move-exception
            r4 = r0
            r1.zzJ(r2, r4)
        L_0x01dd:
            if (r16 == 0) goto L_0x01e2
            r16.disconnect()
        L_0x01e2:
            throw r3
        L_0x01e3:
            byte[] r2 = r8.zzc()
            int r4 = r1.zzg(r0, r2, r10)
        L_0x01eb:
            if (r4 != r6) goto L_0x01fb
            int r0 = r8.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Batched upload completed. Hits batched"
            r1.zzO(r2, r0)
            goto L_0x0220
        L_0x01fb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "Network error uploading hits. status code"
            r1.zzO(r2, r0)
            com.google.android.gms.internal.gtm.zzcv r2 = r19.zzw()
            java.util.Set r2 = r2.zza()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x021c
            java.lang.String r0 = "Server instructed the client to stop batching"
            r1.zzQ(r0)
            com.google.android.gms.internal.gtm.zzfq r0 = r1.zzc
            r0.zzb()
        L_0x021c:
            java.util.List r9 = java.util.Collections.emptyList()
        L_0x0220:
            return r9
        L_0x0221:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r20.size()
            r2.<init>(r0)
            java.util.Iterator r0 = r20.iterator()
        L_0x022e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0320
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.gtm.zzez r3 = (com.google.android.gms.internal.gtm.zzez) r3
            com.google.android.gms.common.internal.i.h(r3)
            boolean r4 = r3.zzh()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.String r4 = r1.zza(r3, r4)
            if (r4 != 0) goto L_0x0255
            com.google.android.gms.internal.gtm.zzfd r4 = r19.zzz()
            java.lang.String r7 = "Error formatting hit for upload"
            r4.zzb(r3, r7)
        L_0x0252:
            r4 = 0
            goto L_0x0308
        L_0x0255:
            r19.zzw()
            int r7 = r4.length()
            com.google.android.gms.internal.gtm.zzev r8 = com.google.android.gms.internal.gtm.zzew.zzu
            java.lang.Object r8 = r8.zzb()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 > r8) goto L_0x02c1
            java.net.URL r4 = r1.zzj(r3, r4)
            if (r4 != 0) goto L_0x0277
            java.lang.String r0 = "Failed to build collect GET endpoint url"
            r1.zzI(r0)
            goto L_0x0320
        L_0x0277:
            java.lang.String r7 = "GET request"
            r1.zzF(r7, r4)
            java.net.HttpURLConnection r4 = r1.zzb(r4)     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            r4.connect()     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            r1.zzk(r4)     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            int r7 = r4.getResponseCode()     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            if (r7 != r6) goto L_0x0295
            com.google.android.gms.internal.gtm.zzbs r7 = r19.zzs()     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            r7.zzi()     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            r7 = 200(0xc8, float:2.8E-43)
        L_0x0295:
            java.lang.String r8 = "GET status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            r1.zzF(r8, r9)     // Catch:{ IOException -> 0x02a7, all -> 0x02a4 }
            r4.disconnect()
            if (r7 != r6) goto L_0x0320
            goto L_0x0252
        L_0x02a4:
            r0 = move-exception
            r7 = r4
            goto L_0x02bb
        L_0x02a7:
            r0 = move-exception
            r7 = r4
            goto L_0x02af
        L_0x02aa:
            r0 = move-exception
            r7 = 0
            goto L_0x02bb
        L_0x02ad:
            r0 = move-exception
            r7 = 0
        L_0x02af:
            java.lang.String r3 = "Network GET connection error"
            r1.zzR(r3, r0)     // Catch:{ all -> 0x02ba }
            if (r7 == 0) goto L_0x0320
            r7.disconnect()
            goto L_0x0320
        L_0x02ba:
            r0 = move-exception
        L_0x02bb:
            if (r7 == 0) goto L_0x02c0
            r7.disconnect()
        L_0x02c0:
            throw r0
        L_0x02c1:
            r4 = 0
            java.lang.String r7 = r1.zza(r3, r4)
            if (r7 != 0) goto L_0x02d2
            com.google.android.gms.internal.gtm.zzfd r7 = r19.zzz()
            java.lang.String r8 = "Error formatting hit for POST upload"
            r7.zzb(r3, r8)
            goto L_0x0308
        L_0x02d2:
            byte[] r7 = r7.getBytes()
            int r8 = r7.length
            r19.zzw()
            com.google.android.gms.internal.gtm.zzev r9 = com.google.android.gms.internal.gtm.zzew.zzz
            java.lang.Object r9 = r9.zzb()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r8 <= r9) goto L_0x02f2
            com.google.android.gms.internal.gtm.zzfd r7 = r19.zzz()
            java.lang.String r8 = "Hit payload exceeds size limit"
            r7.zzb(r3, r8)
            goto L_0x0308
        L_0x02f2:
            java.net.URL r8 = r1.zzi(r3)
            if (r8 != 0) goto L_0x02fe
            java.lang.String r0 = "Failed to build collect POST endpoint url"
            r1.zzI(r0)
            goto L_0x0320
        L_0x02fe:
            int r9 = r3.zza()
            int r7 = r1.zzg(r8, r7, r9)
            if (r7 != r6) goto L_0x0320
        L_0x0308:
            long r7 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2.add(r3)
            int r3 = r2.size()
            r19.zzw()
            int r7 = com.google.android.gms.internal.gtm.zzcv.zzh()
            if (r3 < r7) goto L_0x022e
        L_0x0320:
            return r2
        L_0x0321:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null reference"
            r0.<init>(r2)
            goto L_0x032a
        L_0x0329:
            throw r0
        L_0x032a:
            goto L_0x0329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzc(java.util.List):java.util.List");
    }

    public final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        v.b();
        zzV();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[SYNTHETIC, Splitter:B:32:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0089 A[SYNTHETIC, Splitter:B:41:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzg(java.net.URL r5, byte[] r6, int r7) {
        /*
            r4 = this;
            java.lang.String r7 = "Error closing http post connection output stream"
            java.lang.String r0 = "null reference"
            if (r5 == 0) goto L_0x009d
            if (r6 == 0) goto L_0x0097
            int r0 = r6.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "POST bytes, url"
            r4.zzG(r2, r1, r5)
            boolean r1 = com.google.android.gms.internal.gtm.zzbt.zzU()
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r2 = "Post payload\n"
            r4.zzO(r2, r1)
        L_0x0022:
            r1 = 0
            java.net.HttpURLConnection r5 = r4.zzb(r5)     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            r2 = 1
            r5.setDoOutput(r2)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r5.setFixedLengthStreamingMode(r0)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r5.connect()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            java.io.OutputStream r1 = r5.getOutputStream()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r1.write(r6)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r4.zzk(r5)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x004c
            com.google.android.gms.internal.gtm.zzbs r6 = r4.zzs()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r6.zzi()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r6 = 200(0xc8, float:2.8E-43)
        L_0x004c:
            java.lang.String r0 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r4.zzF(r0, r2)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L_0x005d:
            r5.disconnect()
            return r6
        L_0x0061:
            r6 = move-exception
            goto L_0x0087
        L_0x0063:
            r6 = move-exception
            r3 = r1
            r1 = r5
            r5 = r3
            goto L_0x006d
        L_0x0068:
            r6 = move-exception
            r5 = r1
            goto L_0x0087
        L_0x006b:
            r6 = move-exception
            r5 = r1
        L_0x006d:
            java.lang.String r0 = "Network POST connection error"
            r4.zzR(r0, r6)     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x007c
            r5.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r5 = move-exception
            r4.zzJ(r7, r5)
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.disconnect()
        L_0x0081:
            r5 = 0
            return r5
        L_0x0083:
            r6 = move-exception
            r3 = r1
            r1 = r5
            r5 = r3
        L_0x0087:
            if (r1 == 0) goto L_0x0091
            r1.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L_0x0091:
            if (r5 == 0) goto L_0x0096
            r5.disconnect()
        L_0x0096:
            throw r6
        L_0x0097:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            throw r5
        L_0x009d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzg(java.net.URL, byte[], int):int");
    }

    public final URL zzh() {
        zzw();
        String zzi = zzcv.zzi();
        zzw();
        try {
            return new URL(zzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    public final URL zzi(zzez zzez) {
        String str;
        if (zzez.zzh()) {
            zzw();
            String zzi = zzcv.zzi();
            zzw();
            str = zzi.concat(zzcv.zzj());
        } else {
            zzw();
            String zzk = zzcv.zzk();
            zzw();
            str = zzk.concat(zzcv.zzj());
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    public final URL zzj(zzez zzez, String str) {
        String str2;
        if (zzez.zzh()) {
            zzw();
            String zzi = zzcv.zzi();
            zzw();
            str2 = zzi + zzcv.zzj() + "?" + str;
        } else {
            zzw();
            String zzk = zzcv.zzk();
            zzw();
            str2 = zzk + zzcv.zzj() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001f A[SYNTHETIC, Splitter:B:18:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzk(java.net.HttpURLConnection r4) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x001b }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0019 }
        L_0x000a:
            int r2 = r4.read(r1)     // Catch:{ all -> 0x0019 }
            if (r2 > 0) goto L_0x000a
            r4.close()     // Catch:{ IOException -> 0x0014 }
            return
        L_0x0014:
            r4 = move-exception
            r3.zzJ(r0, r4)
            return
        L_0x0019:
            r1 = move-exception
            goto L_0x001d
        L_0x001b:
            r1 = move-exception
            r4 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0027
            r4.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            r3.zzJ(r0, r4)
        L_0x0027:
            goto L_0x0029
        L_0x0028:
            throw r1
        L_0x0029:
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzk(java.net.HttpURLConnection):void");
    }
}
