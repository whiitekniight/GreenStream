package p130;

/* JADX INFO: renamed from: ˈʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2482 implements InterfaceC2478 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f8810;

    public C2482(int r1) {
        this.f8810 = r1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC2478.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof InterfaceC2478) == false) goto L17;
        int r22 = ((C2482) ((InterfaceC2478) r2)).f8810;
        if (this.f8810 != r22) goto L13;
        Object r23 = EnumC2477.f8794;
        if (r23.equals(r23) == false) goto L16;
        return true;
    L16:
        return false;
    L13:
        return false;
    L17:
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f8810) + (EnumC2477.f8794.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8810 + "intEncoding=" + EnumC2477.f8794 + ')';
    }
}
