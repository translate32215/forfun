package ke;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CipherSuite */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<String> f20703b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, g> f20704c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f20705d;

    /* renamed from: e  reason: collision with root package name */
    public static final g f20706e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f20707f;

    /* renamed from: g  reason: collision with root package name */
    public static final g f20708g;

    /* renamed from: h  reason: collision with root package name */
    public static final g f20709h;

    /* renamed from: i  reason: collision with root package name */
    public static final g f20710i;

    /* renamed from: j  reason: collision with root package name */
    public static final g f20711j;

    /* renamed from: k  reason: collision with root package name */
    public static final g f20712k;

    /* renamed from: l  reason: collision with root package name */
    public static final g f20713l;

    /* renamed from: m  reason: collision with root package name */
    public static final g f20714m;

    /* renamed from: n  reason: collision with root package name */
    public static final g f20715n;

    /* renamed from: o  reason: collision with root package name */
    public static final g f20716o;

    /* renamed from: p  reason: collision with root package name */
    public static final g f20717p;

    /* renamed from: q  reason: collision with root package name */
    public static final g f20718q;

    /* renamed from: r  reason: collision with root package name */
    public static final g f20719r;

    /* renamed from: s  reason: collision with root package name */
    public static final g f20720s;

    /* renamed from: t  reason: collision with root package name */
    public static final g f20721t;

    /* renamed from: u  reason: collision with root package name */
    public static final g f20722u;

    /* renamed from: a  reason: collision with root package name */
    public final String f20723a;

    /* compiled from: CipherSuite */
    public class a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            int i10 = 4;
            while (true) {
                if (i10 < min) {
                    char charAt = str.charAt(i10);
                    char charAt2 = str2.charAt(i10);
                    if (charAt == charAt2) {
                        i10++;
                    } else if (charAt < charAt2) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f20704c = linkedHashMap;
        linkedHashMap.put("SSL_RSA_WITH_NULL_MD5", new g("SSL_RSA_WITH_NULL_MD5"));
        linkedHashMap.put("SSL_RSA_WITH_NULL_SHA", new g("SSL_RSA_WITH_NULL_SHA"));
        linkedHashMap.put("SSL_RSA_EXPORT_WITH_RC4_40_MD5", new g("SSL_RSA_EXPORT_WITH_RC4_40_MD5"));
        linkedHashMap.put("SSL_RSA_WITH_RC4_128_MD5", new g("SSL_RSA_WITH_RC4_128_MD5"));
        linkedHashMap.put("SSL_RSA_WITH_RC4_128_SHA", new g("SSL_RSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_RSA_WITH_DES_CBC_SHA", new g("SSL_RSA_WITH_DES_CBC_SHA"));
        g gVar = new g("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        linkedHashMap.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", gVar);
        f20705d = gVar;
        linkedHashMap.put("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_DSS_WITH_DES_CBC_SHA", new g("SSL_DHE_DSS_WITH_DES_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", new g("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_RSA_WITH_DES_CBC_SHA", new g("SSL_DHE_RSA_WITH_DES_CBC_SHA"));
        linkedHashMap.put("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", new g("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", new g("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"));
        linkedHashMap.put("SSL_DH_anon_WITH_RC4_128_MD5", new g("SSL_DH_anon_WITH_RC4_128_MD5"));
        linkedHashMap.put("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", new g("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"));
        linkedHashMap.put("SSL_DH_anon_WITH_DES_CBC_SHA", new g("SSL_DH_anon_WITH_DES_CBC_SHA"));
        linkedHashMap.put("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", new g("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_DES_CBC_SHA", new g("TLS_KRB5_WITH_DES_CBC_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", new g("TLS_KRB5_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_RC4_128_SHA", new g("TLS_KRB5_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_KRB5_WITH_DES_CBC_MD5", new g("TLS_KRB5_WITH_DES_CBC_MD5"));
        linkedHashMap.put("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", new g("TLS_KRB5_WITH_3DES_EDE_CBC_MD5"));
        linkedHashMap.put("TLS_KRB5_WITH_RC4_128_MD5", new g("TLS_KRB5_WITH_RC4_128_MD5"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", new g("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", new g("TLS_KRB5_EXPORT_WITH_RC4_40_SHA"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", new g("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"));
        linkedHashMap.put("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", new g("TLS_KRB5_EXPORT_WITH_RC4_40_MD5"));
        g gVar2 = new g("TLS_RSA_WITH_AES_128_CBC_SHA");
        linkedHashMap.put("TLS_RSA_WITH_AES_128_CBC_SHA", gVar2);
        f20706e = gVar2;
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new g("TLS_DHE_DSS_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", new g("TLS_DHE_RSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_128_CBC_SHA", new g("TLS_DH_anon_WITH_AES_128_CBC_SHA"));
        g gVar3 = new g("TLS_RSA_WITH_AES_256_CBC_SHA");
        linkedHashMap.put("TLS_RSA_WITH_AES_256_CBC_SHA", gVar3);
        f20707f = gVar3;
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new g("TLS_DHE_DSS_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", new g("TLS_DHE_RSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_256_CBC_SHA", new g("TLS_DH_anon_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_RSA_WITH_NULL_SHA256", new g("TLS_RSA_WITH_NULL_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_AES_256_CBC_SHA256", new g("TLS_RSA_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", new g("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", new g("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", new g("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", new g("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", new g("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", new g("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_128_CBC_SHA256", new g("TLS_DH_anon_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", new g("TLS_DH_anon_WITH_AES_256_CBC_SHA256"));
        linkedHashMap.put("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new g("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", new g("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", new g("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_RC4_128_SHA", new g("TLS_PSK_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_3DES_EDE_CBC_SHA", new g("TLS_PSK_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_AES_128_CBC_SHA", new g("TLS_PSK_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_PSK_WITH_AES_256_CBC_SHA", new g("TLS_PSK_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_RSA_WITH_SEED_CBC_SHA", new g("TLS_RSA_WITH_SEED_CBC_SHA"));
        g gVar4 = new g("TLS_RSA_WITH_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_RSA_WITH_AES_128_GCM_SHA256", gVar4);
        f20708g = gVar4;
        g gVar5 = new g("TLS_RSA_WITH_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_RSA_WITH_AES_256_GCM_SHA384", gVar5);
        f20709h = gVar5;
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new g("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", new g("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", new g("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", new g("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_128_GCM_SHA256", new g("TLS_DH_anon_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_DH_anon_WITH_AES_256_GCM_SHA384", new g("TLS_DH_anon_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", new g("TLS_EMPTY_RENEGOTIATION_INFO_SCSV"));
        linkedHashMap.put("TLS_FALLBACK_SCSV", new g("TLS_FALLBACK_SCSV"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_NULL_SHA", new g("TLS_ECDH_ECDSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", new g("TLS_ECDH_ECDSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", new g("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", new g("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_NULL_SHA", new g("TLS_ECDHE_ECDSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", new g("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", new g("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", new g("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_NULL_SHA", new g("TLS_ECDH_RSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_RC4_128_SHA", new g("TLS_ECDH_RSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", new g("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", new g("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_NULL_SHA", new g("TLS_ECDHE_RSA_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new g("TLS_ECDHE_RSA_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"));
        g gVar6 = new g("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", gVar6);
        f20710i = gVar6;
        g gVar7 = new g("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", gVar7);
        f20711j = gVar7;
        linkedHashMap.put("TLS_ECDH_anon_WITH_NULL_SHA", new g("TLS_ECDH_anon_WITH_NULL_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_RC4_128_SHA", new g("TLS_ECDH_anon_WITH_RC4_128_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", new g("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", new g("TLS_ECDH_anon_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", new g("TLS_ECDH_anon_WITH_AES_256_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", new g("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", new g("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"));
        g gVar8 = new g("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", gVar8);
        f20712k = gVar8;
        g gVar9 = new g("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", gVar9);
        f20713l = gVar9;
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new g("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", new g("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"));
        g gVar10 = new g("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", gVar10);
        f20714m = gVar10;
        g gVar11 = new g("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", gVar11);
        f20715n = gVar11;
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new g("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"));
        linkedHashMap.put("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", new g("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"));
        linkedHashMap.put("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", new g("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"));
        linkedHashMap.put("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", new g("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"));
        g gVar12 = new g("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        linkedHashMap.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", gVar12);
        f20716o = gVar12;
        g gVar13 = new g("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        linkedHashMap.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", gVar13);
        f20717p = gVar13;
        linkedHashMap.put("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new g("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"));
        linkedHashMap.put("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", new g("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"));
        g gVar14 = new g("TLS_AES_128_GCM_SHA256");
        linkedHashMap.put("TLS_AES_128_GCM_SHA256", gVar14);
        f20718q = gVar14;
        g gVar15 = new g("TLS_AES_256_GCM_SHA384");
        linkedHashMap.put("TLS_AES_256_GCM_SHA384", gVar15);
        f20719r = gVar15;
        g gVar16 = new g("TLS_CHACHA20_POLY1305_SHA256");
        linkedHashMap.put("TLS_CHACHA20_POLY1305_SHA256", gVar16);
        f20720s = gVar16;
        g gVar17 = new g("TLS_AES_128_CCM_SHA256");
        linkedHashMap.put("TLS_AES_128_CCM_SHA256", gVar17);
        f20721t = gVar17;
        g gVar18 = new g("TLS_AES_256_CCM_8_SHA256");
        linkedHashMap.put("TLS_AES_256_CCM_8_SHA256", gVar18);
        f20722u = gVar18;
    }

    public g(String str) {
        str.getClass();
        this.f20723a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = f20704c;
            gVar = (g) ((LinkedHashMap) map).get(str);
            if (gVar == null) {
                gVar = (g) ((LinkedHashMap) map).get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    public static String b(String str) {
        if (str.startsWith("TLS_")) {
            StringBuilder a10 = android.support.v4.media.a.a("SSL_");
            a10.append(str.substring(4));
            return a10.toString();
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            StringBuilder a11 = android.support.v4.media.a.a("TLS_");
            a11.append(str.substring(4));
            return a11.toString();
        }
    }

    public String toString() {
        return this.f20723a;
    }
}
