package p029;

/* JADX INFO: renamed from: ʼʻ.ᵎˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1474 {

    /* JADX INFO: renamed from: ʽ */
    public final Object f4915;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f4916;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f4917;

    public C1474(Object r1, Object r2, Object r3) {
        this.f4917 = r1;
        this.f4916 = r2;
        this.f4915 = r3;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final IllegalArgumentException m3969() {
        StringBuilder r1 = new StringBuilder("Multiple entries with same key: ");
        Object r2 = this.f4917;
        r1.append(r2);
        r1.append("=");
        r1.append(this.f4916);
        r1.append(" and ");
        r1.append(r2);
        r1.append("=");
        r1.append(this.f4915);
        return new IllegalArgumentException(r1.toString());
    }
}
