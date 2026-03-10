package p107;

/* JADX INFO: renamed from: ˆʽ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2370 extends AbstractC2372 {

    /* JADX INFO: renamed from: ʾˋ */
    public static final C2370 f8473 = null;

    static {
        f8473 = new C2370();
    }

    public final boolean equals(Object r1) {
        if (r1 != this) goto L5;
        return true;
    L5:
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // p107.AbstractC2372
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo5523() {
        return false;
    }

    @Override // p107.AbstractC2372
    /* JADX INFO: renamed from: ﹳٴ */
    public final Object mo5524() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
