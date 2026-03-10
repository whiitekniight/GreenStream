package p097;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ʿˑ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2217 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Map f8027;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f8028;

    public C2217(String r1, Map r2) {
        this.f8028 = r1;
        this.f8027 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C2217 m5392(String r2) {
        return new C2217(r2, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2217) == true) goto L8;
        return false;
    L8:
        C2217 r52 = (C2217) r5;
        if (this.f8028.equals(r52.f8028) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.f8027.equals(r52.f8027) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f8028.hashCode() * 31;
        return this.f8027.hashCode() + r0;
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f8028 + ", properties=" + this.f8027.values() + "}";
    }
}
