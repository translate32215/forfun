package e;

import android.net.Uri;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.uh;
import e8.q50;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class h {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0176, code lost:
        if (r0.equals("video/mp2t") == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r21) {
        /*
            r0 = r21
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.ArrayList<v6.s$a> r2 = v6.s.f26493a
            int r2 = r21.hashCode()
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r2) {
                case -1007807498: goto L_0x002a;
                case -586683234: goto L_0x001f;
                case 187090231: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r2 = -1
            goto L_0x0034
        L_0x0014:
            java.lang.String r2 = "audio/mp3"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r2 = 2
            goto L_0x0034
        L_0x001f:
            java.lang.String r2 = "audio/x-wav"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r2 = 1
            goto L_0x0034
        L_0x002a:
            java.lang.String r2 = "audio/x-flac"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r2 = 0
        L_0x0034:
            java.lang.String r6 = "audio/mpeg"
            java.lang.String r7 = "audio/wav"
            java.lang.String r8 = "audio/flac"
            switch(r2) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0040;
                case 2: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0043
        L_0x003e:
            r0 = r6
            goto L_0x0043
        L_0x0040:
            r0 = r7
            goto L_0x0043
        L_0x0042:
            r0 = r8
        L_0x0043:
            int r2 = r0.hashCode()
            r9 = 14
            r10 = 13
            r11 = 12
            r12 = 11
            r13 = 10
            r14 = 9
            r15 = 8
            r16 = 7
            r17 = 6
            r18 = 5
            r19 = 4
            r20 = 3
            switch(r2) {
                case -2123537834: goto L_0x0186;
                case -1662384011: goto L_0x017a;
                case -1662384007: goto L_0x0170;
                case -1662095187: goto L_0x0164;
                case -1606874997: goto L_0x0158;
                case -1487394660: goto L_0x014c;
                case -1248337486: goto L_0x0140;
                case -1004728940: goto L_0x0134;
                case -387023398: goto L_0x0127;
                case -43467528: goto L_0x0119;
                case 13915911: goto L_0x010b;
                case 187078296: goto L_0x00fd;
                case 187078297: goto L_0x00ef;
                case 187078669: goto L_0x00e1;
                case 187090232: goto L_0x00d4;
                case 187091926: goto L_0x00c7;
                case 187099443: goto L_0x00bc;
                case 1331848029: goto L_0x00af;
                case 1503095341: goto L_0x00a2;
                case 1504578661: goto L_0x0095;
                case 1504619009: goto L_0x008a;
                case 1504831518: goto L_0x007f;
                case 1505118770: goto L_0x0072;
                case 2039520277: goto L_0x0065;
                default: goto L_0x0062;
            }
        L_0x0062:
            r3 = -1
            goto L_0x0191
        L_0x0065:
            java.lang.String r2 = "video/x-matroska"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x006e
            goto L_0x0062
        L_0x006e:
            r3 = 23
            goto L_0x0191
        L_0x0072:
            java.lang.String r2 = "audio/webm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x007b
            goto L_0x0062
        L_0x007b:
            r3 = 22
            goto L_0x0191
        L_0x007f:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0086
            goto L_0x0062
        L_0x0086:
            r3 = 21
            goto L_0x0191
        L_0x008a:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0091
            goto L_0x0062
        L_0x0091:
            r3 = 20
            goto L_0x0191
        L_0x0095:
            java.lang.String r2 = "audio/eac3"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x009e
            goto L_0x0062
        L_0x009e:
            r3 = 19
            goto L_0x0191
        L_0x00a2:
            java.lang.String r2 = "audio/3gpp"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ab
            goto L_0x0062
        L_0x00ab:
            r3 = 18
            goto L_0x0191
        L_0x00af:
            java.lang.String r2 = "video/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00b8
            goto L_0x0062
        L_0x00b8:
            r3 = 17
            goto L_0x0191
        L_0x00bc:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00c3
            goto L_0x0062
        L_0x00c3:
            r3 = 16
            goto L_0x0191
        L_0x00c7:
            java.lang.String r2 = "audio/ogg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00d0
            goto L_0x0062
        L_0x00d0:
            r3 = 15
            goto L_0x0191
        L_0x00d4:
            java.lang.String r2 = "audio/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00dd
            goto L_0x0062
        L_0x00dd:
            r3 = 14
            goto L_0x0191
        L_0x00e1:
            java.lang.String r2 = "audio/amr"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00eb
            goto L_0x0062
        L_0x00eb:
            r3 = 13
            goto L_0x0191
        L_0x00ef:
            java.lang.String r2 = "audio/ac4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00f9
            goto L_0x0062
        L_0x00f9:
            r3 = 12
            goto L_0x0191
        L_0x00fd:
            java.lang.String r2 = "audio/ac3"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0107
            goto L_0x0062
        L_0x0107:
            r3 = 11
            goto L_0x0191
        L_0x010b:
            java.lang.String r2 = "video/x-flv"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0115
            goto L_0x0062
        L_0x0115:
            r3 = 10
            goto L_0x0191
        L_0x0119:
            java.lang.String r2 = "application/webm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0123
            goto L_0x0062
        L_0x0123:
            r3 = 9
            goto L_0x0191
        L_0x0127:
            java.lang.String r2 = "audio/x-matroska"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0131
            goto L_0x0062
        L_0x0131:
            r3 = 8
            goto L_0x0191
        L_0x0134:
            java.lang.String r2 = "text/vtt"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x013e
            goto L_0x0062
        L_0x013e:
            r3 = 7
            goto L_0x0191
        L_0x0140:
            java.lang.String r2 = "application/mp4"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x014a
            goto L_0x0062
        L_0x014a:
            r3 = 6
            goto L_0x0191
        L_0x014c:
            java.lang.String r2 = "image/jpeg"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0156
            goto L_0x0062
        L_0x0156:
            r3 = 5
            goto L_0x0191
        L_0x0158:
            java.lang.String r2 = "audio/amr-wb"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0162
            goto L_0x0062
        L_0x0162:
            r3 = 4
            goto L_0x0191
        L_0x0164:
            java.lang.String r2 = "video/webm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x016e
            goto L_0x0062
        L_0x016e:
            r3 = 3
            goto L_0x0191
        L_0x0170:
            java.lang.String r2 = "video/mp2t"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0191
            goto L_0x0062
        L_0x017a:
            java.lang.String r2 = "video/mp2p"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0184
            goto L_0x0062
        L_0x0184:
            r3 = 1
            goto L_0x0191
        L_0x0186:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0190
            goto L_0x0062
        L_0x0190:
            r3 = 0
        L_0x0191:
            switch(r3) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x01a1;
                case 2: goto L_0x01a0;
                case 3: goto L_0x019f;
                case 4: goto L_0x019e;
                case 5: goto L_0x019d;
                case 6: goto L_0x019c;
                case 7: goto L_0x019b;
                case 8: goto L_0x019f;
                case 9: goto L_0x019f;
                case 10: goto L_0x019a;
                case 11: goto L_0x01a2;
                case 12: goto L_0x0199;
                case 13: goto L_0x019e;
                case 14: goto L_0x019c;
                case 15: goto L_0x0198;
                case 16: goto L_0x0197;
                case 17: goto L_0x019c;
                case 18: goto L_0x019e;
                case 19: goto L_0x01a2;
                case 20: goto L_0x0196;
                case 21: goto L_0x0195;
                case 22: goto L_0x019f;
                case 23: goto L_0x019f;
                default: goto L_0x0194;
            }
        L_0x0194:
            return r1
        L_0x0195:
            return r16
        L_0x0196:
            return r19
        L_0x0197:
            return r11
        L_0x0198:
            return r14
        L_0x0199:
            return r4
        L_0x019a:
            return r18
        L_0x019b:
            return r10
        L_0x019c:
            return r15
        L_0x019d:
            return r9
        L_0x019e:
            return r20
        L_0x019f:
            return r17
        L_0x01a0:
            return r12
        L_0x01a1:
            return r13
        L_0x01a2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a(java.lang.String):int");
    }

    public static int b(Map<String, List<String>> map) {
        List list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return -1;
    }

    public static Executor d(Executor executor, gh<?> ghVar) {
        executor.getClass();
        if (executor == uh.f8247a) {
            return executor;
        }
        return new q50(executor, ghVar);
    }

    public static void e(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(f.a(valueOf.length() + 24, "null key in entry: null=", valueOf));
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException(g.a(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
        }
    }

    public static int f(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
