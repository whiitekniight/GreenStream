package p198;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: ˋᵔ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C3322 {

    /* JADX INFO: renamed from: ʽ */
    public final ViewGroup f11583;

    /* JADX INFO: renamed from: ˈ */
    public boolean f11584;

    /* JADX INFO: renamed from: ˑﹳ */
    public int[] f11585;

    /* JADX INFO: renamed from: ⁱˊ */
    public ViewParent f11586;

    /* JADX INFO: renamed from: ﹳٴ */
    public ViewParent f11587;

    public C3322(ViewGroup r1) {
        this.f11583 = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m7007(int r13, int r14, int r15, int[] r16, int[] r17) {
        if (this.f11584 == false) goto L42;
        ViewParent r1 = m7009(r15);
        if (r1 != null) goto L8;
        return false;
    L8:
        if (r13 != 0) goto L14;
        if (r14 != 0) goto L14;
        if (r17 == null) goto L43;
        r17[0] = 0;
        r17[1] = 0;
        return false;
    L43:
        return false;
    L14:
        ViewGroup r2 = this.f11583;
        if (r17 == null) goto L17;
        r2.getLocationInWindow(r17);
        int r10 = r17[0];
        int r11 = r17[1];
    L18:
        if (r16 == null) goto L20;
        int[] r5 = r16;
    L24:
        r5[0] = 0;
        r5[1] = 0;
        if ((r1 instanceof InterfaceC3274) == false) goto L27;
        ((InterfaceC3274) r1).mo42(r2, r13, r14, r5, r15);
    L32:
        if (r17 == null) goto L35;
        r2.getLocationInWindow(r17);
        r17[0] = r17[0] - r10;
        r17[1] = r17[1] - r11;
    L35:
        if (r5[0] != 0) goto L39;
        if (r5[1] != 0) goto L39;
        return false;
    L39:
        return true;
    L27:
        if (r15 != 0) goto L32;
        r1.onNestedPreScroll(r2, r13, r14, r5);     // Catch: AbstractMethodError -> L30
    L31:
        String r0 = "ViewParent " + r1 + " does not implement interface method onNestedPreScroll";
        goto L32
    L20:
        if (this.f11585 != null) goto L22;
        this.f11585 = new int[2];
    L22:
        r5 = this.f11585;
        goto L24
    L17:
        r10 = 0;
        r11 = 0;
        goto L18
    L42:
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public final boolean m7008(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
        if (this.f11584 == false) goto L41;
        ViewParent r2 = m7009(r20);
        if (r2 == null) goto L41;
        if (r15 != 0) goto L16;
        if (r16 != 0) goto L16;
        if (r17 != 0) goto L16;
        if (r18 != 0) goto L16;
        if (r19 == null) goto L41;
        r19[0] = 0;
        r19[1] = 0;
        return false;
    L16:
        ViewGroup r3 = this.f11583;
        if (r19 == null) goto L19;
        r3.getLocationInWindow(r19);
        int r12 = r19[0];
        int r13 = r19[1];
    L20:
        if (r21 == null) goto L22;
        int[] r9 = r21;
    L27:
        if ((r2 instanceof InterfaceC3310) == false) goto L29;
        ((InterfaceC3310) r2).mo44(r3, r15, r16, r17, r18, r20, r9);
    L38:
        if (r19 == null) goto L40;
        r3.getLocationInWindow(r19);
        r19[0] = r19[0] - r12;
        r19[1] = r19[1] - r13;
    L40:
        return true;
    L29:
        r9[0] = r9[0] + r17;
        r9[1] = r9[1] + r18;
        if ((r2 instanceof InterfaceC3274) == false) goto L32;
        ((InterfaceC3274) r2).mo45(r3, r15, r16, r17, r18, r20);
        goto L38
    L32:
        if (r20 != 0) goto L38;
        r2.onNestedScroll(r3, r15, r16, r17, r18);     // Catch: AbstractMethodError -> L36
    L37:
        String r0 = "ViewParent " + r2 + " does not implement interface method onNestedScroll";
        goto L38
    L22:
        if (this.f11585 != null) goto L24;
        this.f11585 = new int[2];
    L24:
        int[] r02 = this.f11585;
        r02[0] = 0;
        r02[1] = 0;
        r9 = r02;
        goto L27
    L19:
        r12 = 0;
        r13 = 0;
    L41:
        return false;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final ViewParent m7009(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return null;
    L8:
        return this.f11586;
    L10:
        return this.f11587;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean m7010(int r12, int r13) {
        if (m7014(r13) == false) goto L6;
    L31:
        return true;
    L6:
        if (this.f11584 == false) goto L36;
        View r0 = this.f11583;
        ViewParent r3 = r0.getParent();
        View r4 = r0;
    L8:
        if (r3 == null) goto L36;
        boolean r5 = r3 instanceof InterfaceC3274;
        if (r5 == false) goto L12;
        boolean r8 = ((InterfaceC3274) r3).mo51(r4, r0, r12, r13);
    L18:
        if (r8 == true) goto L19;
        if ((r3 instanceof View) == false) goto L35;
        r4 = (View) r3;
    L35:
        r3 = r3.getParent();
        goto L8
    L19:
        if (r13 == 0) goto L23;
        if (r13 != 1) goto L24;
        this.f11586 = r3;
    L24:
        if (r5 == false) goto L26;
        ((InterfaceC3274) r3).mo49(r4, r0, r12, r13);
        goto L31
    L26:
        if (r13 != 0) goto L31;
        r3.onNestedScrollAccepted(r4, r0, r12);     // Catch: AbstractMethodError -> L29
    L30:
        String r02 = "ViewParent " + r3 + " does not implement interface method onNestedScrollAccepted";
        goto L31
    L23:
        this.f11587 = r3;
        goto L24
    L12:
        if (r13 == 0) goto L37;
    L17:
        r8 = false;
        goto L18
    L37:
        r8 = r3.onStartNestedScroll(r4, r0, r12);     // Catch: AbstractMethodError -> L15
    L16:
        String r03 = "ViewParent " + r3 + " does not implement interface method onStartNestedScroll";
    L36:
        return false;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m7011(int r5) {
        ViewParent r0 = m7009(r5);
        if (r0 == null) goto L22;
        boolean r1 = r0 instanceof InterfaceC3274;
        ViewGroup r2 = this.f11583;
        if (r1 == false) goto L7;
        ((InterfaceC3274) r0).mo48(r2, r5);
    L13:
        if (r5 != 0) goto L15;
        this.f11587 = null;
        return;
    L15:
        if (r5 != 1) goto L24;
        this.f11586 = null;
        return;
    L24:
        return;
    L7:
        if (r5 != 0) goto L13;
        r0.onStopNestedScroll(r2);     // Catch: AbstractMethodError -> L10
    L11:
        String r02 = "ViewParent " + r0 + " does not implement interface method onStopNestedScroll";
        goto L13
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean m7012(float r4, float r5) {
        if (this.f11584 == false) goto L11;
        ViewParent r0 = m7009(0);
        if (r0 == null) goto L11;
        return r0.onNestedPreFling(this.f11583, r4, r5);
    L10:
        String r02 = "ViewParent " + r0 + " does not implement interface method onNestedPreFling";
    L11:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m7013(float r4, float r5, boolean r6) {
        if (this.f11584 == false) goto L11;
        ViewParent r0 = m7009(0);
        if (r0 == null) goto L11;
        return r0.onNestedFling(this.f11583, r4, r5, r6);
    L10:
        String r02 = "ViewParent " + r0 + " does not implement interface method onNestedFling";
    L11:
        return false;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean m7014(int r1) {
        if (m7009(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }
}
