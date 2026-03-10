package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʾˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C0285 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ C0328 f1886;

    /* JADX INFO: renamed from: ʾˋ */
    public final Comparable f1887;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f1888;

    public C0285(C0328 r1, Comparable r2, Object r3) {
        this.f1886 = r1;
        this.f1887 = r2;
        this.f1888 = r3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r2) {
        Comparable r22 = ((C0285) r2).f1887;
        return this.f1887.compareTo(r22);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
    L22:
        return true;
    L6:
        if ((r5 instanceof Map.Entry) == false) goto L23;
        Map.Entry r52 = (Map.Entry) r5;
        Object r1 = r52.getKey();
        Comparable r3 = this.f1887;
        if (r3 != null) goto L13;
        if (r1 == null) goto L12;
        boolean r12 = false;
    L14:
        if (r12 == false) goto L23;
        Object r13 = this.f1888;
        Object r53 = r52.getValue();
        if (r13 != null) goto L20;
        if (r53 == null) goto L19;
        boolean r54 = false;
    L21:
        if (r54 == false) goto L23;
    L19:
        r54 = true;
        goto L21
    L20:
        r54 = r13.equals(r53);
        goto L21
    L12:
        r12 = true;
        goto L14
    L13:
        r12 = r3.equals(r1);
    L23:
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f1887;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1888;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int r0 = 0;
        Comparable r1 = this.f1887;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        Object r2 = this.f1888;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r0 ^ r12;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        this.f1886.m1636();
        Object r0 = this.f1888;
        this.f1888 = r2;
        return r0;
    }

    public final String toString() {
        String r0 = String.valueOf(this.f1887);
        String r1 = String.valueOf(this.f1888);
        int r2 = r0.length();
        int r22 = r2 + 1;
        StringBuilder r4 = new StringBuilder(r22 + r1.length());
        r4.append(r0);
        r4.append("=");
        r4.append(r1);
        return r4.toString();
    }
}
