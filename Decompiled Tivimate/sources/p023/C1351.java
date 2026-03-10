package p023;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import p375.C4894;
import p375.C4909;

/* JADX INFO: renamed from: ʻᐧ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public class C1351 extends AbstractDialogInterfaceOnClickListenerC1335 {

    /* JADX INFO: renamed from: ˋـ */
    public final HashSet f4639;

    /* JADX INFO: renamed from: ٴʿ */
    public CharSequence[] f4640;

    /* JADX INFO: renamed from: ᵔⁱ */
    public CharSequence[] f4641;

    /* JADX INFO: renamed from: ﹶʽ */
    public boolean f4642;

    public C1351() {
        this.f4639 = new HashSet();
    }

    @Override // p023.AbstractDialogInterfaceOnClickListenerC1335, p241.DialogInterfaceOnCancelListenerC3556, p241.AbstractComponentCallbacksC3606
    /* JADX INFO: renamed from: ʽᵔ */
    public final void mo421(Bundle r5) {
        super.mo421(r5);
        HashSet r1 = this.f4639;
        if (r5 != null) goto L11;
        MultiSelectListPreference r52 = (MultiSelectListPreference) m3763();
        CharSequence[] r2 = r52.f1343;
        CharSequence[] r3 = r52.f1344;
        if (r2 == null) goto L10;
        if (r3 == null) goto L10;
        r1.clear();
        r1.addAll(r52.f1345);
        this.f4642 = false;
        this.f4641 = r52.f1343;
        this.f4640 = r3;
        return;
    L10:
        throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
    L11:
        r1.clear();
        r1.addAll(r5.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f4642 = r5.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f4641 = r5.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f4640 = r5.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // p023.AbstractDialogInterfaceOnClickListenerC1335, p241.DialogInterfaceOnCancelListenerC3556, p241.AbstractComponentCallbacksC3606
    /* JADX INFO: renamed from: ʾﾞ */
    public final void mo424(Bundle r3) {
        super.mo424(r3);
        r3.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f4639));
        r3.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f4642);
        r3.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f4641);
        r3.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f4640);
    }

    @Override // p023.AbstractDialogInterfaceOnClickListenerC1335
    /* JADX INFO: renamed from: ᵔⁱ */
    public final void mo3762(C4909 r6) {
        int r0 = this.f4640.length;
        boolean[] r1 = new boolean[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        String r3 = this.f4640[r2].toString();
        r1[r2] = this.f4639.contains(r3);
        r2 = r2 + 1;
        goto L3
    L5:
        CharSequence[] r02 = this.f4641;
        DialogInterfaceOnMultiChoiceClickListenerC1341 r22 = new DialogInterfaceOnMultiChoiceClickListenerC1341(this);
        C4894 r62 = r6.f17412;
        r62.f17364 = r02;
        r62.f17353 = r22;
        r62.f17347 = r1;
        r62.f17360 = true;
    }

    @Override // p023.AbstractDialogInterfaceOnClickListenerC1335
    /* JADX INFO: renamed from: ﹶʽ */
    public final void mo3764(boolean r2) {
        if (r2 == true) goto L4;
    L6:
        this.f4642 = false;
        return;
    L4:
        if (this.f4642 == false) goto L6;
        MultiSelectListPreference r22 = (MultiSelectListPreference) m3763();
        HashSet r0 = this.f4639;
        r22.m845(r0);
        r22.m826(r0);
        goto L6
    }
}
