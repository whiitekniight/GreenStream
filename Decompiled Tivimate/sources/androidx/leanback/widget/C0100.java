package androidx.leanback.widget;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import p056.C1819;

/* JADX INFO: renamed from: androidx.leanback.widget.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C0100 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ Object f884;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f885;

    public /* synthetic */ C0100(int r1, Object r2) {
        this.f885 = r1;
        this.f884 = r2;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View r2, AccessibilityEvent r3) {
        switch(this.f885) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onInitializeAccessibilityEvent(r2, r3);
        return;
    L6:
        super.onInitializeAccessibilityEvent(r2, r3);
        C0096 r22 = ((C0102) this.f884).f896;
        if (r22 != null) goto L9;
    L11:
        boolean r23 = false;
    L12:
        r3.setChecked(r23);
        return;
    L9:
        if (r22.m584() == false) goto L11;
        r23 = true;
        goto L12
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r4, AccessibilityNodeInfo r5) {
        switch(this.f885) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        super.onInitializeAccessibilityNodeInfo(r4, r5);
        EditText r42 = ((C1819) this.f884).f6093.getEditText();
        if (r42 == null) goto L21;
        r5.setLabeledBy(r42);
        return;
    L21:
        return;
    L8:
        super.onInitializeAccessibilityNodeInfo(r4, r5);
        C0102 r43 = (C0102) this.f884;
        C0096 r0 = r43.f896;
        boolean r1 = false;
        if (r0 != null) goto L11;
    L13:
        boolean r02 = false;
    L14:
        r5.setCheckable(r02);
        C0096 r44 = r43.f896;
        if (r44 != null) goto L17;
    L19:
        r5.setChecked(r1);
        return;
    L17:
        if (r44.m584() == false) goto L19;
        r1 = true;
        goto L19
    L11:
        if (r0.f874 == 0) goto L13;
        r02 = true;
        goto L14
    }
}
