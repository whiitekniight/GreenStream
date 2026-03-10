package p023;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: ʻᐧ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC1341 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ C1351 f4611;

    public DialogInterfaceOnMultiChoiceClickListenerC1341(C1351 r1) {
        this.f4611 = r1;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface r3, int r4, boolean r5) {
        C1351 r32 = this.f4611;
        HashSet r0 = r32.f4639;
        if (r5 == false) goto L6;
        boolean r52 = r32.f4642;
        r32.f4642 = r0.add(r32.f4640[r4].toString()) | r52;
        return;
    L6:
        boolean r53 = r32.f4642;
        r32.f4642 = r0.remove(r32.f4640[r4].toString()) | r53;
    }
}
