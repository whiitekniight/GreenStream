package p005j$.util.concurrent;

import java.util.Map;
import p005j$.com.android.tools.p006r8.AbstractC0754a;

/* JADX INFO: renamed from: j$.util.concurrent.k */
/* JADX INFO: loaded from: classes2.dex */
public class C0917k implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final int f3527a;

    /* JADX INFO: renamed from: b */
    public final Object f3528b;

    /* JADX INFO: renamed from: c */
    public volatile Object f3529c;

    /* JADX INFO: renamed from: d */
    public volatile C0917k f3530d;

    public C0917k(int r1, Object r2, Object r3) {
        this.f3527a = r1;
        this.f3528b = r2;
        this.f3529c = r3;
    }

    public C0917k(int r1, Object r2, Object r3, C0917k r4) {
        this(r1, r2, r3);
        this.f3530d = r4;
    }

    /* JADX INFO: renamed from: a */
    public C0917k mo3210a(int r3, Object r4) {
        C0917k r0 = this;
    L4:
        if (r0.f3527a != r3) goto L11;
        Object r1 = r0.f3528b;
        if (r1 == r4) goto L10;
        if (r1 == null) goto L11;
        if (r4.equals(r1) == false) goto L11;
    L10:
        return r0;
    L11:
        r0 = r0.f3530d;
        if (r0 != null) goto L4;
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r3) {
        if ((r3 instanceof Map.Entry) == false) goto L18;
        Map.Entry r32 = (Map.Entry) r3;
        Object r0 = r32.getKey();
        if (r0 == null) goto L21;
        Object r33 = r32.getValue();
        if (r33 == null) goto L22;
        Object r1 = this.f3528b;
        if (r0 != r1) goto L11;
    L12:
        Object r02 = this.f3529c;
        if (r33 != r02) goto L15;
        return true;
    L15:
        if (r33.equals(r02) == false) goto L24;
        return true;
    L24:
        return false;
    L11:
        if (r0.equals(r1) == true) goto L12;
        return false;
    L22:
        return false;
    L21:
        return false;
    L18:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3528b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3529c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3528b.hashCode() ^ this.f3529c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r1) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return AbstractC0754a.m2814X(this.f3528b, this.f3529c);
    }
}
