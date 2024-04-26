package com.startapp;

import android.content.Context;
import com.startapp.o7;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final d3<AnalyticsConfig> f10809a;

    public l(Context context, d3<AnalyticsConfig> d3Var) {
        this.f10809a = d3Var;
    }

    public void a(m mVar) {
        long j10;
        long j11;
        List list;
        String group;
        m mVar2 = mVar;
        AnalyticsConfig call = this.f10809a.call();
        if (call != null && Math.random() < call.c()) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = mVar2.f10845c;
            sb2.append("preLoading");
            sb2.append('=');
            sb2.append(z10 ? 1 : 0);
            sb2.append(", ");
            if (mVar2.f10846d) {
                boolean z11 = mVar2.f10848f;
                sb2.append("appPresent");
                sb2.append('=');
                sb2.append(z11 ? 1 : 0);
                sb2.append(", ");
            }
            m.a(sb2);
            String sb3 = sb2.toString();
            sb2.delete(0, sb2.length());
            List<String> b10 = call.b();
            m.a(sb2, "adId", mVar2.f10843a, true);
            long j12 = mVar2.f10844b.f11525d;
            sb2.append("start");
            sb2.append('=');
            sb2.append(j12);
            sb2.append(", ");
            Map<String, List<String>> map = mVar2.f10844b.f11524c;
            if (map != null && (list = map.get("Server-Timing")) != null) {
                Pattern pattern = m.f10842m;
                if (pattern == null) {
                    pattern = Pattern.compile("^total;dur=(\\d+(\\.\\d*)?)$");
                    m.f10842m = pattern;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Matcher matcher = pattern.matcher((String) it.next());
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        j10 = (long) (Double.parseDouble(group) * 1000000.0d);
                        break;
                    }
                }
            }
            j10 = 0;
            if (j10 > 0) {
                m.a(sb2, "serverTotal", m.a(j10), false);
            }
            o7.a aVar = mVar2.f10844b;
            String str = sb3;
            m.a(sb2, "network", m.a((aVar.f11527f - aVar.f11526e) - j10), false);
            long j13 = mVar2.f10849g;
            if (j13 > 0) {
                m.a(sb2, "parsing", m.a(j13 - mVar2.f10844b.f11527f), false);
                if (mVar2.f10845c) {
                    long j14 = mVar2.f10850h;
                    if (j14 > 0) {
                        m.a(sb2, "beforeLoad", m.a(j14 - mVar2.f10849g), false);
                        if (mVar2.f10847e) {
                            sb2.append("preLoadingSkipped");
                            sb2.append('=');
                            sb2.append(1);
                            sb2.append(", ");
                            j11 = mVar2.f10850h;
                        } else {
                            long j15 = mVar2.f10851i;
                            if (j15 > 0) {
                                m.a(sb2, "init", m.a(j15 - mVar2.f10850h), false);
                                m.a(sb2, "loading", m.a(mVar2.f10852j - mVar2.f10851i), false);
                                boolean z12 = mVar2.f10854l;
                                sb2.append("pageFinished");
                                sb2.append('=');
                                sb2.append(z12 ? 1 : 0);
                                sb2.append(", ");
                                j11 = mVar2.f10852j;
                            } else {
                                sb2.append("error");
                                sb2.append('=');
                                sb2.append((long) mVar2.f10853k);
                                sb2.append(", ");
                                j11 = mVar2.f10850h;
                            }
                        }
                    }
                }
                j11 = mVar2.f10849g;
            } else {
                j11 = mVar2.f10844b.f11527f;
            }
            m.a(sb2, "total", m.a(j11 - mVar2.f10844b.f11526e), false);
            Map<String, List<String>> map2 = mVar2.f10844b.f11524c;
            if (!(map2 == null || b10 == null)) {
                sb2.append("headers");
                sb2.append("={");
                for (Map.Entry next : map2.entrySet()) {
                    if (b10.contains(next.getKey()) && next.getValue() != null) {
                        sb2.append((String) next.getKey());
                        sb2.append("=[");
                        for (String a10 : (List) next.getValue()) {
                            m.a(sb2, (String) null, a10, true);
                        }
                        m.a(sb2);
                        sb2.append(']');
                        sb2.append(", ");
                    }
                }
                m.a(sb2);
                sb2.append("}");
                sb2.append(", ");
            }
            m.a(sb2);
            String sb4 = sb2.toString();
            i4 i4Var = new i4(j4.f10587d);
            i4Var.f10537d = "ADM";
            i4Var.f10542i = str;
            i4Var.f10538e = sb4;
            i4Var.a();
        }
    }
}
