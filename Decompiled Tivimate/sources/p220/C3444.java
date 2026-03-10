package p220;

import java.util.Comparator;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ˎᵢ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3444 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        String r52 = (String) r5;
        String r62 = (String) r6;
        int r0 = Math.min(r52.length(), r62.length());
        int r1 = 4;
    L3:
        if (r1 >= r0) goto L10;
        char r2 = r52.charAt(r1);
        char r3 = r62.charAt(r1);
        if (r2 != r3) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        if (AbstractC2927.m6274(r2, r3) < 0) goto L21;
        return 1;
    L21:
        return -1;
    L10:
        int r53 = r52.length();
        int r63 = r62.length();
        if (r53 == r63) goto L17;
        if (r53 >= r63) goto L22;
        return -1;
    L22:
        return 1;
    L17:
        return 0;
    }
}
