package p106;

import java.util.Arrays;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˆʻ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C2358 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final String f8453;

    /* JADX INFO: renamed from: ˈ */
    public final String f8454;

    /* JADX INFO: renamed from: ˑﹳ */
    public final byte[] f8455;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8456;

    public C2358(String r2, String r3, String r4, byte[] r5) {
        super("GEOB");
        this.f8456 = r2;
        this.f8453 = r3;
        this.f8454 = r4;
        this.f8455 = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (C2358.class != r5.getClass()) goto L19;
        C2358 r52 = (C2358) r5;
        if (Objects.equals(this.f8456, r52.f8456) == false) goto L19;
        if (Objects.equals(this.f8453, r52.f8453) == false) goto L19;
        if (Objects.equals(this.f8454, r52.f8454) == false) goto L19;
        if (Arrays.equals(this.f8455, r52.f8455) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f8456;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L6:
        int r2 = (527 + r12) * 31;
        String r13 = this.f8453;
        if (r13 == null) goto L9;
        int r14 = r13.hashCode();
    L10:
        int r22 = (r2 + r14) * 31;
        String r15 = this.f8454;
        if (r15 == null) goto L14;
        r0 = r15.hashCode();
    L14:
        return Arrays.hashCode(this.f8455) + ((r22 + r0) * 31);
    L9:
        r14 = 0;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }

    @Override // p106.AbstractC2346
    public final String toString() {
        return this.f8423 + ": mimeType=" + this.f8456 + ", filename=" + this.f8453 + ", description=" + this.f8454;
    }
}
