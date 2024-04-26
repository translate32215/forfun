package t0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.d0;
import t0.b;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25324a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25325b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f25326c;

    /* renamed from: d  reason: collision with root package name */
    public Context f25327d;

    /* renamed from: e  reason: collision with root package name */
    public int f25328e;

    /* renamed from: f  reason: collision with root package name */
    public C0244a f25329f;

    /* renamed from: g  reason: collision with root package name */
    public DataSetObserver f25330g;

    /* renamed from: h  reason: collision with root package name */
    public b f25331h;

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    public class C0244a extends ContentObserver {
        public C0244a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f25325b && (cursor = aVar.f25326c) != null && !cursor.isClosed()) {
                aVar.f25324a = aVar.f25326c.requery();
            }
        }
    }

    /* compiled from: CursorAdapter */
    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f25324a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f25324a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        boolean z11 = true;
        char c10 = z10 ? (char) 1 : 2;
        if ((c10 & 1) == 1) {
            c10 |= 2;
            this.f25325b = true;
        } else {
            this.f25325b = false;
        }
        z11 = cursor == null ? false : z11;
        this.f25326c = cursor;
        this.f25324a = z11;
        this.f25327d = context;
        this.f25328e = z11 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((c10 & 2) == 2) {
            this.f25329f = new C0244a();
            this.f25330g = new b();
        } else {
            this.f25329f = null;
            this.f25330g = null;
        }
        if (z11) {
            C0244a aVar = this.f25329f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f25330g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f25326c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0244a aVar = this.f25329f;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f25330g;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f25326c = cursor;
            if (cursor != null) {
                C0244a aVar2 = this.f25329f;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f25330g;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f25328e = cursor.getColumnIndexOrThrow("_id");
                this.f25324a = true;
                notifyDataSetChanged();
            } else {
                this.f25328e = -1;
                this.f25324a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f25324a || (cursor = this.f25326c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f25324a) {
            return null;
        }
        this.f25326c.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f25337s.inflate(cVar.f25336r, viewGroup, false);
        }
        a(view, this.f25327d, this.f25326c);
        return view;
    }

    public Filter getFilter() {
        if (this.f25331h == null) {
            this.f25331h = new b(this);
        }
        return this.f25331h;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f25324a || (cursor = this.f25326c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f25326c;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f25324a || (cursor = this.f25326c) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f25326c.getLong(this.f25328e);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f25324a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f25326c.moveToPosition(i10)) {
            if (view == null) {
                view = d(this.f25327d, this.f25326c, viewGroup);
            }
            a(view, this.f25327d, this.f25326c);
            return view;
        } else {
            throw new IllegalStateException(d0.a("couldn't move cursor to position ", i10));
        }
    }
}
