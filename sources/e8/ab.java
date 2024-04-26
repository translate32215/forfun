package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ab implements f3<ia> {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077 A[Catch:{ NullPointerException | NumberFormatException -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a A[Catch:{ NullPointerException | NumberFormatException -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0085 A[Catch:{ NullPointerException | NumberFormatException -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r8, java.util.Map r9) {
        /*
            r7 = this;
            e8.ia r8 = (e8.ia) r8
            com.google.android.gms.internal.ads.w7 r0 = r8.o()
            java.lang.String r1 = "duration"
            java.lang.String r2 = "1"
            if (r0 != 0) goto L_0x0033
            java.lang.Object r0 = r9.get(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r3 = "customControlsAllowed"
            java.lang.Object r3 = r9.get(r3)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            boolean r3 = r2.equals(r3)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r4 = "clickToExpandAllowed"
            java.lang.Object r4 = r9.get(r4)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            boolean r4 = r2.equals(r4)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            com.google.android.gms.internal.ads.w7 r5 = new com.google.android.gms.internal.ads.w7     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r5.<init>(r8, r0, r3, r4)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r8.d(r5)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r0 = r5
        L_0x0033:
            java.lang.Object r8 = r9.get(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r1 = "muted"
            java.lang.Object r1 = r9.get(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            boolean r4 = r2.equals(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r1 = "currentTime"
            java.lang.Object r1 = r9.get(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = "playbackState"
            java.lang.Object r2 = r9.get(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3 = 3
            if (r2 < 0) goto L_0x0067
            if (r3 >= r2) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r5 = r2
            goto L_0x0069
        L_0x0067:
            r2 = 0
            r5 = 0
        L_0x0069:
            java.lang.String r2 = "aspectRatio"
            java.lang.Object r9 = r9.get(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            if (r2 == 0) goto L_0x007a
            r2 = 0
            r6 = 0
            goto L_0x007f
        L_0x007a:
            float r2 = java.lang.Float.parseFloat(r9)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r6 = r2
        L_0x007f:
            boolean r2 = l0.e.h(r3)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            if (r2 == 0) goto L_0x00c3
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            int r2 = r2.length()     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            int r2 = r2 + 140
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3.<init>(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = "Video Meta GMSG: currentTime : "
            r3.append(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3.append(r1)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = " , duration : "
            r3.append(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3.append(r8)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = " , isMuted : "
            r3.append(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3.append(r4)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = " , playbackState : "
            r3.append(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3.append(r5)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r2 = " , aspectRatio : "
            r3.append(r2)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            r3.append(r9)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            java.lang.String r9 = r3.toString()     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            l0.e.E(r9)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
        L_0x00c3:
            r2 = r8
            r3 = r5
            r5 = r6
            r0.t6(r1, r2, r3, r4, r5)     // Catch:{ NullPointerException -> 0x00cc, NumberFormatException -> 0x00ca }
            return
        L_0x00ca:
            r8 = move-exception
            goto L_0x00cd
        L_0x00cc:
            r8 = move-exception
        L_0x00cd:
            java.lang.String r9 = "Unable to parse videoMeta message."
            l0.e.C(r9, r8)
            d7.l r9 = d7.l.B
            com.google.android.gms.internal.ads.y6 r9 = r9.f13190g
            android.content.Context r0 = r9.f8584e
            e8.f9 r9 = r9.f8585f
            e8.v6 r9 = com.google.android.gms.internal.ads.a5.d(r0, r9)
            java.lang.String r0 = "VideoMetaGmsgHandler.onGmsg"
            r9.c(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ab.f(java.lang.Object, java.util.Map):void");
    }
}
