package com.startapp;

import com.startapp.common.parser.JSONStreamException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class i5 {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Class> f10545a;

    static {
        HashMap hashMap = new HashMap();
        f10545a = hashMap;
        hashMap.put("int[]", Integer.class);
        f10545a.put("long[]", Long.class);
        f10545a.put("double[]", Double.class);
        f10545a.put("float[]", Float.class);
        f10545a.put("bool[]", Boolean.class);
        f10545a.put("char[]", Character.class);
        f10545a.put("byte[]", Byte.class);
        f10545a.put("void[]", Void.class);
        f10545a.put("short[]", Short.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0277, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027f, code lost:
        throw new com.startapp.common.parser.JSONStreamException("Unknown error occurred ", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012e A[Catch:{ Exception -> 0x0280, all -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016d A[Catch:{ Exception -> 0x0280, all -> 0x0277 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0277 A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:42:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(java.lang.Class<T> r19, org.json.JSONObject r20) throws com.startapp.common.parser.JSONStreamException {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "Problem instantiating object class "
            java.lang.Class<com.startapp.pb> r3 = com.startapp.pb.class
            java.lang.Class<com.startapp.nb> r4 = com.startapp.nb.class
            java.lang.annotation.Annotation r4 = r0.getAnnotation(r4)     // Catch:{ Exception -> 0x0288 }
            com.startapp.nb r4 = (com.startapp.nb) r4     // Catch:{ Exception -> 0x0288 }
            java.lang.Class<java.net.HttpCookie> r5 = java.net.HttpCookie.class
            boolean r5 = r0.equals(r5)     // Catch:{ Exception -> 0x0288 }
            java.lang.String r6 = "."
            r7 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0035
            java.lang.reflect.Constructor[] r2 = r19.getDeclaredConstructors()     // Catch:{ Exception -> 0x0288 }
            r2 = r2[r9]     // Catch:{ Exception -> 0x0288 }
            r2.setAccessible(r7)     // Catch:{ Exception -> 0x0288 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0288 }
            java.lang.String r10 = "name"
            r5[r9] = r10     // Catch:{ Exception -> 0x0288 }
            java.lang.String r10 = "value"
            r5[r7] = r10     // Catch:{ Exception -> 0x0288 }
            java.lang.Object r2 = r2.newInstance(r5)     // Catch:{ Exception -> 0x0288 }
            goto L_0x009b
        L_0x0035:
            boolean r5 = r19.isPrimitive()     // Catch:{ Exception -> 0x0288 }
            if (r5 == 0) goto L_0x0040
            java.lang.Object r0 = r19.newInstance()     // Catch:{ Exception -> 0x0288 }
            return r0
        L_0x0040:
            java.lang.Class<com.startapp.nb> r5 = com.startapp.nb.class
            java.lang.annotation.Annotation r5 = r0.getAnnotation(r5)     // Catch:{ Exception -> 0x0288 }
            if (r5 == 0) goto L_0x008c
            boolean r5 = r4.extendsClass()     // Catch:{ Exception -> 0x0288 }
            if (r5 == 0) goto L_0x004f
            goto L_0x008c
        L_0x004f:
            boolean r5 = r4.extendsClass()     // Catch:{ Exception -> 0x0288 }
            if (r5 != 0) goto L_0x008a
            java.lang.String r0 = r4.decider()     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            java.lang.String r3 = r4.packageName()     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            r4.append(r3)     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            r4.append(r6)     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            r4.append(r0)     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            java.lang.String r0 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            java.lang.Object r0 = a(r0, (org.json.JSONObject) r1)     // Catch:{ ClassNotFoundException -> 0x0083, JSONException -> 0x007c }
            return r0
        L_0x007c:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException     // Catch:{ Exception -> 0x0288 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0288 }
            throw r1     // Catch:{ Exception -> 0x0288 }
        L_0x0083:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException     // Catch:{ Exception -> 0x0288 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0288 }
            throw r1     // Catch:{ Exception -> 0x0288 }
        L_0x008a:
            r2 = 0
            goto L_0x009b
        L_0x008c:
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0288 }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x0288 }
            r2.setAccessible(r7)     // Catch:{ Exception -> 0x0288 }
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0288 }
            java.lang.Object r2 = r2.newInstance(r5)     // Catch:{ Exception -> 0x0288 }
        L_0x009b:
            java.lang.reflect.Field[] r5 = r19.getDeclaredFields()
            if (r4 == 0) goto L_0x00bc
            boolean r4 = r4.extendsClass()
            if (r4 == 0) goto L_0x00bc
            int r4 = r5.length
            java.lang.Class r0 = r19.getSuperclass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r10 = r0.length
            int r11 = r4 + r10
            java.lang.reflect.Field[] r11 = new java.lang.reflect.Field[r11]
            java.lang.System.arraycopy(r5, r9, r11, r9, r4)
            java.lang.System.arraycopy(r0, r9, r11, r4, r10)
            r5 = r11
        L_0x00bc:
            int r0 = r5.length
            r4 = 0
        L_0x00be:
            if (r4 >= r0) goto L_0x0287
            r10 = r5[r4]
            int r11 = r10.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r11)
            if (r12 != 0) goto L_0x0280
            boolean r11 = java.lang.reflect.Modifier.isTransient(r11)
            if (r11 == 0) goto L_0x00d4
            goto L_0x0280
        L_0x00d4:
            java.lang.String r11 = com.startapp.l5.a(r10)
            boolean r12 = r1.has(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r12 == 0) goto L_0x0280
            r10.setAccessible(r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.annotation.Annotation[] r12 = r10.getDeclaredAnnotations()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            int r12 = r12.length     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r12 <= 0) goto L_0x0119
            java.lang.annotation.Annotation[] r12 = r10.getDeclaredAnnotations()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r12 = r12[r9]     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r13 = r12.annotationType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class<com.startapp.ob> r14 = com.startapp.ob.class
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r13 == 0) goto L_0x0119
            com.startapp.ob r12 = (com.startapp.ob) r12     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r13 = r12.type()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r14 = r12.key()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r15 = r12.value()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            boolean r16 = r12.complex()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r17 = r12.innerValue()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r12 = r12.parser()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r7 = r17
            r18 = 1
            goto L_0x0122
        L_0x0119:
            r12 = r3
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
        L_0x0122:
            java.lang.Class r9 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class<com.startapp.nb> r8 = com.startapp.nb.class
            java.lang.annotation.Annotation r8 = r9.getAnnotation(r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r8 == 0) goto L_0x016d
            java.lang.Class r7 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class<com.startapp.nb> r8 = com.startapp.nb.class
            java.lang.annotation.Annotation r7 = r7.getAnnotation(r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            com.startapp.nb r7 = (com.startapp.nb) r7     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            org.json.JSONObject r8 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.String r9 = r7.decider()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.String r8 = r8.getString(r9)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.String r7 = r7.packageName()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r9.<init>()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r9.append(r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r9.append(r6)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r9.append(r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            org.json.JSONObject r8 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Object r7 = a(r7, (org.json.JSONObject) r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x016d:
            if (r12 == r3) goto L_0x0186
            java.lang.Object r7 = r12.newInstance()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            com.startapp.pb r7 = (com.startapp.pb) r7     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r8 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Object r9 = r1.opt(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Object r7 = r7.parse(r8, r9)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x0186:
            if (r16 == 0) goto L_0x0199
            java.lang.Class r7 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            org.json.JSONObject r8 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Object r7 = a(r7, (org.json.JSONObject) r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x0199:
            if (r18 == 0) goto L_0x0218
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            boolean r8 = r8.isAssignableFrom(r13)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r8 != 0) goto L_0x01ab
            java.lang.Class<java.util.Collection> r8 = java.util.Collection.class
            boolean r8 = r8.isAssignableFrom(r13)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r8 == 0) goto L_0x0218
        L_0x01ab:
            java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
            boolean r8 = r13.equals(r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r8 == 0) goto L_0x01c4
            org.json.JSONObject r8 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.util.Iterator r9 = r8.keys()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.util.Map r7 = a(r14, r15, r7, r8, r9)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x01c4:
            java.lang.Class<java.util.ArrayList> r7 = java.util.ArrayList.class
            boolean r7 = r13.equals(r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r7 == 0) goto L_0x01d9
            org.json.JSONArray r7 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.util.List r7 = a((java.lang.Class) r15, (org.json.JSONArray) r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x01d9:
            java.lang.Class<java.util.HashSet> r7 = java.util.HashSet.class
            boolean r7 = r13.equals(r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r7 == 0) goto L_0x01ee
            org.json.JSONArray r7 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.util.Set r7 = b(r15, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x01ee:
            java.lang.Class<java.util.EnumSet> r7 = java.util.EnumSet.class
            boolean r7 = r13.equals(r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r7 == 0) goto L_0x0280
            org.json.JSONArray r7 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r8.<init>()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r9 = 0
        L_0x0200:
            int r11 = r7.length()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r9 >= r11) goto L_0x0214
            java.lang.String r11 = r7.getString(r9)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Enum r11 = java.lang.Enum.valueOf(r15, r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r8.add(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            int r9 = r9 + 1
            goto L_0x0200
        L_0x0214:
            r10.set(r2, r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x0218:
            java.lang.Class r7 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            boolean r7 = r7.isEnum()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r7 == 0) goto L_0x0230
            java.lang.Object r7 = r1.get(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Enum r7 = java.lang.Enum.valueOf(r13, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x0230:
            java.lang.Class r7 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            boolean r7 = r7.isPrimitive()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r7 == 0) goto L_0x024a
            java.lang.Object r7 = r1.get(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r8 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Object r7 = a(r1, r10, r7, r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x024a:
            java.lang.Class r7 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            boolean r7 = r7.isArray()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            if (r7 == 0) goto L_0x025c
            java.lang.Object r7 = a(r1, r13, r10)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            goto L_0x0280
        L_0x025c:
            java.lang.Object r7 = r1.get(r11)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Class r8 = r10.getType()     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            java.lang.Object r7 = a((java.lang.Object) r7, (java.lang.Class<?>) r8)     // Catch:{ Exception -> 0x0280, all -> 0x0277 }
            r8 = 0
            boolean r9 = r7.equals(r8)     // Catch:{ Exception -> 0x0281, all -> 0x0277 }
            if (r9 == 0) goto L_0x0273
            r10.set(r2, r8)     // Catch:{ Exception -> 0x0281, all -> 0x0277 }
            goto L_0x0281
        L_0x0273:
            r10.set(r2, r7)     // Catch:{ Exception -> 0x0281, all -> 0x0277 }
            goto L_0x0281
        L_0x0277:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException
            java.lang.String r2 = "Unknown error occurred "
            r1.<init>(r2, r0)
            throw r1
        L_0x0280:
            r8 = 0
        L_0x0281:
            int r4 = r4 + 1
            r7 = 1
            r9 = 0
            goto L_0x00be
        L_0x0287:
            return r2
        L_0x0288:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException
            java.lang.String r2 = "Can't deserialize the object. Failed to instantiate object."
            r1.<init>(r2, r0)
            goto L_0x0292
        L_0x0291:
            throw r1
        L_0x0292:
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.i5.a(java.lang.Class, org.json.JSONObject):java.lang.Object");
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) throws JSONException, JSONStreamException {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                hashSet.add(jSONArray.get(i10));
            } else {
                hashSet.add(a(cls, optJSONObject));
            }
        }
        return hashSet;
    }

    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) throws JSONStreamException, JSONException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, IllegalArgumentException, NoSuchFieldException {
        Object obj;
        Class<Character> cls2 = Character.class;
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(l5.a(field));
            int length = jSONArray.length();
            Object newInstance = Array.newInstance(cls, length);
            for (int i10 = 0; i10 < length; i10++) {
                Array.set(newInstance, i10, a(cls, jSONArray.getJSONObject(i10)));
            }
            return (Object[]) newInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(l5.a(field));
        int length2 = jSONArray2.length();
        Class<?> type = field.getType();
        Class cls3 = (Class) ((HashMap) f10545a).get(type.getSimpleName());
        Object newInstance2 = Array.newInstance((Class) cls3.getField("TYPE").get((Object) null), length2);
        for (int i11 = 0; i11 < length2; i11++) {
            String string = jSONArray2.getString(i11);
            Class<String> cls4 = String.class;
            if (cls3.equals(cls2)) {
                cls4 = Character.TYPE;
            }
            Constructor constructor = cls3.getConstructor(new Class[]{cls4});
            if (cls3.equals(cls2)) {
                obj = constructor.newInstance(new Object[]{Character.valueOf(string.charAt(0))});
            } else {
                obj = constructor.newInstance(new Object[]{string});
            }
            Array.set(newInstance2, i11, obj);
        }
        return newInstance2;
    }

    public static <K, V> Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) throws JSONException, JSONStreamException {
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object cast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                cast = Enum.valueOf(cls, cast.toString());
            }
            String str = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null) {
                    hashMap.put(cast, b(cls3, optJSONArray));
                } else if (cls2.isEnum()) {
                    hashMap.put(cast, Enum.valueOf(cls2, (String) jSONObject.get(str)));
                } else {
                    hashMap.put(cast, jSONObject.get(str));
                }
            } else {
                hashMap.put(cast, a(cls2, optJSONObject));
            }
        }
        return hashMap;
    }

    public static <V> List a(Class cls, JSONArray jSONArray) throws JSONException, JSONStreamException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                arrayList.add(jSONArray.get(i10));
            } else {
                arrayList.add(a(cls, optJSONObject));
            }
        }
        return arrayList;
    }

    public static Object a(Object obj, Class<?> cls) {
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (!cls.equals(cls3)) {
            return (!cls.equals(cls2) || !obj.getClass().equals(cls3)) ? obj : Long.valueOf(((Integer) obj).longValue());
        }
        if (obj.getClass().equals(Double.class)) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj.getClass().equals(cls2)) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        return obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) throws JSONException {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (obj.getClass().equals(String.class)) {
            if (cls.equals(Integer.TYPE)) {
                return Integer.valueOf(jSONObject.getInt(l5.a(field)));
            }
            return obj;
        } else if (cls.equals(Integer.TYPE)) {
            return Integer.valueOf(((Number) obj).intValue());
        } else {
            if (cls.equals(Float.TYPE)) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (cls.equals(Long.TYPE)) {
                return Long.valueOf(((Number) obj).longValue());
            }
            return cls.equals(Double.TYPE) ? Double.valueOf(((Number) obj).doubleValue()) : obj;
        }
    }
}
