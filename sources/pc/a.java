package pc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.startapp.startappsdk.R;
import db.f;
import db.i;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import jf.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import t4.q;
import ud.l;

/* compiled from: CoreApp.kt */
public final class a extends l implements td.l<k<? extends Object>, com.google.firebase.remoteconfig.a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23973b = new a();

    public a() {
        super(1);
    }

    public Object c(Object obj) {
        ud.k.f((k) obj, "$this$singleton");
        com.google.firebase.a b10 = com.google.firebase.a.b();
        b10.a();
        com.google.firebase.remoteconfig.a c10 = ((i) b10.f9665d.a(i.class)).c();
        f.b bVar = new f.b();
        bVar.f13226a = 0;
        s8.l.c(c10.f9754c, new db.a(c10, new f(bVar, (f.a) null)));
        Context context = c10.f9752a;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.config);
                String str = null;
                String str2 = null;
                String str3 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (str2 == null || str3 == null) {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                hashMap.put(str2, str3);
                            }
                            str2 = null;
                            str3 = null;
                        }
                        str = null;
                    } else if (eventType == 4 && str != null) {
                        char c11 = 65535;
                        int hashCode = str.hashCode();
                        if (hashCode != 106079) {
                            if (hashCode == 111972721) {
                                if (str.equals("value")) {
                                    c11 = 1;
                                }
                            }
                        } else if (str.equals("key")) {
                            c11 = 0;
                        }
                        if (c11 == 0) {
                            str2 = xml.getText();
                        } else if (c11 != 1) {
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            str3 = xml.getText();
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException e10) {
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e10);
        }
        try {
            Date date = b.f9776f;
            new JSONObject();
            c10.f9757f.c(new b(new JSONObject(hashMap), b.f9776f, new JSONArray(), new JSONObject())).n(q.f25722c);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e11);
            s8.l.e(null);
        }
        return c10;
    }
}
