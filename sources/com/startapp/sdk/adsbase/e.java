package com.startapp.sdk.adsbase;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.p;
import com.startapp.t9;
import com.startapp.wb;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class e implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f12333a;

    /* renamed from: b  reason: collision with root package name */
    public final b f12334b;

    /* compiled from: Sta */
    public interface b {
    }

    public e(SharedPreferences sharedPreferences) {
        this(sharedPreferences, (b) null);
    }

    /* renamed from: a */
    public a edit() {
        return new a(this.f12333a.edit(), this.f12333a.getAll(), this.f12334b);
    }

    public boolean contains(String str) {
        try {
            return this.f12333a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Map<String, ?> getAll() {
        try {
            return this.f12333a.getAll();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    public boolean getBoolean(String str, boolean z10) {
        try {
            return this.f12333a.getBoolean(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    public float getFloat(String str, float f10) {
        try {
            return this.f12333a.getFloat(str, f10);
        } catch (Throwable unused) {
            return f10;
        }
    }

    public int getInt(String str, int i10) {
        try {
            return this.f12333a.getInt(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public long getLong(String str, long j10) {
        try {
            return this.f12333a.getLong(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f12333a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        try {
            return this.f12333a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f12333a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f12333a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public e(SharedPreferences sharedPreferences, b bVar) {
        this.f12333a = sharedPreferences;
        this.f12334b = bVar;
    }

    /* compiled from: Sta */
    public static class a implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        public final SharedPreferences.Editor f12335a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, ?> f12336b;

        /* renamed from: c  reason: collision with root package name */
        public final b f12337c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12338d;

        public a(SharedPreferences.Editor editor, Map<String, ?> map, b bVar) {
            this.f12335a = editor;
            this.f12336b = map;
            this.f12337c = bVar;
        }

        public final <T> void a(String str, T t10) {
            if (this.f12337c != null && !wb.a(this.f12336b.get(str), t10)) {
                this.f12338d = true;
            }
        }

        public void apply() {
            this.f12335a.apply();
            b bVar = this.f12337c;
            if (bVar != null && this.f12338d) {
                this.f12338d = false;
                t9.f12617d.a(((p) bVar).f12533a.f12490b, MetaDataRequest.RequestReason.EXTRAS);
            }
        }

        public SharedPreferences.Editor clear() {
            if (!this.f12336b.isEmpty()) {
                this.f12338d = true;
            }
            this.f12335a.clear();
            return this;
        }

        public boolean commit() {
            return this.f12335a.commit();
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            a(str, Boolean.valueOf(z10));
            this.f12335a.putBoolean(str, z10);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f10) {
            a(str, Float.valueOf(f10));
            this.f12335a.putFloat(str, f10);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i10) {
            a(str, Integer.valueOf(i10));
            this.f12335a.putInt(str, i10);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j10) {
            a(str, Long.valueOf(j10));
            this.f12335a.putLong(str, j10);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            a(str, str2);
            this.f12335a.putString(str, str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set set) {
            a(str, set);
            this.f12335a.putStringSet(str, set);
            return this;
        }

        public a a(String str, String str2) {
            a(str, str2);
            this.f12335a.putString(str, str2);
            return this;
        }

        public a a(String str, int i10) {
            a(str, Integer.valueOf(i10));
            this.f12335a.putInt(str, i10);
            return this;
        }

        public a a(String str, long j10) {
            a(str, Long.valueOf(j10));
            this.f12335a.putLong(str, j10);
            return this;
        }

        /* renamed from: a */
        public a remove(String str) {
            if (this.f12336b.containsKey(str)) {
                this.f12338d = true;
            }
            this.f12335a.remove(str);
            return this;
        }
    }
}
