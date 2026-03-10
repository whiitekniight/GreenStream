package p005j$.util;

import java.util.Map;

/* JADX INFO: renamed from: j$.util.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0964q implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Map.Entry f3626a;

    public C0964q(Map.Entry r1) {
        this.f3626a = (Map.Entry) Objects.requireNonNull(r1);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
    L22:
        return true;
    L6:
        if ((r5 instanceof Map.Entry) == false) goto L23;
        Map.Entry r52 = (Map.Entry) r5;
        Object r1 = this.f3626a.getKey();
        Object r3 = r52.getKey();
        if (r1 != null) goto L13;
        if (r3 != null) goto L12;
        boolean r12 = true;
    L14:
        if (r12 == false) goto L23;
        Object r13 = this.f3626a.getValue();
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
        r12 = r1.equals(r3);
    L23:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3626a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3626a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3626a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r1) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f3626a.toString();
    }
}
