package p336;

import p164.AbstractC2927;
import p341.InterfaceC4585;

/* JADX INFO: renamed from: ᴵי.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C4535 {

    /* JADX INFO: renamed from: ʽ */
    public final InterfaceC4585 f16383;

    /* JADX INFO: renamed from: ˈ */
    public final Object f16384;

    /* JADX INFO: renamed from: ˑﹳ */
    public final Throwable f16385;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC4475 f16386;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f16387;

    public C4535(Object r1, InterfaceC4475 r2, InterfaceC4585 r3, Object r4, Throwable r5) {
        this.f16387 = r1;
        this.f16386 = r2;
        this.f16383 = r3;
        this.f16384 = r4;
        this.f16385 = r5;
    }

    public /* synthetic */ C4535(Object r9, InterfaceC4475 r10, InterfaceC4585 r11, Throwable r12, int r13) {
        if ((r13 & 2) == 0) goto L5;
        InterfaceC4475 r4 = null;
    L7:
        if ((r13 & 4) == 0) goto L9;
        InterfaceC4585 r5 = null;
    L11:
        if ((r13 & 16) == 0) goto L13;
        Throwable r7 = null;
    L14:
        this(r9, r4, r5, null, r7);
        return;
    L13:
        r7 = r12;
        goto L14
    L9:
        r5 = r11;
        goto L11
    L5:
        r4 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C4535 m8983(C4535 r6, InterfaceC4475 r7, Throwable r8, int r9) {
        Object r1 = r6.f16387;
        if ((r9 & 2) == 0) goto L5;
        r7 = r6.f16386;
    L5:
        InterfaceC4475 r2 = r7;
        InterfaceC4585 r3 = r6.f16383;
        Object r4 = r6.f16384;
        if ((r9 & 16) == 0) goto L9;
        r8 = r6.f16385;
    L9:
        return new C4535(r1, r2, r3, r4, r8);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4535) == true) goto L8;
        return false;
    L8:
        C4535 r52 = (C4535) r5;
        if (AbstractC2927.m6273(this.f16387, r52.f16387) == true) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f16386, r52.f16386) == true) goto L15;
        return false;
    L15:
        if (AbstractC2927.m6273(this.f16383, r52.f16383) == true) goto L18;
        return false;
    L18:
        if (AbstractC2927.m6273(this.f16384, r52.f16384) == true) goto L21;
        return false;
    L21:
        if (AbstractC2927.m6273(this.f16385, r52.f16385) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f16387;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        InterfaceC4475 r2 = this.f16386;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r14 = (r13 + r22) * 31;
        InterfaceC4585 r23 = this.f16383;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r15 = (r14 + r24) * 31;
        Object r25 = this.f16384;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r16 = (r15 + r26) * 31;
        Throwable r27 = this.f16385;
        if (r27 == null) goto L23;
        r0 = r27.hashCode();
    L23:
        return r16 + r0;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f16387 + ", cancelHandler=" + this.f16386 + ", onCancellation=" + this.f16383 + ", idempotentResume=" + this.f16384 + ", cancelCause=" + this.f16385 + ')';
    }
}
