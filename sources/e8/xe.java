package e8;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.oe;
import d7.l;
import f7.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xe implements we {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17483a = 2;

    /* renamed from: b  reason: collision with root package name */
    public Object f17484b;

    public xe(Context context) {
        this.f17484b = l.B.f13188e.l(context);
    }

    public final void a(Map map) {
        Object obj;
        switch (this.f17483a) {
            case 0:
                ((d0) this.f17484b).c(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        oe oeVar = (oe) this.f17484b;
                        if (Boolean.parseBoolean(str)) {
                            oeVar.b(1, 2);
                            return;
                        } else {
                            oeVar.b(2, 1);
                            return;
                        }
                    } catch (Exception unused) {
                        throw new IllegalStateException("Invalid render_in_browser state");
                    }
                } else {
                    return;
                }
            default:
                if (((CookieManager) this.f17484b) != null) {
                    if (((String) map.get("clear")) != null) {
                        String str2 = (String) ti0.f16763j.f16769f.a(t.f16645r0);
                        String cookie = ((CookieManager) this.f17484b).getCookie(str2);
                        if (cookie != null) {
                            k40 k40 = new k40(new gz((lg) new g40(';')));
                            gz gzVar = k40.f15238b;
                            gzVar.getClass();
                            l40 l40 = new l40(gzVar, k40, cookie);
                            ArrayList arrayList = new ArrayList();
                            while (l40.hasNext()) {
                                arrayList.add((String) l40.next());
                            }
                            List unmodifiableList = Collections.unmodifiableList(arrayList);
                            for (int i10 = 0; i10 < unmodifiableList.size(); i10++) {
                                CookieManager cookieManager = (CookieManager) this.f17484b;
                                String str3 = (String) unmodifiableList.get(i10);
                                k40 k402 = new k40(new gz((lg) new g40('=')));
                                str3.getClass();
                                m40 m40 = new m40(k402, str3);
                                if (m40 instanceof List) {
                                    obj = ((List) m40).get(0);
                                } else {
                                    kg kgVar = (kg) m40.iterator();
                                    if (kgVar.hasNext()) {
                                        obj = kgVar.next();
                                    } else {
                                        throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                                    }
                                }
                                String valueOf = String.valueOf((String) obj);
                                String valueOf2 = String.valueOf((String) ti0.f16763j.f16769f.a(t.f16591i0));
                                cookieManager.setCookie(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                            }
                            return;
                        }
                        return;
                    }
                    String str4 = (String) map.get("cookie");
                    if (!TextUtils.isEmpty(str4)) {
                        ((CookieManager) this.f17484b).setCookie((String) ti0.f16763j.f16769f.a(t.f16645r0), str4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xe(oe oeVar) {
        this.f17484b = oeVar;
    }

    public xe(d0 d0Var) {
        this.f17484b = d0Var;
    }
}
