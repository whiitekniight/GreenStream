package p005j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b */
    public static final Optional f3471b = null;

    /* JADX INFO: renamed from: a */
    public final Object f3472a;

    static {
        f3471b = new Optional();
    }

    public Optional() {
        this.f3472a = null;
    }

    public Optional(Object r1) {
        this.f3472a = Objects.requireNonNull(r1);
    }

    public static <T> Optional<T> ofNullable(T r1) {
        if (r1 != null) goto L6;
        return f3471b;
    L6:
        return new Optional(r1);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Optional) == true) goto L10;
        return false;
    L10:
        return Objects.equals(this.f3472a, ((Optional) r2).f3472a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3472a);
    }

    public final String toString() {
        Object r0 = this.f3472a;
        if (r0 != null) goto L5;
        return "Optional.empty";
    L5:
        return String.format("Optional[%s]", new Object[]{r0});
    }
}
