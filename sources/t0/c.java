package t0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public int f25335i;

    /* renamed from: r  reason: collision with root package name */
    public int f25336r;

    /* renamed from: s  reason: collision with root package name */
    public LayoutInflater f25337s;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, (Cursor) null, z10);
        this.f25336r = i10;
        this.f25335i = i10;
        this.f25337s = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
