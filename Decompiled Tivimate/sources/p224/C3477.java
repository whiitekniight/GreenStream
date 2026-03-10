package p224;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p005j$.util.DesugarCollections;
import p015.C1270;
import ﹳˋ.ٴﹶ;

/* JADX INFO: renamed from: ˏ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3477 {

    /* JADX INFO: renamed from: ʽ */
    public final Set f12357;

    /* JADX INFO: renamed from: ˈ */
    public final int f12358;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f12359;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Set f12360;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Set f12361;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f12362;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final InterfaceC3469 f12363;

    public C3477(String r1, Set r2, Set r3, int r4, int r5, InterfaceC3469 r6, Set r7) {
        this.f12362 = r1;
        this.f12361 = DesugarCollections.unmodifiableSet(r2);
        this.f12357 = DesugarCollections.unmodifiableSet(r3);
        this.f12358 = r4;
        this.f12359 = r5;
        this.f12363 = r6;
        this.f12360 = DesugarCollections.unmodifiableSet(r7);
    }

    /* JADX INFO: renamed from: ʽ */
    public static C3477 m7231(Object r10, Class r11, Class... r12) {
        HashSet r0 = new HashSet();
        HashSet r1 = new HashSet();
        HashSet r9 = new HashSet();
        r0.add(C3471.m7230(r11));
        int r112 = r12.length;
        int r2 = 0;
    L3:
        if (r2 >= r112) goto L6;
        Class r3 = r12[r2];
        ٴﹶ.ᵎﹶ(r3, "Null interface");
        r0.add(C3471.m7230(r3));
        r2 = r2 + 1;
        goto L3
    L6:
        return new C3477(null, new HashSet(r0), new HashSet(r1), 0, 0, new C1270(r10), r9);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C3478 m7232(C3471 r2) {
        return new C3478(r2, new C3471[0]);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C3478 m7233(Class r2) {
        return new C3478(r2, new Class[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f12361.toArray()) + ">{" + this.f12358 + ", type=" + this.f12359 + ", deps=" + Arrays.toString(this.f12357.toArray()) + "}";
    }
}
