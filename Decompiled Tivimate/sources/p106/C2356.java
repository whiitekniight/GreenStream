package p106;

import java.util.Arrays;
import p005j$.util.Objects;
import p067.C1942;

/* JADX INFO: renamed from: ˆʻ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2356 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final String f8446;

    /* JADX INFO: renamed from: ˈ */
    public final int f8447;

    /* JADX INFO: renamed from: ˑﹳ */
    public final byte[] f8448;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8449;

    public C2356(String r2, String r3, int r4, byte[] r5) {
        super("APIC");
        this.f8449 = r2;
        this.f8446 = r3;
        this.f8447 = r4;
        this.f8448 = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (C2356.class != r5.getClass()) goto L19;
        C2356 r52 = (C2356) r5;
        if (this.f8447 != r52.f8447) goto L19;
        if (Objects.equals(this.f8449, r52.f8449) == false) goto L19;
        if (Objects.equals(this.f8446, r52.f8446) == false) goto L19;
        if (Arrays.equals(this.f8448, r52.f8448) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = (527 + this.f8447) * 31;
        int r1 = 0;
        String r2 = this.f8449;
        if (r2 == null) goto L5;
        int r22 = r2.hashCode();
    L6:
        int r02 = (r0 + r22) * 31;
        String r23 = this.f8446;
        if (r23 == null) goto L10;
        r1 = r23.hashCode();
    L10:
        return Arrays.hashCode(this.f8448) + ((r02 + r1) * 31);
    L5:
        r22 = 0;
        goto L6
    }

    @Override // p106.AbstractC2346
    public final String toString() {
        return this.f8423 + ": mimeType=" + this.f8449 + ", description=" + this.f8446;
    }

    @Override // p106.AbstractC2346, p067.InterfaceC1948
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo3503(C1942 r3) {
        byte[] r0 = this.f8448;
        r3.m4958(this.f8447, r0);
    }
}
