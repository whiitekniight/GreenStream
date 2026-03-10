package com.google.android.gms.internal.play_billing;

import p005j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C0533 extends AbstractC0592 {

    /* JADX INFO: renamed from: ʽʽ */
    public final transient Object[] f2313;

    /* JADX INFO: renamed from: ˈٴ */
    public final transient int f2314;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final transient int f2315;

    public C0533(Object[] r1, int r2, int r3) {
        this.f2313 = r1;
        this.f2314 = r2;
        this.f2315 = r3;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        com.bumptech.glide.ˈ.ᵔי(r2, this.f2315);
        int r22 = (r2 + r2) + this.f2314;
        Object r23 = this.f2313[r22];
        Objects.requireNonNull(r23);
        return r23;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2315;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean mo2095() {
        return true;
    }
}
