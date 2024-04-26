package e8;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.w7;
import f7.b0;
import java.util.HashMap;
import java.util.Map;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xa implements f3<ia> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17455a;

    public static int a(Context context, Map<String, String> map, String str, int i10) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i10;
        }
        try {
            y8 y8Var = ti0.f16763j.f16764a;
            return y8.a(context.getResources().getDisplayMetrics(), Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 34);
            sb2.append("Could not parse ");
            sb2.append(str);
            sb2.append(" in a video GMSG: ");
            sb2.append(str2);
            e.K(sb2.toString());
            return i10;
        }
    }

    public static void b(i7 i7Var, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                i7Var.f6926f.p(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                e.K(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            i7Var.f6926f.q(Integer.parseInt(str2));
        }
        if (str3 != null) {
            i7Var.f6926f.r(Integer.parseInt(str3));
        }
        if (str4 != null) {
            i7Var.f6926f.s(Integer.parseInt(str4));
        }
        if (str5 != null) {
            i7Var.f6926f.t(Integer.parseInt(str5));
        }
    }

    public final void f(Object obj, Map map) {
        int i10;
        boolean z10;
        int i11;
        Map map2 = map;
        ia iaVar = (ia) obj;
        String str = (String) map2.get("action");
        if (str == null) {
            e.K("Action missing from video GMSG.");
            return;
        }
        if (e.h(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(o.a(jSONObject2, str.length() + 13));
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(jSONObject2);
            e.E(sb2.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map2.get("color");
            if (TextUtils.isEmpty(str2)) {
                e.K("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                iaVar.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                e.K("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map2.get("mimeTypes");
                if (str3 == null) {
                    e.K("No MIME types specified for decoder properties inspection.");
                    int i12 = i7.f6920z;
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    iaVar.O("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str4 : str3.split(",")) {
                    hashMap2.put(str4, b0.b(str4.trim()));
                }
                int i13 = i7.f6920z;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                iaVar.O("onVideoEvent", hashMap3);
                return;
            }
            da t02 = iaVar.t0();
            if (t02 == null) {
                e.K("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = iaVar.getContext();
                int a10 = a(context, map2, "x", 0);
                int a11 = a(context, map2, "y", 0);
                int a12 = a(context, map2, "w", -1);
                int a13 = a(context, map2, "h", -1);
                int min = Math.min(a12, iaVar.T() - a10);
                int min2 = Math.min(a13, iaVar.y() - a11);
                try {
                    i10 = Integer.parseInt((String) map2.get("player"));
                } catch (NumberFormatException unused2) {
                    i10 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                if (!equals || t02.a() != null) {
                    i.d("The underlay may only be modified from the UI thread.");
                    i7 i7Var = t02.f14231d;
                    if (i7Var != null) {
                        i7Var.g(a10, a11, min, min2);
                        return;
                    }
                    return;
                }
                ja jaVar = new ja((String) map2.get("flags"));
                if (t02.f14231d == null) {
                    g.b(t02.f14229b.i().f6910b, t02.f14229b.l(), "vpr2");
                    Context context2 = t02.f14228a;
                    ia iaVar2 = t02.f14229b;
                    i7 i7Var2 = new i7(context2, iaVar2, i10, parseBoolean, iaVar2.i().f6910b, jaVar);
                    t02.f14231d = i7Var2;
                    t02.f14230c.addView(i7Var2, 0, new ViewGroup.LayoutParams(-1, -1));
                    t02.f14231d.g(a10, a11, min, min2);
                    t02.f14229b.J(false);
                }
                i7 a14 = t02.a();
                if (a14 != null) {
                    b(a14, map2);
                    return;
                }
                return;
            }
            w7 o10 = iaVar.o();
            if (o10 != null) {
                if ("timeupdate".equals(str)) {
                    String str5 = (String) map2.get("currentTime");
                    if (str5 == null) {
                        e.K("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        float parseFloat = Float.parseFloat(str5);
                        synchronized (o10.f8419b) {
                            o10.f8427r = parseFloat;
                        }
                        return;
                    } catch (NumberFormatException unused3) {
                        e.K(str5.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str5) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    synchronized (o10.f8419b) {
                        z10 = o10.f8425h;
                        i11 = o10.f8422e;
                        o10.f8422e = 3;
                    }
                    o10.u6(i11, 3, z10, z10);
                    return;
                }
            }
            i7 a15 = t02.a();
            if (a15 == null) {
                int i14 = i7.f6920z;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                iaVar.O("onVideoEvent", hashMap4);
            } else if ("click".equals(str)) {
                Context context3 = iaVar.getContext();
                int a16 = a(context3, map2, "x", 0);
                int a17 = a(context3, map2, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a16, (float) a17, 0);
                aa aaVar = a15.f6926f;
                if (aaVar != null) {
                    aaVar.dispatchTouchEvent(obtain);
                }
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str6 = (String) map2.get("time");
                if (str6 == null) {
                    e.K("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    int parseFloat2 = (int) (Float.parseFloat(str6) * 1000.0f);
                    aa aaVar2 = a15.f6926f;
                    if (aaVar2 != null) {
                        aaVar2.h(parseFloat2);
                    }
                } catch (NumberFormatException unused4) {
                    e.K(str6.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str6) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                a15.setVisibility(4);
            } else if ("load".equals(str)) {
                if (a15.f6926f != null) {
                    if (!TextUtils.isEmpty(a15.f6933u)) {
                        a15.f6926f.o(a15.f6933u, a15.f6934v);
                    } else {
                        a15.h("no_src", new String[0]);
                    }
                }
            } else if ("loadControl".equals(str)) {
                b(a15, map2);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map2.get("muted"))) {
                    aa aaVar3 = a15.f6926f;
                    if (aaVar3 != null) {
                        ma maVar = aaVar3.f13669b;
                        maVar.f15479e = true;
                        maVar.b();
                        aaVar3.a();
                        return;
                    }
                    return;
                }
                aa aaVar4 = a15.f6926f;
                if (aaVar4 != null) {
                    ma maVar2 = aaVar4.f13669b;
                    maVar2.f15479e = false;
                    maVar2.b();
                    aaVar4.a();
                }
            } else if ("pause".equals(str)) {
                aa aaVar5 = a15.f6926f;
                if (aaVar5 != null) {
                    aaVar5.e();
                }
            } else if ("play".equals(str)) {
                aa aaVar6 = a15.f6926f;
                if (aaVar6 != null) {
                    aaVar6.g();
                }
            } else if ("show".equals(str)) {
                a15.setVisibility(0);
            } else if ("src".equals(str)) {
                String str7 = (String) map2.get("src");
                Integer num = null;
                if (map2.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map2.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused5) {
                        String str8 = (String) map2.get("periodicReportIntervalMs");
                        StringBuilder sb3 = new StringBuilder(o.a(str8, 65));
                        sb3.append("Video gmsg invalid numeric parameter '");
                        sb3.append("periodicReportIntervalMs");
                        sb3.append("': ");
                        sb3.append(str8);
                        e.K(sb3.toString());
                    }
                }
                String[] strArr = {str7};
                String str9 = (String) map2.get("demuxed");
                if (str9 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str9);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                            strArr2[i15] = jSONArray.getString(i15);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused6) {
                        e.K(str9.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str9) : new String("Malformed demuxed URL list for playback: "));
                        strArr = new String[]{str7};
                    }
                }
                if (num != null) {
                    iaVar.d0(num.intValue());
                }
                a15.f6933u = str7;
                a15.f6934v = strArr;
            } else if ("touchMove".equals(str)) {
                Context context4 = iaVar.getContext();
                int a18 = a(context4, map2, "dx", 0);
                int a19 = a(context4, map2, "dy", 0);
                float f10 = (float) a18;
                float f11 = (float) a19;
                aa aaVar7 = a15.f6926f;
                if (aaVar7 != null) {
                    aaVar7.j(f10, f11);
                }
                if (!this.f17455a) {
                    iaVar.j0();
                    this.f17455a = true;
                }
            } else if ("volume".equals(str)) {
                String str10 = (String) map2.get("volume");
                if (str10 == null) {
                    e.K("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    a15.setVolume(Float.parseFloat(str10));
                } catch (NumberFormatException unused7) {
                    e.K(str10.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str10) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                a15.d();
            } else {
                e.K(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
            }
        }
    }
}
