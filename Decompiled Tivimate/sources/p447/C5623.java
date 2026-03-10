package p447;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p041.C1607;
import ʽˋ.ـˆ;

/* JADX INFO: renamed from: ﹶˑ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5623 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Pattern f20354;

    public C5623(int r2, String r3) {
        switch(1) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            default: goto L5;
        };
    L6:
        int r22 = 128;
    L14:
        if ((r22 & 2) == 0) goto L16;
        r22 = r22 | 64;
    L16:
        this(Pattern.compile(r3, r22));
        return;
    L7:
        r22 = 32;
        goto L14
    L8:
        r22 = 4;
        goto L14
    L9:
        r22 = 1;
        goto L14
    L10:
        r22 = 16;
        goto L14
    L11:
        r22 = 8;
        goto L14
    L12:
        r22 = 2;
        goto L14
    L5:
        throw null;
    }

    public C5623(String r1) {
        this(Pattern.compile(r1));
    }

    public C5623(Pattern r1) {
        this.f20354 = r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C1607 m10811(C5623 r3, String r4) {
        r3.getClass();
        if (r4.length() < 0) goto L6;
        ـˆ r0 = new ـˆ(r3, 22, r4);
        C5634 r32 = C5634.f20367;
        return new C1607(r0);
    L6:
        StringBuilder r02 = AbstractC0002.m16(0, "Start index out of bounds: ", ", input length: ");
        r02.append(r4.length());
        throw new IndexOutOfBoundsException(r02.toString());
    }

    public final String toString() {
        return this.f20354.toString();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C5632 m10812(int r3, String r4) {
        Matcher r32 = this.f20354.matcher(r4).useAnchoringBounds(false).useTransparentBounds(true).region(r3, r4.length());
        if (r32.lookingAt() == true) goto L5;
        return null;
    L5:
        return new C5632(r32, r4);
    }
}
