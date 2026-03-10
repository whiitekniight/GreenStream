package p067;

import java.util.Locale;
import p317.AbstractC4195;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʽⁱ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C1968 {

    /* JADX INFO: renamed from: ˈ */
    public static final C1968 f6777 = null;

    /* JADX INFO: renamed from: ʽ */
    public final int f6778;

    /* JADX INFO: renamed from: ⁱˊ */
    public final float f6779;

    /* JADX INFO: renamed from: ﹳٴ */
    public final float f6780;

    static {
        f6777 = new C1968(1.0f, 1.0f);
        AbstractC4195.m8513(0);
        AbstractC4195.m8513(1);
    }

    public C1968(float r5, float r6) {
        boolean r2 = false;
        if (r5 <= 0.0f) goto L5;
        boolean r1 = true;
    L6:
        AbstractC4214.m8560(r1);
        if (r6 <= 0.0f) goto L9;
        r2 = true;
    L9:
        AbstractC4214.m8560(r2);
        this.f6780 = r5;
        this.f6779 = r6;
        this.f6778 = Math.round(r5 * 1000.0f);
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C1968.class != r5.getClass()) goto L15;
        C1968 r52 = (C1968) r5;
        if (this.f6780 != r52.f6780) goto L15;
        if (this.f6779 != r52.f6779) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = (Float.floatToRawIntBits(this.f6780) + 527) * 31;
        return Float.floatToRawIntBits(this.f6779) + r0;
    }

    public final String toString() {
        Object[] r2 = {Float.valueOf(this.f6780), Float.valueOf(this.f6779)};
        String r0 = AbstractC4195.f15423;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", r2);
    }
}
