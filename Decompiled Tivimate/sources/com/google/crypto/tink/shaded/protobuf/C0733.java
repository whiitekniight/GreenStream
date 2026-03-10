package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ᐧﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C0733 extends AbstractC0722 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ int f3036;

    public /* synthetic */ C0733(Unsafe r1, int r2) {
        this.f3036 = r2;
        super(r1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo2592(long r4, Object r6) {
        switch(this.f3036) {
            case 0: goto L14;
            default: goto L5;
        };
    L5:
        if (AbstractC0734.f3040 == false) goto L10;
        if (AbstractC0734.m2676(r4, r6) != 0) goto L22;
        return false;
    L22:
        return true;
    L10:
        if (AbstractC0734.m2665(r4, r6) != 0) goto L22;
        return false;
    L14:
        if (AbstractC0734.f3040 == false) goto L19;
        if (AbstractC0734.m2676(r4, r6) != 0) goto L24;
        return false;
    L24:
        return true;
    L19:
        if (AbstractC0734.m2665(r4, r6) != 0) goto L24;
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ˈ */
    public final byte mo2594(long r2, Object r4) {
        switch(this.f3036) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC0734.f3040 == false) goto L8;
        return AbstractC0734.m2676(r2, r4);
    L8:
        return AbstractC0734.m2665(r2, r4);
    L10:
        if (AbstractC0734.f3040 == false) goto L13;
        return AbstractC0734.m2676(r2, r4);
    L13:
        return AbstractC0734.m2665(r2, r4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ˉʿ */
    public final void mo2595(Object r7, long r8, double r10) {
        switch(this.f3036) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m2591(r7, r8, Double.doubleToLongBits(r10));
        return;
    L6:
        m2591(r7, r8, Double.doubleToLongBits(r10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ˑﹳ */
    public final double mo2597(long r2, Object r4) {
        switch(this.f3036) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Double.longBitsToDouble(m2602(r2, r4));
    L7:
        return Double.longBitsToDouble(m2602(r2, r4));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: יـ */
    public final boolean mo2598() {
        switch(this.f3036) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo2599(Object r2, long r3, boolean r5) {
        switch(this.f3036) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC0734.f3040 == false) goto L7;
        AbstractC0734.m2679(r2, r3, r5 ? 1 : 0);
        return;
    L7:
        AbstractC0734.m2670(r2, r3, r5 ? 1 : 0);
        return;
    L10:
        if (AbstractC0734.f3040 == false) goto L12;
        AbstractC0734.m2679(r2, r3, r5 ? 1 : 0);
        return;
    L12:
        AbstractC0734.m2670(r2, r3, r5 ? 1 : 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ᵔʾ */
    public final void mo2601(Object r2, long r3, float r5) {
        switch(this.f3036) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m2596(r3, r2, Float.floatToIntBits(r5));
        return;
    L6:
        m2596(r3, r2, Float.floatToIntBits(r5));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ﾞʻ */
    public final void mo2607(Object r2, long r3, byte r5) {
        switch(this.f3036) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC0734.f3040 == false) goto L7;
        AbstractC0734.m2679(r2, r3, r5);
        return;
    L7:
        AbstractC0734.m2670(r2, r3, r5);
        return;
    L10:
        if (AbstractC0734.f3040 == false) goto L12;
        AbstractC0734.m2679(r2, r3, r5);
        return;
    L12:
        AbstractC0734.m2670(r2, r3, r5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ﾞᴵ */
    public final float mo2608(long r2, Object r4) {
        switch(this.f3036) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Float.intBitsToFloat(m2600(r2, r4));
    L7:
        return Float.intBitsToFloat(m2600(r2, r4));
    }
}
