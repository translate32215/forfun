package n7;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzft;
import java.util.HashMap;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f22374a;

    public l(c cVar) {
        this.f22374a = cVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        String str;
        for (z zVar : this.f22374a.f22352g) {
            if (zVar.f22405b == 0) {
                if (zVar.zzC().a() >= Math.max(1000, zVar.f22406c) + zVar.f22408e) {
                    zVar.f22407d = true;
                }
            }
            zVar.f22405b++;
            if (zVar.f22404a) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    h hVar = zVar.f22409f;
                    Uri data = intent.getData();
                    hVar.getClass();
                    if (data != null && !data.isOpaque()) {
                        String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            Uri parse = Uri.parse("http://hostname/?".concat(String.valueOf(queryParameter)));
                            String queryParameter2 = parse.getQueryParameter("utm_id");
                            if (queryParameter2 != null) {
                                hVar.f22360b.put("&ci", queryParameter2);
                            }
                            String queryParameter3 = parse.getQueryParameter("anid");
                            if (queryParameter3 != null) {
                                hVar.f22360b.put("&anid", queryParameter3);
                            }
                            String queryParameter4 = parse.getQueryParameter("utm_campaign");
                            if (queryParameter4 != null) {
                                hVar.f22360b.put("&cn", queryParameter4);
                            }
                            String queryParameter5 = parse.getQueryParameter("utm_content");
                            if (queryParameter5 != null) {
                                hVar.f22360b.put("&cc", queryParameter5);
                            }
                            String queryParameter6 = parse.getQueryParameter("utm_medium");
                            if (queryParameter6 != null) {
                                hVar.f22360b.put("&cm", queryParameter6);
                            }
                            String queryParameter7 = parse.getQueryParameter("utm_source");
                            if (queryParameter7 != null) {
                                hVar.f22360b.put("&cs", queryParameter7);
                            }
                            String queryParameter8 = parse.getQueryParameter("utm_term");
                            if (queryParameter8 != null) {
                                hVar.f22360b.put("&ck", queryParameter8);
                            }
                            String queryParameter9 = parse.getQueryParameter("dclid");
                            if (queryParameter9 != null) {
                                hVar.f22360b.put("&dclid", queryParameter9);
                            }
                            String queryParameter10 = parse.getQueryParameter("gclid");
                            if (queryParameter10 != null) {
                                hVar.f22360b.put("&gclid", queryParameter10);
                            }
                            String queryParameter11 = parse.getQueryParameter("aclid");
                            if (queryParameter11 != null) {
                                hVar.f22360b.put("&aclid", queryParameter11);
                            }
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                h hVar2 = zVar.f22409f;
                zzft zzft = hVar2.f22364f;
                if (zzft != null) {
                    str = activity.getClass().getCanonicalName();
                    String str2 = (String) zzft.zzg.get(str);
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    str = activity.getClass().getCanonicalName();
                }
                hVar2.o("&cd", str);
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    Intent intent2 = activity.getIntent();
                    String str3 = null;
                    if (intent2 != null) {
                        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            str3 = stringExtra;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        hashMap.put("&dr", str3);
                    }
                }
                zVar.f22409f.i(hashMap);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        for (z zVar : this.f22374a.f22352g) {
            int i10 = zVar.f22405b - 1;
            zVar.f22405b = i10;
            int max = Math.max(0, i10);
            zVar.f22405b = max;
            if (max == 0) {
                zVar.f22408e = zVar.zzC().a();
            }
        }
    }
}
