package p377;

import java.util.Map;

/* JADX INFO: renamed from: ᵔﹳ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4938 implements Map.Entry {

    /* JADX INFO: renamed from: ʽʽ */
    public C4938 f17616;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f17617;

    /* JADX INFO: renamed from: ˈٴ */
    public C4938 f17618;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f17619;

    public C4938(Object r1, Object r2) {
        this.f17617 = r1;
        this.f17619 = r2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4938) == true) goto L8;
        return false;
    L8:
        C4938 r52 = (C4938) r5;
        if (this.f17617.equals(r52.f17617) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.f17619.equals(r52.f17619) == false) goto L13;
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17617;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17619;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f17617.hashCode() ^ this.f17619.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17617 + "=" + this.f17619;
    }
}
