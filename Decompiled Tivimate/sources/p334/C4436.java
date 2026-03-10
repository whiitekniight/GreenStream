package p334;

/* JADX INFO: renamed from: ᴵˋ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C4436 extends AbstractC4465 {
    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C4436.class != r3.getClass()) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return C4436.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
