package p331;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p308.AbstractC4142;

/* JADX INFO: renamed from: ᴵˈ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC4407 extends DialogFragment {

    /* JADX INFO: renamed from: ʽʽ */
    public AlertDialog f16131;

    /* JADX INFO: renamed from: ʾˋ */
    public Dialog f16132;

    /* JADX INFO: renamed from: ᴵˊ */
    public DialogInterface.OnCancelListener f16133;

    public DialogFragmentC4407() {
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r2) {
        DialogInterface.OnCancelListener r0 = this.f16133;
        if (r0 == null) goto L6;
        r0.onCancel(r2);
        return;
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle r2) {
        Dialog r22 = this.f16132;
        if (r22 != null) goto L9;
        setShowsDialog(false);
        if (this.f16131 != null) goto L8;
        Activity r0 = getActivity();
        AbstractC4142.m8398(r0);
        this.f16131 = new AlertDialog.Builder(r0).create();
    L8:
        return this.f16131;
    L9:
        return r22;
    }
}
