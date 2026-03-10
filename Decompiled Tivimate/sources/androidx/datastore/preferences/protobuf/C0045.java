package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ᐧᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C0045 extends AbstractC0047 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ int f446;

    public /* synthetic */ C0045(Unsafe r1, int r2) {
        this.f446 = r2;
        super(r1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo245(long r2, Object r4) {
        switch(this.f446) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC0005.f357 == false) goto L8;
        return AbstractC0005.m166(r2, r4);
    L8:
        return AbstractC0005.m156(r2, r4);
    L10:
        if (AbstractC0005.f357 == false) goto L13;
        return AbstractC0005.m166(r2, r4);
    L13:
        return AbstractC0005.m156(r2, r4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo246(Object r2, long r3, boolean r5) {
        switch(this.f446) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC0005.f357 == false) goto L7;
        AbstractC0005.m162(r2, r3, r5 ? 1 : 0);
        return;
    L7:
        AbstractC0005.m168(r2, r3, r5 ? 1 : 0);
        return;
    L10:
        if (AbstractC0005.f357 == false) goto L12;
        AbstractC0005.m162(r2, r3, r5 ? 1 : 0);
        return;
    L12:
        AbstractC0005.m168(r2, r3, r5 ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˈ */
    public final double mo247(long r2, Object r4) {
        switch(this.f446) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Double.longBitsToDouble(m315(r2, r4));
    L7:
        return Double.longBitsToDouble(m315(r2, r4));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˉʿ */
    public final void mo248(Object r2, long r3, float r5) {
        switch(this.f446) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m316(r3, r2, Float.floatToIntBits(r5));
        return;
    L6:
        m316(r3, r2, Float.floatToIntBits(r5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˑﹳ */
    public final float mo249(long r2, Object r4) {
        switch(this.f446) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Float.intBitsToFloat(m320(r2, r4));
    L7:
        return Float.intBitsToFloat(m320(r2, r4));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo250(Object r2, long r3, byte r5) {
        switch(this.f446) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC0005.f357 == false) goto L7;
        AbstractC0005.m162(r2, r3, r5);
        return;
    L7:
        AbstractC0005.m168(r2, r3, r5);
        return;
    L10:
        if (AbstractC0005.f357 == false) goto L12;
        AbstractC0005.m162(r2, r3, r5);
        return;
    L12:
        AbstractC0005.m168(r2, r3, r5);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ﹳᐧ */
    public final boolean mo252() {
        switch(this.f446) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ﾞʻ */
    public final void mo253(Object r7, long r8, double r10) {
        switch(this.f446) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m314(r7, r8, Double.doubleToLongBits(r10));
        return;
    L6:
        m314(r7, r8, Double.doubleToLongBits(r10));
    }
}
