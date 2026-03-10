package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ˈⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C0023 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ C0063 f406;

    /* JADX INFO: renamed from: ʾˋ */
    public final Comparable f407;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f408;

    public C0023(C0063 r1, Comparable r2, Object r3) {
        this.f406 = r1;
        this.f407 = r2;
        this.f408 = r3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f407.compareTo(((C0023) r2).f407);
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
        Comparable r3 = this.f407;
        if (r3 != null) goto L13;
        if (r1 != null) goto L12;
        boolean r12 = true;
    L14:
        if (r12 == false) goto L23;
        Object r13 = this.f408;
        Object r53 = r52.getValue();
        if (r13 != null) goto L20;
        if (r53 != null) goto L19;
        boolean r54 = true;
    L21:
        if (r54 == false) goto L23;
    L19:
        r54 = false;
        goto L21
    L20:
        r54 = r13.equals(r53);
        goto L21
    L12:
        r12 = false;
        goto L14
    L13:
        r12 = r3.equals(r1);
    L23:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f407;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f408;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int r0 = 0;
        Comparable r1 = this.f407;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        Object r2 = this.f408;
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
        this.f406.m377();
        Object r0 = this.f408;
        this.f408 = r2;
        return r0;
    }

    public final String toString() {
        return this.f407 + "=" + this.f408;
    }
}
