package z7;

import cb.d;
import i8.i;
import i8.j;
import i8.k;
import i8.m;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class g {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    public static Map<String, String> a(URI uri, String str) {
        String str2;
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        HashMap hashMap = emptyMap;
        if (rawQuery != null) {
            hashMap = emptyMap;
            if (rawQuery.length() > 0) {
                HashMap hashMap2 = new HashMap();
                d dVar = new d((j) new i8.g('='));
                i iVar = i.f19330a;
                m mVar = new m(dVar, false, iVar);
                m mVar2 = new m(new d((j) new i8.g('&')), true, iVar);
                k kVar = new k(mVar2.f19340c, mVar2, rawQuery);
                while (kVar.hasNext()) {
                    String str3 = (String) kVar.next();
                    str3.getClass();
                    k kVar2 = new k(mVar.f19340c, mVar, str3);
                    ArrayList arrayList = new ArrayList();
                    while (kVar2.hasNext()) {
                        arrayList.add((String) kVar2.next());
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    try {
                        String decode = URLDecoder.decode((String) unmodifiableList.get(0), str);
                        if (unmodifiableList.size() == 2) {
                            try {
                                str2 = URLDecoder.decode((String) unmodifiableList.get(1), str);
                            } catch (UnsupportedEncodingException e10) {
                                throw new IllegalArgumentException(e10);
                            }
                        } else {
                            str2 = null;
                        }
                        hashMap2.put(decode, str2);
                    } catch (UnsupportedEncodingException e11) {
                        throw new IllegalArgumentException(e11);
                    }
                }
                hashMap = hashMap2;
            }
        }
        return hashMap;
    }
}
