package p025;

/* JADX INFO: renamed from: ʻᵢ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1402 implements Comparable {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C1402 f4786 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f4787;

    static {
        f4786 = new C1402();
    }

    public C1402() {
        this.f4787 = 131594;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f4787 - ((C1402) r2).f4787;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C1402) == false) goto L8;
        C1402 r42 = (C1402) r4;
    L10:
        if (r42 != null) goto L13;
        return false;
    L13:
        if (this.f4787 != r42.f4787) goto L15;
        return true;
    L15:
        return false;
    L8:
        r42 = null;
        goto L10
    }

    public final int hashCode() {
        return this.f4787;
    }

    public final String toString() {
        return "2.2.10";
    }
}
