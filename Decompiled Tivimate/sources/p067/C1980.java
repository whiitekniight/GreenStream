package p067;

/* JADX INFO: renamed from: ʽⁱ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1980 {
    public final boolean equals(Object r3) {
        if (this == r3) goto L14;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C1980.class != r3.getClass()) goto L16;
        C1980 r32 = (C1980) r3;
        if (Float.compare(0.0f, 0.0f) != 0) goto L15;
        return true;
    L15:
        return false;
    L16:
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
