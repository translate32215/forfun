package we;

import java.net.URL;

/* compiled from: HTTP */
public class b {
    public static final String a(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    public static final int b(String str) {
        try {
            int port = new URL(str).getPort();
            if (port <= 0) {
                return 80;
            }
            return port;
        } catch (Exception unused) {
            return 80;
        }
    }

    public static final boolean c(String str) {
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final String d(String str) {
        return e(str, true);
    }

    public static final String e(String str, boolean z10) {
        if (c(str)) {
            try {
                URL url = new URL(str);
                String path = url.getPath();
                if (z10) {
                    String query = url.getQuery();
                    if (!query.equals("")) {
                        path = String.valueOf(path) + "?" + query;
                    }
                }
                return path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            } catch (Exception unused) {
                return str;
            }
        } else if (str.length() <= 0 || str.charAt(0) == '/') {
            return str;
        } else {
            return "/" + str;
        }
    }
}
