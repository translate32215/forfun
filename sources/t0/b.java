package t0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.a1;

/* compiled from: CursorFilter */
public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f25334a;

    /* compiled from: CursorFilter */
    public interface a {
    }

    public b(a aVar) {
        this.f25334a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return ((a1) this.f25334a).c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            t0.b$a r0 = r4.f25334a
            androidx.appcompat.widget.a1 r0 = (androidx.appcompat.widget.a1) r0
            r0.getClass()
            if (r5 != 0) goto L_0x000c
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x000c:
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f803t
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0038
            androidx.appcompat.widget.SearchView r1 = r0.f803t
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x0038
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f804u     // Catch:{ RuntimeException -> 0x0030 }
            r3 = 50
            android.database.Cursor r5 = r0.g(r1, r5, r3)     // Catch:{ RuntimeException -> 0x0030 }
            if (r5 == 0) goto L_0x0038
            r5.getCount()     // Catch:{ RuntimeException -> 0x0030 }
            goto L_0x0039
        L_0x0030:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L_0x0038:
            r5 = r2
        L_0x0039:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0049
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x004e
        L_0x0049:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f25334a;
        Cursor cursor = ((a) aVar).f25326c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((a1) aVar).b((Cursor) obj);
        }
    }
}
