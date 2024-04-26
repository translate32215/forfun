package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;

/* compiled from: Sta */
public class AdInformationPositions {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12193a = Position.BOTTOM_LEFT.name();

    /* compiled from: Sta */
    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);
        
        private int animationMultiplier;
        private int index;
        private int[] rules;

        private Position(int i10, int[] iArr, int i11) {
            this.rules = iArr;
            this.animationMultiplier = i11;
            this.index = i10;
        }

        public static Position getByIndex(long j10) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (((long) values[i10].getIndex()) == j10) {
                    position = values[i10];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    position = values[i10];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i10 < iArr.length) {
                    layoutParams.addRule(iArr[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        }

        public int getAnimationStartMultiplier() {
            return this.animationMultiplier;
        }

        public int getIndex() {
            return this.index;
        }
    }
}
