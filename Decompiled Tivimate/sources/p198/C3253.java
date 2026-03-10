package p198;

import android.text.TextUtils;
import android.view.View;
import p136.AbstractC2611;

/* JADX INFO: renamed from: ˋᵔ.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C3253 extends AbstractC2611 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ int f11472;

    public C3253(int r1, Class r2, int r3, int r4, int r5) {
        this.f11472 = r5;
        this.f9255 = r1;
        this.f9256 = r2;
        this.f9254 = r3;
        this.f9257 = r4;
    }

    @Override // p136.AbstractC2611
    /* JADX INFO: renamed from: ʽ */
    public final Object mo5798(View r2) {
        switch(this.f11472) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(AbstractC3278.m6924(r2));
    L7:
        return AbstractC3277.m6919(r2);
    L9:
        return AbstractC3278.m6925(r2);
    L11:
        return Boolean.valueOf(AbstractC3278.m6921(r2));
    }

    @Override // p136.AbstractC2611
    /* JADX INFO: renamed from: ˈ */
    public final void mo5799(View r2, Object r3) {
        switch(this.f11472) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC3278.m6922(r2, ((Boolean) r3).booleanValue());
        return;
    L6:
        AbstractC3277.m6918(r2, (CharSequence) r3);
        return;
    L8:
        AbstractC3278.m6923(r2, (CharSequence) r3);
        return;
    L10:
        AbstractC3278.m6926(r2, ((Boolean) r3).booleanValue());
    }

    @Override // p136.AbstractC2611
    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean mo5801(Object r3, Object r4) {
        switch(this.f11472) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L19;
            default: goto L4;
        };
    L4:
        Boolean r32 = (Boolean) r3;
        Boolean r42 = (Boolean) r4;
        boolean r0 = false;
        if (r32 != null) goto L7;
    L9:
        boolean r33 = false;
    L10:
        if (r42 != null) goto L12;
    L14:
        boolean r43 = false;
    L15:
        if (r33 != r43) goto L18;
        r0 = true;
    L18:
        return !r0;
    L12:
        if (r42.booleanValue() == false) goto L14;
        r43 = true;
        goto L15
    L7:
        if (r32.booleanValue() == false) goto L9;
        r33 = true;
        goto L10
    L19:
        boolean r34 = TextUtils.equals((CharSequence) r3, (CharSequence) r4);
    L21:
        return !r34;
    L22:
        r34 = TextUtils.equals((CharSequence) r3, (CharSequence) r4);
        goto L21
    L23:
        Boolean r35 = (Boolean) r3;
        Boolean r44 = (Boolean) r4;
        boolean r02 = false;
        if (r35 != null) goto L26;
    L28:
        boolean r36 = false;
    L29:
        if (r44 != null) goto L31;
    L33:
        boolean r45 = false;
    L34:
        if (r36 != r45) goto L37;
        r02 = true;
    L37:
        return !r02;
    L31:
        if (r44.booleanValue() == false) goto L33;
        r45 = true;
        goto L34
    L26:
        if (r35.booleanValue() == false) goto L28;
        r36 = true;
        goto L29
    }
}
