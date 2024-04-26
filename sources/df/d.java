package df;

/* compiled from: SSDPSearchRequest */
public class d extends we.d {
    public d(String str, int i10) {
        this.f13211b = "1.1";
        this.f27214f = "M-SEARCH";
        this.f27215g = "*";
        s("ST", str);
        s("MX", Integer.toString(i10));
        s("MAN", "\"ssdp:discover\"");
    }
}
