package p427;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ﹳـ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC5401 implements ActionMode.Callback {

    /* JADX INFO: renamed from: ʽ */
    public Class f19284;

    /* JADX INFO: renamed from: ˈ */
    public Method f19285;

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean f19286;

    /* JADX INFO: renamed from: ⁱˊ */
    public final TextView f19287;

    /* JADX INFO: renamed from: ﹳٴ */
    public final ActionMode.Callback f19288;

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean f19289;

    public ActionModeCallbackC5401(ActionMode.Callback r1, TextView r2) {
        this.f19288 = r1;
        this.f19287 = r2;
        this.f19289 = false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode r2, MenuItem r3) {
        return this.f19288.onActionItemClicked(r2, r3);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode r2, Menu r3) {
        return this.f19288.onCreateActionMode(r2, r3);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode r2) {
        this.f19288.onDestroyActionMode(r2);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode r14, Menu r15) {
        TextView r0 = this.f19287;
        Context r1 = r0.getContext();
        PackageManager r2 = r1.getPackageManager();
        boolean r3 = this.f19289;
        Class<?> r4 = Integer.TYPE;
        if (r3 == true) goto L56;
        this.f19289 = true;
        Class<?> r32 = Class.forName("com.android.internal.view.menu.MenuBuilder");     // Catch: Throwable -> L7
        this.f19284 = r32;     // Catch: Throwable -> L7
        this.f19285 = r32.getDeclaredMethod("removeItemAt", new Class[]{r4});     // Catch: Throwable -> L7
        this.f19286 = true;     // Catch: Throwable -> L7
    L7:
        this.f19284 = null;
        this.f19285 = null;
        this.f19286 = false;
    L56:
        if (this.f19286 == true) goto L11;
    L13:
        Method r33 = r15.getClass().getDeclaredMethod("removeItemAt", new Class[]{r4});     // Catch: Throwable -> L55
    L15:
        int r42 = r15.size() - 1;
    L17:
        if (r42 < 0) goto L24;
        MenuItem r8 = r15.getItem(r42);     // Catch: Throwable -> L55 Throwable -> L55 Throwable -> L55
        if (r8.getIntent() == null) goto L23;
        if ("android.intent.action.PROCESS_TEXT".equals(r8.getIntent().getAction()) == false) goto L23;
        r33.invoke(r15, new Object[]{Integer.valueOf(r42)});     // Catch: Throwable -> L55 Throwable -> L55 Throwable -> L55
    L23:
        r42 = r42 - 1;
        goto L17
    L24:
        ArrayList r34 = new ArrayList();
        if ((r1 instanceof Activity) == false) goto L41;
        Iterator<ResolveInfo> r43 = r2.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();
    L29:
        if (r43.hasNext() == false) goto L41;
        ResolveInfo r9 = r43.next();
        if (r1.getPackageName().equals(r9.activityInfo.packageName) == true) goto L40;
        ActivityInfo r10 = r9.activityInfo;
        if (r10.exported == false) goto L29;
        String r102 = r10.permission;
        if (r102 == null) goto L40;
        if (r1.checkSelfPermission(r102) != 0) goto L29;
    L40:
        r34.add(r9);
    L41:
        int r12 = 0;
    L43:
        if (r12 >= r34.size()) goto L54;
        ResolveInfo r44 = (ResolveInfo) r34.get(r12);
        MenuItem r92 = r15.add(0, 0, r12 + 100, r44.loadLabel(r2));
        Intent r103 = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        if ((r0 instanceof Editable) == true) goto L47;
    L51:
        boolean r11 = false;
    L52:
        Intent r104 = r103.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !r11);
        ActivityInfo r45 = r44.activityInfo;
        r92.setIntent(r104.setClassName(r45.packageName, r45.name)).setShowAsAction(1);
        r12 = r12 + 1;
        goto L43
    L47:
        if (r0.onCheckIsTextEditor() == false) goto L51;
        if (r0.isEnabled() == false) goto L51;
        r11 = true;
        goto L52
    L11:
        if (this.f19284.isInstance(r15) == false) goto L13;
        r33 = this.f19285;     // Catch: Throwable -> L55
    L54:
        return this.f19288.onPrepareActionMode(r14, r15);
    }
}
