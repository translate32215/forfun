package d5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q5.a;
import v5.e;
import v5.i;
import v6.e0;

/* compiled from: GaplessInfoHolder */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f13055c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f13056a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f13057b = -1;

    public final boolean a(String str) {
        Matcher matcher = f13055c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i10 = e0.f26436a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f13056a = parseInt;
            this.f13057b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean b(a aVar) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f24150a;
            if (i10 >= bVarArr.length) {
                return false;
            }
            a.b bVar = bVarArr[i10];
            if (bVar instanceof e) {
                e eVar = (e) bVar;
                if ("iTunSMPB".equals(eVar.f26394c) && a(eVar.f26395d)) {
                    return true;
                }
            } else if (bVar instanceof i) {
                i iVar = (i) bVar;
                if ("com.apple.iTunes".equals(iVar.f26406b) && "iTunSMPB".equals(iVar.f26407c) && a(iVar.f26408d)) {
                    return true;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
